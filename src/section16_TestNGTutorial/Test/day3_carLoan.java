package section16_TestNGTutorial.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day3_carLoan {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execute @BeforeClass, from (day3.java)");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginCarLoan(String url, String apiKey) {
		//Selenium
		System.out.println("webLoginCar "+url);
	}
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Execute @BeforeMethod, from (day3.java)");
	}
	
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("Execute @AfterMethod, from (day3.java)");
	}
	
	@Test(timeOut=4000)
	public void mobileLoginCarLoan() {
		//Appium
		System.out.println("mobileLoginCar");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Execute @BeforeSuite, from (day3.java)");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Execute @AfterClass, from (day3.java)");
	}
	
	@Test(dependsOnMethods = {"webLoginCarLoan", "mobileLoginCarLoan"})
	public void APILoginCarLoan() {
		//RestAPI
		System.out.println("APILoginCar");
	}

}
