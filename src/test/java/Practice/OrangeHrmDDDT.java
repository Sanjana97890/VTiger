package Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class OrangeHrmDDDT {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PropertiesUtility proputil = new PropertiesUtility();
		String Url=proputil.getDataFromProperties("url");
		driver.get(Url);
		String userName=proputil.getDataFromProperties("username");
		System.out.println(userName);
		String pwd=proputil.getDataFromProperties("password");
		System.out.println(pwd);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(userName,Keys.TAB,pwd,Keys.ENTER);
	}
}
