package TestCase_For_FinishGoodsTransferPage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.FinishGoodsTransferPage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCaseOf_FinishGoodsTransferPage extends BaseClass {

	HomePageOfVat homepage;
	FinishGoodsTransferPage finishgoodstransfer;
	
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
		finishgoodstransfer = homepage.HomePageToNavigateFinishGoodsTransferPage();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//--> Add Page
	@Test(priority = 1)
	public void verifyAllRequiredField() throws InterruptedException {
		finishgoodstransfer.functionalityForValidateAllRequiredField();
		Assert.assertEquals(finishgoodstransfer.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsTransfer"), " Test case fail because");
	}
	
	@Test(priority = 2)
	public void VerifyNameOfTheBranchRequiredField() throws InterruptedException {
		finishgoodstransfer.functionalityForNameOfTheBrnchRequiredField();
		Assert.assertEquals(finishgoodstransfer.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsTransfer"), " Test case fail because");
	}
	
	@Test(priority = 3)
	public void VerifyPreparedByRequiredField() throws InterruptedException {
		finishgoodstransfer.functionalityForPreparedByRequiredField();
		Assert.assertEquals(finishgoodstransfer.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsTransfer"), " Test case fail because");
	}
	
	@Test(priority = 4)
	public void VerifyVehicleNoRequiredField() throws InterruptedException {
		finishgoodstransfer.functionalityForVehicleNoRequiredField();
		Assert.assertEquals(finishgoodstransfer.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsTransfer"), " Test case fail because");
	}
	
	@Test(priority = 5)
	public void VerifySavingFinishGoodsTransferInfo() throws InterruptedException {
		finishgoodstransfer.functionalityForFinishGoodsTransferRcvInfoSaving();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayVehicleNoTextValue(), 
				DataPropForVat.getProperty("ExpectedVehicleNoValue"),"Test Case Fail because ");
	}
	
	//--> Edit Page
	@Test(priority = 6)
	public void VerifyNameOfTheBranchRequiredFieldInUpdatePage() throws InterruptedException {
		finishgoodstransfer.functionalityForNameOfTheBranchRequiredFieldInUpdatePage();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsTransfer"), " Test case fail because");	
	}
	
	@Test(priority = 7)
	public void VerifyPreparedByRequiredFieldInUpdatePage() throws InterruptedException {
		finishgoodstransfer.functionalityForPreparedByRequiredFieldInUpdatePage();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsTransfer"), " Test case fail because");	
	}
	
	@Test(priority = 8)
	public void VerifyVehicleNoRequiredFieldInUpdatePage() throws InterruptedException {
		finishgoodstransfer.functionalityForVehicleNoRequiredFieldInUpdatePage();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayWarningMsg(), 
				DataPropForVat.getProperty("ExpectedWarningMsgForFinishGoodsTransfer"), " Test case fail because");	
	}
	
	@Test(priority = 9)
	public void VerifyChangingNameOfTheBranchValueInUpdatePage() throws InterruptedException {
		finishgoodstransfer.functionalityForChangingNameOfTheBranchFieldValueInUpdatePage();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayReceivingBranchTextValue(), 
				DataPropForVat.getProperty("ExpectedReceivingBranch"), " Test Case Fail Because");
	}
	
	@Test(priority = 10)
	public void VerifyChangingPreparedByValueInUpdatePage() throws InterruptedException {
		finishgoodstransfer.functionalityForChangingPreparedByFieldValueInUpdatePage();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayPreparedByTextValue(), 
				DataPropForVat.getProperty("ExpectedPreparedBy"), " Test Case Fail Because");
	}
	
	@Test(priority = 11)
	public void VerifyChangingVehicleNoValueInUpdatePage() throws InterruptedException {
		finishgoodstransfer.functionalityForChangingVehiclenoFieldValueInUpdatePage();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayvehicleNoTextValue(), 
				DataPropForVat.getProperty("ExpectedVehicleNoTextValue"), " Test Case Fail Because");
	}
	
	@Test(priority = 12)
	public void VerifyUpdatingTotalQtyValue() throws InterruptedException {
		finishgoodstransfer.FunctionalityForChangingTotalQtyValueInUpdatepage();
		Thread.sleep(2000);
		Assert.assertEquals(finishgoodstransfer.displayTotalAmtTextValueInDashBoard(),
				DataPropForVat.getProperty("ExpectedTotalAmtInDashboard"), "Test case Fail Because");		
	}
	
	//-->DashBoard
    @Test(priority = 13)
	public void VerifyPDFFileInfoAfterSavingInfo() throws InterruptedException, IOException {
    	String mainWindowHandle = driver.getWindowHandle();
    	finishgoodstransfer.funcationalityForVerifyPDFFileAfterSaving();
		Thread.sleep(1000);
		Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        String url = driver.getCurrentUrl();
        URL pdfURL=new URL(url);
        InputStream is=pdfURL.openStream();
        BufferedInputStream bis=new BufferedInputStream(is);
        PDDocument doc=PDDocument.load(bis);
        String pdfContent=new PDFTextStripper().getText(doc);
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Product 3"), "Test case fail for incorrect Item Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("1.000"), "Test Case Fail for incorrect Item Qty");
        Thread.sleep(1000);
	    driver.close();
        driver.switchTo().window(mainWindowHandle); 
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
