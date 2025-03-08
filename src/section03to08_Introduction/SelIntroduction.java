package section03to08_Introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		/*Invoking Browser
		Chrome - ChromeDriver class implement interface WebDriver ->Methods close get
		Firefox - FireFoxDriver class implement interface WebDriver ->Methods close get
		Safari - SafariDriver class implement interface WebDriver ->Methods close get
		WebDriver is interface, define all methods name close get
		WebDriver methods + class methods*/
		
//		ChromeDriver driver = new ChromeDriver();
//		this method is belong to ChromeDriver only
//		driver.resetInputState();		
//		Reason to use WebDriver instead of ChromeDriver is to use methods belong to WebDriver only
//		for easy switching between browsers	
		
//		Launch browser CHROME
//		Key value "webdriver.chrome.driver"-> value of path
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
//		Invoke chromedriver.exe -> Chrome browser
//		WebDriver driver = new ChromeDriver();
		
//		Launch browser FIREFOX
//		Key value "webdriver.gecko.driver"-> value of path
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\geckodriver.exe");
//		Invoke firefoxdriver.exe -> Firefox browser
		WebDriver driver = new FirefoxDriver();

//		Launch browser MICROSOFT EDGE
//		Key value "webdriver.edge.driver"-> value of path
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\msedgedriver.exe");
//		Invoke msedgedriver.exe -> MSEdge browser
//		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		driver.close();
//		driver.quit();

		
	}

}
