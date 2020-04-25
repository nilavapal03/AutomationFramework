package GenericUtils;

import org.apache.logging.log4j.util.Timer.Status;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.Scenario;

public class Report {

	private static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	//this is for set Extent report method
	
	@SuppressWarnings("deprecation")
	public static void setReport() {
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/report/extentReports/AutomationReport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		htmlReporter.start();
		extent.setSystemInfo("Host Name", "Local Host");
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("OS", System.getProperty("user.name"));
		extent.setSystemInfo("Java Version", "1.8.0");
		extent.setSystemInfo("Selenium Version", "3.141.59");
		
			}
	
	
	//if Pass, fail and Skiped then this method will execute.
	public static void tesepHandelStep(String testStatus, ExtentTest extentTest, Throwable throwable) {
		switch (testStatus) {
		case "FAIL":
			extentTest.fail(MarkupHelper.createLabel("Test case is Failed : ", ExtentColor.RED));
			extentTest.error(throwable.fillInStackTrace());
			if(Driver.driver!=null) {
				Driver.driver.quit();
			}
			break;
		case "PASS":
			extentTest.pass(MarkupHelper.createLabel("Test case is Passed ", ExtentColor.GREEN));
			break;
		default:
			extentTest.skip(MarkupHelper.createLabel("Test case is Skiped ", ExtentColor.ORANGE));
			break;
		}
			
			}
		
	//flush the Extent report
	public static void endReport() {
		if(extent!=null) {
			extent.flush();
		}
	}
	
	
	//This method for feature and Scenario name
	public static ExtentTest createReport(String featureName, String scenarioName) {
		test=extent.createTest(Feature.class,featureName);
		test=test.createNode(com.aventstack.extentreports.gherkin.model.Scenario.class,scenarioName);
		return test;
		} 
	
	//This method is for Create Test and Steps
	public static ExtentTest createTesteport(String gherkinkeyword, String steps) throws ClassNotFoundException {
		return  test.createNode(new GherkinKeyword(gherkinkeyword), steps ); 
		
	}
}
	
		