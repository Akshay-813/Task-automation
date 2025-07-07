package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngaction {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test1()
{
	WebElement fullname=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
	fullname.sendKeys("abcd");
	WebElement rediffid=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input"));
	Actions act=new Actions(driver);
	act.keyDown(fullname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fullname, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(rediffid, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
}
}
