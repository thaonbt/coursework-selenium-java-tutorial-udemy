package section30_UnderstandExcelDataDrivenTestingFunctions_with_examples;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractList;

public class testDataProvide {

    DataFormatter formatter = new DataFormatter();

    @Test(dataProvider = "dataProvider1")
    public void testDataProvider1 (String testcasename, String data1, String data2, String data3) {
        System.out.println(testcasename+data1+data2+data3);
    }

    @Test(dataProvider = "dataProvider2")
    public void testDataProvider2 (String testcasename, String data1, String data2, String data3) {
        System.out.println(testcasename+data1+data2+data3);
    }

    @DataProvider(name="dataProvider1")
    public  Object[][] getExcelDataProvider1() throws IOException {
        excel_dataDriven excelData = new excel_dataDriven();
        AbstractList<String> data = excelData.getData("Add Profile");
        return new Object[][]{{data.get(0), data.get(1), data.get(2), data.get(3)} };
    }

    @DataProvider(name="dataProvider2")
    public Object[][] getExcelDataProvider2() throws IOException {
        //fileInputStream argument
        String fileSeparator = FileSystems.getDefault().getSeparator();
        Path resourcesPath = Paths.get("src", "section30_UnderstandExcelDataDrivenTestingFunctions_with_examples");
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + fileSeparator + resourcesPath + fileSeparator + "testcases.xlsx");

        //read the file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("testdata");
        int rowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(1);
        int columnCount = row.getLastCellNum();

        Object[][] data = new Object[rowCount-1][columnCount];

        // Populate the data array
        for (int i = 0; i < rowCount-1; i++) { // Start from 0 include header
//            System.out.println("outer loop started");
            row = sheet.getRow(i+1);
            for (int j = 0; j < columnCount; j++) {
//                System.out.println(row.getCell(j));
                XSSFCell cell = row.getCell(j);
                data[i][j] = formatter.formatCellValue(cell);
                /*if (row.getCell(j) != null) {
                    switch (row.getCell(j).getCellType()) {
                        case STRING:
                            data[i][j] = row.getCell(j).getStringCellValue();
                            break;
                        case NUMERIC:
                            data[i][j] = NumberToTextConverter.toText(row.getCell(j).getNumericCellValue());
                            break;
                        case BLANK:
                            data[i][j] = "";
                            break;
                        default:
                            data[i][j] = null;
                    }
                }*/

            }
//            System.out.println("outer loop ended");
        }

        return data;
    }

}
