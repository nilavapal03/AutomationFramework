package GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * 
 * @author nilava
 *This code is for driver code
 */

public class Driver{

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Logger logger = Logger.getLogger(Driver.class);
	
	
	public static WebDriver selectBrowser(String browser) {
		
		try {
			PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
			logger.info("INFO Msg:=====================>Loading Properties file");
			prop.load(new FileInputStream("./resourceLib/configuration/configFile.properties"));
			
		}catch(Exception e) {
			logger.error("ERROR Msg:=====================>Error while loading properties file"+e);
			e.printStackTrace();
		}
		
		switch (browser) {
		case "Chrome" :
			try {
			logger.info("INFO Msg:=====================> Launching Chrome browser");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver", prop.getProperty("Chrome"));
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			}catch (Exception e) {
				logger.error("ERROR Msg:=====================> Error while launching Chrome browser");
			}
			break;
			
		case "Firefox" :
			try {
			logger.info("INFO Msg:=====================> Launching Firefox browser");
			System.setProperty("webdriver.gecko.driver", prop.getProperty("Firefox"));
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			}catch (Exception e) {
				logger.error("ERROR Msg:=====================> Error while launching Firefox browser");
			}
			break;
			
		case "IE" :
			try {
			logger.info("INFO Msg:=====================> Launching IE browser");
			System.setProperty("webdriver.ie.driver", prop.getProperty("IE"));
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			}catch (Exception e) {
				logger.error("ERROR Msg:=====================> Error while launching IE browser");
			}
			break;
		default:
			logger.error("ERROR Msg:=====================> Please choose the correct browser");
			break;
		}
		
		return driver;
	}

	
}
