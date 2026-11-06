package Datadriven;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

    public static void main(String[] args) throws IOException {

        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Sheet1");

        Row row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("admin");
        row1.createCell(1).setCellValue("admin123");
        row1.createCell(2).setCellValue("admin@123");

        Row row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("user1");
        row2.createCell(1).setCellValue("user123");
        row2.createCell(2).setCellValue("user1@123");

        Row row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("test1");
        row3.createCell(1).setCellValue("test123");
        row3.createCell(2).setCellValue("test1@123");

        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\Harshavardhan Reddy\\OneDrive\\Desktop\\Data.xlsx");

        workbook.write(fos);

        workbook.close();
        fos.close();

        System.out.println("Data written successfully");
    }
}