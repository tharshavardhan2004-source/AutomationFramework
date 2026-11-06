package basicscripts12;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_the_browser 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Dimension d=new Dimension(300, 4000);
		driver.manage().window().setSize(d);
		driver.quit();
	}

}
