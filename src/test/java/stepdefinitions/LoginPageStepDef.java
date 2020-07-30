package stepdefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.LoginPage;

@RunWith(Cucumber.class)
public class LoginPageStepDef {
	
	LoginPage loginpage=new LoginPage();

	    @Given("^User is on Home page of \"([^\"]*)\"$")
	    public void user_is_on_home_page_of_something(String url) throws Throwable {
	       loginpage.initializeDriver();
	       loginpage.loadPage(url);
	    }

	    @When("^User logs into the application with username as (.+) and password as (.+)$")
	    public void user_logs_into_the_application_with_username_as_and_password_as(String username, String password) throws Throwable {
	        loginpage.usernamecheck();
	        loginpage.passwordcheck();
	        loginpage.login();
	    }

	    @Then("^login should be unsuccessful$")
	    public void login_should_be_unsuccessful() throws Throwable {
	    	String actualUrl=loginpage.loginvalidation();
	        String expectedUrl= "http://automationpractice.com/index.php?controller=HomePage";
	    	Assert.assertFalse(expectedUrl.contentEquals(actualUrl));
	        //Assert.assertFalse(expectedUrl,loginpage.loginvalidation());
	    	System.out.println("Success");
	    	
	    }
}
