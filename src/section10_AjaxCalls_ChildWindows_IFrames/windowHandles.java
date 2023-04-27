package section10_AjaxCalls_ChildWindows_IFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();	// [parentid, childid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();	// zero index is [parentid]
		String childId = it.next();		// 1st index is [childid]
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		System.out.println("Username before input" + driver.findElement(By.cssSelector("#username")).getText());
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
		System.out.println("Username after input" + driver.findElement(By.cssSelector("#username")).getText());
		
		driver.quit();
	}

}
