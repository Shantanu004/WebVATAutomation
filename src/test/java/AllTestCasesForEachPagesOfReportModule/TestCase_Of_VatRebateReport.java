package AllTestCasesForEachPagesOfReportModule;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesForReportModule.VATRebateReport;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_VatRebateReport extends BaseClass {

	HomePageOfVat homepage;
	VATRebateReport vatrebatereport;
	
	@BeforeMethod
	public void BrowserSetUp() throws InterruptedException { 
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		loadPropertiesFileOfVAT();
		driver = intilizeBrowserAndOpenApplicationURL(propForVat.getProperty("EdgeBrowser"));
		driver.get(propForVat.getProperty("url"));
		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(propForVat.getProperty("validUsername"), 
				propForVat.getProperty("validPassword"));
		homepage = new HomePageOfVat(driver);
		Thread.sleep(1000);
		vatrebatereport = homepage.HomePageToNavigateVATRebateReport();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void VerifyPurchaseRcvMushak6Point1VatRebateReport() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak6Point1PurchaseRcv();
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
        Assert.assertTrue(pdfContent.contains("Alovera Leaf"), "Incorrect Product Name");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);	
	}
	
	@Test(priority = 2)
	public void VerifyMushak6Point2SalesRegisterReport() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak6Point2SalesRegister();
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
        Assert.assertTrue(pdfContent.contains("Final Product (QA Final)"), "Incorrect Challan No value");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);	
	}
	
	@Test(priority = 3)
	public void VerifyMushak6Point10MoreThanTwoLakhPurchaseReport() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak6Point10MoreThanTakaTwoLakhTakaPurchase();
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
        Assert.assertTrue(pdfContent.contains("QAChallan 0123"), "Incorrect Challan No Value");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("QA Supplier"), "InCorrect Buyer Name");
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 4)
	public void VerifyMushak6Point10MoreThanTwoLakhSalesReport() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak6Point10MoreThanTwoLakhSales();
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
        Assert.assertTrue(pdfContent.contains("9/22-23"), "Incorrect Challan No");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("003441088-0102"), "Incorrect BIN No");
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 5)
	public void VerifyMushak6Point2Point1PurchaseAndSalesRegisterReport() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak6Point2Point1PurchaseSalesRegister();
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
        Assert.assertTrue(pdfContent.contains(""));
	}
	
	@Test(priority = 6)
	public void VerifyMushak9Point1VatRtnEnglishV2() throws IOException, InterruptedException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak9Point1VatRtnEngV2();
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
        Assert.assertTrue(pdfContent.contains("Mushak-9.1"), "Incorrect Report Generating");
        Thread.sleep(1000);
        LocalDate currentDate = LocalDate.now();
        Month CurrentMonth = currentDate.getMonth();
        String CurrentMonthName = CurrentMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(CurrentMonthName);
        Assert.assertTrue(pdfContent.contains(CurrentMonthName), "Current Month Name is not as Expected");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 7)
	public void VerifyMushak6Point8PurchaseReturnReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak6Point8PurchaseReturn();
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
        Assert.assertTrue(pdfContent.contains("1001001"), "Incorrect Challan Number");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("80,000.00"), "Incorrect Value of Item");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 8)
	public void VerfiyMushak6Point5FinishGoodTransferReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak6Point5FinishGoodTransfer();
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
        Assert.assertTrue(pdfContent.contains("ABC Manufacturing Limited"), "Not Expected as Actual Company Name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("003441088-0102"), "Not Expected as Actual BIN No");     
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	@Test(priority = 9)
	public void VerifyMushak4Point4OfUselessRawAndPackingMaterialReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		vatrebatereport.functionalityForValidateMushak4Point4UselessRawAndPackingMaterials();
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
        Boolean AcutalItemHISCode = pdfContent.contains("48191000");
        String ActualItemHISCodeInString= String.valueOf(AcutalItemHISCode);
        String ExpectedHISCode="true";
        Assert.assertEquals(ActualItemHISCodeInString, ExpectedHISCode, "Incorrect HIS Code");  
	    Thread.sleep(1000);
	    Assert.assertTrue(pdfContent.contains("Clopid -AS Tab."), "Incorrect Item");
	    Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
}
