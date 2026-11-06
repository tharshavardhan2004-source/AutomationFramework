package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_task
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys("toxic trailer");
		driver.findElement(By.cssSelector("button[title='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("yt-formatted-string[aria-label='Toxic Official"
				+ " Tamil Trailer | Rocking Star Yash | Geetu Mohandas | KVN | Monster Mind Creations 4 minutes, 39 seconds']")).click();
		
		//driver.manage().window().maximize();
	}

}
