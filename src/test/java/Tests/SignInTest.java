package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basics.BaseClass;
import Basics.DefineConstants;
import Utils.JsonUtils;
import pages.SignInPage;



public class SignInTest extends BaseClass {
	SignInPage signInPage;

	@Test(enabled = true)
	public void login() throws Exception {

		
		signInPage = new SignInPage(driver);
		signInPage.enterUserName(JsonUtils.getData(DefineConstants.TC_01_Login, "username"));
		signInPage.enterPass(JsonUtils.getData(DefineConstants.TC_01_Login, "password"));
		//signInPage.enterUserName("Nikita");
		
		signInPage.enterLoginBtn();
		
		String actual_title = driver.getTitle();
		String expected_title = "Address Book";

		Assert.assertEquals(actual_title, expected_title);
		
	} 

}
