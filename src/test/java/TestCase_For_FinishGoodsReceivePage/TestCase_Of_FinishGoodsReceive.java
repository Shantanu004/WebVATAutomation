package TestCase_For_FinishGoodsReceivePage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.FinishGoodsReceivePage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_FinishGoodsReceive extends BaseClass{
 
	HomePageOfVat homepage;
	FinishGoodsReceivePage finishgoodsReceive;
	
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
		finishgoodsReceive = homepage.HomePageToNavigateFinishGoodsReceivePage();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//-->Add Page
	@Test(priority = 0)
	public void VerifySavingFinishGoodsReceive() throws InterruptedException {
		finishgoodsReceive.functionalityForFinishGoodsItemSaving();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodsReceive.DisplayRcvQtyValue(),
				DataPropForVat.getProperty("ExpectedRcvQty"));
	}
	
	@Test(priority = 1)
	public void VerifyRequiredField() throws InterruptedException {
		finishgoodsReceive.functionalityForRequiredField();
		Assert.assertEquals(finishgoodsReceive.DisplayWarningMsg(),
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsRcv"));
	}
	
	@Test(priority = 2)
	public void VerifyQtyRcvValueEdit() throws InterruptedException {
		finishgoodsReceive.functionalityForEditRcvQtyValue();	
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodsReceive.EditedReceiveQtyValue(),
				DataPropForVat.getProperty("ExpectedEditedReceiveQtyTextValue"), "Test Case Fail as");
	}
	
	@Test(priority = 3)
	public void VerifyItemInfoDelete() throws InterruptedException {
		finishgoodsReceive.functionalityForDeleteItemInfo();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodsReceive.DisplayMsgForNoData(),
				DataPropForVat.getProperty("ExpectedDisplayMsgForNoData"), "Test Case fail");
	}
	
	@Test(priority = 4)
	public void VerifyFGTRequiredField() throws InterruptedException {
		finishgoodsReceive.functionalityForFGTRequiredField();
		Assert.assertEquals(finishgoodsReceive.DisplayWarningMsg(),
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsRcv"));
	}
	
	@Test(priority = 5)
	public void VerifyRcvRequiredField() throws InterruptedException {
		finishgoodsReceive.functionalityForRCVDateRequiredField();
		Assert.assertEquals(finishgoodsReceive.DisplayWarningMsg(),
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsRcv"));	
	}
	
	@Test(priority = 6)
	public void VerifySearchingInfo() throws InterruptedException {
		finishgoodsReceive.functionlityForSearchingItemByDate();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodsReceive.DisplayValueOfRcvQtyAfterSearch(), 
				DataPropForVat.getProperty("ExpectedRcvQty"));	
	}
	
	
	
	
}
