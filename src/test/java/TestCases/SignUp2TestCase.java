package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import spiceJetBaseClass.BaseClass;

public class SignUp2TestCase extends BaseClass {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://spiceclub.spicejet.com/signup");

		By tittle = By.xpath("//select[@class='form-control form-select ']");
		doSeletByVisibileText(tittle, "Miss");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("akhila");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("kondru");
		By country = By.xpath("//select[@class='form-control form-select']");
		doSeletByVisibileText(country, "India");
		driver.findElement(By.xpath("//img[@class='d-inline-block datepicker']")).click();
	
		driver.findElement(By.xpath("//input[@id='dobDate']")).sendKeys("05/11/1999");
		driver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("9988776655");
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("akhilakondru522@gmail.com");
		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("Thaswika@2021");
		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys("Thaswika@2021");
		driver.findElement(By.xpath("//input[@id='defaultCheck1']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSeletByVisibileText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

}
