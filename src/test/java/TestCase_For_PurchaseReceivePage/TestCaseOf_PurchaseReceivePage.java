package TestCase_For_PurchaseReceivePage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import AllPagesOfTransactionModule.PurchaseReceivePage;
import VAT_BasePackage.BaseClass;


public class TestCaseOf_PurchaseReceivePage extends BaseClass {

	HomePageOfVat homepage;
	PurchaseReceivePage purchaseReceivepage;
	ChromeOptions options;
	
	@BeforeMethod
	public void BrowserSetUp() throws InterruptedException { 
	  	System.setProperty("webdriver.http.factory", "jdk-http-client");
//	  	options =  new ChromeOptions();
//	  	options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//	  	driver = new ChromeDriver(options);
	  	loadPropertiesFileOfVAT();
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(propForVat.getProperty("url"));
			driver.manage().window().maximize();
			LoginPage loginpage = new LoginPage(driver);
			loginpage.login(propForVat.getProperty("validUsername"),
					propForVat.getProperty("validPassword"));
			homepage = new HomePageOfVat(driver);
			Thread.sleep(1500);
			purchaseReceivepage = homepage.HomePageToNavigatePurhcaseReceive();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 0)
	public void VerifyPerfectlyNavigateToPurchaseReceivePage() {
		Assert.assertEquals(purchaseReceivepage.PurchaseReceiveHeadingText(), 
				DataPropForVat.getProperty("purchaseReceiveHeading"), 
				"Wrong Page");
	}
	
	@Test(priority = 1)
	public void VerifyRequiredFieldWithEmptyByClickingSaveButton() {
		purchaseReceivepage.ClickOnSaveButtonWithEmptyRequiredField();
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"),"Test fail");
	}
	
	@Test(priority = 2)
	public void VerifyEmptyRequiredFieldByClickingAddIconBtn() {
		purchaseReceivepage.ClickOnItemInfoAddIconWithEmptyField();
		Assert.assertTrue(purchaseReceivepage.GettingZeroFromTotalAmountField(), "Wrong Value");
	}
	
	@Test(priority = 3)
	public void VerifySupplierNameRequiredFieldInPurchaseRcvAddPage() throws InterruptedException {
		purchaseReceivepage.functionalityForVerifySupplierNameRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"),"Test fail");
	}
	
	@Test(priority = 4)
	public void VerifyChallanNoRequiredFieldInPurchaseRcvAddPage() throws InterruptedException {
		purchaseReceivepage.functionalityForVerifyChallanNoRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"),"Test fail");
	}
	
	@Test(priority = 5)
	public void VerifyChallanDateRequiredFieldInPurchaseRcvAddPage() throws InterruptedException {
		purchaseReceivepage.functionalityForVerifyChallanDateRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"),"Test fail");
	}
	
	@Test(priority = 6)
	public void VerifyItemNameRequiredFieldInPurchaseRcvAddPage() throws InterruptedException {
		purchaseReceivepage.functionalityForVerifyItemNameRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"),"Test fail");
	}
	
	@Test(priority = 7)
	public void VerifyQuantityValueRequiredFieldInPurchaseRcvAddPage() throws InterruptedException {
		purchaseReceivepage.functionalityForVerifyQuantityValueRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"),"Test fail");
	}
	
	@Test(priority = 8)
	public void VerifyUnitPriceRequiredFieldInPurchaseRcvAddPage() throws InterruptedException {
		purchaseReceivepage.functionalityForVerifyUnitPriceRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"),"Test fail");
	}
	
	@Test(priority = 9)
	public void VerifyOfFillingUpAllRequiredFieldAndClickAddIconBtn() throws InterruptedException {
		Thread.sleep(2000);
		purchaseReceivepage.FillingItemInfo(DataPropForVat.getProperty("PurchaseReceiveItemValue"),
			DataPropForVat.getProperty("UnitPrice"),DataPropForVat.getProperty("Quantity"));
		Thread.sleep(1500);
//		Assert.assertEquals(purchaseReceivepage.DisplayedTotalAmountValueAfterCalculation(), 
//				DataPropForVat.getProperty("TotalAmountValue"),"Wrong Calculation");
		Assert.assertTrue(purchaseReceivepage.DisplayedTotalAmountValueAfterCalculation(), "Wrong Value");
	}
	
	@Test(priority = 10)
	public void VerifySavingPurchseReceiveInfoWithFillingAllRequiredField() throws InterruptedException {
		purchaseReceivepage.SavingPurchaseReceiveInfo(DataPropForVat.getProperty("SupplyName"),
				generateChallanNoValueDynamically(),DataPropForVat.getProperty("PurchaseReceiveItemValue"),
				DataPropForVat.getProperty("UnitPrice"),DataPropForVat.getProperty("Quantity"));
		Thread.sleep(2000);
		Assert.assertEquals(purchaseReceivepage.ActualItem_sTotalAmountValueInPurchaseRcvHomePageForAssert(),
				DataPropForVat.getProperty("ExpectedTotalAmountValueInPurchaseRcvHomepage"),"Wrong Value Saved");
	}
	
