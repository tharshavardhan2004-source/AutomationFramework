package exampleforTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount
{
	@Test(invocationCount = 0)
	public void tc1() {
		Reporter.log("Tc1 is passed",true);
	}
	
	@Test(invocationCount = 3)
	public void tc2() {
		Reporter.log("tc2 is passed",true);
	}

}
