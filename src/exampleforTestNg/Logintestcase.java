package exampleforTestNg;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintestcase 
{
	WebDriver driver;
	@BeforeMethod
	public void lauchbrowser() 
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	
	@Test
	public void validlogin() 
	{
		String expectedResult="Logged In Successfully | Practice Test Automation";
		WebElement Usn = driver.findElement(By.id("username"));
		WebElement Psw = driver.findElement(By.id("password"));
		WebElement Loginbtn = driver.findElement(By.id("submit"));
		Usn.sendKeys("student");
		Psw.sendKeys("Password123");
		Loginbtn.click();
		String actualResult=driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test(priority = 1)
	public void invalidlogin() 
	{
		String expectedResult="Logged In Successfully | Practice Test Automation";
		WebElement Usn = driver.findElement(By.id("username"));
		WebElement Psw = driver.findElement(By.id("password"));
		WebElement Loginbtn = driver.findElement(By.id("submit"));
		Usn.sendKeys("student44");
		Psw.sendKeys("Password12387");
		Loginbtn.click();
		String actualResult=driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult);
	}
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
