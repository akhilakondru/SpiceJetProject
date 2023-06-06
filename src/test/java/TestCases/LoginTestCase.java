package TestCases;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import spiceJetBaseClass.BaseClass;

public class LoginTestCase extends BaseClass{
	
	LoginPage lp;
	@BeforeClass
	public void before() throws Exception {
		 lp=new LoginPage();
	}

		
	
	//@Test
	public void tc001_login_dummyemail_validation() {
		
		lp.loginFailedTest("test@gmail.com", "akki@123");
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
		//driver.navigate().back();
	
	}
	@Test
	public void tc002_login_realemail_validation() throws InterruptedException {
		lp.loginSuccessTest("akhilakondru522@gmail.com", "Thaswika@2021");
		Thread.sleep(5000);
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
		
	}


}
