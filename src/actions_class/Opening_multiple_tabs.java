package actions_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opening_multiple_tabs 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Actions act=new Actions(driver);
		List<WebElement> About = driver.findElements(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 ps-4 ps-lg-2']/li"));
		Thread.sleep(2000);
		for(WebElement abouts:About)
		{
			act.contextClick(abouts).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_DOWN);
		
		}
	}

}
