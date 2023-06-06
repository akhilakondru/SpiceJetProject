package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.OneWayTrip;
import pages.RoundTripPage;
import spiceJetBaseClass.BaseClass;

public class RoundTripTestCase extends BaseClass{
	
	@Test
	public void tc001_roundTrip_booking_Validation_flow() throws Exception {
		
		 RoundTripPage ob=new RoundTripPage();
		 ob.bookFlight("MAA", "DEL");
		 Thread.sleep(5000);
		 Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
		// driver.switchTo().window(Webdriver);
	}

}
