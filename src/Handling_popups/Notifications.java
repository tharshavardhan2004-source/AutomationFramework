package Handling_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Notification']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
