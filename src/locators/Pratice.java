package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.id("identifierId")).sendKeys("tharshavardhan2004@gmail.com");
		
		}

}
