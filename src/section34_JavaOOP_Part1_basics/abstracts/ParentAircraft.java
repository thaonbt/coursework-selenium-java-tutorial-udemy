package section34_JavaOOP_Part1_basics.abstracts;

public abstract class ParentAircraft {

	public void engineGuideline() {
		System.out.println("Follow Engine Guidelines");
	}
	
	public void safetyGuideline() {
		System.out.println("Follow Safety Guidelines");
	}
	
	public abstract void bodyColor();

}
