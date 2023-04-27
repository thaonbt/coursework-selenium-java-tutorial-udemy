package section03to08_Introduction;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		MethodsDemo d = new MethodsDemo();		
		d.getDataVoid();
		
		MethodsDemo2 d2 = new MethodsDemo2();		
		String name = d2.getUserData();
		System.out.println(name);

	}
	
	//void - return nothing, just excute inside codes
	//int - return integer
	//String - return String
	public void getDataVoid()
	{
		System.out.println("Void: Hello world!");
	}

}
