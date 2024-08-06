package TestCase_For_ConsumptionRaw_PackingMaterials;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.Consumption_RawAndPackingMaterialsPage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_ConsumptionRaw_PackingMaterials extends BaseClass{

	HomePageOfVat homepage;
	Consumption_RawAndPackingMaterialsPage consupmtionofrawandpackingmaterials;
	
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
		consupmtionofrawandpackingmaterials = homepage.HomePageToNavigateConsumption();
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 0)
	public void VerifyConsumptionAddPageHeading() throws InterruptedException {
		consupmtionofrawandpackingmaterials.functionalityForAddbtnToGoConsumptionform();
		Thread.sleep(1000);
		Assert.assertEquals(consupmtionofrawandpackingmaterials.DisplayConsumptionAddFormHeadText(),
				DataPropForVat.getProperty("ExpectedHeadingOfConsuptionAddPage"),"Wrong Headline");
	}
	
	@Test(priority = 1)
	public void VerifySavingRawMaterialsConsumption() throws InterruptedException {
		consupmtionofrawandpackingmaterials.functionalityForSavingProductForRawMaterials();
		Thread.sleep(2000);
		Assert.assertEquals(consupmtionofrawandpackingmaterials.DisplayProductTextValueForRaw(),
				DataPropForVat.getProperty("ExpectedConsumptionTypeForRaw"), "Wrong Product");
	}
	
	@Test(priority = 2)
	public void VerifySavingPackingMaterialsConsumption() throws InterruptedException {
		 consupmtionofrawandpackingmaterials.functionalityForSavingProductForPackingMaterials();
		 Thread.sleep(2000);
		 Assert.assertEquals(consupmtionofrawandpackingmaterials.DisplayProductTextValueForPacking(),
				 DataPropForVat.getProperty("ExpectedConsumptionTypeForPacking"), "Wrong Product");
	}
	
	@Test(priority = 3)
	public void VerifySearchingValue() throws InterruptedException {
		consupmtionofrawandpackingmaterials.functionalityForItemSearching();
		Thread.sleep(2000);
		Assert.assertEquals(consupmtionofrawandpackingmaterials.DisplayBatchNameTextValue(),
				DataPropForVat.getProperty("ExpectedBatchName"),"Wrong Value Showing");
	}
	
	
	
	
}
