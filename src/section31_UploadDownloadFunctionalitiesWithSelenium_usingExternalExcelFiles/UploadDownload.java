package section31_UploadDownloadFunctionalitiesWithSelenium_usingExternalExcelFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class UploadDownload {

    public static void main(String[] args) throws InterruptedException, IOException {

        String fileSeparator = FileSystems.getDefault().getSeparator();
        Path resourcesPath = Paths.get("src", "section31_UploadDownloadFunctionalitiesWithSelenium_usingExternalExcelFiles");
        String fileName = "download.xlsx";
        String file = System.getProperty("user.dir")+fileSeparator+resourcesPath+fileSeparator+fileName;
        String fruitName = "Apple";
        double newPrice = Double.parseDouble("350.0");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");

        //data before edit
        String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getDomAttribute("data-column-id");
        double originalPrice = Double.parseDouble(driver.findElement(By.xpath("//div[text()='"+fruitName+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']")).getText());
        System.out.println("originalPrice: "+originalPrice);

        //download Excel file
        //driver.findElement(By.id("downloadButton")).click();

        //edit Excel file
        int col = ExcelUpdater.getColumnNumber(file, "price");
        int row = ExcelUpdater.getRowNumber(file, fruitName);
        ExcelUpdater.updateCell(file, row, col, newPrice);
        System.out.println("newPrice: "+newPrice);

        //upload Excel file
        WebElement upload = driver.findElement(By.id("fileinput"));
        upload.sendKeys(file);

        //wait for success message to show up and then disappear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
        String toastText = driver.findElement(toastLocator).getText();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
        System.out.println(toastText);
        Assert.assertEquals(toastText, "Updated Excel Data Successfully.");

        //verify the updated Excel data showing up on the page table
//        String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
        double actualPrice = Double.parseDouble(driver.findElement(By.xpath("//div[text()='"+fruitName+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']")).getText());
        System.out.println("actualPrice: " + actualPrice);
        Assert.assertEquals(actualPrice, newPrice);

        //quit browser
        driver.close();
    }

}
