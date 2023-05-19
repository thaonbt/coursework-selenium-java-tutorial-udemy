package section35_JavaOOP_Part2_tutorial.corejava;

public class keywordDemo_constructor_Anh {

	public keywordDemo_constructor_Anh() {
		System.out.println("Contructor from constructDemo2.class");
	}
	public keywordDemo_constructor_Anh (int a, int b) {
		System.out.println("Parameterized(int a, int b) Constructor from constructDemo.class");
		System.out.println("multiple is:" + a*b);
	}
	public keywordDemo_constructor_Anh (String arg) {
		
		System.out.println("Parameterized(String arg) Constructor from constructDemo.class");
	}
	public void getData() {
		System.out.println("Method 'constructDemo2' from constuctDemo2.class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		keywordDemo_constructor_Anh constructDemo = new keywordDemo_constructor_Anh();
		
		keywordDemo_constructor_Anh parameterizedConstructDemo_int = new keywordDemo_constructor_Anh(1,2);
		
		keywordDemo_constructor_Anh parameterizedConstructDemo_str = new keywordDemo_constructor_Anh("Hello");
		
	}
}
