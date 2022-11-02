package com.stepDefinitions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Save_Admin {
	Response res;
	@Given("To sets the header and body to create new user details")
	public void to_sets_the_header_and_body_to_create_new_user_details() {
		JSONObject obj=new JSONObject();
		obj.put("email", "kavya@gmail.com");
		obj.put("name", "kavya");
		obj.put("password", "kavya123");
		given()
		.body(obj)
		.contentType("application/json");
	    
	}
	@When("I hit the api with post request and end point as {string}")
	public void i_hit_the_api_with_post_request_and_end_point_as(String string) {
		res = when().post("/admin");
	}
	@Then("To checks the Status code as {int} And status line as {string}")
	public void to_checks_the_Status_code_as_and_status_line_as(Integer scode, String sline) {
		res.then()
   		.assertThat()
   			.statusCode(scode)
   			.statusLine(sline);
	}
	@Then("To checks the Body message and  ContentType")
	public void to_checks_the_Body_message_and_content_type() {
		res.then()
   		.assertThat()
   		.body("message",equalTo("successfull"))
		.header("Content-Type","application/json");
	}
	@Then("API Created a new in the DataBase")
	public void api_Created_a_new_in_the_data_base() {
		res.then()
    	.assertThat()
    		.body("result", not(emptyArray()))
    		.log().all();
	}
}
