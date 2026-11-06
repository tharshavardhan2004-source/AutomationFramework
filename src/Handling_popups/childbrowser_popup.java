package Handling_popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		String pTab = driver.getWindowHandle();
		System.out.println("The address of parent tab: "+pTab);
		
		Set<String> allTabs = driver.getWindowHandles();
		System.out.println("The address of all tabs");
		for(String tabs:allTabs)
		{
			System.out.println(tabs);
		}
		
		driver.quit();
		
		
		
		
	}

}
