package com.stepDefinitions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Delete_Admin {
	Response res;
	@When("I hit the api with delete request and end point as {string}")
	public void i_hit_the_api_with_delete_request_and_end_point_as(String deleteurl) {
		 res = when()
		.delete(deleteurl);
	}
	@Then("To checking the status code as {int} And status line as {string}")
	public void to_checking_the_status_code_as_and_status_line_as(Integer scode, String sline) {
		res.then()
   		.assertThat()
   			.statusCode(scode)
   			.statusLine(sline);
	}
	@Then("To checks the body message as {string} And  data as {string}")
	public void to_checks_the_body_message_as_and_data_as(String msg, String data) {
		res.then()
   		.assertThat()
   		.body("message",equalTo(msg))
   		.body("data",equalTo(data))
   		.log().all();
		
	}
}
