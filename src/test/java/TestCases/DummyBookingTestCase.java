package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DummyBooking;
import spiceJetBaseClass.BaseClass;

public class DummyBookingTestCase extends BaseClass{
	@Test
	public void dummybooking_Validation_Flow() throws Exception {
		DummyBooking db= new DummyBooking();
		db.dummybookFlight("siva", "Ram", "9988776655", "siva123@gmail.com","Hyd");
		Thread.sleep(10000);
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets",
				driver.getTitle());
	}

}
