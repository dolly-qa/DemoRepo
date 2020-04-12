package guru99.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageObjectGuru99 {
 
	protected WebDriver driver;
	
	public BasePageObjectGuru99(WebDriver driver) {
		this.driver = driver;
		
	}
	
//	public void openPage(String pageUrl) {
//		driver.get(pageUrl);
//		
//	}
	public WebElement find(By locator) {
		return driver.findElement(locator);
		
	}
	public void click(By locator) {
		find(locator).click();
		
	}
	
	protected void type(String text, By locator) {
		
		find(locator).sendKeys(text);
	}
}
