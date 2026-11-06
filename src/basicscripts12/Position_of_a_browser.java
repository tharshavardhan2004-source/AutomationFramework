package basicscripts12;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position_of_a_browser
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Point location=driver.manage().window().getPosition();
		System.out.println("The Browser location is :"+location);
		int x=location.getX();
		int y=location.getY();
		System.out.println(x);
		System.out.println(y);
		driver.quit();
	}

}
