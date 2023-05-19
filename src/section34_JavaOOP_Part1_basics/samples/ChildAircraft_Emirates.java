package section34_JavaOOP_Part1_basics.samples;

import section34_JavaOOP_Part1_basics.abstracts.ParentAircraft;

public class ChildAircraft_Emirates extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildAircraft_Emirates childEmirates = new ChildAircraft_Emirates();
		childEmirates.safetyGuideline();
		childEmirates.engineGuideline();
		childEmirates.bodyColor();
		
		ParentAircraft parentAircraft = new ChildAircraft_Emirates();
		parentAircraft.safetyGuideline();
		parentAircraft.engineGuideline();
		parentAircraft.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("from ChildEmirates: Red color on the body");
	}

}
