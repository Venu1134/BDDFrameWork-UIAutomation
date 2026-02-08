package stepDefinations;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;

public class BaseStepDefination {

	protected WebDriver driver;

	public BaseStepDefination() {
		this.driver = Hooks.driver;
	}
}
