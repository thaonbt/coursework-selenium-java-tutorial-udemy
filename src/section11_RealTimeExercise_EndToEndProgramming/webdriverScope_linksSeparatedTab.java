package section11_RealTimeExercise_EndToEndProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverScope_linksSeparatedTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Khau\\Udemy-course_SeleniumJAVA\\browser-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

//1. Give me the count of links on the page (hints: all links mostly have tagname <a/>)		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//2. Give me the count of links on the footer section
		System.out.println(driver.findElements(By.cssSelector("#gf-BIG a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));		// Limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
//3. Give me the count of links on the footer section, 1st column only
		WebElement coulmndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coulmndriver.findElements(By.tagName("a")).size());
		
//4. Click on each link in the column and check if the pages are opening
		//because the column header link is a fake one, so we start from 1 instead of 0
		ArrayList<String> linksList = new ArrayList<String>();
		int columnTotalLinks = coulmndriver.findElements(By.tagName("a")).size();
		//open links on separated tabs
		for(int i=1; i<columnTotalLinks; i++) 
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coulmndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);			
			//Wait for complete opening
			Thread.sleep(5000L);
//			System.out.println(coulmndriver.findElements(By.tagName("a")).get(i).getText());
			linksList.add(coulmndriver.findElements(By.tagName("a")).get(i).getText());
		}
		
		//go to each tab to get the title
		ArrayList<String> titlesList = new ArrayList<String>();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());			
//			System.out.println(driver.getTitle());
			titlesList.add(driver.getTitle());
		}		
		
		//print out the text of links and its relevant title		
		for(int i=0; i<linksList.size(); i++) 
		{
			System.out.println(linksList.get(i));
			System.out.println(titlesList.get(i));
		}
		
		driver.quit();
	}

}
