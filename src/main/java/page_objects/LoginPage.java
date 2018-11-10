package page_objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import common.PropertiesFileManagement;

public class LoginPage {
	
	public LoginPage(WebDriver webDriver) throws NumberFormatException, IOException {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriver, Integer.parseInt(prop.getPropValues("timeout")));
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath="//input[@id=\"txtUsername\"]")
	public WebElement textBoxUserName;
	
	@FindBy(xpath="//input[@id=\"txtPassword\"]")
	public WebElement textBoxPassword;
	
	@FindBy(xpath="//input[@id=\"btnLogin\"]")
	public WebElement buttonLogin;
}