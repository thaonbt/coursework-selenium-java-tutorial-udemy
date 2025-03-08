package section34_JavaOOP_Part1_basics.corejava;

/**
 * People mostly focus on the Multidimensional Arrays
 * Usually have in interviews
 * 
 * What is Multidimensional Arrays?
 * - Matrix format following rows and columns
 * - Example:
 * 				C1	C2	C3
 * 			R1	2	4	5
 * 			R2	3	4	7
 * 
 */

public class Arrays_Mutltidimensional_DeclareAndUse {

	public static void main(String[] args) {

		int[][] intArr_a = new int[2][3];	// -> Arrays has 2 Rows, 3 Columns
		
		intArr_a[0][0] = 2;
		intArr_a[0][1] = 4;
		intArr_a[0][2] = 5;
		
		intArr_a[1][0] = 3;
		intArr_a[1][1] = 4;
		intArr_a[1][2] = 7;
		
		int[][] intArr_b = {{2,4,5}, {3,4,7}, {5,2,1}};
		
		// print 2nd Row, 1st Column
		System.out.println("*** Array 'intArr_a', 2nd Row, 1st Column ***");
		System.out.println(intArr_a[1][0]);
		
		// print all value in the array
//		System.out.println("*** Array 'intArr_a', all values ***");
//		for(int i=0; i<intArr_a.length; i++) {
//			System.out.print(intArr_a[i][0] + "\t");
//			System.out.print(intArr_a[i][1] + "\t");
//			System.out.print(intArr_a[i][2]);
//			System.out.println("");
//		}
		
		System.out.println("*** Array 'intArr_a', all values ***");
        for (int[] ints : intArr_a) {                // Outer loop: row
            for (int anInt : ints) {        // Inner loop: column
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
		
//		System.out.println("*** Array 'intArr_b', all values ***");
//		for(int i=0; i<intArr_a.length; i++) {
//			System.out.print(intArr_b[i][0] + "\t");
//			System.out.print(intArr_b[i][1] + "\t");
//			System.out.print(intArr_b[i][2] + "\t");
//			System.out.print(intArr_b[i][3]);
//			System.out.println("");
//		}
		
		System.out.println("*** Array 'intArr_b', all values ***");
        for (int[] ints : intArr_b) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
	}

}
