package PageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.Driver;

public class LogoutPage {

	
	public static Logger logger= Logger.getLogger(LoginPage.class);
	
	{
		PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
	}
	
	
	public LogoutPage() {
		PageFactory.initElements(Driver.driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Logout")
	private WebElement logout;
	
	
	public void clickonLogout() {
		logout.click();
	}
}
