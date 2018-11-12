package common;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver webDriver = null;
	public static Scenario scenario=null;
	
	@Before
	public void beforeScenario(Scenario scenario) throws IOException {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		this.scenario = scenario;
		webDriver = BrowserManagement.getWebDriver(prop.getPropValues("browser"));		
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Hooks.webDriver).getScreenshotAs(OutputType.BYTES);
		    Hooks.scenario.embed(screenshot, "image/png");
		}
		
		if(webDriver!=null) {
			webDriver.quit();
		}
	}
	
}
