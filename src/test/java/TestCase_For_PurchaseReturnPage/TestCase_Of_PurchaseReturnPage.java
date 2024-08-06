package TestCase_For_PurchaseReturnPage;

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
import AllPagesOfTransactionModule.PurchaseReturnPage;
import VAT_BasePackage.BaseClass;


public class TestCase_Of_PurchaseReturnPage extends BaseClass {

	HomePageOfVat homepage;
	PurchaseReturnPage purchasereturnpage;

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
		purchasereturnpage = homepage.HomePageToNavigatePurhcaseReturn();
	}

	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	//Test Case Of Add Page
	@Test(priority = 1)
	public void VerifyItemInfoSavingWithFillingUPRequiredField() throws InterruptedException {
		purchasereturnpage.PurchaseReturnItemInfoForSaving(DataPropForVat.getProperty("PurchaseReturnSupplierName"), 
				DataPropForVat.getProperty("PurchaseRetuenChallanNumber"), 
				DataPropForVat.getProperty("PurchaseReturnItemName1"),
				DataPropForVat.getProperty("PurchaseReturnItemName2"), 
				DataPropForVat.getProperty("PurchaseReturnQuantityValue"));
		Assert.assertTrue(purchasereturnpage.TotalAmtOfFirstItem(), "Wrong value Showing");
		Thread.sleep(1000);
		Assert.assertTrue(purchasereturnpage.TotalAmtOfSecondItem(), "Wrong value Showing");
		Thread.sleep(1000);
		Assert.assertEquals(purchasereturnpage.PurchaseReturnTotalCalculatedValueInDashBoard(),
        DataPropForVat.getProperty("PurchaseReturnCalculatedValueForAssert"),"Wrong Calculation");
		
		//Assert.assertTrue(purchasereturnpage.PurchaseReturnTotalCalculatedValue(),"Wrong Value");
	}
	
	@Test(priority = 2)
	public void VerifyChallanNumberRequiredFieldInAddPage() throws InterruptedException {
		purchasereturnpage.functionalityForChallanNumberRequiredFieldInAddPage();	
		Assert.assertEquals(purchasereturnpage.DisplayWarningMsgOfRequiredField(), 
				DataPropForVat.getProperty("DisplayMessageForRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 3)
	public void VerifySupplierNameRequiredFieldInAddPage() throws InterruptedException {
		purchasereturnpage.functionalityForSupplierNameRequiredFieldInAddPage();	
		Assert.assertEquals(purchasereturnpage.DisplayWarningMsgOfRequiredField(), 
				DataPropForVat.getProperty("DisplayMessageForRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 4)
	public void VerifyTimeAndDateOfIssueRequiredFieldInAddPage() throws InterruptedException {
		purchasereturnpage.functionalityForTimeAndDateOfIssueRequiredFieldInAddPage();	
		Assert.assertEquals(purchasereturnpage.DisplayWarningMsgOfRequiredField(), 
				DataPropForVat.getProperty("DisplayMessageForRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 5)
	public void VerifyDeleteAnItemInAddPage() throws InterruptedException {
		purchasereturnpage.functionalityForDeletingItemFromAddPage();
		Thread.sleep(1000);
		Assert.assertEquals(purchasereturnpage.DisplayMsgWhenEmptyItemInAddPage(), 
				DataPropForVat.getProperty("DisplayMsgForNoItemValue"), "Test Case Fail");
	}
	
	@Test(priority = 6)
	public void VerifyCancelDeleteAnItemInAddPage() throws InterruptedException {
		purchasereturnpage.functionalityForNotDeletingItemFromAddPage();
		Thread.sleep(1000);
		Assert.assertEquals(purchasereturnpage.DisplayFirstItemTextValueInAddPage(), 
				DataPropForVat.getProperty("PurchaseReturnItemName1"), "Test Case Fail");
	}
	
	@Test(priority = 7)
	public void VerifyItemNameRequiredFieldInAddPage() throws InterruptedException {
		purchasereturnpage.functionalityForverifyItemNameRequiredFieldInAddPage(
				DataPropForVat.getProperty("PurchaseReturnSupplierName"), 
				DataPropForVat.getProperty("PurchaseRetuenChallanNumber"));
		Assert.assertEquals(purchasereturnpage.DisplayForNoItemTextValue(), 
				DataPropForVat.getProperty("DisplayMsgForNoItemValue")," Test Case Fail");
	}
	
	@Test(priority = 8)
	public void VerifyQuantityRequiredFieldInAddPage() throws InterruptedException {
		purchasereturnpage.functionalityForverifyQuantityRequiredFieldInAddPage();
		Assert.assertEquals(purchasereturnpage.DisplayForNoItemTextValue(), 
				DataPropForVat.getProperty("DisplayMsgForNoItemValue")," Test Case Fail");
	}
	
	@Test(priority = 9)
	public void VerifyTotalAmountIsExchangeWhenItemNameIsChangingWithFixedQtyValueInPurchaseRtnAddForm() throws InterruptedException {
		purchasereturnpage.FunctionalityOfPurchaseReturnAddformOfChangingItemNameByFixingQualityValue(
			DataPropForVat.getProperty("PurchaseReturnSupplierName1"), 
			DataPropForVat.getProperty("PurchaseRetuenChallanNumber2"),
			DataPropForVat.getProperty("PurchaseReturnItemName3"),
			DataPropForVat.getProperty("PurchaseReturnQuantityValue1"), 
			DataPropForVat.getProperty("PurchaseReturnItemName4"));
		Thread.sleep(2000);
		Assert.assertFalse(purchasereturnpage.CheckItemNameDropDownButtonIsEnableOrDisable(),"Test Case Fail for ItemName Field Enable");
	}
	
	//-->Test Case of Edit Page 
	@Test(priority = 10)
	public void VerifyTimeAndDateIssueRequiredFieldInEditPage() throws InterruptedException {
		purchasereturnpage.functionalityForVerifyTimeAndDateIssueRequiredFieldInEditPage();
		Assert.assertEquals(purchasereturnpage.DisplayTextForRequiredField(), 
				DataPropForVat.getProperty("DisplayMessageForRequiredField"),"Wrong Message");	
	}
	
	@Test(priority = 11)
	public void VerifyChallanNumberRequiredFieldInEditPage() throws InterruptedException {
		purchasereturnpage.functionalityForVerifyChallanNumberRequiredFieldInEditPage();
		Assert.assertEquals(purchasereturnpage.DisplayTextForRequiredField(), 
				DataPropForVat.getProperty("DisplayMessageForRequiredField"),"Wrong Message");	
	}
	
	@Test(priority = 12)
	public void VerifyEditingAndSavingInfoInEditPage() throws InterruptedException {
		purchasereturnpage.FunctionalityForEditingAndSavingInfoInEditPage();
		Assert.assertEquals(purchasereturnpage.DisplayEditedItemNameTextValue(),
				DataPropForVat.getProperty("ExpectedEditedItemNameTextValue"), "Wrong Item Value");
		Thread.sleep(1000);
		Assert.assertEquals(purchasereturnpage.DisplayEditedReturnQtyValue(),
				DataPropForVat.getProperty("ExpectedEditedReturnQtyValue"), "Wrong Item Value");
	}
	
	@Test(priority = 13)
	public void VerfiyDeleteItemInEditFormWithOutSaving() throws InterruptedException {
		purchasereturnpage.FunctionalityOfDeleteAnItemFromEditPageOfAnItemWithOutSaving();
		Assert.assertTrue(purchasereturnpage.ConfirmItemIsDeleted(), "Test Case Fail if Item Delete");
	}
	
	@Test(priority = 14)
	public void VerfiyDeleteItemInEditFormWithSaving() throws InterruptedException {
		purchasereturnpage.FunctionalityOfDeleteAnItemFromEditPageOfAnItemWithSaving();
		Assert.assertFalse(purchasereturnpage.ConfirmItemIsDeleted(), "Test Case Fail because item is not Delete");
	}
	
	//Test Case of Dashboard
	@Test(priority = 15)
	public void VerifyPerfectlyNavigateToPurchaseReturnPage() {
		Assert.assertEquals(purchasereturnpage.VerifyNavigateToPurchaseReturnPage(),
				DataPropForVat.getProperty("ExpectedPurchaseReceiveHeadingName"), 
				"Bug Found As Navigate To Wrong Page");
	}
	
	@Test(priority = 16)
	public void VerifyExistingItemSearch() throws InterruptedException {
		purchasereturnpage.functionInfoForExistingItemSearch();
		Assert.assertEquals(purchasereturnpage.PurchaseReturnTotalCalculatedValueInDashBoard(),
		DataPropForVat.getProperty("PurchaseReturnCalculatedValueForAssert"),"Wrong Calculation");
	}
	
	@Test(priority = 17)
	public void verifyNonExistingItemSearch() throws InterruptedException {
		purchasereturnpage.functionInfoForNonExistingItemSearch();
		Assert.assertEquals(purchasereturnpage.DisplayTextForNonExistingValue(),
				DataPropForVat.getProperty("DisplayTextForNonExisitingValue"), "Found Bug");
	}
	
	@Test(priority = 18)
	public void VerifyPrintReportFileOfPurchaseReturnPage() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		purchasereturnpage.functionalityForPurchaseReturnPrintReportFile();
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
        int pages=doc.getNumberOfPages();
        System.out.println("The total number of pages "+pages);
        Assert.assertTrue(pdfContent.contains("000000115"), "BIN is not Exist");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("NewChallan7182023"), "ChallanNo is not Exist");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Raw Material 2"), "New QA Raw Material 2 is not Exist");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Raw Material 3"), "New QA Raw Material 3 is not Exist" );
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("2"), "Qty 2 is not Exist" );
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("600.00"), "Total Price of Item_01 600.00 is not Exist" );
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("1,000.00"), "Total Price of Item_02 1000.00 is not Exist" );
        Thread.sleep(1000);
//        Assert.assertTrue(pdfContent.contains("575.00"), "Content is not Exist" );
//        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("1,600.00"), "Total Price of two item is not Exist" );
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	
	
	
}
