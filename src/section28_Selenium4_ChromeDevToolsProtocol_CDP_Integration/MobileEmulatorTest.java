package section28_Selenium4_ChromeDevToolsProtocol_CDP_Integration;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v131.emulation.Emulation;

public class MobileEmulatorTest {

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
		
//		https://chromedevtools.github.io/devtools-protocol/tot/Emulation/#method-setDeviceMetricsOverride
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty()));

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Library")).click();
	}

}
