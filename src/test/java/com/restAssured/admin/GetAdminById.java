package com.restAssured.admin;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

public class GetAdminById {
	@Test
	public void getAdminById() {
		when()
		.get("/admin/16")
		.then()
		.body("message",equalTo("successfull"))
		.and()
		.header("Content-Type","application/json")
		.assertThat()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 ")
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
