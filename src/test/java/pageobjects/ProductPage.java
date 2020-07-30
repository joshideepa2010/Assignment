package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Page;

public class ProductPage extends Page {
	By searchBox = By.id("search_query_top");
	By searchButton = By.name("submit_search");
	By resultdisplay =By.cssSelector("span[class='heading-counter']");
	By actualsearch=By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a");

	/*
	 * public WebElement getSearchBox() { return this.driver.findElement(searchBox);
	 * }
	 */
	

	public void searchByProductName(String name) {
		
		this.driver.findElement(searchBox).sendKeys(name);
		this.driver.findElement(searchButton).click();
	}

	public void loadPage(String pageUrl) {
		this.driver.get(pageUrl);
	}
	
	public void resultdisplay() {
		String Result=this.driver.findElement(resultdisplay).getText();
		System.out.println(Result);
		
	}
	
	public String actualSearch() {
		String Search=this.driver.findElement(actualsearch).getText();
		System.out.println(Search);
		return Search;
		
	}

}