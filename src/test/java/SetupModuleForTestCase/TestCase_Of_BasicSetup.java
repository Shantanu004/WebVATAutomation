package SetupModuleForTestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesForSetupModule.BasicSetupPage;
import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import VAT_BasePackage.BaseClass;

public class TestCase_Of_BasicSetup extends BaseClass {

	HomePageOfVat homepage;
	BasicSetupPage basicsetup;

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
		basicsetup = homepage.HomePageToNavigateBasicSetup();
	}

	@AfterMethod	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	//Add Page Test Case 
	@Test(priority = 1)
	public void VerifyNavigateToAddPageAfterclickingOnAddBtn() throws InterruptedException {
		basicsetup.functionalityForNavigateAddPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddPageHeadingName(), 
				DataPropForVat.getProperty("ExpectedAddPageHeadingName"), "Test Case Fail");
	}

	@Test(priority = 2)
	public void VerfiyNameRequiredField() throws InterruptedException {
		basicsetup.functionalityForNameRequiredFieldVerify();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddPageHeadingName(),
				DataPropForVat.getProperty("ExpectedAddPageHeadingName"), "Test Case Fail" );
	}

	@Test(priority = 3)
	public void VerfiyCodeRequiredField() throws InterruptedException {
		basicsetup.functionalityForCodeRequiredFieldVerify();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddPageHeadingName(),
				DataPropForVat.getProperty("ExpectedAddPageHeadingName"), "Test Case Fail" );
	}

	@Test(priority = 4)
	public void VerifyResetBtn() throws InterruptedException {
		basicsetup.functionalityForResetBtnVerify();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddPageHeadingName(),
				DataPropForVat.getProperty("ExpectedAddPageHeadingName"), "Test Case Fail" );
	}

	@Test(priority = 5)
	public void VerifyCancelBtn() throws InterruptedException{
		basicsetup.functionalityForCancelBtnVerify();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayBasicSetupDashboardHeadingName(), 
				DataPropForVat.getProperty("ExpectedBasicSetupDashboardName"), "Test Case Fail");
	}

	@Test(priority = 6)
	public void VerifyBasicSetupInfoSaving() throws InterruptedException {
		basicsetup.functionalityForBasicSetupInfoSaving();
		Thread.sleep(1000);	
		Assert.assertTrue(basicsetup.DisplayBasicSetupNameAfterSaving(),"Incorrect Info" );
	}
	
	//EditPage
	@Test(priority = 7)
	public void VerifyNameRequiredFieldInEditPage() throws InterruptedException {
		basicsetup.functionalityForValidateNameRequiredFieldInEditPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddPageHeadingName(),
				DataPropForVat.getProperty("ExpectedAddPageHeadingName"), "Test Case Fail" );
	}
	
	@Test(priority = 8)
	public void VerifyCodeRequiredFieldInEditPage() throws InterruptedException {
		basicsetup.functionalityForValidateCodeRequiredFieldInEditPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddPageHeadingName(),
				DataPropForVat.getProperty("ExpectedAddPageHeadingName"), "Test Case Fail" );
	}
	
	@Test(priority = 9)
	public void VerifyUpdatingNameCodeDescriptionValueInEditPage() throws InterruptedException {
		basicsetup.functionalityForValidateUpdatingNameCodeDescriptionValue();
	}
	
	@Test(priority = 10)
	public void VerifyDeleteBtnBasicSetUpInfoInEditPage() throws InterruptedException {
		basicsetup.functionalityForValidateDeleteBtnInEditPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.ActualDeleteMsgAfterDeletingBasicSetup(), 
				DataPropForVat.getProperty("ExpectedBasicSetupDeleteMsg"), "Tes Case Fail");
	}
	
	//Add Child Page
	@Test(priority = 11)
	public void VerifyNavigateToAddChildPage() throws InterruptedException {
		basicsetup.functionalityForNavigateAddChildPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddChildPageHeadingName(),
				DataPropForVat.getProperty("ExpectedHeadingNameForAddChildPage"), "Test Case Fail");
	}
	
	@Test(priority = 12)
	public void VerifyNameRequiredFieldOfChildPage() throws InterruptedException {
		basicsetup.functionalityForNameRequiredFieldInChildPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddChildPageHeadingName(), 
				DataPropForVat.getProperty("ExpectedHeadingNameForAddChildPage"), "Test Case Fail");
	}
	
	@Test(priority = 13)
	public void VerifyCodeRequiredFieldOfChildPage() throws InterruptedException {
		basicsetup.functionalityForCodeRequiredFieldInChildPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddChildPageHeadingName(), 
				DataPropForVat.getProperty("ExpectedHeadingNameForAddChildPage"), "Test Case Fail");
	}
	
	@Test(priority = 14)
	public void VerifyResetBtnInChildPage() throws InterruptedException {
		basicsetup.functionalityForValidateResetBtnInChildPage();
		Thread.sleep(1000);
		Assert.assertEquals(basicsetup.DisplayAddChildPageHeadingName(), 
				DataPropForVat.getProperty("ExpectedHeadingNameForAddChildPage"), "Test Case Fail");
	}
	@Test(priority = 15)
	public void VerifyAddChildInfoSaving() throws InterruptedException {
		basicsetup.functionalityForValidateSavingAddChildInfo();
	}
	
	//Edit Child Page
	@Test(priority = 16)
	public void VerifyEditingAndUpdatingInfoOfChildPage() throws InterruptedException {
		basicsetup.functionalityForValidateEditingChildPage();
	}
}
