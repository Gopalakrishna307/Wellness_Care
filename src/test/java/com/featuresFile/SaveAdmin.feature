
Feature: I am testing the post Request for Wellness Care

		Scenario: Post request to save a user details in the admin DataBase
			Given To sets the header and body to create new user details
			When I hit the api with post request and end point as "/admin"
			Then To checks the Status code as 200 And status line as "HTTP/1.1 200 "
			And To checks the Body message and  ContentType
			And API Created a new in the DataBase