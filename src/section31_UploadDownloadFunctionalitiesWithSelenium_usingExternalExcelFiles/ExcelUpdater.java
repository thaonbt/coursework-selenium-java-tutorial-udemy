package section31_UploadDownloadFunctionalitiesWithSelenium_usingExternalExcelFiles;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUpdater {

    public static int getColumnNumber(String filePath, String columnName) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row headerRow = sheet.getRow(0);

            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell cell = headerRow.getCell(i);
                if (cell != null && columnName.equalsIgnoreCase(cell.getStringCellValue())) {
                    System.out.println(columnName+"'s columnNumber: "+i);
                    return i;
                }
            }
            return -1; // Column not found

        } catch (IOException e) {
//            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }

    public static int getRowNumber(String filePath, String fruitName) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            int nameColumnIndex = getColumnNumber(filePath, "fruit_name"); // the column header name

            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Start from 1 to skip header
                Row row = sheet.getRow(i);
                if (row != null) {
                    Cell cell = row.getCell(nameColumnIndex);
                    if (cell != null && fruitName.equalsIgnoreCase(cell.getStringCellValue())) {
                        System.out.println(fruitName+"'s rowNumber: "+i);
                        return i;
                    }
                }
            }
            return -1; // Fruit not found

        } catch (IOException e) {
//            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }

    public static boolean updateCell(String filePath, int rowNumber, int columnNumber, double newPrice) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(rowNumber);

            if (row == null) {
                return false;
            }

            Cell cell = row.getCell(columnNumber);
            if (cell == null) {
                cell = row.createCell(columnNumber);
            }

            cell.setCellValue(newPrice);

            // Write the changes back to the file
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
                return true;
            }

        } catch (IOException e) {
//            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }

    // Example usage
    public static void main(String[] args) {
        String filePath = "upload.xlsx";
        String fruitName = "apple";
        double newPrice = 2.99;

        int priceColumn = getColumnNumber(filePath, "price");
        int fruitRow = getRowNumber(filePath, fruitName);

        if (priceColumn != -1 && fruitRow != -1) {
            boolean updated = updateCell(filePath, fruitRow, priceColumn, newPrice);
            if (updated) {
                System.out.println("Price updated successfully!");
            } else {
                System.out.println("Failed to update price.");
            }
        } else {
            System.out.println("Could not find the specified column or fruit.");
        }
    }
}

