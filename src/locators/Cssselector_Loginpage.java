package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector_Loginpage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.cssSelector("#username")).sendKeys("student");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
		driver.findElement(By.cssSelector("button.btn")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
