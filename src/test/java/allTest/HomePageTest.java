package allTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import allPages.HomePage;

public class HomePageTest {
	HomePage homePage = new HomePage();
	
	
	@Parameters({"driverValue"})
	@BeforeClass
	public void gotoUrl(String driverValue) {
		homePage.getDriver(driverValue);
		homePage.url();
		
	}
	
	@Test
	public void titleValidation() {	
		String title = homePage.getTitle();
		Assert.assertEquals(title, "Capital One Credit Cards, Bank, and Loans - Personal and Business");
		
	}
	
	@Test
	public void creditCardValidation() throws InterruptedException {
		String value = homePage.clickCards();
		System.out.println(value);
		Assert.assertEquals(value, "FIND A CREDIT CARD");
		
	}
	
	
	@AfterMethod
	@AfterClass
	public void tearDown() {
		homePage.tearDown();
	}

}
