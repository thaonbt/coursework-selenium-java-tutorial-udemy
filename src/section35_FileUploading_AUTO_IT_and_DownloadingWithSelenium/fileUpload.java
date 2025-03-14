package section35_FileUploading_AUTO_IT_and_DownloadingWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class fileUpload {

    static String fileSeparator = FileSystems.getDefault().getSeparator();
    static Path resourcesPath = Paths.get("src", "section35_FileUploading_AUTO_IT_and_DownloadingWithSelenium");
    static String packageName = "section35_FileUploading_AUTO_IT_and_DownloadingWithSelenium";
    static String packagePath = resourcesPath+fileSeparator+packageName;

    public static void main(String[] args) throws InterruptedException, IOException {
        //use autoIT to upload a file
        //download and install autoIT
        //create a script to upload a file
        //- "Au3info" to get the control/component properties of the window
        //- sample script:
        //  |-ControlFocus("Open","","Edit1")
        //  |-ControlSetText("Open","","Edit1","C:\Users\rahul\Documents\check\visit.pdf")
        //  |-ControlClick("Open","","Button1")
        //compile the script to .exe file
        //- build the script by -scite.exe
        //- save it as .au3 file
        //- convert it to .exe file by Tools -> Compile
        //call the .exe file in the selenium code by Runtime.getRuntime().exec("path of the .exe file")
        //run the selenium code
        //the file will be uploaded

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        wait
                .until(ExpectedConditions.visibilityOf(fileUpload))
                .click();
        sleep(3000);

        String fileName = "fileUpload.exe";
        String fileCommand = packagePath+fileName;
        Runtime.getRuntime().exec(fileCommand);
        sleep(3000);

        driver.close();
    }

}
