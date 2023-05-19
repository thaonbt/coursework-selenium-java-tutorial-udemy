package section34_JavaOOP_Part1_basics.corejava;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** nested loops works */
		for(int i=0; i<=4; i++) {			// this block will loop for 4 times
			System.out.println("*** Outer loop started - before inner loop ***");
			for(int j=1; j<=4; j++) {		//inner loop
				System.out.println("*** Inner loop ***");
			}
			System.out.println("*** Outer loop finished - after inner loop ***");
		}
		
		printDirectionalNumber();
		/**
		 * 	1 2 3 4
		 * 	5 6 7
		 * 	8 9
		 * 	10
		 */
		
		printReverseNumber();
		/**
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		printIncreaseNumber();
		/**
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */

	}
	
	public static void printDirectionalNumber() {
		/**
		 * Exercise: Print 1 to 10 as below
		 * 	1 2 3 4
		 * 	5 6 7
		 * 	8 9
		 * 	10
		 */
		System.out.println("============================");
		System.out.println("*** Print in direction ***");
		int k = 1;
		//nested loops works
		for(int i=0; i<=4; i++) {			// this block will loop for 4 times
//			System.out.println("*** Outer loop started - before inner loop ***");
			for(int j=1; j<=4-i; j++) {		//inner loop
//				System.out.println("*** Inner loop ***");
				System.out.print(k);
				System.out.print("\t");	//TAB
				k++;
			}
//			System.out.println("*** Outer loop finished - after inner loop ***");
			System.out.println("");
		}
	}
	
	public static void printReverseNumber() {
		/**
		 * Exercise: Print 1 to 10 as below
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		System.out.println("============================");
		System.out.println("*** Print in reverse ***");
		int k=1;
		for(int i=1; i<5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
		}
		
	}
	
	public static void printIncreaseNumber() {
		/**
		 * Exercise: Print 1 to 10 as below
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		System.out.println("============================");
		System.out.println("*** Print in Increase ***");
//		int k=1;
		for(int i=1; i<5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				System.out.print("\t");
//				k++;
			}
			
			System.out.println("");
		}
		
	}

}
