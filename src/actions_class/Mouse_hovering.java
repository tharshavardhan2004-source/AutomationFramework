package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hovering {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement pt = driver.findElement(By.xpath("//button[.='Point Me']"));
		Actions act=new Actions(driver);
		act.moveToElement(pt).perform();
//		Thread.sleep(2000);
//		driver.quit();

	}

}
