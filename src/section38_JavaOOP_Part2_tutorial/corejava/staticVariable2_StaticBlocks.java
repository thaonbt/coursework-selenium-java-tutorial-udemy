package section38_JavaOOP_Part2_tutorial.corejava;

public class staticVariable2_StaticBlocks extends keywordDemo_public_private_protected_default{

	String name;								// Instance variables - different from objects
	String address;								// Instance variables - different from objects
	static String city = "Bangalore";			// Class variables    - same from objects (and save memory also)
	static int i = 0;
	
	/** Constructor */
	staticVariable2_StaticBlocks(String name, String address){
//	StaticVariable(String name, String address, String city){
		
		//Assign data to Instance Variables
		this.name = name;
		this.address = address;
//		this.city = city;
		
		i++;
		System.out.println(i);
		
		protectedMethod();
	}
	
	public String getAddress() {
		return address + " " + city;
	}
	
	public static void getCity() {		//  Class (Static) method only accept Static variables AND be independent from objects
//		System.out.println(address);	// -> error b/c address is not static
		System.out.println(city);
	}
	
	
	public static void main(String[] args) {
		
//		StaticVariable obj = new StaticVariable("Bob", "Marthalli", "Bangalore");
//		StaticVariable obj1 = new StaticVariable("Ram", "Jayangar", "Bangalore");
//		
//		System.out.println(obj.getAdress());
//		System.out.println((obj1.getAdress()));
		
		System.out.println("*** Invoke objects ***");
		staticVariable2_StaticBlocks obj = new staticVariable2_StaticBlocks("Bob", "Marthalli");
		staticVariable2_StaticBlocks obj1 = new staticVariable2_StaticBlocks("Ram", "Jayangar");
		
		System.out.println("*** Call objects method (default) ***");
		System.out.println(obj.getAddress());
		System.out.println((obj1.getAddress()));
		
		System.out.println("*** Call objects method (after update Instance Variables ***)");
		obj.city = "Indi";

		System.out.println(obj.getAddress());
		System.out.println((obj1.getAddress()));
		
		System.out.println("*** Call static method ***");
		staticVariable2_StaticBlocks.getCity();
		getCity();
	}
	
}
