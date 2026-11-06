package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Testloginpage tt=new Testloginpage(driver);
		tt.enterusername(" student");
		tt.enterpassword("Password123");
		tt.clicksubmit();
		driver.quit();
		System.out.println("Form is submiited");
		
	}

}
