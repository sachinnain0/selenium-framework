package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserManagement {

	public static WebDriver getWebDriver(String browserName) {
		WebDriver webDriver = null;
		if(browserName!=null && browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
			webDriver = new ChromeDriver();
		}else if(browserName!=null && browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "webdrivers\\IEDriverServer.exe");
			webDriver = new InternetExplorerDriver();
		}
		return webDriver;
	}
}
