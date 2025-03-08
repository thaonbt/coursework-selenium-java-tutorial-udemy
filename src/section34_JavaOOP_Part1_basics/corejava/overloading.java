package section34_JavaOOP_Part1_basics.corejava;

/** overloading functions
 * 
 *  either arguments' count should be different
 *  or arguments' data type should be different
 *
 */

public class overloading {

	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(a + " and " + b);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {

		overloading o = new overloading();
		
		o.getData(1);
		o.getData("hello");
		o.getData(2, 3);
		
	}

}
