package section09_Synchronization;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assigment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		/* DO LOGIN */
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		
		driver.findElement(By.cssSelector("input[value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		driver.findElement(By.cssSelector("#okayBtn")).click();
//		driver.switchTo().alert().accept();
		
		WebElement dropdownType = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select selectType = new Select(dropdownType);
		selectType.selectByVisibleText("Consultant");
		
		WebElement checkboxAgree = driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
		if(checkboxAgree.isSelected()) {			
		}else {
			checkboxAgree.click();
		}
		
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		/* ADD CART and CHECKOUT*/
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[button/@class='btn btn-info']")));
		List<WebElement> carts = driver.findElements(By.xpath("//div[button/@class='btn btn-info']"));
		for(WebElement cart:carts) {
			cart.click();
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		driver.quit();
	}

}
