package section35_JavaOOP_Part2_tutorial.corejava;

public class staticVariable1_Class_and_Instance_Variables {

	String name;								// Instance variables - different from objects
	String address;								// Instance variables - different from objects
//	static String city = "Bangalore";			// Class variables    - same from objects (and save memory also)
//	static int i = 0;							// Class variables    - same from objects (and save memory also)
	static String city;							// Class variables    - same from objects (and save memory also)
	static int i;								// Class variables    - same from objects (and save memory also)
	static {					//intial data or static variables
		city = "Bangalore";
		i = 0;
	}
	
	/** Constructor */
	staticVariable1_Class_and_Instance_Variables(String name, String address){
//	StaticVariable(String name, String address, String city){
		
		//Assign data to Instance Variables
		this.name = name;
		this.address = address;
//		this.city = city;
		
		i++;
		System.out.println(i);
	}
	
	public String getAdress() {
		return address + " " + city;
	}
	
	public static void getCity() {		//  Class (Static) method only accept Static variables AND be independent from objects
//		System.out.println(address);	// -> error b/c address is not static
		System.out.println(city);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StaticVariable obj = new StaticVariable("Bob", "Marthalli", "Bangalore");
//		StaticVariable obj1 = new StaticVariable("Ram", "Jayangar", "Bangalore");
//		
//		System.out.println(obj.getAdress());
//		System.out.println((obj1.getAdress()));
		
		System.out.println("*** Invoke objects ***");
		staticVariable1_Class_and_Instance_Variables obj = new staticVariable1_Class_and_Instance_Variables("Bob", "Marthalli");
		staticVariable1_Class_and_Instance_Variables obj1 = new staticVariable1_Class_and_Instance_Variables("Ram", "Jayangar");
		
		System.out.println("*** Call objects method (default) ***");
		System.out.println(obj.getAdress());
		System.out.println((obj1.getAdress()));
		
		System.out.println("*** Call objects method (after update Instance Variables ***)");
		obj.city = "Indi";

		System.out.println(obj.getAdress());
		System.out.println((obj1.getAdress()));
		
		System.out.println("*** Call static method ***");
		staticVariable1_Class_and_Instance_Variables.getCity();
		getCity();
	}
	
}
