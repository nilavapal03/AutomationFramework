package GenericUtils;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.HttpResponse;

import io.restassured.RestAssured;

public class CommonUtils {
	String parentWindowId = null;
	String childWindowId = null;
	//Driver ldriver= new Driver();

	
	public static Logger log = Logger.getLogger(CommonUtils.class);
	{
		PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
	}

	public String switchToChildWindow() {
		try {
			log.info("INFO Msg:====================>switch to Child Window");
			Set<String> set = Driver.driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			// String parentWindowId= it.next();
			childWindowId = it.next();
			Driver.driver.switchTo().window(childWindowId);
		} catch (NoSuchWindowException e) {
			log.error("ERROR Msg:==================>Child window not present" + e);
			e.printStackTrace();
		}

		return childWindowId;
	}

	public String switchToParenWindow() {
		try {
			log.info("INFO Msg: ==================>Switch to Parent window");
			Set<String> set = Driver.driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			parentWindowId = it.next();
			Driver.driver.switchTo().window(parentWindowId);

		} catch (NoSuchWindowException e) {
			log.error("ERROR Msg:=================>Parent window not presnt" + e);
			e.printStackTrace();
		}
		return parentWindowId;
	}

	public void acceptAlert() {
		try {
			log.info("INFO Msg:==================>Switch to accept Alert");
			Driver.driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			log.error("ERROR Msg:================>Alert is not present" + e);
		}
	}

	public void dismissAlert() {
		try {
			log.info("INFO Msg:=================>Switch to dismiss Alert");
			Driver.driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			log.error("ERROR Msg:================>Error while dismiss the alert" + e);
		}
	}

	public String textAlert() {
		String text_value = null;
		try {
			log.info("INFO Msg===============>Switch to Alert to getting the value");
			text_value = Driver.driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			log.error("ERROR Msg:============>Error while fetching value from Alert" + e);
		}
		return text_value;
	}

	public void refresh() {
		try {
			log.info("INFO Msg:==============>Refreshing the Web page");
			Driver.driver.navigate().refresh();
		} catch (Exception e) {
			log.error("ERROR Msg:============>Error while refreshing the Web page" + e);
		}
	}

	public void back() {
		try {
			log.info("INFO Msg:===============>Move to the previous page");
			Driver.driver.navigate().back();
		} catch (Exception e) {
			log.error("ERROR Msg:=============>Error while moving to the previous page" + e);
		}
	}

	public void forward() {
		try {
			log.info("INFO Msg:==============>Move to the next page");
			Driver.driver.navigate().forward();
		} catch (Exception e) {

			log.error("ERROR Msg:============>Error while moving to the next page" + e);
		}
	}

	
	public WebElement getObject(String locators, String locatorsExpression)throws NoSuchElementException {
		if(locators.trim().equalsIgnoreCase("XPATH")) {
			return Driver.driver.findElement(By.xpath(locatorsExpression));
		}
		
		if(locators.trim().equalsIgnoreCase("LINKTEXT")) {
			return Driver.driver.findElement(By.linkText(locatorsExpression));
		}
		if(locators.trim().equalsIgnoreCase("ID")) {
			return Driver.driver.findElement(By.id(locatorsExpression));
		}
		if(locators.trim().equalsIgnoreCase("NAME")) {
			return Driver.driver.findElement(By.name(locatorsExpression));
		}
		
		if(locators.trim().equalsIgnoreCase("PARTIALLINKTEXT")) {
			return Driver.driver.findElement(By.partialLinkText(locatorsExpression));
		}
		if(locators.trim().equalsIgnoreCase("CLASSNAME")) {
			return Driver.driver.findElement(By.className(locatorsExpression));
		}
		
		if(locators.trim().equalsIgnoreCase("CSSSELECTOR")) {
			return Driver.driver.findElement(By.cssSelector(locatorsExpression));
		}
		if(locators.trim().equalsIgnoreCase("TAGNAME")) {
			return Driver.driver.findElement(By.tagName(locatorsExpression));
		}
		
		return null;
	}
	
	public void performActions(String action,String locators, String locatorsExpression, String values )throws InterruptedException {
		if(action.equalsIgnoreCase("CLICK")) {
		this.getObject(locators, locatorsExpression).click();
		}
		if(action.equalsIgnoreCase("EDIT")) {
			this.getObject(locators, locatorsExpression).sendKeys(values);
		}
		
	}
	
