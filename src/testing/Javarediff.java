package testing;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javarediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		
		String exp="Create my account";
		WebElement wb=driver.findElement(By.id("Register"));
		String actual=wb.getDomAttribute("value");
		if(actual.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
	
	}
	
}
