package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageStepDefination extends BaseStepDefination {

	LoginPage loginpage;

	@Then("user should be registered")
	public void verifyUserRegistered() throws Exception {
		loginpage = new LoginPage(driver);
		Thread.sleep(2000);
		Assert.assertTrue(loginpage.verifyUserRegisteredSuccessfully());
	}

}
