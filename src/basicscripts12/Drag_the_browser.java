package basicscripts12;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_the_browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Point p= new Point(300, 400);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
