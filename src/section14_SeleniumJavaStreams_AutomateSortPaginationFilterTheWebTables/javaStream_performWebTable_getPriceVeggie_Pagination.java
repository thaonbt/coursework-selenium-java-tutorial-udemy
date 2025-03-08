package section14_SeleniumJavaStreams_AutomateSortPaginationFilterTheWebTables;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class javaStream_performWebTable_getPriceVeggie_Pagination {
	
	@Test
	public void printPriceVeggie() {
		
		/** Print price of a vegetable */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<String> priceList;
		do {
			//On 1st page
			//scan the vegetable name column with getText -> "Beans" -> print the price of Rice
			List<WebElement> vegElementsList = driver.findElements(By.xpath("//tr/td[1]"));
			priceList = vegElementsList.stream()
				.filter(s->s.getText().equalsIgnoreCase("Rice"))
				.map(s-> getPriceVeggie(s)).collect(Collectors.toList());
			
			priceList.stream().forEach(p->System.out.println(p));
			
			//If there is no veggie, click Next page
			//repeat the above search
			if(priceList.size()<1) {
				driver.findElement(By.xpath("[aria-label='Next']")).click();
			}
		}while(priceList.size()<1);
		
		driver.close();
	
	}

	private static String getPriceVeggie(WebElement element) {
		// TODO Auto-generated method stub
		
		String priceValue = element.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
		return priceValue;
	}
	
}
