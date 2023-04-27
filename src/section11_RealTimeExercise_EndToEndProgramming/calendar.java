package section11_RealTimeExercise_EndToEndProgramming;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**https://stackoverflow.com/questions/7182996/java-get-month-integer-from-date*/
//		//Before Java 8
//		java.util.Date date= new Date();
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		int month = cal.get(Calendar.MONTH);
//		
//		//From Java 8
//		Date date = new Date();
//		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//		int month = localDate.getMonthValue();
//		//OR
//		LocalDate today = LocalDate.now();
//		int month = today.getMonthValue();
//		//OR
//		//convert date to datetime
//		DateTime datetime = new DateTime(date);
//		int monthInt = dateTime.getMonthOfYear();
//		int month = Integer.parseInt(datetime.toString("MM"))
		
		/** https://stackoverflow.com/questions/4216745/java-string-to-date-conversion */
//		String string = "January 2, 2010";
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
//		LocalDate date = LocalDate.parse(string, formatter);
//		System.out.println(date); // 2010-01-02
		
		/** https://www.edureka.co/blog/convert-string-to-date-in-java/ */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.path2usa.com/travel-companion/");
		
		//Going to select date "April 14"		-> should break down into chains
		String month = "April";
		String date = "14";
		
		WebElement calendarEle = driver.findElement(By.id("form-field-travel_comp_date"));
		WebElement yearEle = driver.findElement(By.className("cur-month"));
		WebElement currentMonthEle = driver.findElement(By.className("cur-month"));
		//Grab common attribute -> put into List and iterate
		List<WebElement> dateEleList = driver.findElements(By.className("flatpickr-day"));
		
		//Open calendar
		calendarEle.click();
		
		//Select month
		while(!currentMonthEle.getText().equalsIgnoreCase(month)) {
//			if(select month > current month) {
//				click "next" arrow;
//				break;
//			}else if(select month < current month) {
//				click "back" arrow;
//				break;
//			}
		}
		
		//Select date
		for (int i=0; i<dateEleList.size(); i++) {
			if(dateEleList.get(i).getText().equalsIgnoreCase(date)) {
				dateEleList.get(i).click();
				break;
			}
		}

	}
	
	public int convertMonthToInt(String month) {
		int m=1;
		
		return m;
	}

}
