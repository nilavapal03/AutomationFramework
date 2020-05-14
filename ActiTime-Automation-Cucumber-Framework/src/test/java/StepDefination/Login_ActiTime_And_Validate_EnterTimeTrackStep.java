package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;

import Extensibility.AppMethods;
import GenericUtils.CommonUtils;
import GenericUtils.Driver;
import GenericUtils.Report;
import PageObjects.EnterTimeTrackPage;
import PageObjects.LoginPage;
import PageObjects.LogoutPage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.StepDefinitionMatch;

public class Login_ActiTime_And_Validate_EnterTimeTrackStep extends Report {

	public static Logger logger = Logger.getLogger(Login_ActiTime_And_Validate_EnterTimeTrackStep.class);
	// ==========================Start object creation here================================================//
	public Properties prop = new Properties();
	CommonUtils commonUtils = new CommonUtils();
//	Driver ldriver= new Driver();
	
	
	LoginPage login;
	EnterTimeTrackPage enterTimeTrackPage;
	LogoutPage logoutPage;
	Scenario scenario;
	ExtentTest loginfo;
	// ==========================End of object creation===================================================//
	
	String filePath = "C:\\Users\\Admin\\ActiTime-Automation-Cucumber-Framework\\resourceLib\\testData\\TestData.xlsx";

	{try {
			PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
			logger.info("INFO Msg:===============> Loading peropeties file");
			prop.load(new FileInputStream(new File("./resourceLib/configuration/configFile.properties")));
		} catch (IOException e) {
			logger.info("ERROR Msg:==============> Error while loading properties file" + e);
			e.printStackTrace();
		}
	}

	//Setup method where Browser should launch
	@Before() 
	public void setUp(Scenario scenario) {
		this.scenario=scenario;
		Report.setReport();
		try {
		logger.info("INFO Msg:===============>Launch the Browser");
		Driver.launchBrowser();
		logger.info("Executing Scenario :"+scenario.getName());
		}catch (Exception e) {
			logger.error("ERROR Msg:=============>Error While launcing browser ");
		}
	}

	//tear down method where browser should close
	@After
	public void tearDown(Scenario scenario) {
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		scenario.write("Finished Scenario");
		System.out.println("Hello this is checking msg==================================================");
		
		if(scenario.isFailed()) {
			
			scenario.embed(((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.BYTES), "./report/screenshots/"+timeStamp+".png");
		}
		logger.info("Test Enviourment closed");
		Driver.driver.quit();
		Report.endReport();
	}

	
	@Given("^I want Login to the application$")
	public void i_want_Login_to_the_application() throws Throwable {
		
		Report.createReport("Login to ActiTime Application and Validate Enter Time-Track heading should be available", "Login to ActiTime Application");
		loginfo=Report.createTesteport("Given", "I want Login to the application");
			try {
			loginfo.info("INFO Msg:===============>Launch AtiTime application");
			int statusCode=commonUtils.urlStatusCode(prop.getProperty("actiTime_URL"));
			logger.info("INFO MSG:==================>URL status code is::"+statusCode);
			
			Driver.driver.get(prop.getProperty("actiTime_URL"));
			loginfo.info("AtiTime application launch properly");
			
			
		} catch (Exception e) {
			Report.tesepHandelStep("FAIL", loginfo, e);
			loginfo.error("ERROR Msg:=============>Error While launcing ActiTime application"+e);
		}
	}

	@And("^I Provide valid (.+) and (.+)$")
    public void i_provide_valid_and(String username, String password) throws Throwable {
		login = new LoginPage();
		loginfo=Report.createTesteport("And", "I Provide valid userName and passWord");
		try {
		loginfo.info("INFO Msg:===============>Entering valid userName and passWord");
			
		login.credentials(username,password);
		loginfo.pass("Enter valid userName and passWord sucessfully");
		commonUtils.implicitWait(3);
		}catch (Exception e) {
			Report.tesepHandelStep("FAIL", loginfo, e);
			loginfo.error("ERROR Msg:=============>Error While entering userName and passWord"+e);
		}

	}

	@Then("^I want to click on \"([^\"]*)\" button$")
	public void i_want_to_click_on_Login_button(String Login) throws Throwable {
		login = new LoginPage();
		loginfo=Report.createTesteport("Then", "I want to click on "+Login+ "button");
		try {
			loginfo.info("INFO Msg:===============>clicking on Login button");
		String value = login.loginText();
		
		if (Login.equals(value)) {
			loginfo.debug("Login button value is ==============>"+value);
			login.clickOnLoginButton();
			commonUtils.implicitWait(3);
			loginfo.pass("Successfully click on Login button");
		} else {
			
			loginfo.error("ERROR Msg:=============>Expected value ::"+Login+" and Actual value ::"+value+" is Not match");
		}
		}catch (Exception e) {
			Report.tesepHandelStep("FAIL", loginfo, e);
			loginfo.error("ERROR Msg:=============>Error while click on login button"+e);
		}

	}

	@And("^I validate \"([^\"]*)\" Text$")
	public void i_validate_Text(String expectedText) throws Throwable {
		enterTimeTrackPage= new EnterTimeTrackPage();
		loginfo=Report.createTesteport("And", "I validate "+ expectedText+" Text");
		try {
			
			loginfo.info("INFO Msg:==============>Verifing Enter Time-Track text value in Enter Time-Track page and click on New link");
			commonUtils.implicitWait(3);
		String pageTitle_text = enterTimeTrackPage.verifyEnterTimeTrackText();
			if (pageTitle_text.equalsIgnoreCase(expectedText)) {
				loginfo.debug("Page titile is ==============>"+pageTitle_text);
			enterTimeTrackPage.clickOnNewLink();
			loginfo.pass("Successfully verified Enter Time-Track text value in Enter Time-Track page");
			commonUtils.implicitWait(3);
		}else {
			loginfo.error("ERROR Msg:=============>Expected value ::"+expectedText+" and Actual value ::"+pageTitle_text+" is Not match");
		}
		}catch (Exception e) {
			Report.tesepHandelStep("FAIL", loginfo, e);
			loginfo.error("ERROR Msg:=============>Error while entering Enter Time-Track page");
		}
	}
	
	@And("^validate \"([^\"]*)\" Textfield$")
	public void validate_Textfield(String expectedText) throws Throwable{
		enterTimeTrackPage= new EnterTimeTrackPage();
		commonUtils.implicitWait(3);
		loginfo=Report.createTesteport("And", "I validate "+ expectedText+" Text");
		try {
			loginfo.info("INFO Msg:==============>Verifing Crate New Tasks value");
			String crateNewTaskText=enterTimeTrackPage.createNewTaskText();
			if(expectedText.equalsIgnoreCase(crateNewTaskText)) {
				Thread.sleep(5000);
				loginfo.debug("Actual value is =================>"+crateNewTaskText);	
			enterTimeTrackPage.clickonCloseButton();
			loginfo.pass("Successfully verified Crate New Tasks text field");
			commonUtils.implicitWait(3);
			}else {
				loginfo.error("ERROR Msg:=============>Expected value ::"+expectedText+" and Actual value ::"+crateNewTaskText+" is Not match");
			}
		}catch (Exception e) {
			Report.tesepHandelStep("FAIL", loginfo, e);
			loginfo.error("ERROR Msg:=============>Error while entering Create New Tasks page");
		}
	}
	


}
