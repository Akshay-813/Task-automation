package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javagchrome {
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
}
@Test
public void test()
{
	driver.findElement(By.name("q")).sendKeys("Selinum",Keys.ENTER);
	driver.findElement(By.name("btnK")).click();
}


}
