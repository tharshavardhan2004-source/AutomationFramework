package web_Element_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions1 {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement contact = driver.findElement(By.id("contact_form"));
		WebElement First_name = contact.findElement(By.name("first_name"));
		WebElement last_name = contact.findElement(By.name("last_name"));
		WebElement email = contact.findElement(By.name("email"));
		First_name.sendKeys("Harsha");
		last_name.sendKeys("Reddy");
		email.sendKeys("tharshavardhan@gmail.com");
		email.clear();
		
	}

}
