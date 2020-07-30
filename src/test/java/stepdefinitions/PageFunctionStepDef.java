package stepdefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.ProductFunction;

@RunWith(Cucumber.class)
public class PageFunctionStepDef {
	
	ProductFunction function=new ProductFunction();
	@When("Scroll down to a product on {string} to a mouse over and click on More")
	public void scroll_down_to_a_product_on_to_a_mouse_over_and_click_on_More(String url) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		function.initializeDriver();
		function.loadPage(url);
		function.pageScroll();
		function.mousehower();
		
		
	    
	}

	@Then("validate the resulting page has correct information")
	public void validate_the_resulting_page_has_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
		String actualcontent="Printed chiffon knee length dress with tank straps. Deep v-neckline.";
		String expectedcontent=function.pageValidation();
		Assert.assertEquals(actualcontent, expectedcontent);
	    
	}

	@And("functionality in that page is working by validating increment decrement of quantity, size")
	public void functionality_in_that_page_is_working_by_validating_increment_decrement_of_quantity_size() {
	    // Write code here that turns the phrase above into concrete actions
		function.quantityItem();
	    
	}

	@And("then Add to Cart")
	public void then_Add_to_Cart() {
	    // Write code here that turns the phrase above into concrete actions
	    function.submit();
	}


}
