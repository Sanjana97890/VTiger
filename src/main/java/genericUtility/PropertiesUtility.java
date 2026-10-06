package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	public String getDataFromProperties(String key) throws IOException{
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	/**
	 * This is the generic method used to store the data to properties file
	 * @param key
	 * @param value
	 * @param comment
	 * @throws IOException
	 */
	public void writeDataToProperties(String key,String value,String comment) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty(key,value);
		System.out.println(prop);
		FileOutputStream fos = new FileOutputStream(IPathUtility.propertiesPath);
		prop.store(fos, comment);
	}
}



