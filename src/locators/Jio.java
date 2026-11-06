package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Mobile' and @id='container'and @class='j-JDSLink-container header_item-links_link hasFocus']")).click();
		driver.findElement(By.cssSelector("//div[text()='Recharge for ₹3599']")).click();
	}

}
