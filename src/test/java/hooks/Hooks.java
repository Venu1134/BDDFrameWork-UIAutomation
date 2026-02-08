package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;

public class Hooks {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	@Before
	public void setup(Scenario scenario) {
		driver = DriverFactory.getDriver();
		extent = ExtentManager.getExtent();
		test = extent.createTest(scenario.getName());
	}

	@After
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenShot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);

			scenario.attach(screenShot, "image/png", "Test Failed");
			test.fail("Test Failed");
		} else {
			test.pass("Test Passed");
		}

		extent.flush();
		DriverFactory.quit();
	}
}
