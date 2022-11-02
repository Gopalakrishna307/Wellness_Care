package com.restAssured.admin;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteAdmin {
	@Test
	public void deleteAdmin() {
		//baseURI="http://localhost:8080";
		when()
		.delete("/admin?id=27")
		.then().assertThat()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 ")
		.log().all();
	}

}
