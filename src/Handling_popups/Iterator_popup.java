package Handling_popups;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Iterator_popup 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		Set<String> allTabs = driver.getWindowHandles();
		Iterator<String> al = allTabs.iterator();
		String pTab = al.next();
		String child1 = al.next();
		String child2 = al.next();
		driver.switchTo().window(child1);
		File temp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File perm = new File("./Exceldata/example.png");
	    FileHandler.copy(temp, perm);
	    driver.quit();
		
	
	
		
		
		
	}

}
