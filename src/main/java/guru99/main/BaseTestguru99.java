package guru99.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class BaseTestguru99 {
	
	
	  protected WebDriver driver;
	  protected String url = "http://www.demo.guru99.com/v4/";
		
	  @BeforeMethod(alwaysRun = true)
	  public void setUp() 
	  {

		  System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
			driver = new ChromeDriver();
	  }
	 
	
	
	  @AfterMethod(alwaysRun = true) 
	  public void closeDriver() { 
		  // close driver
	  System.out.println("closing..."); 
	  driver.quit();
	  }
	 

}
