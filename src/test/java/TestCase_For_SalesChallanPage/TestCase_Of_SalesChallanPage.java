package TestCase_For_SalesChallanPage;

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

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import AllPagesOfTransactionModule.SalesChallanPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_SalesChallanPage extends BaseClass {

	HomePageOfVat homepage;
	SalesChallanPage saleschallanpage;
	
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
		saleschallanpage = homepage.HomePageToNavigateSalesChallanPage();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//-->Add Page
	@Test(priority = 1)
	public void VerifySavingSalesChallanInfo() throws InterruptedException {
		saleschallanpage.functionalityForSavingSalesChallan();
		Thread.sleep(2000);
		Assert.assertEquals(saleschallanpage.DisplayAfterSavingTextValue(), 
				DataPropForVat.getProperty("ExpectedBuyerNameTextValue"),"Wrong Page");
	}
	
	@Test(priority = 2)
	public void VerfiyRequiredField() throws InterruptedException {
		saleschallanpage.functionalityForRequiredField();
		Assert.assertEquals(saleschallanpage.displayWarningMsg(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSalesChallan"), "Test Case Fail");
	}
	
	@Test(priority = 3)
	public void VerifyCustomerNameRequiredField() throws InterruptedException {
		saleschallanpage.functionalityCustomerNameRequiredField();
		Assert.assertEquals(saleschallanpage.displayWarningMsg(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSalesChallan"), "Test Case Fail");
	}
	
	@Test(priority = 4)
	public void verifyVehicleNameRequiredField() throws InterruptedException {
		saleschallanpage.functionalityVehicleNameRequiredField();
		Assert.assertEquals(saleschallanpage.displayWarningMsg(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSalesChallan"), "Test Case Fail");
	}
	
	//-->Edit Page
	@Test(priority = 5)
	public void VerifyRequiredFieldInSalesChallanEditPage() throws InterruptedException {
		saleschallanpage.functionalityForSalesChallanEditPageRequiredField();
		Assert.assertEquals(saleschallanpage.DisplayWarningMsgInEditPageForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSalesChallan"));
	}
	
	@Test(priority = 6)
	public void VerifyCustomerNameRequiredFieldInEditPage() throws InterruptedException {
		saleschallanpage.functionalityForCustomerNameRequiredFieldInEditPage();
		Assert.assertEquals(saleschallanpage.DisplayWarningMsgInEditPageForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSalesChallan"),"Test Case Fail");
	}
	
	@Test(priority = 7)
	public void VerifyVehicleNameRequiredFieldInEditPage() throws InterruptedException {
		saleschallanpage.functionalityForVehicleNameRequiredFieldInEditPage();
		Assert.assertEquals(saleschallanpage.DisplayWarningMsgInEditPageForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSalesChallan"),"Test Case Fail");
	}
	
	@Test(priority = 8)
	public void VerifyTotalQtyInEditPage() throws InterruptedException {
		saleschallanpage.functionalityForTotalQtyfieldInEditPage();
		Assert.assertTrue(saleschallanpage.DisplayTotalAmtInEDitPage(), "Test Case fail");
	}
	
	@Test(priority = 9)
	public void VerifySalesOrderEditInAddForm() throws InterruptedException {
		saleschallanpage.functionalityForEditingSalesOrderInSalesChallan();
		Assert.assertEquals(saleschallanpage.DisplayEditedTotalAmt(), 
				DataPropForVat.getProperty("ExpectedEditedTotalAmt"),"Wrong Value");
	}
	
	@Test(priority = 10)
	public void VerifySalesChallanInfoEditingAndUpdating() throws InterruptedException {
		saleschallanpage.functionalityForEditingAndVerifyingSalesChallanInfo();
		Thread.sleep(1000);
		Assert.assertEquals(saleschallanpage.ActualEditingBuyerNameTextValue(),
				DataPropForVat.getProperty("ExpectedEditingBuyerName"), "Incorrect Buyer Name");
		Thread.sleep(1000);
		Assert.assertEquals(saleschallanpage.ActualEditingVatRegNoTextValue(),
				DataPropForVat.getProperty("ExpectedEditingVATRegNo"), "Incorrect Vat Reg No");
		Thread.sleep(1000);
		Assert.assertEquals(saleschallanpage.ActualEditingChallanTypeTextValue(),
				DataPropForVat.getProperty("ExpectedEditingChallanType"), "InCorrect Challan Type");
		Thread.sleep(1000);
		Assert.assertEquals(saleschallanpage.ActualEditingQtyValue(), 
				DataPropForVat.getProperty("ExpectedEditingQtyValue"), "Incorrect qty Value");
		Thread.sleep(1000);
		Assert.assertEquals(saleschallanpage.ActualEditingTotalAmt(), 
				DataPropForVat.getProperty("ExpectedEditingTotalAmt"), "inCorrect Total Amt");	
	}
	//-->Sales Challan Dashboard
	@Test(priority = 11)
	public void VerifySalesChallanEditingPrintedPdfFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		saleschallanpage.functionalityForVerifyPrintedPdfFile();
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
        Assert.assertTrue(pdfContent.contains("Foreign Customer"), "Test case Fail for Incorrect Buyer name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("45452525"), "Test Case fail for incorrect Vat Reg No");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("376.00"), "Test Case Fail for incorrect Total Amt");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Product"),"Test Case Fail for incorrect Item name");
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);  
	}
	
	@Test(priority = 12)
	public void VerifySavingSalesChallanInfoPDfFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		saleschallanpage.functionalityForSavingAndVerifiedPDFFile();
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
        boolean ActualBuyerName= pdfContent.contains("New QA Buyer");
        boolean ActualVatRegNo=pdfContent.contains("211555641551");
        String ActualBuyerNameInString = String.valueOf(ActualBuyerName);
        String ActualVatRegNoInString=String.valueOf(ActualVatRegNo);
        String ExpectedBuyerName= "true";
        String ExpectedVatRegNo="true";
        Thread.sleep(1000);
        Assert.assertEquals(ActualBuyerNameInString, ExpectedBuyerName, "Test Case Fail for InCorrect Buyer Name");
        Thread.sleep(1000);
        Assert.assertEquals(ActualVatRegNoInString,ExpectedVatRegNo, "Test Case Fail for InCorrect VatRegNo");
        driver.close();
        driver.switchTo().window(mainWindowHandle);  
	}
	
}
