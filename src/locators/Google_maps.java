package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_maps 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://maps.google.com");
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ZBTq6e' and @autocomplete='off' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("Rajajinagar");
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Ananthapur");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='pzfvzf']")).click();
	}

}
