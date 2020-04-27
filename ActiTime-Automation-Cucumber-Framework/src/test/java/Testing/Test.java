package Testing;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import GenericUtils.ExcelData;


public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException  {
		//String filepath="./resourceLib/testData/TestData.xlsx";
		
		ExcelData read= new ExcelData();
		String value=read.readExcelSheet("LoginSheet","LoginToActiTime","UserName");
		System.out.println(value);

	}

}
