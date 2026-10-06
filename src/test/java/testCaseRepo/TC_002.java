package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass {
	@Test(groups = {"Smoke","Sanity"})
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage leads = new LeadsPage(driver);
		leads.clickOnCreateNewLeadIcon();
		String lastName = eutil.getDataFromExcel("Leads", 4, 1);
		String company = eutil.getDataFromExcel("Leads", 4, 2);
		String title = eutil.getDataFromExcel("Leads", 4, 3);
		String leadSource = eutil.getDataFromExcel("Leads", 4, 4);
		String noOfEmp = eutil.getDataFromExcel("Leads", 4, 5);
		CreatingNewLeadPage newLead = new CreatingNewLeadPage(driver);
		newLead.createNewLead(lastName, company, title, leadSource, noOfEmp);
	}
}