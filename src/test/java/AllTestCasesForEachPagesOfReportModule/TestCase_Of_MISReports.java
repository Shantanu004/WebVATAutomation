package AllTestCasesForEachPagesOfReportModule;

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

import AllPagesForReportModule.MISReportsPage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_MISReports extends BaseClass {
    
	HomePageOfVat homepage;
	MISReportsPage misreports;
	
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
		Thread.sleep(1000);
		misreports = homepage.HomePageToNavigateMISReports();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
   
	@Test(priority = 1)
	public void VerfiyAdvanceTaxReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateAdvanceTaxReportFile();
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
        Assert.assertTrue(pdfContent.contains("New QA Supplier Name"), "Incorrect Supplier Name as expected");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("QAChallan090057"), "Incorrect Challan Value as expected");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);   
	}
	
	@Test(priority = 2)
	public void VerifyProductStockSummaryReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateProductStockSummaryReportFile();
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
        Assert.assertTrue(pdfContent.contains("Product Stock Summary"), "Incorrect Report File Generate.");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("28 MM CSD Cap (Product)"), "InCorrect Item Name");   
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle); 
	}
	
	@Test(priority = 3)
	public void VerifyCreditNoteReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateCreditNoteReport();
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
        Assert.assertTrue(pdfContent.contains("Credit Note Report"), "Incorrect Report Generate");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Buyer"), "Incorrect Customer Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Product 4"), "Incorrect Item Name");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle); 
	}
	
	@Test(priority = 4)
	public void VerifyDebitNoteReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateDebitNoteReport();
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
        Assert.assertTrue(pdfContent.contains("Debit Note Report"), "Incorrect Report Generate");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("NEW QA SUPPLIER"), "Incorrect Supplier Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Raw Material 2"), "Incorrect Item Name");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle); 
	}
	
	@Test(priority = 5)
	public void VerifySourceVatIssueReortFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateSourceVatIssueReport();
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
        Assert.assertTrue(pdfContent.contains("Source VAT(Issue)"), "Incorrect Report Generate");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("QA_Challan_\r\n"
        		+ "001"), "Incorrect bill of Entry");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("NEW QA SUPPLIER"), "Incorrect Supplier Name");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle); 
	}
	
	@Test(priority = 6)
	public void VerifySourceVatReceiveReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateSourceVatReceiveReport();
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
        Assert.assertTrue(pdfContent.contains("Source VAT (Receive)"), "Incorrect Report Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Buyer"), "Incorrect Customer Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("66"), "Incorrect Total Source Vat");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle); 
	}
	
	@Test(priority = 7)
	public void VerifyClosingStockReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateClosingStockReport();
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
        Assert.assertTrue(pdfContent.contains("Closing Stock"), "Incorrect report generate");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("Raw Material"), "Incorrect Item Type");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("01051110"), "Incorrect HS Code");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("Adapalene"), "Incorrect Item Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("38,837.14"), "Incorrect Total Amount");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle); 
	}
	
	@Test(priority = 8)
	public void VerifyRawPackingStockSummaryReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateRawAndPackingStockSummaryReport();
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
        Assert.assertTrue(pdfContent.contains("Raw/Packing Stock Summary"), "Incorrect Report Generating");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("01051110"), "Incorrect HS Code");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("Adapalene"), "Incorrect Item Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("800.00"), "Incorrect Closig Balance");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 9)
	public void VerifyCostingCalculationReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateCostingCalculationReport();
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
        Assert.assertTrue(pdfContent.contains("Costing Calculation"), "Incorrect Report Generate");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 10)
	public void VerifyInputOutputCoefficientReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		misreports.functionalityForValidateInputOutputCoefficient();
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
        Assert.assertTrue(pdfContent.contains("New QA Product (Product)"), "Incorrect Item Name");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	
}
