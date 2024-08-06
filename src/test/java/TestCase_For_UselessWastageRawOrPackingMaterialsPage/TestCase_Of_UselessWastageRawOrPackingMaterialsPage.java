package TestCase_For_UselessWastageRawOrPackingMaterialsPage;

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
import AllPagesOfTransactionModule.UselessWastageRawOrPackingMaterialsPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_UselessWastageRawOrPackingMaterialsPage extends BaseClass {

	HomePageOfVat homepage;
	UselessWastageRawOrPackingMaterialsPage uselesswastageraworpackingmaterialspage;
	
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
		uselesswastageraworpackingmaterialspage = homepage.HomePageToNavigateUselessWastageRawOrPackingMaterialsPage();	
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void VerifyAllRequiredFieldWithOutFillingUpField() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForValidateAllRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayMsgForEmptyData(), 
				DataPropForVat.getProperty("ExpextedMsg"), "Test Case Fail");	
	}
	
	@Test(priority = 2)
	public void VerifyItemNameRequiredField() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForValidateItemNameRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayMsgForEmptyData(), 
				DataPropForVat.getProperty("ExpextedMsg"), "Test Case Fail");
	}
	
	@Test(priority = 3)
	public void VerifyReceiveDateRequiredField() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForValidateReceiveDateRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayMsgForEmptyData(), 
				DataPropForVat.getProperty("ExpextedMsg"), "Test case ");
	}
	
	@Test(priority = 4)
	public void VerifyPresentPriceRequiredField() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForValidatePresentPriceRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayMsgForEmptyData(), 
				DataPropForVat.getProperty("ExpextedMsg"), "Test Case Fail");
	}
	
	@Test(priority = 5)
	public void VerifyQtyRequiredField() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForValidateQtyRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayMsgForEmptyData(), 
				DataPropForVat.getProperty("ExpextedMsg"), "Test Case Fail");
		}
	@Test(priority = 6)
	public void VerifySavingInfo() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForValidateSavingInfo();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageraworpackingmaterialspage.DisplayActualPresentPriceValue(), 
				"Wrong Value Display");
	}
	
	@Test(priority = 7)
	public void VerifyUpdatingPresentPriceValue() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForUpdatingPresentPrice();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageraworpackingmaterialspage.DisplayActualPresentPriceValue(), 
				"Wrong Value Display");
	}
	
	@Test(priority = 8)
	public void VerifyUpdatingQtyValue() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForUpdatingQtyValue();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageraworpackingmaterialspage.DisplayActualQtyValue(), 
				"Wrong Value Display");
	}
	
	@Test(priority = 9)
	public void VerifyUpdatingReceiveDate() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForUpdatingReceiveDate();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageraworpackingmaterialspage.DisplayActualReceiveDateValue(), 
				"Wrong Value Showing");
	}
	
	@Test(priority = 10)
	public void VerifyUpdatingItemName() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForUpdatingItemName();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageraworpackingmaterialspage.DisplayActualItemNameValue(), 
				"Wrong Value Showing");
	}
	
	@Test(priority = 11)
	public void VerifyClearinginfo() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForvalidateClearBtn();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayMsgForEmptyData(), 
				DataPropForVat.getProperty("ExpextedMsg"), "Test case fail");
	}
	
	@Test(priority = 12)
	public void VerifySearchingInfo() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForvalidateSarchingItem();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayActualSearchingValue(), 
				DataPropForVat.getProperty("ExpectedSearchingValue"), "Test Case Fail");
	}
	
	@Test(priority = 13)
	public void VerifyEditingItemNameValue() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForEditingItemNameInfo();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayActualItemNameEditingValue(), 
				DataPropForVat.getProperty("ExpectedEditingItemName"), "Test case fail");
	}
	
	@Test(priority = 14)
	public void VerifyEditingReceiveDate() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForEditingReceiveDateInfo();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayActualReceiveNumberEditingValue(),
				DataPropForVat.getProperty("ExpectedEditingReceiveName(ForRCVDate)"), "Test Case Fail");
	}
	
	@Test(priority = 15)
	public void VerifyEditingQTYValue() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForEditingQtyValue();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayActualQtyEditingValue(),
				DataPropForVat.getProperty("ExpectedEditingQtyValue"), "Test Case Fail");
	}
	
	@Test(priority = 16)
	public void VerifyEditingPresentPriceValue() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForEditingPresentPriceValue();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayActualPresentPriceEditingValue(),
				DataPropForVat.getProperty("ExpectedEditingPresentPrice"), "Test Case Fail");
	}
	
	@Test(priority = 17)
	public void VerifyDeleteItem() throws InterruptedException {
		uselesswastageraworpackingmaterialspage.functionalityForDeleteItem();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageraworpackingmaterialspage.DisplayMsgForEmptyData(), 
				DataPropForVat.getProperty("ExpextedMsg"), "Test Case Fail");		
	} 
	
	@Test(priority = 18)
	public void VerifyPDFFileByClickingReportBtn() throws InterruptedException, IOException {
	String mainWindowHandle = driver.getWindowHandle();
	uselesswastageraworpackingmaterialspage.functionalityForGenerateReportBtn();
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
	Assert.assertTrue(pdfContent.contains("60.00"), "InCorrect Exact Price");
	Thread.sleep(1000);
	Assert.assertTrue(pdfContent.contains("50.00"), "InCorrect Present Price");
	Thread.sleep(1000);
	Assert.assertTrue(pdfContent.contains("New QA Raw Material 2"), "Incorrect Item Name");
	Thread.sleep(1000);
	Assert.assertTrue(pdfContent.contains("3.00"), "Incorrect Qty value");
	driver.close();
    driver.switchTo().window(mainWindowHandle); 
	}
	
}
