package section30_UnderstandExcelDataDrivenTestingFunctions_with_examples;

import java.io.IOException;
import java.util.AbstractList;

public class testSample {

    public static void main(String[] args) throws IOException {

        excel_dataDriven d = new excel_dataDriven();
        AbstractList<String> data = d.getData("Add Profile");
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }

}
