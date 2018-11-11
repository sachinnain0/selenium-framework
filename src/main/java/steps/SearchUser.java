package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.Hooks;
import common.ScreenshotsManagement;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.HomePage;
import page_objects.SystemUsers;

public class SearchUser {


@When("^User navigates to the Admin portal$")
public void user_navigates_to_the_Admin_portal() throws Throwable {
   HomePage homePage = new HomePage(Hooks.webDriver);
   ScreenshotsManagement.takeScreenshot();
   homePage.tabAdmin.click();  
}

@When("^Search for the user$")
public void search_for_the_user(DataTable dataTable) throws Throwable {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	SystemUsers sysUsers = new SystemUsers(Hooks.webDriver);
	sysUsers.textBoxUserName.sendKeys(data.get(0).get("SearchUserName"));
	Select roleDropDown =  new Select(sysUsers.dropDownUserRole);
	roleDropDown.selectByVisibleText(data.get(0).get("UserRole"));
	ScreenshotsManagement.takeScreenshot();
	sysUsers.buttonSearch.click();
  
}

@Then("^Validates if user exists in HRM portal$")
public void validates_if_user_exists_in_HRM_portal(DataTable dataTable) throws Throwable {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	SystemUsers sysUsers = new SystemUsers(Hooks.webDriver);
	List<WebElement> resultSetUserName = sysUsers.labelUserNameResultTable;
	
	if(resultSetUserName.size()==1){
		if(!data.get(0).get("SearchUserName").equalsIgnoreCase(resultSetUserName.get(0).getText())) {
			throw new Exception("Incorrect search result- Expected: "+data.get(0).get("SearchUserName")+" but Actaul: "+resultSetUserName.get(0).getText());
		}
	}
	ScreenshotsManagement.takeScreenshot();
}
}
