package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PaymentDetails;
import spiceJetBaseClass.BaseClass;

public class PaymentDetailsTestCase extends BaseClass {
	@Test
	
	public void payment_Validation_Flow() throws Exception {
		PaymentDetails pd=new PaymentDetails();
		pd.details("4315813064116005", "SIVARAMAKRISHNA N", "03", "29", "198");
		Thread.sleep(3000);
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
	}

}
