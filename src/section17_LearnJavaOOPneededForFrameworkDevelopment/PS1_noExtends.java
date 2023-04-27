package section17_LearnJavaOOPneededForFrameworkDevelopment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1_noExtends {

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testRun() {
		
		System.out.println("Start PS1_noExtends");
		
		PS ps = new PS();
		ps.doThis();
	}

}
