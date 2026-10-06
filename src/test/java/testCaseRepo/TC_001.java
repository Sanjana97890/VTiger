package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass{
	
	
	
	@Test(groups = {"Smoke","Regression"},retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage leads = new LeadsPage(driver);
		leads.clickOnCreateNewLeadIcon();
		//Assert.fail();
		 String firstName = eutil.getDataFromExcel("Leads", 1, 1);
		 String lastName = eutil.getDataFromExcel("Leads", 1, 2); 
		 String company = eutil.getDataFromExcel("Leads", 1, 3);
		 CreatingNewLeadPage newLead = new CreatingNewLeadPage(driver);
		 newLead.createNewLead(firstName, lastName, company);
	}
	
	
}