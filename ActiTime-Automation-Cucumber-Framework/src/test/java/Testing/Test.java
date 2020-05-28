package Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import GenericUtils.CommonUtils;
import GenericUtils.Driver;
import GenericUtils.ExcelData;


public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Driver.launchBrowser();
		Properties pop = new Properties();
		pop.load(new FileInputStream("./resourceLib/configuration/configFile.properties"));
		CommonUtils common= new CommonUtils();
		int statuscode=common.urlStatusCode(pop.getProperty("actiTime_URL"));
		System.out.println(statuscode);
		
		Driver.driver.get(pop.getProperty("actiTime_URL"));
	}
}


