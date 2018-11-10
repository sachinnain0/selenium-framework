package com.test.automation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue= {"steps", "common"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }
		)
public class Runner {
	
}
