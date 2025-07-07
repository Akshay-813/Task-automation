package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hotsinger_task {
	WebDriver driver;
	@BeforeTest
	public void setup()
{
		driver=new ChromeDriver ();
		}
	@BeforeMethod
	public void utrloading()
	{
		driver.get("https://www.hostinger.com/in");
	}
	@Test
	public void test()
	{
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/div[2]/div[2]")).click();
		
	}
}
