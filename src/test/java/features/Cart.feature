Feature: Add to cart functionality Test

@SmokeTest
Scenario: Scroll down from the homepage and add a product to cart and validate the addition of the product is successful to the cart
Given Home page of "http://automationpractice.com/index.php"
When scroll down And add a product to cart 
Then validate the addition of the product is successful to the cart

