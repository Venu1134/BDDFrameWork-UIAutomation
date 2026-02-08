package stepDefinations;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LandingPage;
import utils.ConfigReader;

public class LandingPageStepDefination extends BaseStepDefination {

	LandingPage landingPage;

	@Given("user opens application")
	public void openApplication() throws Exception {
		driver = DriverFactory.getDriver();
		driver.get(ConfigReader.get("url"));
	}

	@When("user clicks register button")
	public void clickOnRegisterButton() {
		landingPage = new LandingPage(driver);
		landingPage.clickOnRegisterButton();
	}
}
