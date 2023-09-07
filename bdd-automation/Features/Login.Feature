Feature: EcomLogin Features


Background: Background for tests
Given I launch the browser
When I go to the ecommerce site 

@DontRun
Scenario: Verify login page title 
Then the title should be as expected
And Close browser

@DontRun
Scenario: Verify invalid login
When I enter invalid username and password 
Then I should not be logged in 
And Close browser

@DontRun
Scenario: Verify invalid login
When I enter invalid username "user" and password "password" 
Then I should not be logged in 
And Close browser

@Run
Scenario Outline: Verify invalid login
When I enter invalid username "<username>" and password "<password>" 
Then I should not be logged in 
And Close browser

Examples:
|username|password|
|user1|password1|
|user2|password2|
|user3|password3|