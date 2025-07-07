package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaredifflogo {
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
		WebElement logo=driver.findElement(By.xpath("//img[@title='Rediffmail']"));
		if (logo.isDisplayed())
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo not displayed");
	}
		WebElement radio=driver.findElement(By.xpath("//input[@value='f']"));
		boolean ra=radio.isDisplayed();
		if(radio.isDisplayed())
		{
			System.out.println("buttom is working"+ra);
		}
		else
		{
			System.out.println("button not working"+ra);
		}
		
		WebElement chk=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[15]/div[1]/input[1]"));
		boolean rc=chk.isSelected();
	    if(rc)
		{
			System.out.println("button is displayed"+rc);
		}
		else
		{
			System.out.println("button is not displayed"+rc);
		}
}
}

