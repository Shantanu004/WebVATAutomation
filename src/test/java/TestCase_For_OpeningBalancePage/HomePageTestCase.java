package TestCase_For_OpeningBalancePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import AllPagesOfTransactionModule.OpeningBalancePage;
import VAT_BasePackage.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTestCase extends BaseClass {
	HomePageOfVat homepage;
	OpeningBalancePage openingbalance;
	
	@BeforeMethod
    public void BrowserSetUp() { 
  	System.setProperty("webdriver.http.factory", "jdk-http-client");
  	loadPropertiesFileOfVAT();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(propForVat.getProperty("url"));
		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(propForVat.getProperty("validUsername"),
				propForVat.getProperty("validPassword"));
        homepage = new HomePageOfVat(driver);
        
    }
    
	  @AfterMethod	
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
		}
	
	  @Test
	  public void VerifyNavigateToOpeningBalancePage() throws InterruptedException {
		  Thread.sleep(3000); 
		  openingbalance = homepage.HomePageToNavigateOpeningBalance();
		  
	      Assert.assertEquals(openingbalance.HomepageVerifyByNavigateToOpeningBalanace(), 
	    		  DataPropForVat.getProperty("HomePageNavigateToOpeningBalanaceVerfiy"), "Wrong Page");
		  
		  
		  
	  }
}
