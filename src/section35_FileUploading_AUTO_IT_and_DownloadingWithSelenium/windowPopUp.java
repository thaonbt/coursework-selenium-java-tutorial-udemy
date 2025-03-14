package section35_FileUploading_AUTO_IT_and_DownloadingWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopUp {

    public static void main (String[] args) {
        WebDriver driver = new ChromeDriver();
        /* Opt1: follow this syntax to input the username and password
        * http://username:password@url
        */
        driver.get("http://admin:admin@the-internet.herokuapp.com/");

        /* Opt2: use app "autoIT" to input the username and password
        * notice: autoIT (for Windows) is not a part of selenium, it is a separate tool
        * autoIT Steps:
        * download and install autoIT
        * then create a script to input the username and password
        * then compile the script to .exe file
        * then use the .exe file in the selenium code
        * then run the selenium code
        * then the username and password will be automatically inputted
        * */
    }
}
