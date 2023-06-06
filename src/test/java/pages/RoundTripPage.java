package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spiceJetBaseClass.BaseClass;

public class RoundTripPage extends BaseClass {
	
		@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73'])[2]")
		WebElement roundTrip;
	
		//@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
		@FindBy(xpath = "//div[@data-testid='to-testID-origin']")
		WebElement from;
		
		
		//@FindBy(xpath = "//input[@value='Hyderabad (HYD)']")
		
		@FindBy(xpath = "(//input[@type='text'])[1]")
		WebElement fromVal;

		@FindBy(xpath = "(//input[@type='text'])[2]")
		WebElement toVal;

		/*
		 * @FindBy(xpath = "//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")
		 * WebElement depactureDate;
		 */
		
		@FindBy(xpath="//div[text()='10']")
		WebElement depactureDate;
		
		@FindBy(xpath="//div[text()='10']")
		WebElement returnDate;
		
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

		//@FindBy(xpath = "(//div[@class='css-1dbjc4n'])[79]")
		@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
		WebElement searchFlight;

	 public RoundTripPage() { 
			PageFactory.initElements(driver, this);
		}

		public void bookFlight(String fromVal,String toVal) throws Exception {
			this.roundTrip.click();
			this.fromVal.clear();
			this.toVal.clear();
			
			this.fromVal.sendKeys(fromVal);
			this.toVal.sendKeys(toVal);
			this.depactureDate.click();
			this.returnDate.click();
			//this.date.click();
			//this.passengers.click();
			//this.adult.click();
			//this.currency.click();
			//this.currencyType.click();
			//student.click();
			searchFlight.click();
			
		}

}
