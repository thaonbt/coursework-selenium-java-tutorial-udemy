package section03to08_Introduction;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String strName = "ThaoNBT";
		String strEmail = "ThaoNBT@domain.com";
		String strPassword = "p@ssw0rd";
		String strGender = "Female";
		String strEmploymentStatus = "Student";
		String strDOB = "01/01/1986";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input[@name=\"name\"]")).sendKeys(strName);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(strEmail);
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys(strPassword);
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		
		WebElement dropdownGender= driver.findElement(By.id("exampleFormControlSelect1"));
		Select selectGender = new Select(dropdownGender);		
		selectGender.selectByVisibleText(strGender);		
		driver.findElement(By.xpath("//input[@id='inlineRadio1']/following-sibling::label[text()='"+strEmploymentStatus+"']")).click();
		
		driver.findElement(By.name("bday")).sendKeys(strDOB);

		driver.findElement(By.cssSelector(".btn-success")).click();
		
		String strAlertMssg = driver.findElement(By.cssSelector(".alert")).getText();
		System.out.println(strAlertMssg);
//		Assert.assertEquals(strAlertMssg, "Success! The Form has been submitted successfully!.");
		
		driver.close();
		
	}

}
