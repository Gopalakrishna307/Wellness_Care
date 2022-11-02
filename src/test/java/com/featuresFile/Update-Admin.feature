Feature: I am testing the put Request for Wellness Care

		Scenario: Post request to save a user detail by using ID as in the admin DataBase
			Given To set the header and body to update user with help of Id is 45
			When I hit the api with put request and end point as "/admin"
			Then To checks the status code as 200 And status line as "HTTP/1.1 200 "
			And To checks the body message and  ContentType
			And API created a new in the DataBase