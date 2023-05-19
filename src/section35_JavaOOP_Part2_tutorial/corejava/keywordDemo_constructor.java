package section35_JavaOOP_Part2_tutorial.corejava;

/**
 * What is a constructor?
 * Constructor
 * 	|- executes a block of codes whenever an object is created
 *	|- not return values
 *	|- name of constructor will be  class name
 *
 * IF there is no constructor, Compiler will call (default) implicit constructor
 */

public class keywordDemo_constructor {
	
	/** Default constructor (without parameters) */
	public keywordDemo_constructor() {
		
		// this will be executes whenever 'constructDemo' is created
		
		System.out.println("Constructor from constructDemo.class");
	}
	
	/** Constructor with parameters) */
	public keywordDemo_constructor(int a, int b) {
		
		// this will be executes whenever 'constructDemo' is created
		
		System.out.println("Parameterized(int a, int b) Constructor from constructDemo.class");
		System.out.println("multiple is: " + a*b);
	}
	
	public keywordDemo_constructor(String arg) {
		
		// this will be executes whenever 'constructDemo' is created
		
		System.out.println("Parameterized(String arg) Constructor from constructDemo.class");
	}
	
	
	/** Methods */
	public void getData() {
		System.out.println("Method 'constructDemo' from constructDemo.class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		keywordDemo_constructor constructDemo = new keywordDemo_constructor();
		
		keywordDemo_constructor parameterizedConstructDemo_int = new keywordDemo_constructor(1,2);
		
		keywordDemo_constructor parameterizedConstructDemo_str = new keywordDemo_constructor("Hello");
		
	}

}
