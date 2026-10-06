package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//1.Declaring the Webelements
		@FindBy(name="user_name")
		private WebElement usernameTextField;
		
		@FindBy(xpath= "//input[@type='password']")
		private WebElement passwordTextField;
		
		@FindBy(id="submitButton")
		private WebElement loginButton;
		
		//2.initializing
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//Getter Methods
		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}	
		
		//3.Utilizing the webelements
		/**
		 * This is a business library to perform login to application
		 * @param UN
		 * @param PWD
		 */
		public void loginToApplication(String UN,String PWD) {
			getUsernameTextField().sendKeys(UN);
			getPasswordTextField().sendKeys(PWD);
			getLoginButton().click();
		}
		
		
	
		
		
		
		
		
	}


