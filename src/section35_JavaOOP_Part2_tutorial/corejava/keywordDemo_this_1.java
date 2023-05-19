package section35_JavaOOP_Part2_tutorial.corejava;

public class keywordDemo_this_1 {
	
	//Global Variable
	int a = 2;
	
	public void getData() {
		
		//Local Variables
		int a = 3;
		
		System.out.println(a);
		
		//this refers to current object - object scope lies in class level
		System.out.println(this.a);
		
		int b = a + this.a;
		
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keywordDemo_this_1 td = new keywordDemo_this_1();
		td.getData();
	}

}
