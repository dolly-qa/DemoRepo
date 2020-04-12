package guru99.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import guru99.main.BaseTestguru99;
import guru99.pages.BasePageObjectGuru99;
import guru99.pages.WelcomePage;
import guru99.pages.managerPage;

public class PositiveLoginTests extends BaseTestguru99{
	
	
	
	
@Parameters({ "username" , "passsword" })
@Test(priority = 0)
//public void positivLogin(@Optional("mngr251808" ) String username, @Optional("UquqUqa") String passsword)
//{
	public void positivLogin(){
//	driver.get("http://www.demo.guru99.com/v4/");
//	WebElement name = driver.findElement(By.xpath("//input[@name='uid']"));
//	name.sendKeys(userName);
//	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
//	pass.sendKeys(password);
//	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//	String expectedUrl = "http://www.demo.guru99.com/v4/manager/Managerhomepage.php";
//	String actualUrl = driver.getCurrentUrl();
//	String s= driver.getTitle();
//	System.out.println(actualUrl);
//	System.out.println(s);
//	Assert.assertEquals(actualUrl, expectedUrl,"Url does not match...");	
	
//	
	WelcomePage basePage = new WelcomePage(driver);
	basePage.openPage();
	managerPage managerPage = basePage.logIn("mngr251808", "UquqUqa");
	String actualMsg = managerPage.getTitleMsg();
	//String expectedMsg = "";
	//Assert.assertEquals();
	System.out.println(actualMsg);
	
	
}


//@Parameters({ "userName" , "password" })
//@Test(priority = 2)
//public void negativeLoginTests(@Optional("mngr251808" ) String userName, @Optional("UquqUq") String password)
//{
//	driver.get(url);
//	WebElement name = driver.findElement(By.xpath("//input[@name='uid']"));
//	name.sendKeys(userName);
//	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
//	pass.sendKeys(password);
//	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//	String alert = driver.switchTo().alert().getText();
//	System.out.println(alert);
//	driver.switchTo().alert().accept();
//	String Expectedmsg = "User or Password is not valid!";
//	Assert.assertTrue(Expectedmsg.contains(alert), "Message does not match...");
//	
//}


}


