package PageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import GenericUtils.CommonUtils;
import GenericUtils.Driver;
import org.openqa.selenium.support.ui.Select;
public class CreateNewTasksPage {

	public static Logger logger= Logger.getLogger(CreateNewTasksPage.class);
	
	{
		PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
	}
	
	public CreateNewTasksPage() {
		PageFactory.initElements(Driver.driver, this);
	}
	
	CommonUtils commonUtils;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Select Customer and Project')]")
	private WebElement selectCustomerAndProjectToAddTasksforText;
	
	////div[@id='createTasksPopup_selectCustomerAndProject']/div
	
	
	@FindBy(how=How.XPATH, using="//button[@id='ext-gen19']")
	private WebElement selectNewCustomer;
	
	@FindBy(how=How.ID, using="createTasksPopup_newCustomer")
	private WebElement enterCustomerName;
	
	@FindBy(how=How.ID, using="createTasksPopup_newProject")
	private WebElement enterProjectName;
	
	@FindBy(how=How.XPATH, using="(//td[@class='nameCell first']/input[@type='text'])[1]")
	private WebElement enterTask1;
	
	@FindBy(how=How.XPATH,using="(//td[@class='nameCell first']/input[@type='text'])[2]")
	private WebElement enterTask2;
	
	@FindBy(how=How.XPATH,using="//div/span[contains(text(),'Create Tasks')]")
	private WebElement createTaskButton;
	
	public String verifySelectCustomerAndProjectToAddTasksforText() {
		return selectCustomerAndProjectToAddTasksforText.getText();
	}
	
	public String selectCustomerFromUI() {
		return Driver.driver.findElement(By.xpath("//button[@id='ext-gen19']")).getText();
	}
	
	public void selectCustomerAndCreateProject(String Selectcustomer,String CustomerName, String ProjectName, String TaskName1 , String TaskName2) throws InterruptedException {
		commonUtils=new CommonUtils();
		selectNewCustomer.click();
		commonUtils.implicitWait(5);
		commonUtils.performActions("CLICK", "linkText", Selectcustomer, "");
		//Driver.driver.findElement(By.linkText(Selectcustomer)).click();
		enterCustomerName.click();
		enterCustomerName.sendKeys(CustomerName);
		enterProjectName.click();
		enterProjectName.sendKeys(ProjectName);
		enterTask1.click();
		enterTask1.sendKeys(TaskName1);
		enterTask2.click();
		enterTask2.sendKeys(TaskName2);
		
	}
	
	public void clickOncreateTaskButton() {
		createTaskButton.click();
		
	}
}
