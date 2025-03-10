package section03to08_Introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		Question 1 -> Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		System.out.println(driver.findElement(By.xpath("//div[@id='discount-checkbox']/div[1]/input")).isSelected());
//		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='discount-checkbox']/div[1]/input")).isSelected());
		driver.findElement(By.xpath("//div[@id='discount-checkbox']/div[1]/input")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='discount-checkbox']/div[1]/input")).isSelected());
//		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='discount-checkbox']/div[1]/input")).isSelected());
		
//		Question 2 -> Count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		
		driver.close();
	}

}
