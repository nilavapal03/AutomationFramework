package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Extensibility.AppMethods;
import GenericUtils.CommonUtils;
import GenericUtils.Driver;
import GenericUtils.ReadExcel;
import PageObjects.EnterTimeTrackPage;
import PageObjects.LoginPage;
import PageObjects.LogoutPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_ActiTime_And_Validate_EnterTimeTrackStep {

	public static Logger logger = Logger.getLogger(Login_ActiTime_And_Validate_EnterTimeTrackStep.class);
	// ==========================Start object creation here================================================//
	public Properties prop = new Properties();
	CommonUtils commonUtils = new CommonUtils();
	ReadExcel readExcel = new ReadExcel();
	LoginPage login;
	EnterTimeTrackPage enterTimeTrackPage;
	LogoutPage logoutPage;
	// ==========================End of object creation===================================================//
	
	String filePath = "C:\\Users\\Admin\\ActiTime-Automation-Cucumber-Framework\\resourceLib\\testData\\TestData.xlsx";

	{

		try {
			PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
			logger.info("INFO Msg:===============> Loading peropeties file");
			prop.load(new FileInputStream(new File("./resourceLib/configuration/configFile.properties")));
		} catch (IOException e) {
			logger.info("ERROR Msg:==============> Error while loading properties file" + e);
			e.printStackTrace();
		}
	}

	@Given("^I want Login to the application$")
	public void i_want_Login_to_the_application() throws Throwable {
			try {
			logger.info("INFO Msg:===============>Launch AtiTime application");
			Driver.selectBrowser(prop.getProperty("Browser"));
			commonUtils.implicitWait(3);
			Driver.driver.get(prop.getProperty("actiTime_URL"));
		} catch (Exception e) {
			logger.error("ERROR Msg:=============>Error While launcing ActiTime application"+e);
		}
	}

	@Then("^I Provide valid userName and passWord$")
	public void i_Provide_valid_userName_and_passWord(DataTable dt) throws Throwable {
		login = new LoginPage();
		try {
			logger.info("INFO Msg:===============>Entering valid userName and passWord");
		List<String> list = dt.asList(String.class);
		login.credentials(list.get(0), list.get(1));
		commonUtils.implicitWait(3);
		}catch (Exception e) {
			logger.error("ERROR Msg:=============>Error While entering userName and passWord"+e);
		}

	}

	@Then("^I want to click on \"([^\"]*)\" button$")
	public void i_want_to_click_on_Login_button(String Login) throws Throwable {
		login = new LoginPage();
		try {
			logger.info("INFO Msg:===============>clicking on LoginButton");
		String value = login.loginText();
		
		if (Login.equals(value)) {
			logger.debug("Value is ==============>"+value);
			login.clickOnLoginButton();
			commonUtils.implicitWait(3);
		} else {
			logger.error("ERROR Msg:=============>Expected value ::"+Login+" and Actual value ::"+value+" is Not match");
		}
		}catch (Exception e) {
			logger.error("ERROR Msg:=============>Error while click on login button"+e);
		}

	}

	@And("^I validate \"([^\"]*)\" Text$")
	public void i_validate_Text(String expectedText) throws Throwable {
		enterTimeTrackPage= new EnterTimeTrackPage();
		try {
			logger.info("INFO Msg:==============>Verifing Enter Time-Track text value in Enter Time-Track page and click on New link");
			commonUtils.implicitWait(3);
		String pageTitle_text = enterTimeTrackPage.verifyEnterTimeTrackText();
			if (pageTitle_text.equalsIgnoreCase(expectedText)) {
				logger.debug("Page titile is ==============>"+pageTitle_text);
			enterTimeTrackPage.clickOnNewLink();
			commonUtils.implicitWait(3);
		}else {
			logger.error("ERROR Msg:=============>Expected value ::"+expectedText+" and Actual value ::"+pageTitle_text+" is Not match");
		}
		}catch (Exception e) {
			logger.error("ERROR Msg:=============>Error while entering Enter Time-Track page");
		}
	}
	
	@And("^I validate \"([^\"]*)\" Textfield$")
	public void i_validate_Textfield(String expectedText) {
		enterTimeTrackPage= new EnterTimeTrackPage();
		commonUtils.implicitWait(3);
		try {
			logger.info("INFO Msg:==============>Verifing Crate New Tasks value");
			String crateNewTaskText=enterTimeTrackPage.createNewTaskText();
			if(expectedText.equalsIgnoreCase(crateNewTaskText)) {
				Thread.sleep(5000);
			logger.debug("Actual value is =================>"+crateNewTaskText);	
			enterTimeTrackPage.clickonCloseButton();
			commonUtils.implicitWait(3);
			}else {
				logger.error("ERROR Msg:=============>Expected value ::"+expectedText+" and Actual value ::"+crateNewTaskText+" is Not match");
			}
		}catch (Exception e) {
			logger.error("ERROR Msg:=============>Error while entering Create New Tasks page");
		}
	}
	
	@And("^I logout the application$")
	public void i_logout_the_application() {
		logoutPage=new LogoutPage();
		commonUtils.implicitWait(3);
		try {
			logger.info("INFO Msg:==============>click on Logout");
			logoutPage.clickonLogout();
			commonUtils.implicitWait(3);
			Driver.driver.quit();
		}catch (Exception e) {
			logger.error("ERROR Msg:=============>Error while click on logout");
		}
	}

}
