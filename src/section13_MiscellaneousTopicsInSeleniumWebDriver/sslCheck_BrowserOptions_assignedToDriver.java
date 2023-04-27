package section13_MiscellaneousTopicsInSeleniumWebDriver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * ChromeOptions
 * https://chromedriver.chromium.org/capabilities
 */

public class sslCheck_BrowserOptions_assignedToDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());		// -> Privacy Error
		driver.close();
		
		//This helps to define how the browser should behave
		ChromeOptions options = new ChromeOptions();
//		FirefoxOptions options = new FirefoxOptions();
//		EdgeOptions options = new EdgeOtions();
		
		/** tell the driver to simply accept the Insecure Certificates whenever meets it */
		options.setAcceptInsecureCerts(true);	 
		
		/** block/unblock pop-up windows */
		options.setExperimentalOption(			 
				"excludeSwitches", 
				Arrays.asList("disable-popup-blocking"));
		
		/** set download directory */
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.default_directory", "/directory/path");
//		options.setExperimentalOption("preps", prefs);
		
		/** set add-on extensions go with browser driver */
//		options.addExtensions("filepaths");		
		
		/** Set proxy will be used for browser driver */
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("192.168.1.0:4444");
//		options.setCapability("proxy", proxy); 	// -> browser will start with proxy
		
		driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
