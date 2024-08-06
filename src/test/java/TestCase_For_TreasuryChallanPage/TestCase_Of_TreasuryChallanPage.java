package TestCase_For_TreasuryChallanPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import AllPagesOfTransactionModule.TreasuryChallanPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_TreasuryChallanPage extends BaseClass {

	HomePageOfVat homepage;
	TreasuryChallanPage treasurychallanpage;
	
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
		treasurychallanpage = homepage.HomePageToNavigateTreasuryChallanPage();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//--> Add Page
	@Test(priority = 1)
	public void VerifyAllRequiredFieldWithoutFillingUp() throws InterruptedException {
		treasurychallanpage.functionalityForValidateRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(),
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 2)
	public void VerifyChallanNoRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateChallanNoRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
		
	}
	
	@Test(priority = 3)
	public void VerifyTransactionNoRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateTransactionNoRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");		
	}
	
	@Test(priority = 4)
	public void VerifyTreasuryTypeRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateTreasuryTypeRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");		
	}
	
	@Test(priority = 5)
	public void VerifyEconomicCodeRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateEconomicCodeRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");		
	}
	
	@Test(priority = 6)
	public void VerifyChallanDateRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateChallanDateRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");		
	}
	
	@Test(priority = 7)
	public void VerifyDipositDateRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateDipositDateRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");		
	}
	
	@Test(priority = 8)
	public void VerifyBankNameRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateBankNameRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");		
	}
	
	@Test(priority = 9)
	public void VerifyDipositAmtRequiredField() throws InterruptedException {
		treasurychallanpage.functionalityForValidateDipositAmtRequiredFieldInAddPage();
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");		
	}
	
	@Test(priority = 10)
	public void VerifyTreasuryChallanValueSaving() throws InterruptedException {
		treasurychallanpage.functionalityForValidateSavingTreasuryChallanValues();	
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayChallanValue(), "Not Display");
	}
	
	//--> Editing Page
	@Test(priority = 11)
	public void VerifyChallanNoRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyChallanNoRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 12)
	public void VerifyTransactionNoRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyTransactionNoRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 13)
	public void VerifyTreasuryTypeRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyTreasuryTypeRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 14)
	public void VerifyEconomicCodeRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyEconomicCodeRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 15)
	public void VerifyChallanDateRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyChallanDateRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 16)
	public void VerifyDepositDateRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyDepositDateRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 17)
	public void VerifyBankNameRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyBankNameRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 18)
	public void VerifyDepositAmtRequiredFieldInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForVerifyDepositAmtRequiredFieldInEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(treasurychallanpage.DisplayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForTreasuryChallan"), "Test Case Fail Because");
	}
	
	@Test(priority = 19)
	public void VerifyUpdatingChallanValueInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingChallanNoValueInEditPage();	
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedChallanNoValue(), "Not Display");
	}
	
	@Test(priority = 20)
	public void VerifyUpdatingTransactionNoInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingTransactionNoValueInEditPage();	
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedTransactionNoValue(), "Not Display");
	}
	
	@Test(priority = 21)
	public void VerifyUpdatingTreasuryTypeInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingTreasuryTypeInEditPage();	
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedTreasuryTypeValue(), "Not Display");
	}
	
	@Test(priority = 22)
	public void VerifyUpdatingEconomicCodeInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingEconomicCodeInEditPage();
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedEconomicCodeValue(),"Not Display");	
	}
	
	@Test(priority = 23)
	public void VerifyUpdatingChallanDateInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingChallanDateInEditPage();
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedChallanDateValue(),"Not Display");	
	}
	
	@Test(priority = 24)
	public void VerifyUpdatingDepositDateInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingDepositDateInEditPage();
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedDepositDateValue(),"Not Display");	
	}
	
	@Test(priority = 25)
	public void VerifyUpdatingBankNameInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingBankNameInEditPage();
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedBankNameValue(),"Not Display");	
	}
	
	@Test(priority = 26)
	public void VerifyUpdatingDepositAmtInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForUpdatingDepositAmtInEditPage();
		Thread.sleep(1000);
		Assert.assertTrue(treasurychallanpage.DisplayUpdatedDepositAmtValue(),"Not Display");	
	}
	
	@Test(priority = 27)
	public void VerifyDeletingTreasuryChallanInfoInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(1000);
		treasurychallanpage.functionalityForDeletingTreasuryChallanInfo();	
	}
	
	@Test(priority = 28)
	public void VerifyCancelingTreasuryChallanInfoInEditPage() throws InterruptedException {
		treasurychallanpage.FunctionForEnteringEditpage();
		Thread.sleep(3000);
		treasurychallanpage.functionalityForCancelingOfTreasuryChallanInfo();	
	}
	
	
	
	
}
