package stepdefinitions;

import org.junit.runner.RunWith;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.ProductPage;

@RunWith(Cucumber.class)
public class SearchStepDef {
	ProductPage productPage = new ProductPage();
	@Given("^Search a product \"([^\"]*)\" in the Home page of \"([^\"]*)\"$")
    public void search_a_product_something_in_the_home_page_of_something(String productName, String pageUrl) throws Throwable {
	        
	        productPage.initializeDriver();
	        productPage.loadPage(pageUrl);
	        productPage.searchByProductName(productName);
	    }

	    @When("^the result is displayed$")
	    public void the_result_is_displayed() throws Throwable {
	    	 //productPage.searchByProductName(productName);
	    	productPage.resultdisplay();
	    }

	    @Then("^validate the search result is the correct product being displayed$")
	    public void validate_the_search_result_is_the_correct_product_being_displayed() throws Throwable {
	    	String finalsearch=productPage.actualSearch();
	        Assert.assertEquals("Blouse",finalsearch,"Correct product found");
	        productPage.closedriver();
	    }

}
