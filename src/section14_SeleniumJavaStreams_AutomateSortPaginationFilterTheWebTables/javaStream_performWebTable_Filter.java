package section14_SeleniumJavaStreams_AutomateSortPaginationFilterTheWebTables;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class javaStream_performWebTable_Filter {
	
	@Test
	public void filter() {
		
		/** Filter veggie */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//input into search field
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		//capture all elements
		List<WebElement> veggiesList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture filtered elements
		List<WebElement> filteredList = veggiesList.stream().filter(veggie -> veggie.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggiesList.size(), filteredList.size());
		
		driver.close();
	}
	
}
