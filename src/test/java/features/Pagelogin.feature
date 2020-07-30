Feature: Login functionality Test

@SmokeTest @RegressionTest
Scenario: Login page failure validation
Given User is on Home page of "http://automationpractice.com/index.php"
When User logs into the application with username as <username> and password as <password>
Then login should be unsuccessful



