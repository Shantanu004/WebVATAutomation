package TestCase_For_UselessWastageProductPage;

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
import AllPagesOfTransactionModule.UselessWastageProduct;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_UselessWastageProductPage extends BaseClass {

	HomePageOfVat homepage;
	UselessWastageProduct uselesswastageproduct;
	
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
		uselesswastageproduct = homepage.HomePageToNavigateUselessWastageProduct();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void VerifyAllRequiredFieldWithFillingUpField() throws InterruptedException {
		uselesswastageproduct.functionalityForValidateAllRequiredField();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageproduct.ActualWarningMsg(), "Test Case Fail");
	}
	
	@Test(priority = 2)
	public void VerifyItemNameRequiredField() throws InterruptedException {
		uselesswastageproduct.functionalityForValidateItemNameRequiredField();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageproduct.ActualWarningMsg(), "Test Case Fail");	
	}
	
	@Test(priority = 3)
	public void VerifyQtyRequiredField() throws InterruptedException {
		uselesswastageproduct.functionalityForValidateQtyRequiredField();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageproduct.ActualWarningMsg(), "Test Case Fail");	
	}
	
	@Test(priority = 4)
	public void VerifyPresentPriceRequiredField() throws InterruptedException {
		uselesswastageproduct.functionalityForValidatePresentPriceRequiredField();
		Thread.sleep(1000);
		Assert.assertTrue(uselesswastageproduct.ActualWarningMsg(), "Test Case Fail");	
	}
	
	@Test(priority = 5)
	public void VerifyAddingItem() throws InterruptedException {
		uselesswastageproduct.functionalityForValidateAddingItemWithFillupAllRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageproduct.ActualExactPriceValue(),
				DataPropForVat.getProperty("ExpectedExactPrice"), "Test Case Fail");	
	}
	
	@Test(priority = 6)
	public void VerifySavingItem() throws InterruptedException {
		uselesswastageproduct.functionalityForValidateSavingInfo();	
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageproduct.ActualSavingInfo(),
				DataPropForVat.getProperty("ExpectedSavingInfo"), "Test Case Fail");
	}
	
    @Test(priority = 7)
	public void VerifyUpdateQtyValue() throws InterruptedException {
		uselesswastageproduct.functionalityForValidateUpdateQtyValue();
		Thread.sleep(1000);
		Assert.assertEquals(uselesswastageproduct.ActualUpdatingInfoValue(), 
				DataPropForVat.getProperty("ExpectedUpdatingQtyValueMsg"), "Test Case Fail");
	}
    
    @Test(priority = 8)
  	public void VerifyUpdatePresentPriceValue() throws InterruptedException {
  		uselesswastageproduct.functionalityForValidateUpdatePresentPriceValue();
  		Thread.sleep(1000);
  		Assert.assertEquals(uselesswastageproduct.ActualUpdatingInfoValue(), 
  				DataPropForVat.getProperty("ExpectedUpdatingQtyValueMsg"), "Test Case Fail");
  	}
    
    @Test(priority = 9)
  	public void VerifyUpdateItemName() throws InterruptedException {
  		uselesswastageproduct.functionalityForValidateUpdateItemName();
  		Thread.sleep(1000);
  		Assert.assertEquals(uselesswastageproduct.ActualUpdatingInfoValue(), 
  				DataPropForVat.getProperty("ExpectedUpdatingItemNameValue"), "Test Case Fail");
  	}
    
    @Test(priority = 10)
  	public void VerifyClearBtn() throws InterruptedException {
  		uselesswastageproduct.functionalityForValidateClearBtn();
  		Thread.sleep(1000);
  		Assert.assertEquals(uselesswastageproduct.AcutalEmptyDataTextMsg(), 
  				DataPropForVat.getProperty("ExpectedEmptyDataTextMsg"), "Test Case Fail");
  	}
    
    @Test(priority = 11)
    public void VerifyItemSearching() throws InterruptedException {
    	uselesswastageproduct.functionalityForSearchingProduct();
    	Thread.sleep(1000);
    	Assert.assertTrue(uselesswastageproduct.ActualSearchingValue(),"Wrong Item display");
    }
    
    @Test(priority = 12)
    public void VerifyItemNameRequiredFieldInEditPage() throws InterruptedException {
    	uselesswastageproduct.functionalityForValidateItemNameRequiredFieldInEditingPage();
    	Thread.sleep(1000);
    	Assert.assertEquals(uselesswastageproduct.ActualWarningPopUpMsg(), 
    			DataPropForVat.getProperty("ExpectedWarningPopUpMsg"), "Test Case Fail");
    }
    
    @Test(priority = 13)
    public void VerifyQTyRequiredFieldInEditPage() throws InterruptedException {
    	uselesswastageproduct.functionalityForValidateQTYRequiredFieldInEditingPage();
    	Thread.sleep(1000);
    	Assert.assertEquals(uselesswastageproduct.ActualWarningPopUpMsg(), 
    			DataPropForVat.getProperty("ExpectedWarningPopUpMsg"), "Test Case Fail");
    }
	
    @Test(priority = 14)
    public void VerifyPresentPriceRequiredFieldInEditPage() throws InterruptedException {
    	uselesswastageproduct.functionalityForValidatePresentRequiredFieldInEditingPage();
    	Thread.sleep(1000);
    	Assert.assertEquals(uselesswastageproduct.ActualWarningPopUpMsg(), 
    			DataPropForVat.getProperty("ExpectedWarningPopUpMsg"), "Test Case Fail");
    }
    
    @Test(priority = 15)
    public void VerifyPdfFileInfo() throws InterruptedException, IOException {
    	String mainWindowHandle = driver.getWindowHandle();
    	uselesswastageproduct.functionalityForPdfReportGenerating();
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
        Assert.assertTrue(pdfContent.contains("New QA Product 3"),"Incorrect Item ");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("1.00"), "Incorrect Qty");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("321.00"), "Incorrect Exact Price");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("350.00"), "Incorrect Present Price");
        driver.close();
        driver.switchTo().window(mainWindowHandle); 
    }
    
}
