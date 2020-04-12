package guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class managerPage extends BasePageObjectGuru99{
private String managerUrl = "http://www.demo.guru99.com/v4/manager/Managerhomepage.php";
	public managerPage(WebDriver driver) {
		super(driver);
	}
public String getTitleMsg() {
	return driver.getTitle();
	
}
}
