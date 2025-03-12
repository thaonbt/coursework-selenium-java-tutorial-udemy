package section12_PracticalProblemsAndMethodsToHandlesThemWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Assignment7 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String courseName = "Appium ";
//        try {
            WebElement tableCourse = driver.findElement(By.xpath("//td[contains(text(),'"+courseName+"')]"));
//            WebElement tableInstructor = driver.findElement(with(By.tagName("td")).toLeftOf(tableCourse));
//            WebElement tablePrice = driver.findElement(with(By.tagName("td")).toRightOf(tableCourse));
            WebElement tableInstructor = driver.findElement(By.xpath("//td[contains(text(),'"+courseName+"')]/preceding-sibling::td"));
            WebElement tablePrice = driver.findElement(By.xpath("//td[contains(text(),'"+courseName+"')]/following-sibling::td"));
            if (tableCourse.isDisplayed()){
                System.out.println(tableInstructor.getText());
                System.out.println(tableCourse.getText());
                System.out.println(tablePrice.getText());
            } else {
                System.out.println("Table is empty");
            }
            driver.quit();
//        } catch (Exception e) {
//            System.out.println("Table not found");
//        } finally {
//            driver.quit();
//        }

    }

}
