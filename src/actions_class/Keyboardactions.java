package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium_m10/Login_fn,mn,ln.html");
		WebElement FN = driver.findElement(By.id("fn"));
		FN.sendKeys("Hello");
		Thread.sleep(2000);
		WebElement MN = driver.findElement(By.name("mn"));
		MN.sendKeys("Everyone");
		Thread.sleep(2000);
		WebElement LN = driver.findElement(By.name("ln"));
		
		Actions act=new Actions(driver);
		act.keyDown(FN,Keys.CONTROL).sendKeys("ax").keyUp(FN,Keys.CONTROL).perform();
		act.keyDown(LN,Keys.CONTROL).sendKeys("v").keyUp(LN,Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		act.keyDown(MN,Keys.CONTROL).sendKeys("ax").keyUp(MN,Keys.CONTROL).perform();
		act.keyDown(FN,Keys.CONTROL).sendKeys("v").keyUp(FN,Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		act.keyDown(LN,Keys.CONTROL).sendKeys("ax").keyUp(LN,Keys.CONTROL).perform();
		act.keyDown(MN,Keys.CONTROL).sendKeys("v").keyUp(MN,Keys.CONTROL).perform();


	}

}
