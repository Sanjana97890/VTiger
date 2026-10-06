package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass{
	@Test(groups = "Smoke")
	public void CON_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactssMenu();
		ContactsPage contact = new ContactsPage(driver);
		contact.clickOnCreateNewContactIcon();
		CreatingNewContactPage newContactPage = new CreatingNewContactPage(driver);
		String lastName = eutil.getDataFromExcel("Contacts", 4, 1);
		String department = eutil.getDataFromExcel("Contacts", 4, 2);
		String email = eutil.getDataFromExcel("Contacts", 4, 3);
		String mobile = eutil.getDataFromExcel("Contacts", 4, 4);
		newContactPage.createNewContact(lastName, department, email, mobile);
	}
}