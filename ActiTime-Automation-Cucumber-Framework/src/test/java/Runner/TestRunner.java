package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./resourceLib/Features",glue= {"StepDefination"}, 
format= {"pretty","html:./report/cucumberReports",
		"json:./report/cucumberReports/cucumber.json","junit:./report/cucumberReports/cucumber.xml"}
		,tags= {"@SmokeTest"})

public class TestRunner {
	
	
}
