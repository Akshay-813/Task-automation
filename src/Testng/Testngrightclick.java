package Testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngrightclick {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void test1()
{
	WebElement rightclick=driver.findElement(By.xpath("/html/body/span"));
	WebElement doubleclick=driver.findElement(By.xpath("/html/body/button"));
	Actions act=new Actions(driver);
	act.contextClick();
	act.doubleClick();
	act.perform();
	
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	WebElement Doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	
	Alert b=driver.switchTo().alert();
	System.out.println(b.getText());
	b.accept();
	
}
}
