package section11_RealTimeExercise_EndToEndProgramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String optionValue = "option2";
        WebElement checkBox = driver.findElement(By.xpath("//input[@value='"+optionValue+"']"));
        WebElement checkBoxLabel = driver.findElement(By.xpath("//input[@value='"+optionValue+"']//parent::label"));
        checkBox.click();
        String checkBoxValue = checkBoxLabel.getText().trim();
        System.out.println("Selecting checkbox: "+ checkBoxValue);

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select dropdownSelect = new Select(dropDown);
        dropdownSelect.selectByVisibleText(checkBoxValue);
        System.out.println("Selecting dropdown: "+dropdownSelect.getFirstSelectedOption().getText());

        WebElement nameTextbox = driver.findElement(By.name("enter-name"));
        nameTextbox.sendKeys(checkBoxValue);
        System.out.println("Name textbox: "+nameTextbox.getAttribute("value"));

        driver.quit();

    }

}
