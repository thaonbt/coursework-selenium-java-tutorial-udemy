package section37_JavaOOP_Part1_basics.corejava;

import section37_JavaOOP_Part1_basics.abstracts.ParentVehicle;

public class overriding extends ParentVehicle {
	
	public static void main(String[] args) {
		
		overriding o = new overriding();
		
		o.brakes();				// from ParentVehicle
		o.audioSystem();		// override the one from ParentVehicle
	}
	
	public void colour() {
		System.out.println("(ChildVehicle) Color is: " + colour + ", get from (ParentVehicle)");
	}
	
	// Override the one from ParentVehicle 
	// There is no annotation @Override, as it is not an abstract method
	// -> replace
	public void audioSystem() {
		System.out.println("(override) Audio System code is override");
	}

}
