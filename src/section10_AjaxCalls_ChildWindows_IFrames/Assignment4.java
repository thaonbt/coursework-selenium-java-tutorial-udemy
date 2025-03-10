package section10_AjaxCalls_ChildWindows_IFrames;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");		
		
		selectExample(driver, "Multiple Windows");
		driver.findElement(By.cssSelector(".example a")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

		driver.quit();
	}
	
	private static void selectExample(WebDriver driver, String exampleName) throws InterruptedException {
		List<WebElement> examples = driver.findElements(By.cssSelector("ul li a"));
		for(WebElement example: examples) {
			if(example.getText().equalsIgnoreCase(exampleName)) {
				example.click();
				break;
			}
		}
	}
}
