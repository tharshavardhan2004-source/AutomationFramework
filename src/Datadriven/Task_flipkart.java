package Datadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_flipkart
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		WebElement srch = driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']"));
		srch.sendKeys("puma shoes");
		Thread.sleep(2000);
		WebElement srcbtn = driver.findElement(By.xpath("//button[@class='XFwMiH']"));
		srcbtn.click();
		List<WebElement> title = driver.findElements(By.xpath("//a[@class='atJtCj']"));
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("tiles");
		for(int i=0;i<title.size();i++)
		{
			WebElement name = title.get(i);
			String ele = name.getAttribute("title");
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(ele);
			
		}
		
		WebElement src = driver.findElement(By.xpath("//button[@class='XFwMiH']"));	
		Actions act=new Actions(driver);
		FileOutputStream fls=new FileOutputStream("./Exceldata/titles.xlsx");
		book.write(fls);
		book.close();
		fls.close();
		System.out.println("Data is written");
		driver.quit();
		
		
		
	}

}

//input[@class='nw1UBF v1zwn26'])[2]
//button[starts-with(@title,'Search for') and @type='button']