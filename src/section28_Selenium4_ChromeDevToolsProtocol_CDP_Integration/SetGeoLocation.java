package section28_Selenium4_ChromeDevToolsProtocol_CDP_Integration;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SetGeoLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		STEP 1 - Initiate Chromium Driver (which is Chrome Driver)
		ChromeDriver driver = new ChromeDriver();
		
//		STEP 2 - Create object for the Chrome DevTools with "getDevTools()" method
//		         which allows to send() the built-in Selenium commands for CDP (Chrome DevTools Protocol)    
		DevTools devTools = driver.getDevTools();
		
//		STEP 3 - Initiate DevTools sessions to send commands from Selenium
		devTools.createSession();
		
//		Send commands to CDP Methods -> CDP Methods will invoke and get access to Chrome DevTools
//		Commands can be explored through this site, https://chromedevtools.github.io/devtools-protocol/
		
//		https://chromedevtools.github.io/devtools-protocol/tot/Emulation/#method-setGeolocationOverride
		
//		https://earth.google.com/web/search/Madrid,+Spain/@40.4379543,-3.67953665,684.66977954a,56619.2215762d,35y,0h,60t,0r/data=CigiJgokCYVyUxjN3zRAEYVyUxjN3zTAGYK9M9uT0VLAITD0s3RGP2bAKAI
//		Spain, Madrird has latitude:40, longtitude:3, accuracy
		Map coordinates = new HashMap();
		coordinates.put("latitude", 40);
		coordinates.put("longtitude", 3);
		coordinates.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		Thread.sleep(2000);
		String title = driver.findElement(By.cssSelector(".our-story-card-title")).getText();
		System.out.println(title);
	}

}
