package Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.*;

public class LoginVTigerAndCreatingNewLead {
	@Test
	public void vTigerLoginoperationAndreatingNewLead() throws IOException {
		WebDriver driver = new ChromeDriver();
		SeleniumUtility suility= new SeleniumUtility();
		PropertiesUtility puility =new PropertiesUtility();
		ExcelUtility eutil = new ExcelUtility();
		String url = puility.getDataFromProperties("url");
		suility.accessApplication(driver, url);
		suility.maximizeWindow(driver);
		suility.implicitWait(driver, 15);
		
		LoginPage login = new LoginPage(driver);
		login.loginToApplication(puility.getDataFromProperties("username"),puility.getDataFromProperties("password") );
		
		 HomePage home = new HomePage(driver);
		 home.clickOnLeadsMenu();
		 
		 LeadsPage leads = new LeadsPage(driver);
		 leads.clickOnCreateNewLeadIcon();
		 CreatingNewLeadPage newLead = new CreatingNewLeadPage(driver);
		 String lastName = eutil.getDataFromExcel("Leads", 7, 1);
		 String company = eutil.getDataFromExcel("Leads", 7, 2);
		 String phoneNo = eutil.getDataFromExcel("Leads", 7, 3);
		 String email = eutil.getDataFromExcel("Leads", 7, 4);
		 String city = eutil.getDataFromExcel("Leads", 7, 5);
		 String state = eutil.getDataFromExcel("Leads", 7, 6);
		 String country = eutil.getDataFromExcel("Leads", 7, 7);
		 newLead.createNewLead(lastName, company, phoneNo, email, city, state, country);
		 
		 home.logoutOperation(driver);
		 suility.closeBrowser(driver);
		
	}
}
