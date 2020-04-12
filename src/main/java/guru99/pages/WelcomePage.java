package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
public class WelcomePage extends BasePageObjectGuru99{

	
	private String pageUrl = "http://www.demo.guru99.com/v4/";
	private By authenticationLocateor = By.linkText("Form Authentication");
	private String pageurl = "";
	private By userNameLocator = By.xpath("//input[@name='uid']");
	private By passwordLocator = By.xpath("//input[@name='password']");
	private By loginButtonLocator = By.xpath("//input[@name='btnLogin']");
	
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public void openPage()
	{
		driver.get(pageUrl);
		
	}

	
	
	 public managerPage logIn(String username, String password) {
		 type(username,userNameLocator);
		 type(password,passwordLocator);
		 click(loginButtonLocator);
		 return new managerPage(driver);
	 }

}
