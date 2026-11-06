package basicscripts12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_on_browser 
{
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com");
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
		 driver.quit();
		 
	}

}
