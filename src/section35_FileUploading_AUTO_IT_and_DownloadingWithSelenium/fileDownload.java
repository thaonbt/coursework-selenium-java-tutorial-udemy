package section35_FileUploading_AUTO_IT_and_DownloadingWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;

import static java.lang.Thread.sleep;

public class fileDownload {

    static String fileSeparator = FileSystems.getDefault().getSeparator();
    static String packageName = "section35_FileUploading_AUTO_IT_and_DownloadingWithSelenium";
    static Path resourcesPath = Paths.get("src", packageName);
    static String packagePath = System.getProperty("user.dir")+fileSeparator+resourcesPath.toString();

    public static void main(String[] args) throws InterruptedException, IOException {

        //use autoIT to download a file
        //download and install autoIT
        //create a script to download a file
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

        //configure the download path on Chrome
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", packagePath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/download");

        String downloadFile = "Test PDF.pdf";
        WebElement filePDF = driver.findElement(By.linkText(downloadFile));
        wait
                .until(ExpectedConditions.visibilityOf(filePDF))
                .click();
        sleep(3000);

        File downloadedFile = new File(packagePath + fileSeparator+ downloadFile);
        if(downloadedFile.exists()){
            System.out.println("File downloaded successfully");
            Assert.assertTrue(downloadedFile.exists());
            downloadedFile.deleteOnExit();
            if(downloadedFile.delete()){
                Assert.assertFalse(downloadedFile.exists());
                System.out.println("File deleted successfully");
            } else {
                System.out.println("File not deleted");
            }
        } else {
            System.out.println("File not downloaded");
        }

        driver.close();
    }

}
