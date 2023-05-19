package section34_JavaOOP_Part1_basics.corejava;

/**
 * Arrays
 *
 */

public class Arrays_DeclareAndUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int integer = 4;					// -> Single variable
		
		// A container which stores multiple values of same data types
		
		// Declare an array and Allocate memory (space) for the values
		int intArr_a[] = new int[5];		// traditional way
		int intArr_b[] = {1,4,3,5,7}; 		// mostly use, because of its ease and convenience
		String strArr[] = new String[1];
		
		// Initialize values into an array
		intArr_a[0] = 2;
		intArr_a[1] = 6;
		intArr_a[2] = 1;
		intArr_a[3] = 9;
		intArr_a[4] = 12;	
		
		// Retrieve values present in an array
		
		System.out.println("*** Array 'intArr_a' ***");
		for(int i=0; i<intArr_a.length; i++) {
			System.out.println(intArr_a[i]);
		}
		
		System.out.println("*** Array 'intArr_b' ***");
		for(int i=0; i<intArr_b.length; i++) {
			System.out.println(intArr_b[i]);
		}

	}

}
