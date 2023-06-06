package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ValidateFields;
import spiceJetBaseClass.BaseClass;

public class ValidateFieldTestCase extends BaseClass{
	@Test
	public void testField_Validation_Flow() throws Exception {
		ValidateFields af=new ValidateFields();
		af.fields();
		Thread.sleep(2000);
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", driver.getTitle());
	}

}
