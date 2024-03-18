package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users/Ram prasad yadav/Selenium_prerequsite/eclipse/DemoApps/src/test/resources/TestData/Demotest.xlsx");
	    Workbook wb=WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet1");
	    Row rw = sh.getRow(2);
	    Cell cell = rw.getCell(1);
	    String candiName = rw.getCell(0).getStringCellValue();
	    System.out.println(candiName);
	    long candPhoneNo = (long)rw.getCell(2).getNumericCellValue();
	    System.out.println(candPhoneNo);
	    String candiEmail = rw.getCell(1).getStringCellValue();
	    System.out.println(candiEmail);
	    boolean candiStatus = rw.getCell(3).getBooleanCellValue();
	    System.out.println(candiStatus);
	    if(candiStatus) {
	    	System.out.println("She is Searching");
	    }
	    else
	    {
	    	System.out.println("She got matching");
	    }
	    
	}
	
}
