package com.restAssured.admin;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;








public class UpdateAdmin {
	
	@Test
	
	public void updateAdmin() {
		JSONObject jo=new JSONObject();
		jo.put("adminId", 16);
		jo.put("email","krishna@gmail.com");
		jo.put("name","glA2L9P8CQ6hFbKdY+0Wow==");
		jo.put("password","krishnagopal123");
		
		//File jo=new File("E:\\Bengulore CG\\Sprint_2\\data.json");
		given()
		.body(jo)
		.contentType("application/json")
		.when().put("/admin/16")
		.then()
		.body("message",equalTo("successful"))
		.assertThat()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 ")
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
