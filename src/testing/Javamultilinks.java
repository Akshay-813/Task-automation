package testing;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javamultilinks {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void mobiles()
	{
		driver.get("https://www.google.co.in/");
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for (WebElement tb:li)
		{
			String link=tb.getAttribute("href");
			String texts=tb.getText();
			System.out.println(link+"..."+texts);
		}
	}
}
