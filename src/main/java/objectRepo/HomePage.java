package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	//1.Declaring the Webelements
		@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
		private WebElement leads;
		
		@FindBy(linkText = "Contacts")
		private WebElement contacts;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement accountsIcon;
		
		@FindBy(xpath = "//a[text()='Sign Out']")
		private WebElement signOut;
		
		//2.initializing
			public HomePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			//Getting method
			public WebElement getLeads() {
				return leads;
			}

			public WebElement getContacts() {
				return contacts;
			}

			public WebElement getAccountsIcon() {
				return accountsIcon;
			}

			public WebElement getSignOut() {
				return signOut;
			}
			
			//3.Utilizing Webelements
			/**
			 * This is a business library to perform click operation on leads menu in application
			 */
			public void clickOnLeadsMenu() {
				getLeads().click();
			}
			/**
			 * This is a business library to perform click operation on Accounts Icon to application
			 */
			public void clickOnContactssMenu() {
				getContacts().click();
			}
			
			/**
			 * This is a business library to perform signout of the application
			 * @param driver
			 */
			public void logoutOperation(WebDriver driver) {
				new SeleniumUtility().mouseHoveringAction(driver, getAccountsIcon());		
				getSignOut().click();
			}
	}

	
	