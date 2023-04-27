package section09_Synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverWaitTest {

	public static void main(String[] args) {
		/** There are 2 ways to achieve SYNCHRONIZATION in Selenium Webdriver 
		 * - ExplicitWait 
		 *   |- WebDriverWait
		 *   |- FluentWait
		 * - ImplicitWait
		 */
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		WebElement finishedMssg = driver.findElement(By.cssSelector("[id='finish'] h4"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(finishedMssg));
		
		System.out.println(finishedMssg.isDisplayed());
		System.out.println(finishedMssg.getText());
		
		driver.quit();

	}

}
