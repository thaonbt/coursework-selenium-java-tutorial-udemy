package section37_JavaOOP_Part1_basics.samples;

import section37_JavaOOP_Part1_basics.abstracts.ParentAircraft;

public class ChildAircraft_Emirates extends ParentAircraft{

	public static void main(String[] args) {

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
		System.out.println("from ChildEmirates: Red color on the body");
	}

}
