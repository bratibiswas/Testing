package bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="feature",
		glue="stepDef",
		plugin="json:target/cucumber-report.json"
		)
public class TestRunner{

}
