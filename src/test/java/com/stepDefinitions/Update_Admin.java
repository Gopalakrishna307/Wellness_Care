package com.stepDefinitions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Update_Admin {
	int id;
	Response res;
	@Given("To set the header and body to update user with help of Id is {int}")
	public void to_set_the_header_and_body_to_update_user_with_help_of_id_is(Integer id) {
		id=id;
		JSONObject jo=new JSONObject();
		jo.put("adminId", id);
		jo.put("email","krishna@gmail.com");
		jo.put("name","glA2L9P8CQ6hFbKdY+0Wow==");
		jo.put("password","krishnagopal123");
		given()
		.body(jo)
		.contentType("application/json");
	}

	@When("I hit the api with put request and end point as {string}")
	public void i_hit_the_api_with_put_request_and_end_point_as(String string) {
		 res = when().put("/admin/"+id);
	}

	@Then("To checks the status code as {int} And status line as {string}")
	public void to_checks_the_status_code_as_and_status_line_as(Integer scode, String sline) {
		res.then()
   		.assertThat()
   			.statusCode(scode)
   			.statusLine(sline);
	}

	@Then("To checks the body message and  ContentType")
	public void to_checks_the_body_message_and_content_type() {
		res.then()
   		.assertThat()
   		.body("message",equalTo("successfull"))
		.header("Content-Type","application/json");
	}

	@Then("API created a new in the DataBase")
	public void api_created_a_new_in_the_data_base() {
		res.then()
    	.assertThat()
    		.body("result", not(emptyArray()))
    		.log().all();
	}

}
