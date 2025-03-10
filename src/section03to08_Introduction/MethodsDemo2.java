package section03to08_Introduction;

public class MethodsDemo2 {

	public static void main(String[] args) {

		MethodsDemo2 d = new MethodsDemo2();
		String name = d.getUserData();
		System.out.println(name);
		
		System.out.println(getStaticUserData());

	}
	
	public String getUserData()
	{
		System.out.println("return");
		return "rahul shutty";
	}
	
	public static String getStaticUserData()
	{
		System.out.println("static return");
		return "rahul shutty";
	}


}
