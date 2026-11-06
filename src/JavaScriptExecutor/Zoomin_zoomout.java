package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomin_zoomout 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/home");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.Zoom='400%'");
		
	}

}
