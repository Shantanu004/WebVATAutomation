package TestCase_For_MiscellaneousAdjustmentPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import AllPagesOfTransactionModule.MiscellaneousAdjustmentPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_MiscellaneousAdjustmentPage extends BaseClass {

	HomePageOfVat homepage;
	MiscellaneousAdjustmentPage miscellaneousadjustmentpage;
	
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
		miscellaneousadjustmentpage = homepage.HomePageToNavigateMiscellaneousAdjustmentPage();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//--> Add Page 
	@Test(priority = 1)
	public void verifyMonthNameRequiredField() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForMonthNameRequiredField();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 2)
	public void verifyTransactionDateRequiredField() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForTransactionDateRequiredField();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");	
	}
	
	@Test(priority = 3)
	public void verifyAdjustmentTypeRequiredField() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForAdjustmentTypeRequiredField();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 4)
	public void verifyAdjustmentForRequiredField() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForAdjustmentForRequiredField();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 5)
	public void verifyALLRequiredField() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForALLRequiredField();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 6)
	public void verifySavingData() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForSavingData();
		Thread.sleep(2000);
		Assert.assertEquals(miscellaneousadjustmentpage.displayAdjustmentForTextValue(), 
				DataPropForVat.getProperty("ExpectedAdjustmentForValue"), "Test case fail as");
	}
	
	//--> Update Page
	@Test(priority = 7)
	public void verifyMonthNameRequiredFieldInUpdatePage() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForMonthNameRequiredFieldInEditPage();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 8)
	public void verifyAdjustmentTypeRequiredFieldInUpdatePage() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForAdjustmentTypeRequiredFieldInEditPage();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 9)
	public void verifyAdjustmentAmtRequiredFieldInUpdatePage() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForAdjustmentAmtRequiredFieldInEditPage();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 10)
	public void verifyTransactionDateRequiredFieldInUpdatePage() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForTrnasactionDateRequiredFieldInEditPage();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
	
	@Test(priority = 11)
	public void verifyAdjustmentForRequiredFieldInUpdatePage() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForAdjustmentForRequiredFieldInEditPage();
		Assert.assertEquals(miscellaneousadjustmentpage.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForMiscellaneousAdjustment"), " Test case fail because");
	}
    //--> Dashboard Page 
	@Test(priority = 12)
	public void verifySearchBoxForMiscellaneousAdjustmentDashboardPage() throws InterruptedException {
		miscellaneousadjustmentpage.functionalityForMiscellaneousAdjustementInfoSearch();
		Thread.sleep(2000);
		Assert.assertEquals(miscellaneousadjustmentpage.displayMiscellaneousSearchingTextValue(), 
				DataPropForVat.getProperty("ExpectedMiscellaneousSearchingInfo"), "Test case Fail becasue");
	}
	 
	@Test(priority = 13)
	public void VerifyMiscellaneousInfoSavingAndEditing() throws InterruptedException {
		miscellaneousadjustmentpage.functionaltyForSavingAndEditingMiscellaneousInfo();
		Thread.sleep(1000);
		Assert.assertEquals(miscellaneousadjustmentpage.DisplayActualEditingAdjustmentAmtValue(), 
				DataPropForVat.getProperty("ExpectedEditingAdjustmentAmt"), "Test case Fail becasue");
		Thread.sleep(1000);
		Assert.assertEquals(miscellaneousadjustmentpage.DisplayActualEditingAdjustForValue(),
				DataPropForVat.getProperty("ExpectedEditingAdjustmentFor"), "Test Case Fail because");
	}
	
	
	
	
}
