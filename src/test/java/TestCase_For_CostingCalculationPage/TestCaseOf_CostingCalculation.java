package TestCase_For_CostingCalculationPage;


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

import AllPagesOfTransactionModule.CostingCalculationPage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCaseOf_CostingCalculation extends BaseClass {

	HomePageOfVat homepage;
	CostingCalculationPage costingCalculationpage;
	
	@BeforeMethod
	public void BrowserSetUp() throws InterruptedException { 
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		loadPropertiesFileOfVAT();
		driver = intilizeBrowserAndOpenApplicationURL(propForVat.getProperty("Browser"));
		driver.get(propForVat.getProperty("url"));
		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(propForVat.getProperty("validUsername"),
				propForVat.getProperty("validPassword"));
		homepage = new HomePageOfVat(driver);
		Thread.sleep(1500);
		costingCalculationpage = homepage.HomePageToNavigateCostingCalculationPage();
	}

	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 0)
	public void VerifyProductCantSaveWhenProductIsRemoved() throws InterruptedException {
		costingCalculationpage.functionalityForSelectProductAndDeselectProductForNotSavingData(
				DataPropForVat.getProperty("ProductName"));
		Thread.sleep(2000);
		Assert.assertEquals(costingCalculationpage.DisplayTextForNoData(), 
				DataPropForVat.getProperty("ExpectedMsgForNoData"),"Test Case Fail");
	}
	
	@Test(priority = 1)
	public void VerifyItemWithChallanNoValue() throws InterruptedException {
		costingCalculationpage.functionalityForItemCheckingForASpecificProduct(
				DataPropForVat.getProperty("ProductName"));
	    Thread.sleep(1000);
		costingCalculationpage.ClickOnItem1Btn();
		Thread.sleep(1000);	    Assert.assertEquals(costingCalculationpage.DisplayChallanNoForItem1(),
	    		DataPropForVat.getProperty("ExpectedItem1ChallanNo"), "Wrong Item");
	    Thread.sleep(2000);
	    costingCalculationpage.ClickOnItemCloseBtn();
	    Thread.sleep(2000);
	    costingCalculationpage.ClickOnItem2Btn();
	    Thread.sleep(2000);
	    Assert.assertEquals(costingCalculationpage.DisplayChallanNoForItem2(),
	    		DataPropForVat.getProperty("ExpectedItem2ChallanNo"), "Wrong Item");
	    Thread.sleep(2000);
	    costingCalculationpage.ClickOnItemCloseBtn();
	    Thread.sleep(2000);
	    costingCalculationpage.ClickOnItem3Btn();
	    Thread.sleep(2000);
	    Assert.assertEquals(costingCalculationpage.DisplayChallanNoForItem3(),
	    		DataPropForVat.getProperty("ExpectedItem3ChallanNo"), "Wrong Item");
	    Thread.sleep(2000);
	    costingCalculationpage.ClickOnItemCloseBtn();	
	}
	
	@Test(priority = 2)
	public void VerifyProductIsSavedPerfectly() throws InterruptedException {
		costingCalculationpage.functionalityForProductItemSaving(
				DataPropForVat.getProperty("ProductName"));
		Thread.sleep(2000);
		Assert.assertEquals(costingCalculationpage.DisplayTextForTotalAmountValueOfAnProduct(),
				DataPropForVat.getProperty("TotalAmountOfCostingCalculationItem"),"Wrong Product Saved");
	}
	
	@Test(priority = 3)
	public void VerifyProductSearch() throws InterruptedException {
		costingCalculationpage.functionalityForProductSearch
		(DataPropForVat.getProperty("ProductName"));
		Thread.sleep(2000);
		Assert.assertEquals(costingCalculationpage.DisplayTextForTotalAmountValueOfAnProduct(), 
				DataPropForVat.getProperty("TotalAmountOfCostingCalculationItem"));	
	}
	
	@Test(priority = 4)
	public void VerifyReportGenerate() throws InterruptedException {
		costingCalculationpage.functionaliyForViewingReport
		(DataPropForVat.getProperty("ProductName"));	
	}
	
	@Test(priority = 5)
	public void VerifyReportFile() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		costingCalculationpage.functionalityForVerifyingReportFile
		(DataPropForVat.getProperty("ProductName"));
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
        Assert.assertTrue(pdfContent.contains("New QA Product (Product)/1Pcs."), "Wrong report generated as incorrect Product name");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("118016.4000"), "Wrong report generated as incorrect Total value");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	
	
}
