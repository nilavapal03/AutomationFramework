package Runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./resourceLib/Features", glue= {"StepDefination"},
format= { "pretty","html:./report/cucumberReports"},
tags= {"@SmokeTest"})

/**
 * ,
 * @author Admin
 *
 */

public class TestRunner {
	public static  Logger logger= Logger.getLogger(TestRunner.class);
	
		
}

