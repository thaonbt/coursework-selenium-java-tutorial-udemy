package section38_JavaOOP_Part2_tutorial.corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf_datetime = new SimpleDateFormat("MMM d yyyy hh:mm:ss");
		
		System.out.println(sdf_datetime.format(cal.getTime()));			// -> 	Apr 28 2023 03:03:36
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));					// AM=0 and PM=1
		System.out.println(cal.get(Calendar.MILLISECOND));
	}

}
