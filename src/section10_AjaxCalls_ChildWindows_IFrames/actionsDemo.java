package section10_AjaxCalls_ChildWindows_IFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement moveElement = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(50));		
		Actions a = new Actions(driver);
		
		// The page request Captcha to continue, then place wait here to allow manual input the captcha.
		w.until(ExpectedConditions.elementToBeClickable(moveElement));
		
		/* Click -> Hold SHILT -> Type -> Select all text by Double Click */
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).doubleClick().sendKeys("hello").build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).clickAndHold().doubleClick().sendKeys(" world").build().perform();
		
		/* Moves to Specific element */
		a.moveToElement(moveElement).build().perform();
		
		/* Moves to Specific element and Right-click on it */
		a.moveToElement(moveElement).contextClick().build().perform();
		
		
		driver.quit();
	}

}
