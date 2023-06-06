package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spiceJetBaseClass.BaseClass;

public class ValidateFields extends BaseClass{
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[1]")
    WebElement checkin;
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightStatus;
	
	//@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-ymttw5 r-1f1sjgu r-1otgn73'])[2]")
	//WebElement flightStatus;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[3]")
	WebElement manageBooking;
	
	public ValidateFields() {
		PageFactory.initElements(driver, this);
	}
	
	public void fields() {
		checkin.click();
		flightStatus.click();
		manageBooking.click();
		
	}
}
