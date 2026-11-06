package Handling_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_alltabs_fetchtiltles 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		String pTab = driver.getWindowHandle();
		System.out.println("The address of parent tab :"+ pTab);
		
		
		
	}

}
