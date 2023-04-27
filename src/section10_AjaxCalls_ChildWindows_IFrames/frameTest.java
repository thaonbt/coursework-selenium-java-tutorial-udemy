package section10_AjaxCalls_ChildWindows_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
//		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
//		driver.switchTo().frame(0);  //risky in use as the app might be change without knowledge
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//		driver.findElement(By.id("draggable")).click();		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();		// Switch back to default window, not frame anymore
		System.out.println(driver.findElement(By.cssSelector("a[title='jQuery UI']")).getText());
		
		driver.quit();

	}

}
