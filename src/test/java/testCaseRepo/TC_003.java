package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass{
	@Test(groups = {"Regression","Sanity"})
	public void LE_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage leads = new LeadsPage(driver);
		leads.clickOnCreateNewLeadIcon();
		String lastName = eutil.getDataFromExcel("Leads", 7, 1);
		String company = eutil.getDataFromExcel("Leads", 7, 2);
		String phoneNo = eutil.getDataFromExcel("Leads", 7, 3);
		String email = eutil.getDataFromExcel("Leads", 7, 4);
		String city = eutil.getDataFromExcel("Leads", 7, 5);
		String state = eutil.getDataFromExcel("Leads", 7, 6);
		String country = eutil.getDataFromExcel("Leads", 7, 7);
		CreatingNewLeadPage newLead = new CreatingNewLeadPage(driver);
		newLead.createNewLead(lastName, company, phoneNo, email, city, state, country);
		 
	}
}
