package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.OneWayTrip;
import spiceJetBaseClass.BaseClass;

public class OneWayTripTestCase extends BaseClass{
	@Test
	public void tc001_Onewway_Trip_Validation_flow() throws Exception {
		
		 OneWayTrip ob=new OneWayTrip();
		 Thread.sleep(3000);
		 ob.bookFlight("Tirupati", "HYD");
		 Thread.sleep(5000);
		 Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
		// driver.switchTo().window(Webdriver);
	}

}
