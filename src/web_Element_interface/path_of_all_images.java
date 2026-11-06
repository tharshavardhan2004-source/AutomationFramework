package web_Element_interface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class path_of_all_images 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		Thread.sleep(2000);
		List<WebElement> imgs = driver.findElements(By.xpath("//img"));
		for(int i=0;i<imgs.size();i++)
		{
			WebElement img=imgs.get(i);
			String path = img.getAttribute("src");
			System.out.println(path);
		}
		driver.quit();
	}

}
