package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By LoginPageTitle = By.xpath("//h2[text()='Login']");

	public boolean verifyUserRegisteredSuccessfully() {
		return isDisplayed(LoginPageTitle);
	}
}
