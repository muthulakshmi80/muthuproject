package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class TestUtil {
	static Workbook book;
	static Sheet sheet;


	public static String test_data ="C:/Users/laksh/eclipse-workspace/selenium_java_framework/src/main/java/testdata/check.xlsx";

	public static Object[][] getLoginData(String sheetname) {

		FileInputStream  file = null;

		try {

			file = new FileInputStream(test_data);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}//catch

		try {

			book = WorkbookFactory.create(file);

		} catch (InvalidFormatException e) {

			e.printStackTrace();

		}catch(IOException e) {
			e.printStackTrace();		

		}

		
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0;i<sheet.getLastRowNum();i++) {

			for (int k = 0; k<sheet.getRow(1).getLastCellNum(); k++){
				
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				
				
			}//k loop
			
			
		}//i loop
		
return data;

	}


}



