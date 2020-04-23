package PageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.Driver;

public class LoginPage {
	
	
	public static Logger logger= Logger.getLogger(LoginPage.class);
	
	{
		PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
	}

	//create constructor for initiate driver.
	public LoginPage() {
		PageFactory.initElements(Driver.driver, this);
	}
	
	//locators are decleare here for login page
	
	@FindBy(how=How.ID, using= "username")
	private WebElement userName;
	
	@FindBy(how=How.NAME, using="pwd")
	private WebElement passWord;
	
	@FindBy(how=How.XPATH, using="(//div[contains(text(),'Login')])[1]")
	private WebElement loginButton;
	
	
	//Method impliments done here using above locators
	
	//this method is for username and password
	public void credentials(String usernname, String password) {
		userName.sendKeys(usernname);
		passWord.sendKeys(password);
		}
	
	//this method is for getText for login button
	public String loginText() {
		return loginButton.getText();
	}
	
	//this method is for click on login button
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
