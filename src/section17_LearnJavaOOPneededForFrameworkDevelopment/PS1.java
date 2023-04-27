package section17_LearnJavaOOPneededForFrameworkDevelopment;

import org.testng.annotations.Test;

public class PS1 {
	
	@Test
	public void testRun() {
		int a = 3;
		
		PS2 ps2A = new PS2(3);	// Parameterised Constructor
		System.out.println(ps2A.incrementA());
		System.out.println(ps2A.decrementA());
		
//		PS2 ps2B = new PS2();	// Non-Parameterised Constructor
//		System.out.println(ps2B.incrementB(3));
//		System.out.println(ps2B.decrementB(3));

//		***************************************************************
//		PS3 ps3 = new PS3(3);	// Parameterised Constructor
//		System.out.println(ps3.multiplyThree());
		
		PS2 ps2 = new PS2(3);	// Parameterised Constructor
//		PS3 ps3 = new PS3(3);	// Parameterised Constructor
		System.out.println(ps2.multiplyThree());
	}
	
}
