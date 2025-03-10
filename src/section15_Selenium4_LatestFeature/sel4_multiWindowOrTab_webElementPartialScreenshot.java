package section15_Selenium4_LatestFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel4_multiWindowOrTab_webElementPartialScreenshot {

	public static void main(String[] args) throws IOException {
		
//		Land on 'https://rahulshettyacademy.com'
//		Capture 1st course name
//		Land on 'https://rahulshettyacademy.com/angularpractice'
//		Input the 1st course name into Name field
		
		/** Window Handles */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator(); 
		String parentWindowId = it.next();		// zero index is [parentid]
		String childWindowId = it.next();		// 1st index is [childid]
		
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		
		driver.switchTo().window(parentWindowId);
		WebElement name = driver.findElement(By.name("name"));
		
		name.sendKeys(courseName);
		
		/** WebElement partial screenshot */
		File srcFile = name.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("logo.png"));
		String fileSeparator = FileSystems.getDefault().getSeparator();
		Path resourcesPath = Paths.get("src", "section15_Selenium4_LatestFeature","screenshot");
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+fileSeparator+resourcesPath+fileSeparator+"logo.png"));

		/** WebElement widht height*/
		System.out.println(name.getRect().getDimension().getWidth());
		System.out.println(name.getRect().getDimension().getHeight());

//		driver.close();
		driver.quit();

	}

}
