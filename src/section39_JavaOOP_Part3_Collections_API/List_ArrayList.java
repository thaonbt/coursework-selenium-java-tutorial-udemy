package section39_JavaOOP_Part3_Collections_API;

import java.util.ArrayList;

/**
 * List interface is implemented by ArrayList, LinkedList and Vector
 * - an ordered Collection (sometimes called a sequence)
 * - accept duplicated value
 */

public class List_ArrayList {

	public static void main(String[] args) {
		
		arrayDemo();
		
		arrayListDemo();
		
	}
	
	/** Arrays - Static list initially */
	static void arrayDemo() {
		
		//Integer array
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		
		int[] arr2 = {1,2,4,5,6};
	}
	
	/** ArrayList - Dynamic list size, can be added or removed any index*/
	static void arrayListDemo() {

		ArrayList arrList1 = new ArrayList();
		ArrayList<?> arrList2 = new ArrayList<Object>();
		ArrayList<Integer> arrList3 = new ArrayList<Integer>();
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("rahul");
		arrList.add("java");
		System.out.println(arrList);						// [rahul, java]
		
		arrList.add(0, "student");
		System.out.println(arrList);						// [student, rahul, java]
		
		arrList.remove(1);
		System.out.println(arrList);						// [student, java]
		
		System.out.println(arrList.get(1));					// java
		
		System.out.println(arrList.contains("java"));		// true
		System.out.println(arrList.contains("rahul"));		// false
		
		// =======
		System.out.println(arrList.isEmpty());				// false
		System.out.println(arrList.size());					// 2
		System.out.println(arrList.indexOf("java"));		// 1
		
		// =======
		arrList.add("java");
		System.out.println(arrList);						// [student, java, java]
	}
	
}
