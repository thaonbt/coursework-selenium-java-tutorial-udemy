package section14_SeleniumJavaStreams_AutomateSortPaginationFilterTheWebTables;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class javaStream_performWebTable_Sorting {
	
	@Test
	public void sortColumn() {
		
		/** Veriy sorted column */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		driver.findElement(By.cssSelector("tr th")).click();
		//capture all webElements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all webElements into new list -> originalList
		List<String> originalList = elementList.stream()
											.map(s->s.getText()).collect(Collectors.toList());
		//sort the new list -> sortedList
		List<String> sortedList = originalList.stream()
											.sorted().collect(Collectors.toList());
		//compare the originalList vs sortedList
		Assert.assertTrue(originalList.equals(sortedList));
		
		driver.close();
	}
	
}
