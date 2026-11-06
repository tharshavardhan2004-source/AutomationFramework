package Handling_popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_popup 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[.='Levis Shirt']/preceding-sibling::td[1]/input")).click();
		driver.findElement(By.xpath("//button[.='Delete']")).click();
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.sendKeys("Bad product");
		popup.accept();
		
	}

}
