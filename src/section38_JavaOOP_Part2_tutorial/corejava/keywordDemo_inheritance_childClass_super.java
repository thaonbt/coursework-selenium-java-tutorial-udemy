package section38_JavaOOP_Part2_tutorial.corejava;

public class keywordDemo_inheritance_childClass_super extends keywordDemo_inheritance_parentClass {

	/** VARIABLES */
	String firstName = "QAClickAcademy";
	
	/** CONSTRUCTORS */
	public keywordDemo_inheritance_childClass_super() {
		
		super();		// <- This should always be at the 1st line
		System.out.println("========== CONSTRUCTOR from childClass_superKeyword ===========");
	}
	
	/** METHODS */
	public void getStringData() {
		System.out.println("=====================================");
		System.out.println("(childClass) default firstName: " + firstName);
		System.out.println("(parentClass) firstName: " + super.firstName);
		
		firstName = "rahulshettyacademy";
		System.out.println("(childClass) modified firstName: " + firstName);
		
		System.out.println("=====================================");
		
		System.out.println("(childClass) not declared lastName: " + lastName);
		System.out.println("(parentClass) lastName: " + super.lastName);
		System.out.println("=====================================");
	}
	
	public void getData() {
		super.getData();
		System.out.println("Method 'getData()' from (childClass)");
	}
	
	public static void main(String[] args) {
		
		/** 'Super' keyword */
		keywordDemo_inheritance_childClass_super m = new keywordDemo_inheritance_childClass_super();
		m.getStringData();
		
		m.getData();
	}

}
