package section34_JavaOOP_Part1_basics.inheritance;

//public class ClassMain extends ClassA, ClassB {		// Java does not allow multi extends (inheritance)

public class ClassMain extends ClassA{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Samples: Class A, B */
		ClassA a1 = new ClassA();
		System.out.println(a1.i);
		
		ClassA a2 = new ClassB();
		System.out.println(a2.i);
		
		/** Explanation: WebDriver */
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver();
		


	}

}
