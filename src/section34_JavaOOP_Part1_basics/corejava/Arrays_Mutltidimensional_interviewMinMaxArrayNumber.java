package section34_JavaOOP_Part1_basics.corejava;

/**
 * 
 *			C1	C2	C3
 * 			R1	2	4	5
 * 			R2	3	0	7
 *			R3	5	1	9
 *
 */

public class Arrays_Mutltidimensional_interviewMinMaxArrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[][] = {{2,4,5}, {3,0,7}, {5,9,1}};
		
		System.out.println("*** Array 'intArr' ***");
		printArrNumber(intArr);
		
		System.out.println("*** Array 'intArr' has min. number  ***");
		System.out.println(getMinArrNumber(intArr));
		
		System.out.println("*** Array 'intArr' has max. number  ***");
		System.out.println(getMaxArrNumber(intArr));
		
		System.out.println("*** Array 'intArr' has max. number in the column which has min. array number  ***");
		System.out.println(getMaxColumnNumberOfMinArrNumber(intArr));
		
	}
	
	public static void printArrNumber(int arr[][]) {
		
		for(int i=0; i<arr.length; i++) {				// Outer loop: row
			for(int j=0; j<arr[i].length; j++) {		// Inner loop: column
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static int getMinArrNumber(int arr[][]) {
		
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

	public static int getMaxArrNumber(int arr[][]) {
		
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
	
	public static int getMaxColumnNumberOfMinArrNumber(int arr[][]) {

		//Step 1: Find the minimum number	
		//Step2: Identify the column of minimum number
		//Step 3: Find the maximum number in the identified column
		
		int minNum = arr[0][0];
		int minCol = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {			
				if(arr[i][j] < minNum) {
					minNum = arr[i][j];
					minCol = j;
					
//					for(int k=0; k<arr.length; k++) {
//						if(arr[k][j] > maxNum) {
//							maxNum = arr[k][j];
//							System.out.println("arr[k][j]: "+arr[k][j]);
//						}
//					}
				}
			}

		}
		
		int maxNum = arr[0][minCol];
		int k=0;
//		while(k < arr.length) {
		while(k < 3) {
			if(arr[k][minCol] > maxNum) {
				maxNum = arr[k][minCol];
			}
			k++;
		}
		
		
		return maxNum;
		
	}
}
