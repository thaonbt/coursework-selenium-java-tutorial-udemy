package section34_JavaOOP_Part1_basics.samples;

import section34_JavaOOP_Part1_basics.abstracts.ParentVehicle;

public class ChildVehicle extends ParentVehicle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildVehicle childVehicle = new ChildVehicle();
		
		childVehicle.colour();
		childVehicle.brakes();
		
	}

	public void engine() {
		System.out.println("(ChildVehicle) Engine code is implemented");
	}
	
	public void colour() {
		System.out.println("(ChildVehicle) Color is: " + colour + ", get from (ParentVehicle)");
	}
}
