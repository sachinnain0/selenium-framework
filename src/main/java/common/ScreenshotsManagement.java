package common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotsManagement {
	public static void takeScreenshot() {
		final byte[] screenshot = ((TakesScreenshot) Hooks.webDriver).getScreenshotAs(OutputType.BYTES);
	    Hooks.scenario.embed(screenshot, "image/png");

	}
}
