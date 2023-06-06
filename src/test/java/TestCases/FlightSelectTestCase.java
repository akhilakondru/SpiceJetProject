package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FlightSelectPage;
import spiceJetBaseClass.BaseClass;

public class FlightSelectTestCase extends BaseClass{
	
	@Test
	public void tc001_flight_booking_Validation_flow() throws Exception {
		
		 FlightSelectPage ob=new FlightSelectPage();
		 ob.flightDetails();
		 Thread.sleep(5000);
		 Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
	}

}
