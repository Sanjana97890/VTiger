package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass {
	@Test(groups = "Regression")
	public void CON_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactssMenu();
		ContactsPage contact = new ContactsPage(driver);
		contact.clickOnCreateNewContactIcon();
		CreatingNewContactPage newContactPage = new CreatingNewContactPage(driver);
		String firstName = eutil.getDataFromExcel("Contacts", 1, 1);
		String lastName = eutil.getDataFromExcel("Contacts", 1, 2);
		String title = eutil.getDataFromExcel("Contacts", 1, 3);
		newContactPage.createNewContact(firstName, lastName, title);
		
	}
}
