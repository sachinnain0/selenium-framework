package common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver webDriver = null;
	
	@Before
	public void beforeScenario() throws IOException {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		webDriver = BrowserManagement.getWebDriver(prop.getPropValues("browser"));		
	}
	
	@After
	public void afterScenario() {
		if(webDriver!=null) {
			webDriver.quit();
		}
	}
	
}
