package PageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.Driver;

public class EnterTimeTrackPage {
	
	
	public static Logger logger= Logger.getLogger(LoginPage.class);
	
	{
		PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
	}

	//constructor impliments done here
	public EnterTimeTrackPage() {
		PageFactory.initElements(Driver.driver, this);
	}
	
	//locators are decleare here for Enter Time Track page
	@FindBy(how=How.XPATH, using="//td[contains(text(),'Enter Time-Track')]")
	private WebElement enterTimeTrackText;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'New')]")
	private WebElement newlink;
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Create New Tasks')]")
	private WebElement createNewTaskText;
	
	@FindBy(how=How.ID, using="closeCreateTasksPopupButton")
	private WebElement CloseButton;
	
	
	//Method impliments done here using above locators
	
	public String verifyEnterTimeTrackText() {
		return enterTimeTrackText.getText();
	}
	
	public void clickOnNewLink() {
		newlink.click();
	}
	
	public String createNewTaskText() {
		return createNewTaskText.getText();
	}
	
	public void clickonCloseButton() {
		CloseButton.click();
	}
}
