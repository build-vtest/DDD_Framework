package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basics.BaseClass;
import Basics.DefineConstants;
import ReusableMethods.Scroll;
import Utils.JsonUtils;
import pages.AddressesPage;
import pages.SignInPage;



public class AddressesTest extends BaseClass {
	AddressesPage addressesPage;
	SignInPage signInPage;

	@Test(enabled = true)
	public void address() throws Exception {

		signInPage = new SignInPage(driver);
		signInPage.enterUserName(JsonUtils.getData(DefineConstants.TC_01_Login, "username"));
		signInPage.enterPass(JsonUtils.getData(DefineConstants.TC_01_Login, "password"));
		//signInPage.enterUserName("Nikita");
		
		signInPage.enterLoginBtn();
		addressesPage = new AddressesPage(driver);
		addressesPage.clickOnAddress();
		addressesPage.clickOnNewAddress();
		
		
		addressesPage.enterFirstName(JsonUtils.getData(DefineConstants.TC_02_Addresses, "FirstName"));
		addressesPage.enterLastName(JsonUtils.getData(DefineConstants.TC_02_Addresses, "LastName"));
		addressesPage.enterstreetAddress(JsonUtils.getData(DefineConstants.TC_02_Addresses, "Address1"));
		addressesPage.entersecondaryAddress(JsonUtils.getData(DefineConstants.TC_02_Addresses, "Address2"));
		addressesPage.entercity(JsonUtils.getData(DefineConstants.TC_02_Addresses, "city"));
		addressesPage.enterstate();

		addressesPage.enterzipCode(JsonUtils.getData(DefineConstants.TC_02_Addresses, "zipCode"));
		
		addressesPage.Selectcountry();
		addressesPage.enterbirthdayDate();
		
		Scroll scroll =  new Scroll();
		scroll.scrolldown(driver);
		
		addressesPage.enteraddressAge(JsonUtils.getData(DefineConstants.TC_02_Addresses, "Age"));
		addressesPage.enteraddressWebsite(JsonUtils.getData(DefineConstants.TC_02_Addresses, "Website"));
		addressesPage.enteraddressPhone(JsonUtils.getData(DefineConstants.TC_02_Addresses, "Phone"));
		addressesPage.enterread();
		
		addressesPage.enternote(JsonUtils.getData(DefineConstants.TC_02_Addresses, "Note"));

		addressesPage.clickOnSubmit();
		
		
		String actual_title = driver.getTitle();
		String expected_title = "We're sorry, but something went wrong (500)";

		Assert.assertEquals(actual_title, expected_title);
		
	} 

}
