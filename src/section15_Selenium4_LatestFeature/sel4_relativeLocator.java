package section15_Selenium4_LatestFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class sel4_relativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Selenium 4.0 - Relative Locators
		 *  - above()		: element located above with respect to the specified element
		 *  - below()		: element located below with respect to the specified element
		 *  - toLeftOf()	: element located to the left of specified element
		 *  - toRightOf()	: element located to the right of specified element
		 * 
		 * Syntax:
		 *    WebElement ele = driver.findElement(By...);
		 * 	  driver.findElement(with(By.tagName("...")).above(ele));
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//above()
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());		// -> Name
		
		//below()
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for=\"dateofBirth\"]"));
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		
		//leftToOf()
		WebElement icecreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecreamLabel)).click();
		
		//rightToOf()
		WebElement rdbStudent = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdbStudent)).getText());	// -> Student
		
		driver.close();

	}

}
