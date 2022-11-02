
Feature: I am testing the Get request  Wellness Care API

	Scenario: Get request to getting the user details by using ID
		When I hit the api with get request and end point as "/admin/40"
		Then To Checks the status code as 200 And status line as "HTTP/1.1 200 "
		And To Checks the message and ContentType
		And  API should return  user details
