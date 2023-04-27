package section16_TestNGTutorial.Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class day2_DataProvider {
	
	@Test(groups = {"Smoke"})
	public void ploan() {
		System.out.println("good "); 	//automation
	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("Execute @BeforeTest, from (day2.java)");
	}
	
	@Test(timeOut = 4000)
	public void pdeposit() {
		System.out.println("deposit "); 	//automation
	}
	
	@Test(dataProvider = "getData")
	public void pcredit(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void pbalance() {
		System.out.println("well");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit history
		//1st combination - username password - no credit history
		//1st combination - username password - fraudelent credit history
		
		Object[][] data = new Object[3][2];		//[row][column]	-	[repeat times][parameters]
		//columns in the row are nothing but values for that particular combination (row)
		
		//1st combination
		data[0][0] = "1stUsername";
		data[0][1] = "1stPassword";
		
		//2nd combiniation
		data[1][0] = "2ndUsername";
		data[1][1] = "2ndPassword";
		
		//3rd combiniation
		data[2][0] = "3rdUsername";
		data[2][1] = "3rdPassword";
		
		return data;
	}
}
