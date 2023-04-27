package section16_TestNGTutorial.Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void postconditions() {
		System.out.println("Execute @AfterTest, from (day1.java)");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test(groups= {"Smoke"})
	public void demo(String url, String apiKey) {
		System.out.println("hello " + url); 	//automation
		System.out.println(apiKey); 	//automation
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Execute @AfterSuite, from (day1.java)");
	}
	
	@Test(enabled=false)				//skip this as it is outdated (Example)
	public void secondTest() {
		System.out.println("bye");
	}

}
