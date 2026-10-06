package Practice;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class POMPractise {
	//declaring non-static variables
	@FindBy(name ="user_name")
	WebElement usernameTF;
	
	//initializing 
	public POMPractise(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		SeleniumUtility selenium = new SeleniumUtility();
		 WebDriver driver = new ChromeDriver();
		selenium.maximizeWindow(driver);
		selenium.implicitWait(driver, 15);
		PropertiesUtility putility = new PropertiesUtility();
		String url = putility.getDataFromProperties("url");
		selenium.accessApplication(driver, url);
		String username = putility.getDataFromProperties("username");
		String pwd = putility.getDataFromProperties("password");
//		WebElement userTF = driver.findElement(By.name("user_name"));
//		userTF.sendKeys(username);
		
		
//		driver.findElement(By.name("user_name")).sendKeys(username);
//		POMPractise p = new POMPractise(driver);
//		p.usernameTF.sendKeys(username);
//		Thread.sleep(1000);
		
		
//		selenium.refreshWebpage(driver);
//		Thread.sleep(1000);
		
//		p.usernameTF.sendKeys(username);
//		driver.findElement(By.name("user_name")).sendKeys(username);
//		//StaleElementReferenceException here we get this exception
//		//because we are trying to send keys to the old referance
		//after every webpage refresh we will get new dom structure that looks exactly same
//		userTF.sendKeys(admin,Keys.TAB,pwd);
		
		
	}

}
