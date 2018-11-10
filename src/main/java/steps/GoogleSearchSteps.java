package steps;

import common.Hooks;
import common.PropertiesFileManagement;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	
	@Given("^User launches the application$")
	public void user_is_on_Home_Page() throws Throwable {
		PropertiesFileManagement prop = new PropertiesFileManagement();
		Hooks.webDriver.get(prop.getPropValues("applicationUrl"));
	}

	@When("^User search for some string$")
	public void user_search_for_some_string() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User verifies the result$")
	public void user_verifies_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
