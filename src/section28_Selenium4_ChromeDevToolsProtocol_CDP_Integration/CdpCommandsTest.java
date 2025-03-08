package section28_Selenium4_ChromeDevToolsProtocol_CDP_Integration;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class CdpCommandsTest {

	public static void main(String[] args) throws InterruptedException {
		
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
//		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		Map deviceMetrics = new HashMap();
		deviceMetrics.put("width", 600);
		deviceMetrics.put("height", 1000);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Library")).click();
	}

}
