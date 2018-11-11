package page_objects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import common.PropertiesFileManagement;

public class SystemUsers {
	
	public SystemUsers(WebDriver webDriver) throws NumberFormatException, IOException {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriver, Integer.parseInt(prop.getPropValues("timeout")));
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath="//input[@id=\"searchSystemUser_userName\"]")
	public WebElement textBoxUserName;
	
	@FindBy(xpath="//select[@id=\"searchSystemUser_userType\"]")
	public WebElement dropDownUserRole;
	
	@FindBy(xpath="//input[@id=\"searchBtn\"]")
	public WebElement buttonSearch;
	
	@FindBy(xpath="//table[@id=\"resultTable\"]//tr/td[2]/a")
	public List<WebElement> labelUserNameResultTable;
	
}