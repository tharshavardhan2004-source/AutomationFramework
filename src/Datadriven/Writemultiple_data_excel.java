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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writemultiple_data_excel {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("links");
		for(int i=0;i<links.size();i++)
		{
			WebElement link = links.get(i);
			String url =link.getAttribute("href");
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(url);
		}
		FileOutputStream fls=new FileOutputStream("./Exceldata/flipkart_links.xlsx");
		book.write(fls);
		book.close();
		fls.close();
		System.out.println("Data is written");
		driver.quit();
		
	
	}

}
