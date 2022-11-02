
Feature: I am testing the delete Request for Wellness Care

		Scenario: delete request to delete a user detail by using ID  in the admin DataBase
			When I hit the api with delete request and end point as "/admin?id=50"
			Then To checking the status code as 200 And status line as "HTTP/1.1 200 "
			And To checks the body message as "successful" And  data as "Admin deleted"
			