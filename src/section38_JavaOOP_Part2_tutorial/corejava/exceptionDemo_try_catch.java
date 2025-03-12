package section38_JavaOOP_Part2_tutorial.corejava;




public class exceptionDemo_try_catch {

	int a=4;
	// 3 lines
	// try catch mechanism
	
	static int b=7;
	static int c=0;
	
	int k = b/c;
	
	public void getData() {
		System.out.println(k);
	}
	
	public static void main(String[] args) {

//		exceptionDemo ed = new exceptionDemo();
//		ed.getData();						// -> Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		/** 
		 * One 'try'can be followed by multiple 'catch' blocks
		 * 'catch' should be an immediate block after try 
		 */
		try {
			
//			System.out.println(b/c);		// -> java.lang.ArithmeticException: / by zero
			
			int arr[] = new int[5];
			System.out.println(arr[7]);		// -> java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
			
		}catch(ArithmeticException e){
			System.out.println("Catched the ArithmeticException");
			System.out.println(e);
		}catch(IndexOutOfBoundsException e){
			System.out.println("Catched the IndexOutOfBoundsException");
			System.out.println(e);
		}catch(Exception e){
			System.out.println("Catched the error/exception");
			System.out.println(e);
		}finally{
			// This block is executed irrespective of exception thrown or not
			System.out.println("from 'finally' block");
		}

	}

}
