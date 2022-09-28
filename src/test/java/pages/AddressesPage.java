package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class AddressesPage {
	private WebDriver driver;

//	private ExtentTest test;

	public AddressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		this.test = test;
	}

	@FindBy(xpath = "//a[normalize-space()='Addresses'][1]")
	private WebElement address;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/a[1]")
	private WebElement newAddress;

	@FindBy(xpath = "//input[@id='address_first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='address_last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='address_street_address']")
	private WebElement streetAddress;

	@FindBy(xpath = "//input[@id='address_secondary_address']")
	private WebElement secondaryAddress;

	@FindBy(xpath = "//input[@id='address_city']")
	private WebElement city;

	@FindBy(xpath = "//select[@id='address_state']")
	private WebElement state;

	@FindBy(xpath = "//input[@id='address_zip_code']")
	private WebElement zipCode;

	@FindBy(xpath = "//input[@id='address_country_us']")
	private WebElement country;

	@FindBy(id = "address_birthday")
	private WebElement birthdayCalender;

	@FindBy(xpath = "//input[@id='address_color']")
	private WebElement addressColor;

	@FindBy(xpath = "//input[@id='address_age']")
	private WebElement addressAge;

	@FindBy(xpath = "//input[@id='address_website']")
	private WebElement addressWebsite;

	@FindBy(xpath = "//input[@id='address_phone']")
	private WebElement addressPhone;

	@FindBy(xpath = "//input[@id='address_interest_read']")
	private WebElement read;

	@FindBy(xpath = "//textarea[@id='address_note']")
	private WebElement note;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[17]/input[1]")
	private WebElement submit;

	public void clickOnAddress() {

		address.click();
		System.out.println("clicked on Address button");
	}

	public void clickOnNewAddress() throws InterruptedException {
 
		Thread.sleep(2000);
		newAddress.click();
		System.out.println("clicked on New Address button");
	}

	public void enterFirstName(String inputFname) throws InterruptedException {

		Thread.sleep(4000);
		firstName.sendKeys(inputFname);
		System.out.println("Address entered");
	}

	public void enterLastName(String inputLname) throws InterruptedException {

		Thread.sleep(2000);
		lastName.sendKeys(inputLname);
		System.out.println("Last name entered");
	}

	public void enterstreetAddress(String inputstreetAddress) throws InterruptedException {

		Thread.sleep(2000);
		streetAddress.sendKeys(inputstreetAddress);
		System.out.println("street Address entered");
	}

	public void entersecondaryAddress(String inputsecondaryAddress) throws InterruptedException {

		Thread.sleep(2000);
		secondaryAddress.sendKeys(inputsecondaryAddress);
		System.out.println("secondary Address entered");
	}

	public void entercity(String inputCity) throws InterruptedException {

		Thread.sleep(2000);
		city.sendKeys(inputCity);
		System.out.println("city name entered");
	}

	public void enterstate() throws InterruptedException {

		Thread.sleep(2000);
		state.click();
		Select select = new Select(state);
		select.selectByVisibleText("California");
	}

	public void enterzipCode(String inputzipCode) throws InterruptedException {

		Thread.sleep(2000);
		zipCode.sendKeys(inputzipCode);
		System.out.println("Zip Code entered");
	}

	public void Selectcountry() throws InterruptedException {

		Thread.sleep(2000);
		country.click();
		
		System.out.println("Country selected");
	}

	public void enterbirthdayDate() throws InterruptedException {

		Thread.sleep(2000);
		birthdayCalender.click();
		Thread.sleep(2000);
//		Select select = new Select(birthdayCalender);
//		select.selectByVisibleText("28");
		
		System.out.println("Birthday Date selected");
	}

	public void enteraddressAge(String inputaddressAge) throws InterruptedException {

		Thread.sleep(2000);
		addressAge.sendKeys(inputaddressAge);
		System.out.println("Age entered");
	}

	public void enteraddressWebsite(String inputWebsiteName) throws InterruptedException
	{
		Thread.sleep(2000);
		addressWebsite.sendKeys(inputWebsiteName);
		System.out.println("Website entered");
	}
	
	public void enteraddressPhone(String inputaddressPhone) throws InterruptedException
	{
		Thread.sleep(2000);
		addressPhone.sendKeys(inputaddressPhone);
		System.out.println("Phone numer entered");
	}
	
	public void enterread() throws InterruptedException
	{
		Thread.sleep(2000);
		read.click();
		System.out.println("Clicked on common interest");
	}
	
	public void enternote(String inputnote) throws InterruptedException
	{
		Thread.sleep(2000);
		note.sendKeys(inputnote);
		System.out.println("note entered");
	}
	
	public void clickOnSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		submit.click();
		System.out.println("Clicked on Submit button");
	}
}
