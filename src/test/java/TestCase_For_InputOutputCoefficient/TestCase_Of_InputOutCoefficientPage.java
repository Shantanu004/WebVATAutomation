package TestCase_For_InputOutputCoefficient;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.InputOutputCoefficientPage;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_InputOutCoefficientPage extends BaseClass {

	HomePageOfVat homepage;
	InputOutputCoefficientPage inputoutputcoefficientpage;
	
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
		inputoutputcoefficientpage = homepage.HomePageToNavigateInputOutputCoefficient();
	}

	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 0)
	public void VerifyClearButtonAfterSelectingProduct() throws InterruptedException {
		inputoutputcoefficientpage.FunctionalityForProductClearAfterSelecting(
				DataPropForVat.getProperty("ProductName"));
		//Thread.sleep(2000);
		Assert.assertEquals(inputoutputcoefficientpage.DisplayEmptyProductTextField(),
				DataPropForVat.getProperty("ExpectedEmptyProductInTextField"),"Test case fail");
	}
	
	@Test(priority = 1)
	public void VerifyProductIsSaved() throws InterruptedException {
		inputoutputcoefficientpage.FunctionalityForSaveBtnAfterSelectingProduct();
		Thread.sleep(2000);
		Assert.assertEquals(inputoutputcoefficientpage.DisplaySearchedProductAfterSaving(), 
				DataPropForVat.getProperty("ExpectedSearchingValueAfterSaving"));		
	}
	
	@Test(priority = 2)
	public void VerifySearchFieldBySearchingProduct() throws InterruptedException {
		inputoutputcoefficientpage.FunctionalityForProductSearchFromList(
				DataPropForVat.getProperty("ProductName"));
	Assert.assertEquals(inputoutputcoefficientpage.DisplaySearchingValue(), 
			DataPropForVat.getProperty("ExpectedSearchingValueOfInputOutputCoefficient"), "Test Case Fail");	
	}
	
	@Test(priority = 3)
	public void VerifyProductIsClearedAfterSearchingProduct() throws InterruptedException {
		inputoutputcoefficientpage.FunctionalityForProductClearFromSearchField(
				DataPropForVat.getProperty("ProductName"));	
		Assert.assertEquals(inputoutputcoefficientpage.DisplayEmptySearchField(), 
				DataPropForVat.getProperty("ExpectedEmptySearchField"), "Test Case Fail");
	} 
	
	@Test(priority = 4)
	public void VerifyClearBtnOfProductList() throws InterruptedException {
		inputoutputcoefficientpage.FunctionalityForProductSearchFromListForClearedBtn(
				DataPropForVat.getProperty("ProductName"));
		Assert.assertEquals(inputoutputcoefficientpage.DisplayEmptySearchField(), 
				DataPropForVat.getProperty("ExpectedEmptySearchField"), "Test Case Fail");
	}
	
	@Test(priority = 5)
	public void VerifyGeneratingReport() throws InterruptedException, IOException {
		inputoutputcoefficientpage.FunctionalityForProductReportGenerateFromList();		
	}
	
	
	
}
