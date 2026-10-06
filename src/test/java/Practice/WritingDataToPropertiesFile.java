package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import genericUtility.PropertiesUtility;

public class WritingDataToPropertiesFile {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Appu\\OneDrive\\Desktop\\SeleniumNotebook\\testdata.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		prop.setProperty("email", "robin@gmail.com");
//		System.out.println(prop);
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Appu\\OneDrive\\Desktop\\SeleniumNotebook\\testdata.properties");
//		prop.store(fos, "email is updated");
		PropertiesUtility prop = new PropertiesUtility();
		prop.writeDataToProperties("email","luffy@gmail.com" , "email is updated");
		
	}
}
