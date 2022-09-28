package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;



public class SignInPage {
	private WebDriver driver;
	
//	private ExtentTest test;

	public  SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		this.test = test;
	}


	@FindBy(xpath = "//input[@placeholder = 'Email']")
	private WebElement email;

	@FindBy(xpath = "//input[@placeholder = 'Password']")
	private WebElement pass;

	@FindBy(xpath = "//input[@class = 'btn btn-primary']")
	private WebElement login;

	public void enterUserName(String inputUserName) {

		email.sendKeys(inputUserName);
		System.out.println("Email id entered");
	}

	public void enterPass(String inputPassword) {

		pass.sendKeys(inputPassword);
		System.out.println("Password entered");
	}

	public void enterLoginBtn() {

		login.click();
		System.out.println("clicked on login button");
	}
}
