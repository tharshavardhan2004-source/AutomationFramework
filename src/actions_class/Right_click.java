package actions_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click 
{
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[.='Bestsellers' and @tabindex='0']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		
	}

}
