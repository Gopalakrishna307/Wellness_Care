package com.authorization;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {
	@Test
	public void bearer_Token() {
		baseURI="https://api.github.com";
		JSONObject obj=new JSONObject();
		obj.put("name", "234567kjksj");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		
	}
}
