package web_Element_interface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_scrollactions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");//ScrollDown
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-800)");//ScrollUp
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//Scroll Bottom
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//Scroll Top
		
	}

}
