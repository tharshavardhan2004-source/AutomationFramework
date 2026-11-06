package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testloginpage 
{
	private WebDriver driver;
	private By usnTf=By.id("username");
	private By pswTf=By.id("password");
	private By submitBtn=By.id("submit");
	
	public Testloginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void enterusername(String usn) {
		driver.findElement(usnTf).sendKeys(usn);
	}
	
	public void enterpassword(String psw) {
		driver.findElement(usnTf).sendKeys(psw);
	}
	public void clicksubmit() {
		driver.findElement(submitBtn).click();
		
	}

}
