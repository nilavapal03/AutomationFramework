package Runner;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import StepDefination.Login_ActiTime_And_Validate_EnterTimeTrackStep;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./resourceLib/Features", glue= {"StepDefination"},
format= {"pretty","html:./report/cucumberReports", 
		"json:./report/cucumberReports/cucumber.json",
		"junit:./report/cucumberReports/cucumber.xml"}, tags= {"@SmokeTest"})

public class TestRunner {
	public static  Logger logger= Logger.getLogger(TestRunner.class);
	
}

