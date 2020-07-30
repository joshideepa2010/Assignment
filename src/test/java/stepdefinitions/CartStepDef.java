package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CartPage;

public class CartStepDef {
	CartPage cartPage = new CartPage();
	@Given("Home page of {string}")
	public void home_page_of(String pageUrl) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cartPage.initializeDriver();
		cartPage.loadPage(pageUrl);
	}

	@When("scroll down And add a product to cart")
	public void scroll_down_And_add_a_product_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		cartPage.scrollToBottom();
		cartPage.addtoCart();
		
	}

	@Then("validate the addition of the product is successful to the cart")
	public void validate_the_addition_of_the_product_is_successful_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		String actualCart=cartPage.cartValidation();
		Assert.assertEquals(actualCart, "Blouse","Cart Validated");
		cartPage.closedriver();
	}


}
