package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javafacbook {
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void test()
{
	//driver.findElement(By.name("email")).sendKeys("akshay@gmail.com");
	//driver.findElement(By.name("pass")).sendKeys("123@gmial.com");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("akshay@gmail.com");
}
}
