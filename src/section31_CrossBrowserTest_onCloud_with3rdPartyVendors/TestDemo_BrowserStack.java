package section31_CrossBrowserTest_onCloud_with3rdPartyVendors;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import graphql.Assert;

/**
 * This will demo on BrowserStack, https://www.browserstack.com
 * 
 * 1. Login BrowserStack
 * 2. At "Get Started", select the correct environment for tests (example: "Java/ TestNG")
 *    (ref: https://automate.browserstack.com/dashboard/v2/quick-start/get-started)
 *    
 * 3. Follow the site instruction to "Run a sample Build", which briefs as below:
 *    STEP 1 - Clone the sample repository
 *				 # Clone our sample repo
 *				 git clone -b sdk https://github.com/browserstack/testng-browserstack.git
 *				 # cd into testng-browserstack
 *				 cd testng-browserstack
 *				 # Install dependencies
 *				 mvn compile
 *   				 
 *    STEP 2 - Configure test script, file "browserstack.yml"
 *    		   a. Set access credentials: [userName] and [accessKey]
 *    		   b. Configure browser or device combinations
 *    		   c. Copy and replace the "browserstack.yml" config file 
 * 
 *    STEP 3 - Execute build on BrowserStack
 *    		    # Run from inside the sample repository
 *    			mvn test -P sample-test
 */


public class TestDemo_BrowserStack {

	@Test
	public void titleCheck() throws MalformedURLException {
		
		MutableCapabilities caps = new MutableCapabilities();
		
//		https://hub.browserstack.com/wd/hub
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
		driver.get("http://rahulshettyacademey.com");
		AssertJUnit.assertTrue(driver.getTitle().matches("Rahul Shetty Academy"));
		
	}
	
}
