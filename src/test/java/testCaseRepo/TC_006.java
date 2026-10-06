package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass {
	@Test
	public void CON_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactssMenu();
		ContactsPage contact = new ContactsPage(driver);
		contact.clickOnCreateNewContactIcon();
		CreatingNewContactPage newContactPage = new CreatingNewContactPage(driver);
		String lastName = eutil.getDataFromExcel("Contacts", 7, 1);
		String title = eutil.getDataFromExcel("Contacts", 7, 2);
		String email = eutil.getDataFromExcel("Contacts", 7, 3);
		String mailingCity = eutil.getDataFromExcel("Contacts", 7, 4);
		String mailingState = eutil.getDataFromExcel("Contacts", 7, 5);
		String mailingCountry = eutil.getDataFromExcel("Contacts", 7, 6);
		newContactPage.createNewContact(lastName, title, email, mailingCity, mailingState, mailingCountry);
	}
	

public void m1()
{
	System.out.println("Hello Selenium");
}
}