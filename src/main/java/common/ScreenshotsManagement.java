package common;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class ScreenshotsManagement {
	public static void takeScreenshot() throws WebDriverException, IOException {

		PropertiesFileManagement prop = new PropertiesFileManagement();
		if(prop.getPropValues("takeeveryscreenshot")!=null && prop.getPropValues("takeeveryscreenshot").equalsIgnoreCase("true")) {
			final byte[] screenshot = ((TakesScreenshot) Hooks.webDriver).getScreenshotAs(OutputType.BYTES);
			Hooks.scenario.embed(screenshot, "image/png");
		}

	}
}
