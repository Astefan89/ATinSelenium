package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testdata.User;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Declare variables for the different elements on the page and identify the element 
	
	private By usernameInput = By.id("user-name");
	private By passwordInput = By.id("password");
	private By loginButton = By.id("login-button");
	private By headerText = By.xpath("//div[@class=\"login_logo\"]");
	private By errorMessage = By.xpath("//h3[@data-test=\"error\"]");
	private By errorMessageLockoutUser = By.xpath("//div [@class=\"error-message-container error\"]");
	
	
	//Actions
	public void enterUsername(String name) {
		driver.findElement(usernameInput).sendKeys(name);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	public String getHeaderText() {
		return driver.findElement(headerText).getText();
	}
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	public String getLoginErrorMessage () {
		return driver.findElement(errorMessage).getText();
	}
	public String getLoginErrorMessageLockOutUser() {
		return driver.findElement(errorMessageLockoutUser).getText();
	}
	//Method to create a authenticator
	public void authenticator(User standard_user) {
	enterUsername(standard_user.getUsername());
	enterPassword(standard_user.getPassword());
	clickLogin();	
	}

}
