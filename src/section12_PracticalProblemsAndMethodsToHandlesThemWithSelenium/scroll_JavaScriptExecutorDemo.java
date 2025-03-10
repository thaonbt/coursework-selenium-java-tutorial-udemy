package section12_PracticalProblemsAndMethodsToHandlesThemWithSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Scroll window
 * to avoid unstable run due to scroll issue
 * usually caused when running headless mode (not open browser)
 */

public class scroll_JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Cast driver to JavascripExecutor, so it can do scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//In browser console, try to evaluate the scroll
		//window.scrollBy(0,500)	-> scroll the whole window
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//In Selenium, we have driver.findElement(By.cssSelector("..."))
		//In JavaScript, we have document.querySelector("...")
		//document.querySelector...		-> to scroll a table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		List<WebElement> amountCells = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int expectedTotal=0;
		for(int i=0; i<amountCells.size(); i++) {
			expectedTotal = expectedTotal + Integer.parseInt(amountCells.get(i).getText());
		}
		
		System.out.println(expectedTotal);
		
		driver.findElement(By.className("totalAmount")).getText();	// -> Total Amount Collected: 296
		int actualTotal = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertTrue(expectedTotal==actualTotal);
	}


}
