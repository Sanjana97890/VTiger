package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	@FindBy(name="firstname")
	private WebElement firstNameTextfield;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextfield;
	
	@FindBy(name="title")
	private WebElement titleTextfield;
	
	@FindBy(name="department")
	private WebElement departmentTextfield;
	
	@FindBy(name="email")
	private WebElement emailTextfield;
	
	@FindBy(name="mobile")
	private WebElement mobileTextfield;
	
	@FindBy(name="mailingcity")
	private WebElement mailingcityTextfield;
	
	@FindBy(name="mailingstate")
	private WebElement mailingstateTextfield;
	
	@FindBy(name="mailingcountry")
	private WebElement mailingcountryTextfield;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	
	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}


	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}


	public WebElement getTitleTextfield() {
		return titleTextfield;
	}


	public WebElement getDepartmentTextfield() {
		return departmentTextfield;
	}


	public WebElement getEmailTextfield() {
		return emailTextfield;
	}


	public WebElement getMobileTextfield() {
		return mobileTextfield;
	}


	public WebElement getMailingcityTextfield() {
		return mailingcityTextfield;
	}


	public WebElement getMailingstateTextfield() {
		return mailingstateTextfield;
	}


	public WebElement getMailingcountryTextfield() {
		return mailingcountryTextfield;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param firstName
	 * @param lastName
	 * @param title
	 */
	public void createNewContact(String firstName,String lastName, String title) {
		getFirstNameTextfield().sendKeys(firstName);
		getLastNameTextfield().sendKeys(lastName);
		getTitleTextfield().sendKeys(title);
		getSaveButton().click();
		}
	
	/**
	 * This is a business library to create a new contact
	 * @param lastName
	 * @param department
	 * @param email
	 * @param mobile
	 */
	public void createNewContact(String lastName, String department, String email, String mobile) {
		getLastNameTextfield().sendKeys(lastName);
		getDepartmentTextfield().sendKeys(department);
		getEmailTextfield().sendKeys(email);
		getMobileTextfield().sendKeys(mobile);
		getSaveButton().click();
		}
	
	
	/**
	 * This is a business library to create a new contact
	 * @param lastName
	 * @param title
	 * @param email
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void createNewContact(String lastName, String title, String email, String mailingCity,
			String mailingState, String mailingCountry) {
		getLastNameTextfield().sendKeys(lastName);
		getTitleTextfield().sendKeys(title);
		getEmailTextfield().sendKeys(email);
		getMailingcityTextfield().sendKeys(mailingCity);
		getMailingstateTextfield().sendKeys(mailingState);
		getMailingcountryTextfield().sendKeys(mailingCountry);
		getSaveButton().click();
		}
}



