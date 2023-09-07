package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features/Tag.Feature",
		glue="stepDefinition",
		plugin={"pretty","json:target/cucumber-reports/reports.json",		
				"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports/reports2.html"},
		tags = {"@Run"},
		dryRun = false
		)
public class TestRunner {
	
	

}
