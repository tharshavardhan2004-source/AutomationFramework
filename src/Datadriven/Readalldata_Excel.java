package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readalldata_Excel 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream fls = new FileInputStream("C:\\Users\\Harshavardhan Reddy\\OneDrive\\Desktop\\Testdata.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.getSheet("data");
		int lastrow = sheet.getLastRowNum();
		int lastcell = sheet.getRow(0).getLastCellNum();
		for(int r=0;r<=lastrow;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<lastcell;c++)
			{
				XSSFCell cell=row.getCell(c);
				String value = cell.getStringCellValue();
				System.out.print(value+" \t");
			}
			System.out.println(" ");
		}
				
	}

}

