package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import spiceJetBaseClass.BaseClass;

public class PaymentDetails extends BaseClass {

	@FindBy(xpath = "//iframe[@class='card_number_iframe']")
	WebElement iframe;
	
	@FindBy(xpath = "//*[@id=\"payment_form\"]/div[3]/div[1]/iframe")
	WebElement holdername;
	

	@FindBy(xpath = "//input[@id='card_number']")
	WebElement cardNumber;

	// @FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	// WebElement iframe1;

	@FindBy(xpath = "//input[@id='name_on_card']")
	WebElement cardholderName;

	// @FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	// WebElement iframe2;

	@FindBy(xpath = "//div[@class='card_exp_month_div']")
	WebElement month;

	@FindBy(xpath = "//input[@id='card_exp_year']")
	WebElement year;

	@FindBy(xpath = "//input[@id='security_code']")
	WebElement securityCode;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73 r-1wgg2b2 r-1wn9b5e']")
	WebElement proccedtoPay;

	public PaymentDetails() {
		PageFactory.initElements(driver, this);
	}

	public void details(String cardNumber, String cardholderName, String month, String year, String securityCode)
			throws Exception {
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		this.cardNumber.sendKeys(cardNumber);

		// Thread.sleep(3000);
        driver.switchTo().frame(2);
        Thread.sleep(3000);
		this.cardholderName.sendKeys(cardholderName);

		this.month.sendKeys(month);

		this.year.sendKeys(year);
		this.securityCode.sendKeys(securityCode);
		proccedtoPay.click();

	}

}
