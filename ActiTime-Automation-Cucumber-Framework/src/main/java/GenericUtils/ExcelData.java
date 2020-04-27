package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static Logger logger = Logger.getLogger(ExcelData.class);
	Properties prop = new Properties();

	// initialized class variable
	public FileInputStream fis;
	public Workbook wb;
	public Sheet sheet;
	public Row row;
	public Cell cell;
	String excelFilePath;

	{PropertyConfigurator.configure("./resourceLib/configuration/log4j.properties");
	
		try {
			logger.info("INFO Msg:================Excel Sheet Properties file is loading================");
			prop.load(new FileInputStream("./resourceLib/configuration/configFile.properties"));
		} catch (FileNotFoundException e) {
			logger.error("ERROR Msg:===============>File not found in your system path" + e);
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("ERROR Msg:===============>Error occured while fateching the data from properties file" + e);
			e.printStackTrace();
		}
	}

	/***
	 * This is a constructor of ExcelData class. While calling this ExcelData class
	 * to other class you need to call this constructor. For Implements other class
	 * Please follow steps: ExcelData readData= new ExcelData();
	 * 
	 * To pass Excel sheet Path you need to go to the configFile.properties which is
	 * located inside the configuration folder(configuration is located inside
	 *            the reourceLib folder)
	 * 
	 * @param excelFilePath:
	 *             Your excel sheet is located in your project folder (To
	 *            specify excel sheet path I have created one configFile.properties
	 *            inside the configuration folder[configuration is located inside
	 *            the reourceLib folder]) You can change the Excel sheet path from
	 *            there there itSelf.
	 * 
	 * @throws IOException
	 */

	public ExcelData() throws IOException {
		try {
			logger.info("INFO Msg:================>Loading Excel sheet Path from peroperties file");
			fis = new FileInputStream(prop.getProperty("ExcelSheetPath"));
			System.out.println(prop.getProperty("ExcelSheetPath"));
		} catch (FileNotFoundException e) {
			logger.error("ERROR Msg:===============>Error While Loading Excel sheet path from properties file" + e);
			e.printStackTrace();
		}
		try {
			logger.info("INFO Msg:================>Open Excel sheet file");
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			logger.info("ERROR Msg:================>Error while open Excel sheet file"+e);
			e.printStackTrace();
		}
		
		finally{
			wb.close();
		}

	}

	/***
	 * @param SheetName:
	 *            Pass your excel sheetName Example: Here I created TestData.xlsx.
	 *            inside the TestData excel sheet you will get LoginSheet. SheetName
	 *            should be LoginSheet.
	 * 
	 * @param value:
	 *            Which value you want to fetch from Excel sheet. Example: Inside
	 *            the TestData.xlsx you will found userName is a column name. To
	 *            Fetch exact value of userName you need to pass value=userName; so
	 *            you will get userName= Admin
	 * 
	 * @return: I created readExcelSheet() is a String type, so it is returning some
	 *          value for further use.
	 */

	public String readExcelSheet(String SheetName,String testCaseName,String value) {
		
		int rowNumber=-1;
		int cellNumber=-1;
		sheet= wb.getSheet(SheetName);
		row= sheet.getRow(0);
		
		//it will fetch the row name from excel sheet
		for(int j=0;j<sheet.getLastRowNum();j++) {
			if(sheet.getRow(j).getCell(0).getStringCellValue().trim().equals(testCaseName)) {
				rowNumber=j;
				break;
			}
	}
		//it will fetch the colnum from excel sheet
		for(int i=0;i<row.getLastCellNum();i++) {
			if(sheet.getRow(0).getCell(i).getStringCellValue().trim().equalsIgnoreCase(value)) {
				cellNumber=i;
				break;
			}
		}
		
		value=sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		
		return value;
	}

}
