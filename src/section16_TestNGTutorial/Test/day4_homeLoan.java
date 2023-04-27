package section16_TestNGTutorial.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day4_homeLoan {
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginHomeLoan(String url, String apiKey) {
		//Selenium
		System.out.println("webLoginHome "+url);
	}
	
	@Test(groups={"Smoke"})
	public void mobileLoginHomeLoan() {
		//Appium
		System.out.println("mobileLoginHome");
	}
	
	@Test
	public void APILoginHomeLoan() {
		//RestAPI
		System.out.println("APILoginHome");
	}

}
