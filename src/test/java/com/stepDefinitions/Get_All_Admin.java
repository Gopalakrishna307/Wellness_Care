package com.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import  static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class Get_All_Admin {
	
	Response res;
	@When("I hit the api with get all request and end point as {string}")
	public void i_hit_the_api_with_get_all_request_and_end_point_as(String getallurl) {
	   res = when().get(getallurl);
	}

	@Then("To check the status code as {int} And status line as {string}")
	public void to_check_the_status_code_as_and_status_line_as(Integer code1, String sline1) {
	   res.then()
	   		.assertThat()
	   			.statusCode(code1)
	   			.statusLine(sline1);
	}

	@Then("API should return all users details")
	public void api_should_return_all_users_details() {
	    res.then()
	    	.assertThat()
	    		.body("result", not(emptyArray()))
	    		.log().all();
	}

}
