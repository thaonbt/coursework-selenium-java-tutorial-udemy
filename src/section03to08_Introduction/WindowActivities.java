package section03to08_Introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); //wait until all elements load completely
		driver.navigate().to("https://rahulshettyacademy.com"); //wait basic elements only, so must use implicit/explicit wait
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
	}

}
