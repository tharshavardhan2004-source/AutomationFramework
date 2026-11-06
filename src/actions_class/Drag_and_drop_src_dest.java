package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop_src_dest 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement dest1 = driver.findElement(By.xpath("(//div[starts-with(@class,'drop-column')])[1]"));
		
		WebElement src2 = driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement dest2 = driver.findElement(By.xpath("(//div[starts-with(@class,'drop-column')])[2]"));

		WebElement src3 = driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		WebElement dest3 = driver.findElement(By.xpath("(//div[starts-with(@class,'drop-column')])[1]"));
		
		WebElement src4 = driver.findElement(By.xpath("//div[.='Laptop Cover']"));
		WebElement dest4 = driver.findElement(By.xpath("(//div[starts-with(@class,'drop-column')])[2]"));

		
		Actions act=new Actions(driver);
		act.dragAndDrop(src1, dest1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, dest2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, dest3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, dest4).perform();
		Thread.sleep(2000);
		driver.quit();

		
		
	}

}
