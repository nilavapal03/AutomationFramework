package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import GenericUtils.Driver;
import GenericUtils.ReadExcel;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_ActiTime_And_Validate_EnterTimeTrackStep {
	public static Logger logger= Logger.getLogger(Login_ActiTime_And_Validate_EnterTimeTrackStep.class);
	public Properties prop= new Properties();
	ReadExcel readExcel= new ReadExcel();
	String filePath="C:\\Users\\Admin\\ActiTime-Automation-Cucumber-Framework\\resourceLib\\testData\\TestData.xlsx";
	
	{
		
		try {
			PropertyConfigurator.configure("./resourceLib/configuration/configFile.properties");
			logger.info("INFO Msg:===============> Loading peropeties file");
			prop.load(new FileInputStream(new File("./resourceLib/configuration/configFile.properties")));
		} catch (IOException e) {
			logger.info("ERROR Msg:==============> Error while loading properties file"+e);
			e.printStackTrace();
		}
	}
	
	
	@Given("^I want Login to the application$")
	public void i_want_Login_to_the_application() throws Throwable {
		Driver.selectBrowser(prop.getProperty("ch"));
		try {
			logger.info("INFO Msg:===============>Launch AtiTime application");
		Driver.driver.get(prop.getProperty("actiTime_URL"));
		}catch (Exception e) {
			logger.error("ERROR Msg:=============>Error While launcing ActiTime application");
		}
	}

	@Then("^I Provide valid userName and passWord$")
	public void i_Provide_valid_userName_and_passWord(DataTable dt) throws Throwable {
	  List<String> list= dt.asList(String.class);
	  Driver.driver.findElement(By.id("username")).sendKeys(list.get(0));
	  Driver.driver.findElement(By.name("pwd")).sendKeys(list.get(1));
	}

	@Then("^I want to click on \"([^\"]*)\" button$")
	public void i_want_to_click_on_Login_button(String Login) throws Throwable {
	String value=Driver.driver.findElement(By.xpath("//div[text()='Login ']")).getText();
	if(Login.equals(value)) {
		Driver.driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
		
	}

	@And("^I validate \"([^\"]*)\" Text$")
	public void i_validate_Text(String text) throws Throwable {
	    Driver.driver.quit();
	}


}
