Feature: Login page Automation of saucedemo app
Scenario: Check login is successful with valid creds
Given User is on login page
When User enters a valid username and password
And Clicks on login Button
Then User is navigated to Home Page
And Close browser

