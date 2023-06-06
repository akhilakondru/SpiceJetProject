package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.SignUpPage;
import spiceJetBaseClass.BaseClass;

public class SignUpTestCase extends BaseClass {

	SignUpPage sp;

	@BeforeClass
	public void beforeClass() {
		sp = new SignUpPage();

	}
	/*
	 * @Test public void signup() { //signUp.click();
	 * //driver.get("https://spiceclub.spicejet.com/signup"); By
	 * tittle=By.xpath("//select[@class='form-control form-select ']"); By
	 * country=By.xpath("//option[text()='India ']"); doSeletByVisibileText(tittle,
	 * "Miss"); doSeletByVisibileText(country, "India");
	 * 
	 * 
	 * } public static WebElement getElement(By locator){ return
	 * driver.findElement(locator); } public static void doSeletByVisibileText(By
	 * locator, String value) { Select select=new Select(getElement(locator));
	 * select.selectByVisibleText("Miss"); select.selectByVisibleText("India"); }
	 */

	@Test
	public void tc001_signUp_fname_Validation_Flow() throws Exception {
		SignUpPage sp = new SignUpPage();

		sp.signUp("akii", "kondru", "9988776655", "akhilakondru@gmail.com", "akki@123", "akki@123");
		Assert.assertEquals("SpiceClub - The frequent flyer program of SpiceJet", driver.getTitle());
	}

	@Test

	public void tc002_signUp_lname_Validation_Flow() throws Exception {
		SignUpPage sp = new SignUpPage();
		sp.signUp("akki", "", "9988776655", "akhilakondru@gmail.com", "akki@123", "akki@123");
		Assert.assertEquals("Please enter your last name.", driver.getTitle());
	}

	@Test

	public void tc003_signUp_phonenumber_Validation_Flow() throws Exception {
		SignUpPage sp = new SignUpPage();
		sp.signUp("akki", "kondru", "", "akhilakondru@gmail.com", "akki@123", "akki@123");
		Assert.assertEquals("Please enter your phonenumber.", driver.getTitle());
	}

	@Test

	public void tc004_signUp_emailId_Validation_Flow() throws Exception {
		SignUpPage sp = new SignUpPage();
		sp.signUp("akki", "kondru", "9988776655", "", "akki@123", "akki@123");
		Assert.assertEquals("Please enter your emailId.", driver.getTitle());
	}

	@Test

	public void tc005_signUp_password_Validation_Flow() throws Exception {
		SignUpPage sp = new SignUpPage();
		sp.signUp("akki", "kondru", "9988776655", "akhilakondru@gmail.com", "", "akki@123");
		Assert.assertEquals("Please enter your password.", driver.getTitle());
	}

	@Test

	public void tc006_signUp_cpassword_Validation_Flow() throws Exception {
		SignUpPage sp = new SignUpPage();
		sp.signUp("akki", "kondru", "9988776655", "akhilakondru@gmail.com", "akki@123", "");
		Assert.assertEquals("Please enter your ci,password.", driver.getTitle());
	}

}
