package section37_JavaOOP_Part1_basics.inheritance;

public class ClassA {
	
	String firstName = "Rahul";
	String lastName = "Shetty";
	
	int i = 10;
	
	public ClassA() {
		System.out.println("==========CONSTRUCTOR from parent class 'ClassA'===========");
	}
	
	public void getData() {
		System.out.println("Method 'getData()' from (ClassA.class)");
	}

}
