package section13_MiscellaneousTopicsInSeleniumWebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks_HttpURLConnecion_softAssert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/** Broken links */
		//Step 1 - IS to get all urls tied up to the links using Selenium 
		//Java methods will call URL's and gets the status code
		//if status code is >400 th that url is not working -> link which tied up with the url is broken
		
		SoftAssert softAssert = new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link: links) {
			String url = link.getAttribute("href");
			
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			
			/**test will stop whenever have a fail Assertion, and skip remain assertions */
//			if(respCode > 400) {
//				System.out.println("The link with Text: '" + link.getText() + "' is broken with code " + respCode + " and URL is'" + url + "'.");
//				Assert.assertTrue(false);
//			}
//			//equal to the above IF-condition
//			Assert.assertTrue(respCode < 400, "The link with text '" + link.getText() + "' is broken with code " + respCode + " and URL is'" + url + "'.");
			
			/** use SoftAssert to avoid stop when failures */
			softAssert.assertTrue(respCode < 400, "The link with text '" + link.getText() + "' is broken with code " + respCode + " and URL is'" + url + "'.");
		}
		
		softAssert.assertAll();
		
		driver.close();
	}
	
}
