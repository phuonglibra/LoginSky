@tag
Feature: Login Skype Page

@tag1
Scenario: Login with invalid skype name
Given Open Login skype page
When I am input username is "pinkgirl6103"
	And user click Signin button
Then I verify password is "Incorrect password. Please try again."

@tag2
Scenario: Login with invalid password
Given Open Login skype page
When I am input password is "Phuongtk412"
	And user click Signin button
Then I verify skype name is "You did not enter your Skype Name."

@tag3
Scenario: Login with invalid user name and password
Given Open Login skype page
When I am input username is "abcd"
And I am input password is "123123"
	And user click Signin button
Then I verify the error message is "Signing in failed. Please double-check your Skype Name and re-enter your password.​"

@tag4
Scenario: Login with correct user name and password
Given Open Login skype page
When I am input username is "pinkgirl6103"
And I am input password is "Phuongtk412"
	And user click Signin button
Then I verify page title is "Skype My Account"
