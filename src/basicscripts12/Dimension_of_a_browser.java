package basicscripts12;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension_of_a_browser
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Dimension size=driver.manage().window().getSize();
		System.out.println("The Dimension of the browser is:" +size);
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println(height);
		System.out.println(width);
		driver.quit();
	}

}
