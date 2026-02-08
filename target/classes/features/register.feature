Feature: Register

Scenario: Register new user

Given user opens application
When user clicks register button
And enters username password and confirm password
And clicks on register now button
Then user should be registered