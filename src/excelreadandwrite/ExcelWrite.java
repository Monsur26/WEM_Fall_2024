package excelreadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    public void ExcelWriteFile(String newFileName){
        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("NewSheet");

            Row row1 = sheet.createRow(0);
            Row row2 = sheet.createRow(1);

            Cell cell1row1 = row1.createCell(0);
            cell1row1.setCellValue("Username");
            Cell cell2row1 = row1.createCell(1);
            cell2row1.setCellValue("Password");

            Cell cell1row2 = row2.createCell(0);
            cell1row2.setCellValue("User");
            Cell cell2row2 = row2.createCell(1);
            cell2row2.setCellValue("Pass");


            final String path = "C:\\Users\\Monsu\\Fall2024FirstProject\\Document\\"+newFileName+".xlsx";
            File file = new File(path);
            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        ExcelWrite excelWrite = new ExcelWrite();
        excelWrite.ExcelWriteFile("Monsur");

    }
}
