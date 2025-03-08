package section35_JavaOOP_Part2_tutorial.corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		
		/** Current date ... current time */
		Date d =new Date();
		System.out.println(d.toString());					// ->	Fri Apr 28 14:51:09 ICT 2023
		
		/** M/d/yyyy */
		SimpleDateFormat sdf_date = new SimpleDateFormat("MM/d/yyyy");
		System.out.println(sdf_date.format(d));				// -> 	04/28/2023
		
		/** MMM d yyyy hh:mm:ss */
		SimpleDateFormat sdf_datetime = new SimpleDateFormat("MMM d yyyy hh:mm:ss");
		System.out.println(sdf_datetime.format(d));			// -> 	Apr 28 2023 002:56:56
		
	}

}
