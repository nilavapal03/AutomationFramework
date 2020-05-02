package GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author nilava
 *This code is for driver code
 */

public class Driver{

	public static WebDriver driver;
	public static  Properties prop = new Properties();
	public static Logger logger = Logger.getLogger(Driver.class.getName());
	
	public static  WebDriver launchBrowser() {
		
		try {
			PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
			logger.info("INFO Msg:=====================>Loading Properties file");
			prop.load(new FileInputStream("./resourceLib/configuration/configFile.properties"));
			
		}catch(Exception e) {
			logger.error("ERROR Msg:=====================>Error while loading properties file"+e);
			e.printStackTrace();
		}
		
		//browser identification should be user specific.
		String browserName=System.getProperty("Browser");
		System.out.println("Printing browser:=======>"+browserName);
		
		if(browserName==null) {
			browserName=System.getenv("Browser");
			System.out.println(browserName);
			
			if(browserName==null) {
				browserName="Firefox";
			}
		}
		
		switch (browserName) {
			case "Chrome" :
			
			try {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			logger.info("INFO Msg:=====================> Launching Chrome browser");
			if(browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			}else {
				logger.error("ERROR Msg:=====================> Error while executing chrome driver");
			}
			
			}catch (Exception e) {
				logger.error("ERROR Msg:=====================> Error while launching Chrome browser"+e);
				e.printStackTrace();
			}
			break;
			
			case "Firefox" :
			
			try {
			logger.info("INFO Msg:=====================> Launching Firefox browser");
			if(browserName.equals("Firefox")) {
				//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("Hello this line should execute====>"+driver);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			}else {
				logger.error("ERROR Msg:=====================> Error while executing firefox driver");
			}
			}catch (Exception e) {
				logger.error("ERROR Msg:=====================> Error while launching Firefox browser"+e);
				e.printStackTrace();
			}
			break;
			
			case "IE":
			
			try {
				logger.info("INFO Msg:=====================> Launching IE browser");
				if(browserName.equals("IE")) {
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				}else {
					logger.error("ERROR Msg:=====================> Error while executing IE driver");
				}
				}catch (Exception e) {
					logger.error("ERROR Msg:=====================> Error while launching IE browser"+e);
					e.printStackTrace();
				}
			logger.error("ERROR Msg:=====================> Please choose the correct browser");
			break;
			
			default:
				try {
					logger.info("INFO Msg:=====================> Launching IE browser");
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
					}catch (Exception e) {
						logger.error("ERROR Msg:=====================> Error while launching Firefox browser"+e);
						e.printStackTrace();
					}
					break;
				
		}
		
		return driver;
	}

	
}
