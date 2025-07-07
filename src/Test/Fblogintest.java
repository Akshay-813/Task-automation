package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.pomfblogin;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver=new ChromeDriver(); 
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/login/");
	}
@Test
public void test1()
{
	pomfblogin ob=new pomfblogin(driver);
	ob.setvalues("abcd@gmail.com", "abcd");
	ob.login();
}
}
