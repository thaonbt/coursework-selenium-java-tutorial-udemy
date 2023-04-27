package section13_MiscellaneousTopicsInSeleniumWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//Ex: test the login feature, 
		//if there is no sessionKey after login
		//the site should automatically redirect to the login page whenever interact on the site
		driver.manage().deleteCookieNamed("sessionKey???");
		
		
		driver.get("http://google.com");
		
		/** Take screenshot */
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C://screenshot.png"));	// -> Error: Access is denied
		FileUtils.copyFile(src, new File("D://screenshot.png"));
		
		driver.close();
	}

}
