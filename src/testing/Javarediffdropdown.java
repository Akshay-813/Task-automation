package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Javarediffdropdown {
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
		WebElement day=driver.findElement(By.xpath("//select[@name='DOB_Day774c2bbe']"));
		Select rd=new Select(day);
		rd.selectByValue("22");
		
		WebElement month=driver.findElement(By.xpath("//select[@name='DOB_Month774c2bbe']"));
		Select nm=new Select(month);
		nm.selectByValue("JAN");
		
		WebElement year=driver.findElement(By.xpath("//select[@name='DOB_Year774c2bbe']"));
		Select vm=new Select(year);
		vm.selectByValue("2011");
		
	}
		

}
