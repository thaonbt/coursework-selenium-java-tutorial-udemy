package section09_Synchronization;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitTest {

	public static void main(String[] args) {
		
		/**
		 * EXPLICIT WAIT (WebDriverWait) and FLUENT WAIT (FluentWait) are 2 mostly similar classes implement the Wait Interface,
		 * one difference is
		 * - Explicit wait = 10 seconds (means keep seconds to repeat and stop whenever timeout/object gets found)
		 * - Fluent wait = 10 seconds, Pollings 4 seconds (means keep repeat regularly in 4 seconds and stop whenever timeout/object gets found)
		 * Example: Online payment process, <1> Card is accepted (3sec); <2> Order is being processed (7sec); <3> Confirmation
		 * The element at <1> and <2> is the same, so Explicit Wait cannot use in this situation.
		 * 
		 * Website of good samples to practise/demo
		 * https://the-internet.herokuapp.com
		 * 
		 * Website of code template (syntax)
		 * https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html
		 */
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 3 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}else{
					return null;
				}
			}
			/* This does not work for hidden elements on the page*/
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.cssSelector("[id='finish'] h4"));
//			}
		});
		
		System.out.println(foo.isDisplayed());
		System.out.println(foo.getText());
		
		driver.quit();
		
	}

}
