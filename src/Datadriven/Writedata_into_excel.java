package Datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata_into_excel 
{
	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("logindata");
		XSSFRow row_0 = sheet.createRow(0);
		XSSFCell cell_0 = row_0.createCell(0);
		XSSFCell cell_1 = row_0.createCell(1);
		cell_0.setCellValue("admin");
		cell_1.setCellValue("admin@123");
		FileOutputStream fls=new FileOutputStream("./Exceldata/output.xlsx");
		book.write(fls);
		book.close();
		fls.close();
		System.out.println("Data is written");
		
		
		
	}

}
