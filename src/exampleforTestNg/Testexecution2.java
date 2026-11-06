package exampleforTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testexecution2 
{
	@Test
	public void tc3()
	{
		Reporter.log("tc3 is passed",true);
	}
	
	@Test
	public void tc4() 
	{
		Reporter.log("tc4 is passed",true);
		
	}

}
