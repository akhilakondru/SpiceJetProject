package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spiceJetBaseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email1;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	//@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[5]/div[3]")
	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void loginFailedTest(String email1,String password) {
		login.click();
		email.click();
		this.email1.sendKeys(email1);
		this.password.sendKeys(password);
		submit.click();
	}
	
	public void loginSuccessTest(String email1,String password) throws InterruptedException {
		login.click();
		email.click();
		this.email1.clear();
		this.password.clear();
		this.email1.sendKeys(email1);
		this.password.sendKeys(password);
		Thread.sleep(2000);
		submit.click();
	}
}
