package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_testlogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=571&wExp=N&srcTemplate=registerfree468x60&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclsrc=aw.ds&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cHCmQflqrnBmv9qmqA-pegvG&gclid=Cj0KCQjwnbrUBhDOARIsAKKhPpefdI1yxGC6t_Q7TM1QBtUqJEjV2lQkdiu69m82fVfhv7B-DDvUI7EaAo8hEALw_wcB");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#name")).sendKeys("Harshavardhan Reddy");
		driver.findElement(By.cssSelector("#email")).sendKeys("thars3423ha2497558h820041@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Harsha@123");
		driver.findElement(By.cssSelector("#mobile")).sendKeys("7416658843");
		driver.findElement(By.cssSelector("div.textWrap")).click();
		driver.findElement(By.className("submitbtn")).click();
	}

}
