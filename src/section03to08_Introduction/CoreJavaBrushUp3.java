package section03to08_Introduction;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		/*String is an object represents the sequence of characters
		1. Define String as literal
		"s" and "s1"has same value,
		so, instead of creating 2 objects, "
		the system (memory space) will create 1 only
		and point value of "s1" to value of "s"*/
//		String s = "Rahul Shetty Academy";
//		String s1 = "Rahul Shetty Academy";
		String s5 = "hello";
		
		/*2. Define String as new object*/
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		
//		String[] splittedString = s.split(" ");		
//		System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		System.out.println(splittedString[2]);
		
		String[] splittedString = s.split("Shetty");		
//		System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		System.out.println(splittedString[0].trim());
//		System.out.println(splittedString[1].trim());
		
		System.out.println("Display in sequence");
		for (int i=0; i<s.length(); i++)
		{			
			System.out.println(s.charAt(i));
		}
		
		System.out.println("Display in reverse");
		for (int i=s.length()-1; i>=0; i--)
		{			
			System.out.println(s.charAt(i));
		}

	}

}
