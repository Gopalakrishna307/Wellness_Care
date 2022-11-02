package com.stepDefinitions;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Get_Admin_By_Id {
	Response res;
	@When("I hit the api with get request and end point as {string}")
	public void i_hit_the_api_with_get_request_and_end_point_as(String geturl) {
	   res = when().get(geturl);
	}

	@Then("To Checks the status code as {int} And status line as {string}")
	public void to_Checks_the_status_code_as_and_status_line_as(Integer code, String sline) {
	   res.then()
	   		.assertThat()
	   			.statusCode(code)
	   			.statusLine(sline);
	}
	@And("To Checks the message and ContentType")
	public void to_checks_the_message_and_content_type() {
	   res.then()
	   		.assertThat()
	   		.body("message",equalTo("successfull"))
			.header("Content-Type","application/json");
	}

	@And("API should return  user details")
	public void api_should_return_user_details() {
		 res.then()
	    	.assertThat()
	    		.body("result", not(emptyArray()))
	    		.log().all();
	}
	
}
