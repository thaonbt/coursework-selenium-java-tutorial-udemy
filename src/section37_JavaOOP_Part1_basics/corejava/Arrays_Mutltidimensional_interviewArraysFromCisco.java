package section37_JavaOOP_Part1_basics.corejava;

/**
 * 
 *			C1	C2	C3
 * 			R1	2	4	5
 * 			R2	3	4	7
 *
 */

public class Arrays_Mutltidimensional_interviewArraysFromCisco {

	public static void main(String[] args) {

		int intArr[][] = {{2,4,5}, {3,0,7}, {5,9,1}};
		
		System.out.println("*** Array 'intArr' ***");
		printArrNumber(intArr);
		
		System.out.println("*** Array 'intArr' has min. number  ***");
		System.out.println(printMinArrNumber(intArr));
		
		System.out.println("*** Array 'intArr' has max. number  ***");
		System.out.println(printMaxArrNumber(intArr));
		
	}
	
	public static void printArrNumber(int arr[][]) {
		
		for(int i=0; i<arr.length; i++) {				// Outer loop: row
			for(int j=0; j<arr[i].length; j++) {		// Inner loop: column
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static int printMinArrNumber(int arr[][]) {
		
		int min = arr[0][0];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {			
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
				
			}
		}
		
		return min;
	}

	public static int printMaxArrNumber(int arr[][]) {
		
		int max = arr[0][0];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {			
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
				
			}
		}
		
		return max;
	}
}
