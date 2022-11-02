package com.restAssured.admin;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SaveAdmin {
	@Test
	public void saveAbmin() {
		//baseURI="http://localhost:8080";
		JSONObject obj=new JSONObject();
		obj.put("email", "kavya@gmail.com");
		obj.put("name", "kavya");
		obj.put("password", "kavya123");
		given()
		.body(obj)
		.contentType("application/json")
		.when().post("/admin")
		.then()
		.body("message",equalTo("successful"))
		.assertThat()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 ")
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
