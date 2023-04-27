package section17_LearnJavaOOPneededForFrameworkDevelopment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterRun() {
		System.out.println("After Method");
	}
	
	//methods, variables
	public void doThis() {
		System.out.println("I am from PS class.");
	}

}
