package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
//	public static FileInputStream fis;
//	public static Sheet excelSheet;
//	public static Workbook excelWorkbook;
//	public static Row row;
//	public static Cell cell;
	//static String projectPath; 

	

	/*public static String readExcel(String TestCaseName,String excelPath, String sheetName, String TestData) throws Exception {
	
			fis= new FileInputStream(new File(excelPath));
			
			excelWorkbook= new XSSFWorkbook(fis);
			excelSheet=excelWorkbook.getSheet(sheetName);
			row=excelSheet.getRow(0);
			
			//row count
			int rowCount=excelSheet.getLastRowNum();
			
			//cell count
			int cellCount=row.getLastCellNum();
			
			int rowNumberForTestcase=0;
			int cellNumberForTestcase=0;
			
			for(int i=0; i<rowCount;i++) {
				if(excelSheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(TestCaseName)) {
					rowNumberForTestcase=i;
					break;
				}
				
			}
			for(int j=0;j<cellCount;j++) {
				if(excelSheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase(TestData)) {
					cellNumberForTestcase=j;
					break;
				}
			}
			String data=excelSheet.getRow(rowNumberForTestcase).getCell(cellNumberForTestcase).getStringCellValue();
			return data;
		
}*/
	
	public String readData(String filePath, String SheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(filePath);
		System.out.println("fis============>"+fis);
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet= wb.getSheet(SheetName);
		Row row= sheet.getRow(rowNum);
		String value=row.getCell(colNum).getStringCellValue();
		return value;
		
	}
}