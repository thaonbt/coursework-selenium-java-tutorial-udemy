package section03to08_Introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value of myNum variable.");
		System.out.println(website);
		
		//Arrays - Static list initially
		//Integer array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6};
		
		System.out.println("Index 2 of arr2 variable is "+arr2[2]);
		
		System.out.println("arr[]");
		//for loop arr.length=5
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("arr2[]");
		for (int i = 0; i< arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		//String array
		String[] name = {"rahul", "shetty", "selenium"};
		
		System.out.println("String[] name");
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("String[] name (enhancement)");
		for ( String s: name)
		{
			System.out.println(s);
		}

	}

}
