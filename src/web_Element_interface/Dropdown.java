package web_Element_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium_m10/dropdown.html");
		WebElement dropdown=driver.findElement(By.id("Menu"));
		Select s=new Select(dropdown);
//		if(s.isMultiple())
//		{
//			System.out.println("Dropdown is multi select");
//		}
//		else
//		{
//			System.out.println("Dropdown is single select");
//		}
		
		
//		s.selectByIndex(6);
//		WebElement opt = s.getFirstSelectedOption();
//		System.out.println(opt.getText());
		
		s.selectByValue("j");
		Thread.sleep(2000);
		s.selectByContainsVisibleText("Ice");
		Thread.sleep(2000);
	}

}
