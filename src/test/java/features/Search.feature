Feature: Product search Test

@SmokeTest @End2End
Scenario: Search a product and validate that the search result is the correct product being displayed
Given Search a product "blouse" in the Home page of "http://automationpractice.com/index.php"
When the result is displayed
Then validate the search result is the correct product being displayed