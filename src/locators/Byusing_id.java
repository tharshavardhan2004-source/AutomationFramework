package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byusing_id 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium_m10/netflixlink.html");
		WebElement link = driver.findElement(By.id("link"));
		link.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
