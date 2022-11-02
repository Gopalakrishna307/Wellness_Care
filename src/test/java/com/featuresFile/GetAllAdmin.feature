
Feature: I am testing the Get request  Wellness Care API

	Scenario: Get request to display all users details
		When I hit the api with get all request and end point as "/admin"
		Then To check the status code as 200 And status line as "HTTP/1.1 200 "
		And  API should return all users details
