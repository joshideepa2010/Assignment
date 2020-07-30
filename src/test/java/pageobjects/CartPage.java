package pageobjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Page;

public class CartPage extends Page{
	
//WebDriver driver;	


	By addtocart=By.xpath("//span[contains(text(),'Add to cart')]");
	By blouse=By.xpath("//*[@id='homefeatured']/li[2]/div/div[2]/h5/a");
    By cart=By.xpath("//b[contains(text(),'Cart')]");
    By cartdetails=By.xpath("//*[@id='cart_summary']/tbody/tr/td[2]/p/a");
    By proceed=By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
//By close=By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span");*/
	


public void loadPage(String pageUrl) {
	this.driver.get(pageUrl);
}

public void scrollToBottom() {
	 JavascriptExecutor js = (JavascriptExecutor) this.driver;
	 WebElement Element = driver.findElement(blouse);
	 js.executeScript("arguments[0].scrollIntoView();", Element);

}

public void addtoCart()
{
	String dressname="Blouse";
	List<WebElement> products=this.driver.findElements(By.cssSelector("a.product-name"));
	
	for(int i=0;i<products.size();i++)
	{
		String productname=products.get(i).getText();
		System.out.println(productname);
		//List dressnamelist=Arrays.asList(dressname);
		if(dressname.contains(productname))
		{
	     this.driver.findElements(addtocart).get(i).click();
	     break;
		}
	}
	
	
}
public String cartValidation() {
	
	this.driver.findElement(proceed).click();
	 //this.driver.findElement(cart).click();

	String cartresult=this.driver.findElement(cartdetails).getText();
	System.out.println("CART RESULT is"+cartresult);
	return cartresult;
}



}
