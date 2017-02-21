package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst 
{
public WebDriver driver;
@BeforeMethod
public void preCondition()
{
	System.setProperty("GECKO_KEY","GECKO_PATH");
	driver=new FirefoxDriver();
	
	driver.get("http://localhost/login.do");
	
}
@AfterMethod
public void postCondition()
{
	driver.quit();
}
}
