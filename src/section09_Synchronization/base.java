package section09_Synchronization;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] itemsNeeded = { "Cucumber", "Brocolli" };
//		int j = 0;

		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); <- this is deprecated.
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  <- Know where is the delay to use the Explicit wait instead, to 
//		                                                                       (1) improve performance; 
//		                                                                       (2) avoid to miss aut issues which occors in seconds only
		
		//Explicit wait
//		WebDriverWait w = new WebDriverWait(driver, 5);  <- this is deprecated.
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

		/*
		 * List<WebElement> products =
		 * driver.findElements(By.cssSelector("h4.product-name"));
		 * 
		 * FOR ADDING 1 ITEM // for (int i = 0; i < products.size(); i++) { // String
		 * name = products.get(i).getText(); // if (name.contains("Cucumber")) { //
		 * //Click "ADD TO CART" //
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
		 * ); // break; // } // }
		 * 
		 * FOR ADDING MULTI ITEMS for (int i = 0; i < products.size(); i++) { Format it
		 * to get actual vegetable name // Brocolli - 1 Kg // split("-") -> Brocolli, 1
		 * Kg String[] name = products.get(i).getText().split("-"); // name[0] -
		 * "Brocolli " // name[1] - " 1 Kg" String formattedName = name[0].trim();
		 * 
		 * Convert array into array list for // |- easy search // |- another reason is
		 * to save memory as arrayList take more than Array // Check whether name you
		 * extracted is present in arrayList or not List<String> itemsNeededList =
		 * Arrays.asList(itemsNeeded);
		 * 
		 * //int j=0; -> move to top, not in the FOR loop if
		 * (itemsNeededList.contains(formattedName)) { j++; // Click "ADD TO CART" //
		 * Avoid dynamic text, "ADD TO CART" change to "ADDED" //
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
		 * );
		 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
		 * .click(); // break; // need condition like "int j" to do break, ex: 3 times
		 * // if(j==itemsNeededList.size()) { // break; // } if(j==itemsNeeded.length) {
		 * break; } } }
		 */

//		driver.close();
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		/* FOR ADDING 1 ITEM */
//		for (int i = 0; i < products.size(); i++) {
//			String name = products.get(i).getText();
//			if (name.contains("Cucumber")) {
//				//Click "ADD TO CART"
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//			}
//		}

		/* FOR ADDING MULTI ITEMS */
		int j = 0;
		
		for (int i = 0; i < products.size(); i++) {
			/* Format it to get actual vegetable name */
			// Brocolli - 1 Kg
			// split("-") -> Brocolli, 1 Kg
			String[] name = products.get(i).getText().split("-");
			// name[0] - "Brocolli "
			// name[1] - " 1 Kg"
			String formattedName = name[0].trim();

			/* Convert array into array list for */
			// |- easy search
			// |- another reason is to save memory as arrayList take more than Array
			// Check whether name you extracted is present in arrayList or not
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			//int j=0; -> move to top, not in the FOR loop
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// Click "ADD TO CART"
				// Avoid dynamic text, "ADD TO CART" change to "ADDED"
				// driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break;
				// need condition like "int j" to do break, ex: 3 times
//				if(j==itemsNeededList.size()) {
//					break;
//				}
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}
	}
}	
	
