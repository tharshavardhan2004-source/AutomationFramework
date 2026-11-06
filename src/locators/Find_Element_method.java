package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element_method 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium_m10/checkbox.html");
		Thread.sleep(2000);
//		WebElement checkbox = driver.findElement(By.xpath("(//input)[position()=4]"));
//		checkbox.click();
		
		// to select all checkboxs 
//		 List<WebElement> checkbox = driver.findElements(By.xpath("(//input)"));
//		for(int i=0;i<checkbox.size();i++)
//		{
//			WebElement check=checkbox.get(i);
//			check.click();
//		}
		
		
		//to select odd checkbox
		 List<WebElement> checkbox = driver.findElements(By.xpath("(//input)"));
			for(int i=0;i<checkbox.size();i++)
			{
				if(i%2==0)
				{
				WebElement check=checkbox.get(i);
				check.click();
				}
			}

		
		Thread.sleep(2000);
		driver.quit();
	}

}
