package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spiceJetBaseClass.BaseClass;

public class FlightSelectPage extends BaseClass{
	
	

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz r-b5h31w r-1ah4tor r-tvv088']")
	WebElement flightDetails;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement continueBooking;
	
	

 public FlightSelectPage() { 
		PageFactory.initElements(driver, this);
	}

	public void flightDetails() throws Exception {
		Thread.sleep(2000);
		flightDetails.click();
		continueBooking.click();
		
	}

}