	public boolean checkWebElementIsDisplayed(String action, String locators, String locatorsExpression, String values) throws InterruptedException {
		boolean flag=false;
		if(this.getObject(locators, locatorsExpression).isDisplayed()==true) {
			this.performActions(action, locators, locatorsExpression, values);
		}
		return flag;
		
	}

	public void returnListOfElements(String locators,String locatorsExpression ) throws Exception{
		@SuppressWarnings("unchecked")
		List<WebElement> list = (List<WebElement>) this.getObject(locators, locatorsExpression);
		for(int i=0;i<list.size();i++) {
			log.info("INFO Msg:================>List of Elements are: "+list.get(i).getText());
		}
			
		}
	public String verifyText(String locators, String locatorsExpression ,String expectedValue) {
		String actualValue="";
		try {
			log.info("INFO Msg:===============>Verify the text");
		actualValue= this.getObject(locators, locatorsExpression).getText();
		if(expectedValue.equalsIgnoreCase(actualValue)) {
			log.info("DEBUG Msg:===============>"+expectedValue+" and "+actualValue+" are same");
		}else {
			log.error("Error Msg:===============>"+expectedValue+" and "+actualValue+" are not same");
		}
		}catch (Exception e) {
			log.error("ERROR Msg:===============>Error while verifying the text"+e);
		}
		return actualValue;
		
	}
	
	
	/**
	 * Action class method implemented here
	 * @param xpathExpression
	 * @param locatorsExpression
	 */
	
	public void mouseMove(String xpathExpression, String locatorsExpression) {
		WebElement element=this.getObject(xpathExpression, locatorsExpression);
		Actions action= new Actions(Driver.driver);
		action.moveToElement(element).build().perform();
	}
	
	public void dragAndDrop(String locators, String locatorsExpression) {
		WebElement SrcElement=this.getObject(locators, locatorsExpression);
		WebElement DestElement=this.getObject(locators, locatorsExpression);
		Actions action = new Actions(Driver.driver);
		action.dragAndDrop(SrcElement, DestElement);
		}
	
	public void clickOnHold(String locators, String locatorsExpression) {
		WebElement SrcElement= this.getObject(locators, locatorsExpression);
		WebElement DestElement=this.getObject(locators, locatorsExpression);
		Actions action = new Actions(Driver.driver);
		action.moveToElement(SrcElement).clickAndHold().moveToElement(DestElement).release().build().perform();
	}
	
//	public void downloadFile(String url) {
//		try {
//			log.info("INFO Msg:===============>downloading the file");
//		String downloadFilePath="./resourceLib/downLoads";
//		HashMap<Object, Object> chromePref=new HashMap<Object, Object>();
//		chromePref.put("profile.default_content_settings.popups", 0);
//		chromePref.put("download.default_directory", downloadFilePath);
//		ChromeOptions chromOption= new ChromeOptions();
//		chromOption.setExperimentalOption("prefs", chromePref);
//		Driver.selectBrowser("Chrome");
//		Driver.driver=new ChromeDriver(chromOption);
//		Driver.driver.get(url);
//		
//		
//		}catch (Exception e) {
//			log.error("ERROR Msg:=============>error while downloading the file"+e);
//		}
//		}
	
	public String findFrames() {
		String id="";
		List<WebElement> list= Driver.driver.findElements(By.xpath("//iframe"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			id=list.get(i).getAttribute("id");
		}
		return id;
		}
	
	public void clickonFrameObject() {
		String id= findFrames();
		List list = new ArrayList<>();
		list.add(id);
		Iterator it = list.iterator();
		String id1=(String) it.next();
		
//		Iterator it= set.iterator();
//		String id=(String) it.next();
		Driver.driver.switchTo().frame(id1);
		Driver.driver.findElement(By.xpath("html/body/a/img")).click();
		Driver.driver.switchTo().defaultContent();
//		String id=findFrames();
//		Set<String> set= new HashSet<String>();
//		int size=set.size();
//		System.out.println("Size of frame "+size);
//		set.addAll(c)
//		System.out.println(set.add(id));
//		Iterator<String> it= set.iterator();
//		String id1=it.next();
//		Driver.driver.switchTo().frame(id1);
//		Driver.driver.findElement(By.xpath("html/body/a/img")).click();
//		Driver.driver.switchTo().defaultContent();
		}
		
	public void implicitWait(int i) {
		Driver.driver.manage().timeouts().implicitlyWait(i*10, TimeUnit.SECONDS);
	}
	
	
	public int statusCode(String expression, String valueName) {
		String url=Driver.driver.findElement(By.xpath(expression)).getAttribute(valueName);
		return RestAssured.get(url).getStatusCode();
		
	}
}
