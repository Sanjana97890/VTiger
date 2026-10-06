package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("C:\Users\Appu\OneDrive\Desktop\SeleniumNotebook\testdata.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String URL = prop.getProperty("url");
//		System.out.println(URL);
//		WebDriver driver = new ChromeDriver();
//		driver.get(URL);
		
		PropertiesUtility proputil = new PropertiesUtility();
		String Url = proputil.getDataFromProperties("url");
		System.out.println(Url);
		String  userName= proputil.getDataFromProperties("username");
		System.out.println(userName);
	}
}