	@Test(priority = 11)
	public void validedExistingItemSearch() throws InterruptedException {
		purchaseReceivepage.purchaseReceiveItemSearch();
		Assert.assertEquals(purchaseReceivepage.ActualSearchedChallanValueforAssert(),
				DataPropForVat.getProperty("ExpectedPurchaseRcvChallanValue"),"Invalid Value");
	}
	
	@Test(priority = 12)
	public void VerifysearchingInvalidItem() {
		purchaseReceivepage.purchaseReceiveInvalidItemSearch();
		Assert.assertEquals(purchaseReceivepage.ActualInvalidSearchedChallanValueforAssert(),
				DataPropForVat.getProperty("ExpectedInvalidSearchingValue"),"Test Fail");
	}
	
	@Test(priority = 13)
	public void VerifyEditingAndSavingInfo() throws InterruptedException {
		purchaseReceivepage.functionalityForEditingAndSavingPurchaseReceiveInfo();
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.ActualRcvTypeValue(), 
				DataPropForVat.getProperty("ExpectedRcvTypeValue"), "Test Case Fail for incorrect RcvType");
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.ActualSuppllieNameValue(),
				DataPropForVat.getProperty("ExpectdSupplierName"), "Test Case Fail for wrong Supplier Name");
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.ActualQtyValue(),
				DataPropForVat.getProperty("ExpectedQtyValue"), "Test Case Fail for wrong Qty value");
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.ActualUnitPriceValue(), 
				DataPropForVat.getProperty("ExpectedUnitPrice"), "Test Case Fail for wrong unit price");
		Thread.sleep(1000);
		Assert.assertEquals(purchaseReceivepage.ActualTotalAmountValue(),
				DataPropForVat.getProperty("ExpectedTotalAmt"), "Test Case Fail for Wrong TotalAmt");	
	}
	
    @Test(priority = 14)
	public void VerifySupplierNameRequiredFieldInEditPage() throws InterruptedException {
		purchaseReceivepage.functionalityForVerifySupplierNameRequiredFieldInEditPage();
		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
				DataPropForVat.getProperty("warningMessageDisplayStatus"), "Test Case Fail");
	}
    
    @Test(priority = 15)
   	public void VerifyChallanNoRequiredFieldInEditPage() throws InterruptedException {
   		purchaseReceivepage.functionalityForVerifyChallanNoRequiredFieldInEditPage();
   		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
   				DataPropForVat.getProperty("warningMessageDisplayStatus"), "Test Case Fail");
   	}
    
    @Test(priority = 16)
   	public void VerifyChallanDateRequiredFieldInEditPage() throws InterruptedException {
   		purchaseReceivepage.functionalityForVerifyChallanDateRequiredFieldInEditPage();
   		Assert.assertEquals(purchaseReceivepage.DisplayedWarningMessage(),
   				DataPropForVat.getProperty("warningMessageDisplayStatus"), "Test Case Fail");
   	}
	
    @Test(priority = 17)
    public void VerifyQtyFieldRequiredFieldInEditPage() throws InterruptedException {
    	purchaseReceivepage.functionalityForVerifyQtyFieldInEditPage();
    	Thread.sleep(1000);
    	Assert.assertTrue(purchaseReceivepage.DisplayWarningMsgForNumericFieldInEditPage(), "Test Case Fail");
    }
    
    @Test(priority = 18)
    public void VerifyUnitPriceFieldRequiredFieldInEditPage() throws InterruptedException {
    	purchaseReceivepage.functionalityForVerifyUnitPriceFieldInEditPage();
    	Thread.sleep(1000);
    	Assert.assertTrue(purchaseReceivepage.DisplayWarningMsgForNumericFieldInEditPage(), "Test Case Fail");
    }
    
	@Test(priority = 19)
	public void VerifyReportFileOfPurchaseReceive() throws InterruptedException, IOException {
	String mainWindowHandle = driver.getWindowHandle();
		purchaseReceivepage.functionalityForPrintButtonToOpenReportFile();
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
        // Use the openStream() method of the URL class to open a connection to this URL which returns an InputStream for reading from that connection.
        InputStream is=pdfURL.openStream();
        //After this, create an object of BufferedInputStream class which creates a BufferedInputStream and pass InputStream object as a parameter.
        BufferedInputStream bis=new BufferedInputStream(is);
        // And at last, use the PDDDocument class to represent the PDF Document. load() method of PDDocument takes inputstream object as a parameter, parses the PDF and returns a PDDocument object.
        PDDocument doc=PDDocument.load(bis);
        //getText() method of PDFTextStripper is used to get the text of the document passed as a parameter and returns a String value.
        String pdfContent=new PDFTextStripper().getText(doc);
        Assert.assertTrue(pdfContent.contains("1,000.00"),"Test case Fail as Total Amt showing incorrect");
        Thread.sleep(3000);
        Assert.assertTrue(pdfContent.contains("New QA Packing material 1"), "Test case fail as incorrect Item Name");
        Thread.sleep(1000);
        driver.close();
//        Thread.sleep(1000);
//        driver.switchTo().window(mainWindowHandle);
	
	}
		
	
}
