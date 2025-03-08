package section27_CrossBrowserTestWith_SeleniumGrid;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * 
 * Selenium GRID - a smart proxy server that make it be easy to run tests in parallel on multiple machines
 * (ref: https://www.selenium.dev/documentation/)
 * 
 * HOW?
 *  1. Download "Selenium Server (Grid)" from https://www.selenium.dev/downloads/
 *  2. Download web drivers, ex: chromedriver.exe
 *  3. Place (1) and (2) in a same folder
 *  4. Open cmd and Access the folder (3) to:
 *  4.1. Start  HUB by command: java -jar <SeleniumJarName.jar(1)> hub
 *  4.2. Start NODE by command: 
 *       * if on the same machine:  java -jar <SeleniumJarName.jar(1)> node --detect-drivers true
 *       * if on the diff machine:  java -jar <SeleniumJarName.jar(1)> node --detect-drivers true --publish-events tcp://<IPofHUB:portA> --subscribe-events tcp://<IPofHUB:portB>
 *         (see IP address at XBIND command)
 *  5. Selenium grid can be seen at http://localhost:4444
 *
 */

public class RSATest {

	@Test
	public void HomePageCheck() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN10);
		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.1:4444"), caps);
		driver.get("http://rahulshettyacademey.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
}
