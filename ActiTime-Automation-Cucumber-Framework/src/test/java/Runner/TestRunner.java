package Runner;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="./resourceLib/Features", glue= {"StepDefination"},
format= { "pretty","html:report/cucumberReports", "json:target/cucumberReports/cucumber.json"
		,"junit:target/cucumberReports/cucumber.xml"},
tags= {"@SmokeTest"}, monochrome=true,plugin = ("json:target/cucumber-reports/CucumberTestReport.json"))



public class TestRunner {
	public static  Logger logger= Logger.getLogger(TestRunner.class);
	
		
}

