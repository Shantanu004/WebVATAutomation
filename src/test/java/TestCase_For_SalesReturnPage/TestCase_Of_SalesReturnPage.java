package TestCase_For_SalesReturnPage;

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
import AllPagesOfTransactionModule.SalesReturnPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_SalesReturnPage extends BaseClass {

	HomePageOfVat homepage;
	SalesReturnPage salesreturnpage;
	
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
		salesreturnpage = homepage.HomePageToNavigateSalesReturnPage();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//--> Add Page
	@Test(priority = 1)
	public void VerifySavingSalesReturnInfo() throws InterruptedException {
		salesreturnpage.functionalityForSavingSalesReturnInfo();
		Thread.sleep(2000);
		Assert.assertEquals(salesreturnpage.DisplayBuyerNameTextvalue(), 
				DataPropForVat.getProperty("ExpectedBuyerNameAfterSaving"), "Test Case fail because");
	    Thread.sleep(2000);
	    Assert.assertEquals(salesreturnpage.DisplayVatRegNoTextValue(), 
	    		DataPropForVat.getProperty("ExpectedVatRegNoAfterSaving"), "Test Case Fail because");
	
	}
	
	@Test(priority = 2)
	public void VerfiyRequiredFieldInSalesReturnAddPage() throws InterruptedException {
		salesreturnpage.funcionalityForRequiredField();
		Assert.assertEquals(salesreturnpage.displayWarningMsg(),
			DataPropForVat.getProperty("ExpectedWarningMsgForSalesReturnRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 3)
	public void VerfiySalesChallanRequiredFieldInSalesRtnAddPg() throws InterruptedException {
		salesreturnpage.functionalityForSalesChallanRequiredField();
	    Assert.assertEquals(salesreturnpage.displayWarningMsg(), 
	    		DataPropForVat.getProperty("ExpectedWarningMsgForSalesReturnRequiredField"), "Test Case Fail"); 	
	}
	
	@Test(priority = 4)
	public void VerfiyReturnDateRequiredFieldInSalesRtnAddPg() throws InterruptedException {
		salesreturnpage.functionalityForReturnDateRequiredField();
		Assert.assertEquals(salesreturnpage.displayWarningMsg(), 
	    		DataPropForVat.getProperty("ExpectedWarningMsgForSalesReturnRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 5)
	public void VerifySalesReturnItemInfoDelete() throws InterruptedException {
		salesreturnpage.functionalityForSalesRtnItemDelete();
		Thread.sleep(3000);
		Assert.assertFalse(salesreturnpage.SaveBtnEnableOrDisable(),"Test Case Fail");
		System.out.println("Button is enable?, True or False: " + salesreturnpage.SaveBtnEnableOrDisable());
	}
	
	//--> Edit Page 
	@Test(priority = 6)
	public void VerfiySalesReturnEditPageRequiredField() throws InterruptedException {
		salesreturnpage.funcationalityForEditPageRequiredField();
		Assert.assertEquals(salesreturnpage.displayWarningMsg(), 
	    		DataPropForVat.getProperty("ExpectedWarningMsgForSalesReturnRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 7)
	public void VerfiySalesReturnEditPageReturnDateRequiredField() throws InterruptedException {
		salesreturnpage.funcationalityForEditPageReturnDateRequiredField();
		Assert.assertEquals(salesreturnpage.displayWarningMsg(), 
	    		DataPropForVat.getProperty("ExpectedWarningMsgForSalesReturnRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 8)
	public void VerfiySalesReturnEditPageChallanSLRequiredField() throws InterruptedException {
		salesreturnpage.funcationalityForEditPageChallanSLRequiredField();
		Assert.assertEquals(salesreturnpage.displayWarningMsg(), 
	    		DataPropForVat.getProperty("ExpectedWarningMsgForSalesReturnRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 9)
	public void VerifyUpdateBtnInSalesReturnEditPage() throws InterruptedException {
		salesreturnpage.functionalityForUpateBtnInEditPage();
		Thread.sleep(3000);
		Assert.assertFalse(salesreturnpage.UpdateBtnEnableOrDisable(),"Test Case Fail");
		System.out.println("Button is enable?, True or False: " + salesreturnpage.SaveBtnEnableOrDisable());
	}
	
	@Test(priority = 10)
	public void VerifyUpdatingValue() throws InterruptedException {
		salesreturnpage.functionalityForUpdatingDataInEditPage();
		Thread.sleep(2000);
		Assert.assertEquals(salesreturnpage.displayReturnTextValue(), 
				DataPropForVat.getProperty("ExpectedReturnDateTextValue"),"Verification Fail");
	}
	
	//--> DashBoard
	@Test(priority = 11)
	public void VerifyPdfFileInfoAfterSavingSalesReturnInfo() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		salesreturnpage.functionalityForAfterSavingPDFFile();
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
        Assert.assertTrue(pdfContent.contains("New QA Buyer"), "Test Case fail for incorrect Buyer Name");
	    Thread.sleep(2000);
	    driver.close();
        driver.switchTo().window(mainWindowHandle);  
	}
	
}
