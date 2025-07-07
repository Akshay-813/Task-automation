package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver ();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[1]/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[1]/div[2]/div/ul/li[1]/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("Anu@gmil.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("Anu@1234");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/p/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/form/div[2]/input")).sendKeys("appu1234");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/form/button[1]")).click();
	}
}
