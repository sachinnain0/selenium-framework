package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import common.PropertiesFileManagement;

public class HomePage {
	
	public HomePage(WebDriver webDriver) {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriver, prop.get("timeout"));
	}

	@FindBy(xpath="")
	public WebElement textBoxSource;
}