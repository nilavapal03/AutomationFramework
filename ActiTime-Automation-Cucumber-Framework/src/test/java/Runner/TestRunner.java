package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./resourceLib/Features", glue= {"StepDefination"},
format= {"pretty","html:./report/cucumberReports"}, tags= {"@SmokeTest"})
public class TestRunner {

	
}

