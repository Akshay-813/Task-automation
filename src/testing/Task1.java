package testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver ();
	}
	@BeforeMethod
	public void utrloading()
	{
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void test1() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Anu");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Amal");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("amal@gmial.com");
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("ahjjf");
		driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("ahjjf");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C://error7.png"));
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
	}
}
