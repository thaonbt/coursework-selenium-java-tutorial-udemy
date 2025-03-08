package section36_JavaOOP_Part3_Collections_API;

import java.util.ArrayList;

/**
 * Amazon interview question
 * -> 
 */

public class CollectionDemo_AmazonInterviewQuestion {

	public static void main(String[] args) {

		int arr[] = {4,5,5,5,4,6,6,9,4};
		// print unique number from the list - Amazon interview
		// expected out put: 4 - 3, 5 - 3, 6 - 2, 9 - 1

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			int k = 0;
			
			if(!arrList.contains(arr[i])) {
				
				arrList.add(arr[i]);
				k++;
				
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						k++;
					}
				}
				
				System.out.println("arr: "+ arr[i]);
				System.out.println("k: "+ k);
				
				if(k==1) {
					System.out.println("********************");
					System.out.println(arr[i] + " is unique number");
				}
			}
			
		}
		
		
	}

}
