package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import spiceJetBaseClass.BaseClass;

public class OneWayTrip extends BaseClass {

	//@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	@FindBy(xpath = "//div[@data-testid='to-testID-origin']")
	WebElement from;
	
	
	//@FindBy(xpath = "//input[@value='Hyderabad (HYD)']")
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement fromVal;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement toVal;

	@FindBy(xpath = "//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")
	WebElement depactureDate;
	
	/*
	 * @FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]")
	 * WebElement month;
	 */
	
	@FindBy(xpath="//div[text()='10']")
	WebElement date;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;

	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")
	WebElement adult;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")
	WebElement currency;
	
	@FindBy(xpath="//div[text()='INR']")
	WebElement currencyType;
	
	@FindBy(xpath = "//div[text()='Family & Friends']")
	WebElement family;

	
	//@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchFlight;

	public OneWayTrip() {
		PageFactory.initElements(driver, this);
	}

	public void bookFlight(String fromVal,String toVal) throws Exception {
		this.fromVal.clear();	
		this.fromVal.sendKeys(fromVal);
		Thread.sleep(1000);
		this.toVal.clear();
		this.toVal.sendKeys(toVal);
		Thread.sleep(1000);
		//this.depactureDate.click();
		this.date.click();
		Thread.sleep(1000);
		this.passengers.click();
		Thread.sleep(1000);
		this.adult.click();
		Thread.sleep(1000);
		this.currency.click();
		Thread.sleep(1000);
		this.currencyType.click();
		//Thread.sleep(1000);
		//family.click();
		Thread.sleep(3000);
		searchFlight.click();
		
	}
}