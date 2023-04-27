package section10_AjaxCalls_ChildWindows_IFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");		
		
		selectExample(driver, "Nested Frames");

		driver
//			.switchTo().frame(driver.findElement(By.tagName("frameset")))		
			.switchTo().frame(driver.findElement(By.name("frame-top")))
//			.switchTo().frame(driver.findElement(By.name("frameset-middle")))
			.switchTo().frame(driver.findElement(By.name("frame-middle")));
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.quit();
	}
	
	private static void selectExample(WebDriver driver, String exampleName) {
		List<WebElement> examples = driver.findElements(By.cssSelector("ul li a"));
		for(WebElement example: examples) {
			if(example.getText().equalsIgnoreCase(exampleName)) {
				example.click();
				break;
			}
		}
	}

}
