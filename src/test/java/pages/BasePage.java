package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	protected void click(By loc) {
		driver.findElement(loc).click();
	}

	protected void type(By loc, String val) {
		driver.findElement(loc).sendKeys(val);
	}

	protected boolean isDisplayed(By loc) {
		return driver.findElement(loc).isDisplayed();
	}
}
