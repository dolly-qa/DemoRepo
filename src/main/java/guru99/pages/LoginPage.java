package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
public class LoginPage extends BasePageObjectGuru99{

	
	//private String pageurl = "";
	private By userNameLocator = By.xpath("//input[@name='uid']");
	private By passwordLocator = By.xpath("//input[@name='password']");
	private By loginButtonLocator = By.xpath("//input[@name='btnLogin']");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	 public managerPage logIn(String username, String password) {
		 type(username,userNameLocator);
		 type(password,passwordLocator);
		 click(loginButtonLocator);
		 return new managerPage(driver);
	 }

}
