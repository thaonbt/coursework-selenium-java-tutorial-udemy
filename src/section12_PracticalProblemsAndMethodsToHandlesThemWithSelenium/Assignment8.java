package section12_PracticalProblemsAndMethodsToHandlesThemWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment8 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String text = "United States (USA)";
        WebElement element = driver.findElement(By.id("autocomplete"));

        element.sendKeys(text.subSequence(0,3));
        Thread.sleep(2000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase(text)){
                option.click();
                break;
            }
        }

        driver.quit();
    }
}
