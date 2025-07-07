package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparamiters {
@Parameters("a")
@Test
public void main (String V)
{
	System.out.println("value is:"+V);
}
}
