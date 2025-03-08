package section03to08_Introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignementJavaAlert {

	public static void main(String[] args) {

		String strText = "Rahul";
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(strText);
		
		driver.findElement(By.id("alertbtn")).click();		
		//Java alert displays, Selenium cannot work with that dialog
		//so need to switch to in order to click possitive buttons like "OK", "Yes"...
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();		
		//Java alert displays, Selenium cannot work with that dialog
		//so need to switch to in order to click "negative buttons like "Cancel", "No"...
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		driver.close();
	}

}
