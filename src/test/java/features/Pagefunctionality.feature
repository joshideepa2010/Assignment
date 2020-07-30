Feature: Page functionality Test

@End2End
Scenario: Scroll down to a product to a mouse over and click on More, validate the resulting page has correct information and also the functionality in that page is working by validating increment and decrement of quantity, size and then Add to Cart
When Scroll down to a product on "http://automationpractice.com/index.php" to a mouse over and click on More
Then validate the resulting page has correct information 
And functionality in that page is working by validating increment decrement of quantity, size 
And then Add to Cart