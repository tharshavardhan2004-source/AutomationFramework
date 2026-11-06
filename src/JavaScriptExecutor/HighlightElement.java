package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement TF = driver.findElement(By.id("name"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='4px solid red'", TF);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
