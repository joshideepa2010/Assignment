package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Page;

public class ProductFunction extends Page{
	
	By scrollelement=By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/h5/a");
	By more=By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[2]/span");
	By content=By.xpath("//*[@id='short_description_content']/p");
	By mouseover=By.xpath("//*[@id='homefeatured']/li[7]");
	By quantity=By.cssSelector("#quantity_wanted");
	By submitbutton=By.xpath("//*[@id='add_to_cart']/button/span");
	
	public void loadPage(String url) {
		this.driver.get(url);
		
	}
	
	public void pageScroll()
	{
		
		 JavascriptExecutor js = (JavascriptExecutor) this.driver;
		 WebElement element=driver.findElement(scrollelement);
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 //this.driver.findElement(more).click();
	}
	
	public void mousehower() {
		WebElement element = this.driver.findElement(mouseover);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		this.driver.findElement(more).click();
	}
	
	public String pageValidation() {
		String description=this.driver.findElement(content).getText();
		return description;
	}
	
	public void quantityItem() {
        for(int i=0;i<2;i++) {
            driver.findElement(quantity).sendKeys(Keys.ARROW_UP);
        }
        }
    public void submit() {
    	this.driver.findElement(submitbutton).click();
    }
	
}
