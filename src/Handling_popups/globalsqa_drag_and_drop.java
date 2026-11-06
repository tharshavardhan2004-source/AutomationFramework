package Handling_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class globalsqa_drag_and_drop 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement frame = driver.findElement(By.xpath("//ul[starts-with(@class,'gallery ui-help')]"));
		
		
		
	}

}
