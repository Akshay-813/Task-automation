package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdragdrop {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://demoqa.com/droppable");
}
@Test
public void test1()
{
	driver.manage().window().maximize();
	WebElement drag=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]"));
	WebElement drop=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[2]"));
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.perform();
	String text=drop.getText();
	

	
}
}
