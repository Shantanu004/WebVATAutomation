package TestCase_For_BatchSetUp;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.BatchSetUpPage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_BatchSetUp extends BaseClass {

	HomePageOfVat homepage;
	BatchSetUpPage batchsetup;
	
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
		Thread.sleep(1500);
		batchsetup = homepage.HomePageToNavigateBatchSetUp();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//Add Page Test case
	@Test(priority = 0)
	public void VerifyBatchSetupAddPage() throws InterruptedException {
		batchsetup.functionalityForClickAddBtnOfBatchSetupAddForm();
		Thread.sleep(2000);
		Assert.assertEquals(batchsetup.DisplayBatchSetupAddFormHeading(),
				DataPropForVat.getProperty("ExpectedBatchSetUpHeadingName"), "Test Case Fail");
	}
	
	@Test(priority = 1)
	public void VerifyBatchInfoSaving() throws InterruptedException {
		batchsetup.functionalityForBatchSetInfoSaving(DataPropForVat.getProperty("ProductName"),
				DataPropForVat.getProperty("BatchSizeValue"));
		Thread.sleep(2000);
		Assert.assertEquals(batchsetup.DisplayBatchItemName(),
				DataPropForVat.getProperty("ExpectedSavingBatchItemName"),"Test case fail");
	}
	
	@Test(priority = 2)
	public void VerifySaveDataWithOutFilledUpItemNameRequiredField() throws InterruptedException {
		batchsetup.functionalityForSavingDataWithoutItemNamefilledUp(
				DataPropForVat.getProperty("BatchSizeValue"));
		Assert.assertEquals(batchsetup.DisplayWaringMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMessageForRequiredField"));
	}
	
	@Test(priority = 3)
	public void VerifySaveDataWithOutFilledUpBatchSizeRequiredField() throws InterruptedException {
		batchsetup.functionalityForSavingDataWithoutBatchSizefilledUp(
				DataPropForVat.getProperty("ProductName"));
		Assert.assertEquals(batchsetup.DisplayWaringMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMessageForRequiredField"));
	}
	
	@Test(priority = 4)
	public void VerifySavingDataWithoutFillingUpRequiredField() throws InterruptedException {
		batchsetup.functionalityForWithoutSavingAllRequiredField();
		Thread.sleep(2000);
		Assert.assertEquals(batchsetup.DisplayWaringMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMessageForRequiredField"));
	}
	
	@Test(priority = 5)
	public void VerifyActiveStatusWithSavingBatchInfoDataForActiveStatusOff() throws InterruptedException {
		batchsetup.functionalityForBatchSetInfoSavingForActiveStatusOff(
				DataPropForVat.getProperty("ProductName"), DataPropForVat.getProperty("BatchSizeValue"));
		Thread.sleep(2000);		
		Assert.assertTrue(batchsetup.DisplayUdBatchNoText(), "Not Display");
	}
	
	@Test(priority = 6)
	public void VerifySaveDataWithOutFilledUpBatchDateRequiredField() throws InterruptedException {
		batchsetup.functionalityForBatchSetInfoSavingWithoutBatchDateFilledUp(
				DataPropForVat.getProperty("ProductName"),DataPropForVat.getProperty("BatchSizeValue"));
		Assert.assertEquals(batchsetup.DisplayWaringMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMessageForRequiredField"));
	}
	
	//--> Dashboard Page Test Case
	@Test(priority = 7)
	public void VerifyBatchItemNameSearchFromHistory() throws InterruptedException {
		batchsetup.functionalityForSearchingBatchItem();
		Thread.sleep(1000);
		Assert.assertEquals(batchsetup.DisplaySearchedItemName(),
				DataPropForVat.getProperty("ExpectedBatchItemName"),"Not Found");
	}
	
	//-> Update Page Test Case
	@Test(priority = 8)
	public void VerifyRequiredFieldInTheUpdateForm() throws InterruptedException {
		batchsetup.functionalityForUpdatingDataWithOutRequiredField();
		Assert.assertEquals(batchsetup.DisplayWaringMsgForRequiredField(), 
		DataPropForVat.getProperty("ExpectedWarningMessageForRequiredField"),"Test Case Fail");
	}
	
	@Test(priority = 9)
	public void VerifyBatchSizeRequiredFieldInTheUpdateForm() throws InterruptedException {
		batchsetup.functionalityForUpdatingDataWithOutBatchSize();
		Assert.assertEquals(batchsetup.DisplayWaringMsgForRequiredField(), 
		DataPropForVat.getProperty("ExpectedWarningMessageForRequiredField"),"Test Case Fail");
	}
	
	@Test(priority = 10)
	public void VerifyBatchDateRequiredFieldInTheUpdateForm() throws InterruptedException {
		batchsetup.functionalityForUpdatingDataWithOutBatchDate();
		Assert.assertEquals(batchsetup.DisplayWaringMsgForRequiredField(), 
		DataPropForVat.getProperty("ExpectedWarningMessageForRequiredField"),"Test Case Fail");
	}
	
	@Test(priority = 11)
	public void VerifyUpdatigDataWithChangingValue() throws InterruptedException {
		batchsetup.functionalityForUpdatingDataFromEditBatchInfo();	
	}
	
	@Test(priority = 12)
	public void VerifyConfirmOkDeleteBatchInfo() throws InterruptedException {
		batchsetup.functionalityForBatchInfoDeleteConfirm();
		Thread.sleep(1000);	
		Assert.assertEquals(batchsetup.BatchInfoDeleteConfirmMsg(),
				DataPropForVat.getProperty("ExpectedBatchInfoDeleteConfirmMsg"));
	}
	
	@Test(priority = 13)
	public void VerifyConfirmCancelDeleteBatchInfo() throws InterruptedException {
		batchsetup.functionalityForBatchInfoDeleteConfirmCancel();
	}
	
	
		
}
