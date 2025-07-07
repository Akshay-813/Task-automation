package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Javagoogle {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String title=driver.getTitle();
	System.out.println(title);
	String expected="Google";
	
	
	
	if(title.endsWith(expected))
	{
		System.out.println("test pass");
		
	}
	else
	{
		System.out.println("test failed");
	}
			
		

	}

}
