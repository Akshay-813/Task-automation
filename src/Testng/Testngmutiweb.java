package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngmutiweb {
WebDriver driver;
@Parameters("browser")
@BeforeTest
public void setup(String browser )
{
if(browser.equalsIgnoreCase("Edge"))
{
	driver=new EdgeDriver();
}
else if (browser.equalsIgnoreCase("Chrome"))
{
	driver=new ChromeDriver();
}

}
@Test
public void test()
{
	driver.get("https://www.facebook.com/");
}
}
