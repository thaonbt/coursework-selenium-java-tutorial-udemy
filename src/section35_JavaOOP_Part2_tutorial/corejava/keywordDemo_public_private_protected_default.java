package section35_JavaOOP_Part2_tutorial.corejava;

public class keywordDemo_public_private_protected_default {

	/** DEFAULT methods/variables CAN be accessed anywhere in the SAME PACKAGES ONLY
	 *  - will automatically set if there is no public/private/protected define for methods/variables
	 */
	void defaultMethod() {
		
	}
	
	/** PUBLIC methods/variables CAN be accessed anywhere across ALL the PACKAGES */
	public void publicMethod() {
		
	}

	/** PRIVATE methods/variables CANNOT be accessed outside of the CLASS, even in same packages  */
	private void privateMethod() {
		
	}
	
	/** PROTECTED methods/variable 
	 *  - in the SAME PACKAGE, CAN be accessed from CHILD CLASSES (sub-classes, extends it) directly
	 *    	(example: section35_JavaOOP_Part2_tutorial.corejava.staticVariable2_StaticBlocks)
	 *  - in OTHER PACKAGES, CAN be accessed from CHILD CLASSES (sub-classes, extends it) after invoked its instance
	 *    	(example: section36_JavaOOP_Part2_tutorial.collectionapi_mom.arrayListexample)
	 */
	protected void protectedMethod() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
