package pageobjects;

import org.openqa.selenium.By;

import utilities.Page;

public class LoginPage extends Page{

	By username=By.id("email");
	By password=By.id("passwd");
	By login=By.id("SubmitLogin");
	By sigin=By.xpath("//a[contains(text(),'Sign in')]");
	
	public void loadPage(String url) {
		this.driver.get(url);
		this.driver.findElement(sigin).click();
	}
	
	public void usernamecheck() {
		this.driver.findElement(username).sendKeys("test@gmail.com");
	}
	
	public void passwordcheck() {
		this.driver.findElement(username).sendKeys("1234");
	}
	
	public void login() {
		this.driver.findElement(login).click();
	}
	public String loginvalidation() {
		String expectedUrl=this.driver.getCurrentUrl();
		return expectedUrl;
	}
	
	
}
