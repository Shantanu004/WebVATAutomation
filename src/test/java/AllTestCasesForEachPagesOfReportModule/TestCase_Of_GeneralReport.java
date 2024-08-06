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

import AllPagesForReportModule.GeneralReportPage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_GeneralReport extends BaseClass {

	HomePageOfVat homepage;
	GeneralReportPage generalreport;
	
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
		generalreport = homepage.HomePageToNavigateGeneralReport();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void VerifyProductInformationFileInGeneralReport() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForValidateProductInformationFile();
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
        
//        PDDocument systemPdfDocument = PDDocument.load(new File("E:\\QA Document\\QA Automation\\VATAutomation\\Report Module\\General Report\\Production Information File.pdf"));
//        PDFTextStripper pdfTextStripper = new PDFTextStripper();
//        String systemPdfContent = pdfTextStripper.getText(systemPdfDocument);
        
        int pages=doc.getNumberOfPages();
        System.out.println("The total number of pages "+pages);
        //Assert.assertEquals(systemPdfContent,pdfContent, "Incorrect PDF File");
        
        Assert.assertTrue(pdfContent.contains("New QA Product"), "Incorrect Product name");
        driver.close();
        driver.switchTo().window(mainWindowHandle); 
	}
	
	@Test(priority = 2)
	public void VerfiyHSCodeWiseProductInfoFileInGeneralReport() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForValidateHSCodeWiseProductionInformation();
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
        Assert.assertTrue(pdfContent.contains("New QA Product"), "Incorrect Prodcut Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("188.0000"), "Incorrect Unit Price");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 3)
	public void VerifyHSCodeWiseStatmentOfRebatePDFFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForHSCodeWiseStatementOfRebate();
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
        Assert.assertTrue(pdfContent.contains("1,22,100.00"), "Incorrect Grand Total");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("8,315.00"), "InCorrect Rebate");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 4)
	public void VerifyHSCodeWiseMonthlySalesRebatePDFFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForHSCodeWiseMonthlySalesRebate();
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
        Assert.assertTrue(pdfContent.contains("778899662233"), "Incorrect HS Code");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Product"), "Incorrect Product Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("9"), "Incorrect Qty Value");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("1,692.00"), "Incorrect Ammount");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 5)
	public void VerifySupplierWisePurhcasePDFFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForValidateSupplierWisePurchaseReport();
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
        Assert.assertTrue(pdfContent.contains("NEW QA SUPPLIER"), "Supplier doesn't exist");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("PackingofChallan01 - "), "Incorrect Bill of Entry");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("27,500.00"), "Incorrect Total VAT Ammount");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 6)
	public void VerifyMushak6Point3PDFReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForValidateMushak6Point3ReportFile();
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
        Assert.assertTrue(pdfContent.contains("1/23-23"), "Incorrect Challan No");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("Clopid -AS Tab. (Printed Carton)"), "Incorrect Product");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("Spirucap 500mg (Hard Capsule)"), "Incorrect Product");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("152.34"), "Incorrect Price with SD & VAT");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
       }
	
	@Test(priority = 7)
	public void VerifyMushak6Point6SourceVatPdfFile() throws IOException, InterruptedException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForValidateMushak6Point6ForSourceVatReportFile();
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
        Assert.assertTrue(pdfContent.contains("51"), "Incorrect Source Vat No");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("Drug International Ltd (Head Office)"), "Incorrect Provider Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("6.00"), "Incorrect vat of Source");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 8)
	public void VerifySalesReturn6Point7ReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForValidateSalesReturnMushak6Point7();
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
        Assert.assertTrue(pdfContent.contains("Final Product"), "Incorrect Sales Return Product");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("2"), "Incorrect Sales Return Product Qty");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("580.00"), "Incorrect Sales Return Product total value");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 9)
	public void VerifyUselessProductWastageMushak4Point5ReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		generalreport.functionalityForValidateUselessProductWastageMushak4Point5();
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
        Assert.assertTrue(pdfContent.contains("New QA Product"), "Incorrect Product Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("188.00"), "Incorrect Exact Product Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("200.00"), "Incorrect Proposed Product Name");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	
	
}

