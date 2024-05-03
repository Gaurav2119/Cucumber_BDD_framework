Feature: Email functionality

Background:
	Given User is on login page
	
@validEmail
Scenario Outline: Valid Email

When User enters valid email "<email>"
And Clicks on Continue button
Then User redirects to password page
Examples:
| email |
 | abc@gmail.com |
 | raju@gmail.com |
 
 
 @invalidEmail
Scenario Outline: Invalid Email

When User enters invalid email "<email>"
And Clicks on Continue button
Then User stays on the same page with an error message

Examples:
| email |
| invalid |
| wrongemail.com |