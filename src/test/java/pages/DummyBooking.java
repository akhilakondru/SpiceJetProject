package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import spiceJetBaseClass.BaseClass;

public class DummyBooking extends BaseClass {
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement title;
	
	@FindBy(xpath = "//div[text()='Mr']")
	WebElement mr;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement firstNam;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement lastNam;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phoneNumbe;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement email;

	@FindBy(xpath = "//div[@class='css-76zvg2 r-xfv69g r-18tvxmy r-1b43r93 r-zl2h9q']")
	WebElement country;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement townorCity;

	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41']")
	WebElement boxClick;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement isPrimaryPassinger;
	
	@FindBy(xpath = "//div[text()='Next']")
	WebElement passinger2;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	WebElement tittle1;
			
	@FindBy(xpath = "(//div[text()='Miss'][1]")
	WebElement mr1;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement firstName;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement lastName;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement phoneNumber;

	
	//@FindBy(xpath = "//div[@text()='Continue']")
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement continu;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	WebElement continueBooking;

	public DummyBooking() {
		PageFactory.initElements(driver, this);
	}

	public void dummybookFlight(String FirstNam, String lastNam, String phoneNumbe,
			String email, String townorCity) throws Exception {
		Thread.sleep(2000);
		this.title.click();
		this.mr.click();
		this.firstNam.sendKeys(FirstNam);
		this.lastNam.sendKeys(lastNam);
		this.phoneNumbe.sendKeys(phoneNumbe);
		this.email.sendKeys(email);
		//Select se = new Select(country);
		//se.selectByVisibleText("India");
		this.townorCity.sendKeys(townorCity);
		boxClick.click();
		//Select sele = new Select(tittle1);
		//sele.selectByVisibleText("Miss");   
		this.isPrimaryPassinger.click();
		Thread.sleep(2000);
		this.passinger2.click();
		  this.firstName.sendKeys("Akhila");
		  this.lastName.sendKeys("Nade");
		  this.phoneNumber.sendKeys(phoneNumbe);
		 
		this.continu.click();
		Thread.sleep(3000);
		this.continueBooking.click();

	}
}
