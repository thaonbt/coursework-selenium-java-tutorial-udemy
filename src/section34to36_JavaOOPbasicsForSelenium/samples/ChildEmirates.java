package section34to36_JavaOOPbasicsForSelenium.samples;

import section34to36_JavaOOPbasicsForSelenium.abstracts.ParentAircraft;

public class ChildEmirates extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildEmirates childEmirates = new ChildEmirates();
		childEmirates.safetyGuideline();
		childEmirates.engineGuideline();
		childEmirates.bodyColor();
		
		ParentAircraft parentAircraft = new ChildEmirates();
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
