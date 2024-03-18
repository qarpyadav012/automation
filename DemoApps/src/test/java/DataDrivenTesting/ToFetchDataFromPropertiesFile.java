package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
     FileInputStream fis=new FileInputStream("C:/Users/Ram prasad yadav/Selenium_prerequsite/eclipse/DemoApps/src/test/resources/TestData/commonData.properties");
	 Properties prop=new Properties();
	 prop.load(fis);
	 String broserVar = prop.getProperty("browser");
	 System.out.println(broserVar);
	 
	 String urlVar = prop.getProperty("url");
	 System.out.println(urlVar);
	 
	 String emailVar = prop.getProperty("email");
	 System.out.println(emailVar);
	 
	 String passVar = prop.getProperty("password");
	 System.out.println(passVar);
	 
	 
	}

}
