package web_Element_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_elements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium_m10/disabledelements.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Disabled elements using Id attribute
		js.executeScript("document.getElementById('usn').value='Admin'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('usn').value=''");
		Thread.sleep(2000);
		//Disabled elements without Id attribute
		WebElement pswTf = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].value='Password@123'",pswTf);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value=''",pswTf);
		driver.quit();


		
	}

}
