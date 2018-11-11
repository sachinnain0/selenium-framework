package page_objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import common.PropertiesFileManagement;

public class HomePage {
	
	public HomePage(WebDriver webDriver) throws NumberFormatException, IOException {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriver, Integer.parseInt(prop.getPropValues("timeout")));
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath="//a[@id=\"menu_admin_viewAdminModule\"]")
	public WebElement tabAdmin;
	
}