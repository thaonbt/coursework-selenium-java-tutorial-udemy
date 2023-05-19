package section35_JavaOOP_Part2_tutorial.corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo_Anh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf_datetime = new SimpleDateFormat("MMM d yyyy hh:mm:ss");
		System.out.println(sdf_datetime.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MILLISECOND));

	}

}
