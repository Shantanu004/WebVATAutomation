package AllPagesOfTransactionModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id ="P136_USERNAME")
	private WebElement userNameField;
	
	@FindBy(id ="P136_PASSWORD")
	private WebElement passWordField;
	
	@FindBy(id ="P136_BRANCH")
	private WebElement branchSelect;
	
	@FindBy(id = "B200407934638467654")
	private WebElement SignInButton;
	
	@FindBy(id="alertify-logs")
	WebElement LoginFailVerify;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		userNameField.sendKeys(username);	
	}
	
	public void enterPassword(String password) {
		passWordField.sendKeys(password);	
	}
	
	public void SelectBranchName() {
		branchSelect.click();
	}
	
	public void ClickOnSignInButton() {
		SignInButton.click();
	}
	
//	public HomePageOfVat ClickOnSignInButton() {
//		SignInButton.click();
//		return new HomePageOfVat(driver);
//	}
	
	public boolean LoginFailedVerify() {	
		return LoginFailVerify.isDisplayed();
	}
	
	public HomePageOfVat login(String username, String password) {
		userNameField.sendKeys(username);	
		passWordField.sendKeys(password);	
		branchSelect.click();
		SignInButton.click();
		return new HomePageOfVat(driver);
		
	}
	
	
}
