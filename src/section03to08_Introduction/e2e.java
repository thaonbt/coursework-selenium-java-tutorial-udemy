package section03to08_Introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//ONE-WAY
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//FROM - TO
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//DATE
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("it's disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		//CHECKBOX
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//DROPDOWN -> Update number of passengers
		driver.findElement(By.id("divpaxinfo")).click();
		  	Thread.sleep(2000);
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
//		driver.findElement(By.name("#ctl00$mainContent$btn_FindFlights")).click();
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
//		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.close();
	}

}
