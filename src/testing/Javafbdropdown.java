package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Javafbdropdown {
	ChromeDriver driver;
	
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?entry_point=login");
}
@Test
public void test()
{
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	Select fb=new Select(day);
	fb.selectByValue("22");
	
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select bf=new Select(month);
	bf.selectByValue("1");
	
	WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
	Select mn=new Select(Year);
	mn.selectByVisibleText("2000");
	
}
}
