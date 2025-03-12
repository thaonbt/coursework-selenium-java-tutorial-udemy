package section38_JavaOOP_Part2_tutorial.corejava;

public class keywordDemo_this_2 {
	
	//Class Variable
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
		keywordDemo_this_2 td = new keywordDemo_this_2();
		td.getData();
	}

}
