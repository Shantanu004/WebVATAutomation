package TestCase_For_SourceVATPage;

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
import AllPagesOfTransactionModule.SourceVatPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_SourceVATPage extends BaseClass {
    
	HomePageOfVat homepage;
	SourceVatPage sourceVatPage;
	
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
	    sourceVatPage = homepage.HomePageToNavigateSourceVat();	
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	//Add Page
	@Test(priority = 1)
	public void VerifySupplierNameRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForSupplierNameRequiredField();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 2)
	public void VerifyTreasuryNoRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForTreasuryNoRequiredField();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 3)
	public void VerifyBankNameRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForBankNameRequiredField();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 4)
	public void VerifyEconomicsCodeRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForEconomicsCodeRequiredField();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 5)
	public void VerifyTreasuryDateRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForTreasuryDateRequiredField();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 6)
	public void VerifyChallanNoRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForChallanNoRequiredField();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 7)
	public void VerifyChallanDateRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForChallanDateRequiredField();
		Assert.assertEquals(sourceVatPage.ActualTotalSourceVATFieldTextValue(),
				DataPropForVat.getProperty("ExpectedTotalSourceVATFieldTextValue"), "Test Case Fail");
	}
	
	@Test(priority = 8)
	public void VerifyVATAbleAmtRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForVATAbleAmtRequiredField();
		Assert.assertEquals(sourceVatPage.ActualTotalSourceVATFieldTextValue(),
				DataPropForVat.getProperty("ExpectedTotalSourceVATFieldTextValue"), "Test Case Fail");
	}
	
	@Test(priority = 9)
	public void VerifyVATAmtRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForVATAmtRequiredField();
		Assert.assertEquals(sourceVatPage.ActualTotalSourceVATFieldTextValue(),
				DataPropForVat.getProperty("ExpectedTotalSourceVATFieldTextValue"), "Test Case Fail");
	}
	
	@Test(priority = 10)
	public void VerifySavingIssueTypeChallanWithOutCertificateIssue() throws InterruptedException {
		sourceVatPage.functionalityForSavingIssueTypeChallanWithOutCertificateIssue();
		Thread.sleep(1000);
		Assert.assertTrue(sourceVatPage.ActualSupplierNameDisplayed(), "Wrong Supplier Name");
	}
	
	@Test(priority = 11)
	public void VerifySavingReceiveTypeChallan() throws InterruptedException {
		sourceVatPage.functionalityForSavingReceiveTypeChallan();
		Thread.sleep(1000);
		Assert.assertTrue(sourceVatPage.ActualSavingCustomerNameDisplayed(), "Wrong Customer Name");
	}
	
	@Test(priority = 12)
	public void VerifyCustomerNameRequiredField() throws InterruptedException {
		sourceVatPage.functionalityForCustomerNameRequiredField();
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 13)
	public void VerifyCertificateDateRequiredFieldWhenCertificateIssueOn() throws InterruptedException {
		sourceVatPage.functionalityForCertificateDateRequiredFieldWhenCertificateIssueOn();
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 14)
	public void VerifySavingIssueTypeChallanWithCertificateIssue() throws InterruptedException {
		sourceVatPage.functionalityForSavingIssueTypeChallanWithCertificateIssue();
		Thread.sleep(1000);
		Assert.assertTrue(sourceVatPage.ActualSupplierNameDisplayed(), "Wrong Supplier Name");
	}
	
	//Edit Page
	@Test(priority = 15)
	public void VerifySupplierNameRequiredFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForSupplierNameRequiredFieldInNonCiIssueEditPage();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 16)
	public void VerifyTreasuryNoRequiredFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForTreasuryNoRequiredFieldInNonCiIssueEditPage();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 17)
	public void VerifyBankNameRequiredFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForBankNameRequiredFieldInNonCiIssueEditPage();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 18)
	public void VerifyEconomicCodeRequiredFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForEconomicCodeRequiredFieldInNonCiIssueEditPage();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 19)
	public void VerifyTreasuryDateRequiredFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForTreasuryDateRequiredFieldInNonCiIssueEditPage();
		Assert.assertEquals(sourceVatPage.ActualWarningMsgForRequiredField(),
				DataPropForVat.getProperty("ExpectedWarningMsgForSourceVATRequiredField"), "Test Case Fail");
	}
	
	@Test(priority = 20)
	public void VerifyVatableAmtFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForVatableAmtFieldInNonCiIssueEditPage();
		Thread.sleep(1000);
		Assert.assertTrue(sourceVatPage.DisplayNumericValueWarningMsg(), "Test case Fail");
	}
	
	@Test(priority = 21)
	public void VerifyVatAmtFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForVatAmtFieldInNonCiIssueEditPage();
		Thread.sleep(1000);
		Assert.assertTrue(sourceVatPage.DisplayNumericValueWarningMsg(), "Test case Fail");
	}
	
	@Test(priority = 22)
	public void VerifyUpdatingAllRequiredFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForUpdatingAndVerfiyingAllRequiredFieldInNonCiIssueEditPage();	
		Thread.sleep(1000);
		Assert.assertTrue(sourceVatPage.DisplayActualEditingValue(), "Test Case Fail");
	}
	
	@Test(priority = 23)
	public void VerifyUpdatingSourceVATDetialsFieldInNonCIChallanOfIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForUpdatingSourceVATDetailsFieldInNonCiIssueEditPage();	
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualVatableAmtTextValue(),
				DataPropForVat.getProperty("ExpectedVatableAmtTextValue"), "Test Case Fail for Wrong Vatable Amt");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualVatAmtTextValue(),
				DataPropForVat.getProperty("ExpectedVatAmtTextValue"), "Test Case Fail for Wrong Vat Amt");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualSourceVatTextValue(),
				DataPropForVat.getProperty("ExpectedSourceVatTextValue"), "Test Case Fail for Wrong Source Vat Amt");
	}
	
	@Test(priority = 24)
	public void VerifyUpdatingIssueTypeChallanWithCertificateIssueInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForUpdatingIssueTypeChallanWithCertificateIssue();	
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualSupplierNameTextValue(), 
				DataPropForVat.getProperty("ExpectedSupplierName"), "Test Case Fail for Wrong Supplier Name");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualBankNameTextValue(),
				DataPropForVat.getProperty("ExpectedBankName"), "Test Case Fail for Wrong Bank Name");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualBranchNameTextValue(), 
				DataPropForVat.getProperty("ExpectedBranchName"), "Test Case Fail for Wrong Branch Name");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualVatableAmtTextValue(),
				DataPropForVat.getProperty("ExpectedVatableAmtTextValue"), "Test Case Fail for Wrong Vatable Amt");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualVatAmtTextValue(),
				DataPropForVat.getProperty("ExpectedVatAmtTextValue"), "Test Case Fail for Wrong Vat Amt");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualSourceVatTextValue(),
				DataPropForVat.getProperty("ExpectedSourceVatTextValue"), "Test Case Fail for Wrong Source Vat Amt");
	}
	
	@Test(priority = 25)
	public void VerifyUpdatingReceivedTypeChallanInEditPage() throws InterruptedException {
		sourceVatPage.functionalityForVerifyUpdatingReceivedTypeChallanInfo();	
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualCustomerNameTextValue(), 
				DataPropForVat.getProperty("ExpectedCustomerName"), "Test Case Fail for Wrong Customer Name");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualBankNameTextValue(),
				DataPropForVat.getProperty("ExpectedBankName"), "Test Case Fail for Wrong Bank Name");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualBranchNameTextValue(), 
				DataPropForVat.getProperty("ExpectedBranchName"), "Test Case Fail for Wrong Branch Name");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualVatableAmtTextValue(),
				DataPropForVat.getProperty("ExpectedVatableAmtTextValue"), "Test Case Fail for Wrong Vatable Amt");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualVatAmtTextValue(),
				DataPropForVat.getProperty("ExpectedVatAmtTextValue"), "Test Case Fail for Wrong Vat Amt");
		Thread.sleep(1000);
		Assert.assertEquals(sourceVatPage.ActualSourceVatTextValue(),
				DataPropForVat.getProperty("ExpectedSourceVatTextValue"), "Test Case Fail for Wrong Source Vat Amt");
	}
	
	@Test(priority = 26)
	public void VerifyIssueTypeChallanWithCIOnReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		sourceVatPage.FunctionalityForClickingPrintButton();
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
        int pages=doc.getNumberOfPages();
        System.out.println("The total number of pages "+pages);
        Assert.assertTrue(pdfContent.contains("20.00"),"Test case wrong");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
        
}      
