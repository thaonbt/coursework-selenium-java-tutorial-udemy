package section03to08_Introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// implicit wait - # seconds timeout -> wait for showing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahuls");
		driver.findElement(By.name("inputPassword")).sendKeys("Rahuls");
		
//		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//pause 1 second before continue (for now, use Java syntax)
		//equal "explicit wait" (will be taught later) -> wait for stable		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jo");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@cloud.com");
		
		//xPath and cssSelector may have difference in index because
		//xPath ignore the hidden elements, while cssSeletor includes those.
//		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@apple.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("983762534");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
//		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[contains(@class,'forgot-pwd')]/button[1]")).click();
		Thread.sleep(2000);
		//get the password (later lesson, but now use the known one)
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahuls");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
//		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		driver.close();
	}

}
