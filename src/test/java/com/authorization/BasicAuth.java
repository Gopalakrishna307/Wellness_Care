package com.authorization;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BasicAuth {
	@Test
	public void basic_Auth() {
		baseURI="https://github.com";
		
	given().auth().basic("Gopalakrishna307","Krishna@9502978263")
	.when().get("/login")
	.then().log().all();
	
	}
}
