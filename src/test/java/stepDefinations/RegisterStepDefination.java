package stepDefinations;

import io.cucumber.java.en.And;
import pages.RegisterPage;
import utils.CommonUtils;

public class RegisterStepDefination extends BaseStepDefination {

	RegisterPage registerPage;

	@And("enters username password and confirm password")
	public void registerUser() {
		registerPage = new RegisterPage(driver);
		registerPage.registerUser(CommonUtils.username, "Venu12345", "Venu12345");
	}

	@And("clicks on register now button")
	public void userClicksOnRegisterNowButton() {
		registerPage.clickOnRegisterNowButton();
	}
}
