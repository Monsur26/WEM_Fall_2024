package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NotDirectoryException;

public class ExcelRead {
    public void ExcelReadFile(String path){
        try {
            //final String path = "C:\\Users\\Monsu\\Fall2024FirstProject\\Document\\datafile.xlsx";
            File file = new File(path);
            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.getStringCellValue() + "\t");
                }
                System.out.println();
            }
        } catch (IOException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        ExcelRead excelRead = new ExcelRead();
        final String path = "C:\\Users\\Monsu\\Fall2024FirstProject\\Document\\datafile.xlsx";
        excelRead.ExcelReadFile(path);
    }
}
