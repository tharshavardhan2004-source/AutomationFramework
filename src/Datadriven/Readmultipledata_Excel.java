package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readmultipledata_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fls=new FileInputStream("./Exceldata/flipkart_links.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fls);
		XSSFSheet sheet = book.getSheet("links");
		int lastrow = sheet.getLastRowNum();
		for(int i=0;i<lastrow;i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			System.out.println(i+" "+cell.getStringCellValue());
		}
		book.close();
		fls.close();
		
		
	}

}
