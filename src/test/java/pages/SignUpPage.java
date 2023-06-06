package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import spiceJetBaseClass.BaseClass;

public class SignUpPage extends BaseClass {

	@FindBy(xpath = "//div[text()='Signup']")
	WebElement signUp;

	// @FindBy(xpath = "//select[@class='form-control form-select ']")
	// WebElement select;

	//@FindBy(xpath = "//div[@class='question-container']//div[class='question-group']/label[text()='Mrs']"
	//WebElement miss;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/select")
	WebElement select;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastName;

	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement india;

	@FindBy(xpath = "//input[@id='dobDate']")
	WebElement dateOfBirth;

	@FindBy(xpath = "//input[@class=' form-control']")
	WebElement phoneNumber;

	@FindBy(xpath = "//input[@id='email_id']")
	WebElement emailId;

	@FindBy(xpath = "//input[@id='new-password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='c-password']")
	WebElement cPassword;

	@FindBy(xpath = "//input[@id='defaultCheck1']")
	WebElement checkBox;

	@FindBy(xpath = "//button[@type='button']")
	WebElement submit;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void signUp(String firstName, String lastName, String phoneNumber, String emailId, String password,
			String cPassword) throws Exception {
		signUp.click();
		driver.navigate().forward();
		Thread.sleep(3000);
		//Select drpCountry = new Select(driver.findElement(By.xpath("//select[@class='form-control form-select ']")));
		 //drpCountry.selectByVisibleText("Mr");
		//select.click();
		//Thread.sleep(3000);
		//driver.getPageSource();
		//select.click();

		//String cWindow="https://spiceclub.spicejet.com/signup";
		//driver.switchTo().window("cWindow");
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.phoneNumber.sendKeys(phoneNumber);
		this.emailId.sendKeys(emailId);
		this.password.sendKeys(password);
		this.cPassword.sendKeys(cPassword);

	}
}

/*	public String getfname() {
		return firstName.getText();
	}

	public String getlname() {
		return lastName.getText();
	}

	public String getpno() {
		return phoneNumber.getText();
	}

	public String getemailId() {
		return emailId.getText();
	}

	public String getpassword() {
		return password.getText();
	}

	public String getcpassword() {
		return cPassword.getText();
	}

}
*/