package Handling_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_popup 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement upload = driver.findElement(By.id("resume"));
		upload.sendKeys("C:\\Users\\Harshavardhan Reddy\\OneDrive\\Desktop\\harsharesumenew.pdf");
	}

}
