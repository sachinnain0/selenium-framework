package steps;

import java.util.List;
import java.util.Map;

import common.Hooks;
import common.PropertiesFileManagement;
import common.ScreenshotsManagement;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.LoginPage;

public class LoginToApplication {
	
	@Given("^User launches the application$")
	public void user_is_on_Home_Page() throws Throwable {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		Hooks.webDriver.get(prop.getPropValues("applicationUrl"));
		ScreenshotsManagement.takeScreenshot();
	}

	@When("^User logins with valid credentails$")
	public void user_search_for_some_string(DataTable dataTable) throws Throwable {
	   List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	   LoginPage loginPage = new LoginPage(Hooks.webDriver);
	   
	   loginPage.textBoxUserName.sendKeys(data.get(0).get("UserName"));
	   loginPage.textBoxPassword.sendKeys(data.get(0).get("Password"));
	   ScreenshotsManagement.takeScreenshot();
	   loginPage.buttonLogin.click();
	}

	@Then("^User verifies the result$")
	public void user_verifies_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
