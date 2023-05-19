package section34_JavaOOP_Part1_basics.corejava;

public class whileDemo {

	public static void main(String[] args) {
		
		//While loop
		System.out.println("**** WHILE loop ****");
		//1 to 10
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("**** DO-WHILE loop ****");
		int j=20;
		
		do {
			System.out.println(j);
			j--;
		}while(j>10);
		
	}

}
