package section35_JavaOOP_Part2_tutorial.corejava;

public class keywordDemo_finally_try_catch_exceptions {
	int i = 4;
	
	


	public static void main(String[] args) {
		int b = 7;
		int c = 0;
		try
		{
		int k = b/c;
			int arr[] = new int [5]; 
	
				System.out.println(arr[7]);
				System.out.println(k);
				
			
		}
//		catch (IndexOutOfBoundsException est)
//		{
//			System.out.println("I catch IndexBOund exception");
//		}
//		catch (ArithmeticException et)
//		{
//			System.out.println("I catch Arithmetic exception");
//		}
//		catch (Exception e)
//		{
//			System.out.println("I catch error/exception");
//		}
		finally
		
		{
			System.out.println("Delete cookies");
			//This block is executed irrespective of execution err or not

		
		}
	
	}

}
