package TestCase_For_OpeningBalancePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase extends BaseClass {
	
	LoginPage loginpage;
	HomePageOfVat homepage;
	
	  @BeforeMethod
      public void BrowserSetUp() {
    	  
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
    	loadPropertiesFileOfVAT();
  		WebDriverManager.chromedriver().setup();
  		driver = new ChromeDriver();
		driver.get(propForVat.getProperty("url"));
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
      }
      
	  @AfterMethod	
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
		}
	  
	 @Test(priority = 0)
	 public void verfiyLoginWithvalidCredentials() throws InterruptedException {
		 
		 homepage = loginpage.login(propForVat.getProperty("validUsername"),propForVat.getProperty("validPassword"));
		 Thread.sleep(3000); 
		 Assert.assertEquals(homepage.AfterLoginVerifyingDisplayedOfHomePage(), 
				 DataPropForVat.getProperty("validedSuccessfullyLogin"), "Wrong Page");
	 }
	 
	 @Test(priority = 1, dataProvider = "DataSupplyingFromExcel")
	 public void verifyLoginWithInvalidCredentials(String username , String password, String LoginStatus) {
		 
		 loginpage.login(username, password);
		 
		 //Assert.assertEquals(LoginStatus, DataPropForVat.getProperty("InvalidCredentials"),"Test Case Fail");
		 
		 Assert.assertTrue(loginpage.LoginFailedVerify(), "Test Fail");
	 }
	 
	 @DataProvider(name = "DataSupplyingFromExcel")
		public Object[][] SupplyUsernamePasswordLoginStatusDataFromExcelFile() {
			
			//In Excel file if sheet-name is changed that file have to copy and paste again the project
			Object [] [] data = BaseClass.getTestDataFromExcel("Login");
			return data;	
		}
	 
	 @Test(priority = 2)
	 public void verifyLoginWithEmptyCredentials() {
		 
		 loginpage.ClickOnSignInButton();
		 Assert.assertTrue(loginpage.LoginFailedVerify(), "Test Fail");
	 }
}
