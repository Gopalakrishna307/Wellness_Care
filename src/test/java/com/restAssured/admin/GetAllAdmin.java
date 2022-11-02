package com.restAssured.admin;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllAdmin {
	@Test
	public void getAll() {
		baseURI="http://localhost:8080";
		when()
		.get("/admin")
		.then()
		.body("message",equalTo("successful"))
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.statusLine("HTTP/1.1 200 ")
		.log().all();
		
		
	}

}
