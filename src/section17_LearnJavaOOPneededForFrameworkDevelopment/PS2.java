package section17_LearnJavaOOPneededForFrameworkDevelopment;

public class PS2 extends PS3{

	int a=1;
	
	//default constructor
	public PS2(int a) {
		super(a);	//Parent class constructor is invoked
		this.a = a;
	}
	
	public int incrementA() {
		a = a+1;
		return a;
	}
	
	public int decrementA() {
		a = a-1;
		return a;
	}

//	public int incrementB(int a) {
//		a = a+1;
//		return a;
//	}
//	
//	public int decrementB(int a) {
//		a = a-1;
//		return a;
//	}
	
}
