package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	private By RegisterButton = By.xpath("//button[text()='Register']");

	public void clickOnRegisterButton() {
		click(RegisterButton);
	}
}
