package exampleforTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testexceution1 
{
	@Test
	public void tc1()
	{
		Reporter.log("tc1 is passed",true);
	}
	
	@Test
	public void tc2() 
	{
		Reporter.log("tc2 is passed",true);
		
	}

}
