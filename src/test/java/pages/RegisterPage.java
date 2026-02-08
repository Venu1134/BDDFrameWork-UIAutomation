package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

	private By Username = By.xpath("//input[@name='username']");
	private By Password = By.xpath("//input[@name='password']");
	private By ConfirmPassword = By.xpath("//input[@name='confirmPassword']");
	private By RegisterButton = By.xpath("//button[text()='Register Now']");

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	public void registerUser(String username, String password, String confirmPassword) {
		type(Username, username);
		type(Password, password);
		type(ConfirmPassword, confirmPassword);
	}

	public void clickOnRegisterNowButton() {
		click(RegisterButton);
	}
}
