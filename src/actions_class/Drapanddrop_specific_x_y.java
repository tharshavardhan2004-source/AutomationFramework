package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drapanddrop_specific_x_y {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[starts-with(@class,'cursor-move')]"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(ele, 60,80).perform();
		Thread.sleep(2000);
		driver.quit();
		}

}