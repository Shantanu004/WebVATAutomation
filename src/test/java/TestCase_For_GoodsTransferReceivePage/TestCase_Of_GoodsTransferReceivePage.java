package TestCase_For_GoodsTransferReceivePage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.GoodsTransferReceivePage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_GoodsTransferReceivePage extends BaseClass {
	HomePageOfVat homepage;
	GoodsTransferReceivePage goodstransferreceivepage;
	
	@BeforeMethod
	public void BrowserSetUp() throws InterruptedException { 
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		loadPropertiesFileOfVAT();
		driver = intilizeBrowserAndOpenApplicationURL(propForVat.getProperty("Browser"));
		driver.get(propForVat.getProperty("url"));
		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(propForVat.getProperty("validUsername"),
				propForVat.getProperty("validPassword"));
		homepage = new HomePageOfVat(driver);
		Thread.sleep(2000);
		goodstransferreceivepage = homepage.HomePageToNavigateGoodsTransferReceivePage();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void verifyGoodsTransferReceiveIsVerified() throws InterruptedException {
		goodstransferreceivepage.functionalityForVerifyingGoodsTransferReceiveInfo();	
		Thread.sleep(2000);;
		Assert.assertEquals(goodstransferreceivepage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedDisplayText"), " Test Case Fail Because");
	}
	

	
	
	
}
