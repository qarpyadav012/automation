package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {

	public String fetchDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:/Users/Ram prasad yadav/Selenium_prerequsite/eclipse/DemoApps/src/test/resources/TestData/commonData.properties");
		Properties prop=new Properties();
		 prop.load(fis);
		return prop.getProperty(key);
	}
	public String fetchStringDataFromExcelSheet(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\\\Users/Ram prasad yadav/Selenium_prerequsite/eclipse/DemoApps/src/test/resources/TestData/Demotest.xlsx");
	    return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}
	public double fetchNumericDataFromExcelSheet(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\\\Users/Ram prasad yadav/Selenium_prerequsite/eclipse/DemoApps/src/test/resources/TestData/Demotest.xlsx");
	    return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
	}
	public Boolean fetchBooleanDataFromExcelSheet(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\\\Users/Ram prasad yadav/Selenium_prerequsite/eclipse/DemoApps/src/test/resources/TestData/Demotest.xlsx");
	    return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
	}
	
}
