package actions_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_actions 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 800).perform();//Scroll Down
		Thread.sleep(2000);
		act.scrollByAmount(0,-800).perform();//Scroll Up
		
		//act.scrollByAmount(500,0).perform();//Scroll Right
		//act.scrollByAmount(-500,0).perform();//Scroll Left

		
	}

}
