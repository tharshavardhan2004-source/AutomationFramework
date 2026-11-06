package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.className("ytSearchboxComponentInput yt-searchbox-input title")).sendKeys("Toxix trailer");
		
		
	}

}
