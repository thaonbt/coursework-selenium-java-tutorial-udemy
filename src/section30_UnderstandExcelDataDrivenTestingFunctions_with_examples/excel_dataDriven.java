package section30_UnderstandExcelDataDrivenTestingFunctions_with_examples;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class excel_dataDriven {

    /*
       Identify Testcases column by scanning the entire 1st row
       once column is identified then scan entire testcase column to identify purchase testcase row
       after you grab purchase testcase row = pull all the data of that row and feed into test
     */

    public AbstractList<String> getData(String testcaseName) throws IOException {

        ArrayList<String> arrList = new ArrayList<>();

        //fileInputStream argument
        String fileSeparator = FileSystems.getDefault().getSeparator();
        Path resourcesPath = Paths.get("src", "section30_UnderstandExcelDataDrivenTestingFunctions_with_examples");
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + fileSeparator + resourcesPath + fileSeparator + "testcases.xlsx");

        //read the file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                //get access to sheet
                XSSFSheet sheet = workbook.getSheetAt(i);

                //identify testcases columnIndex by scanning the entire 1st row
                Iterator<Row> rows = sheet.iterator();              //sheet is collection of rows
                Row firstRow = rows.next();
                Iterator<Cell> cells = firstRow.cellIterator();     //row is collection of cells
                int k = 0;
                int columnIndex = 0;
                while (cells.hasNext()) {
                    Cell value = cells.next();
                    if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
                        //desired columnIndex
                        columnIndex = k;
                        //pull all the data of that columnIndex
                    }
                    k++;
                }
                System.out.println("columnIndex: " + columnIndex);

                //once columnIndex is identified then scan entire testcase columnIndex to identify purchase testcase row
                while (rows.hasNext()) {
                    Row row = rows.next();
                    if (row.getCell(columnIndex).getStringCellValue().equalsIgnoreCase(testcaseName)) {
                        //after you grab purchase testcase row = pull all the data of that row and feed into test
                        Iterator<Cell> cv = row.cellIterator();
                        while (cv.hasNext()) {
                            Cell cell = cv.next();
                            switch (cell.getCellType()){
                                case STRING ->
//                                      System.out.println(cell.getStringCellValue());
                                        arrList.add(cell.getStringCellValue());
                                case NUMERIC ->
//                                      System.out.println(cell.getNumericCellValue());
                                        arrList.add(NumberToTextConverter.toText(cell.getNumericCellValue()));
                                default ->
                                        throw new IllegalStateException("Unexpected value: " + cv.next().getCellType());
                            }

                        }
                    }
                }
            }
        }
        return arrList;
    }


    public static void main(String[] args) {


    }
}
