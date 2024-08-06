package TestCase_For_OpeningBalancePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesOfTransactionModule.HomePageOfVat;
import AllPagesOfTransactionModule.LoginPage;
import AllPagesOfTransactionModule.OpeningBalancePage;
import VAT_BasePackage.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningBalanceTestCase extends BaseClass {

	HomePageOfVat homepage;
	OpeningBalancePage openingbalance;
	
	@BeforeMethod
    public void BrowserSetUp() throws InterruptedException { 
  	System.setProperty("webdriver.http.factory", "jdk-http-client");
  	loadPropertiesFileOfVAT();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(propForVat.getProperty("url"));
		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(propForVat.getProperty("validUsername"),
				propForVat.getProperty("validPassword"));
	    homepage = new HomePageOfVat(driver);
	    Thread.sleep(1500);
		openingbalance = homepage.HomePageToNavigateOpeningBalance();
    }
    
	  @AfterMethod	
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
		}
	  
	  //-> Add Page of Opening Balance
	  @Test(priority = 0)
	  public void VerifyOpeningBalanceADDButton() throws InterruptedException {
		 Thread.sleep(1500);
		 openingbalance.OpeningBalanceAddButton(); 
		 Assert.assertEquals(openingbalance.ValidedOpeningBalanceADDButton(),
				 DataPropForVat.getProperty("OpeningBalanceADDButtonVerification"), "Wrong Page");
		  
	  }
	  
	  @Test(priority = 1)
	  public void VerifyOpeningBalanceCancelButton() throws InterruptedException {
		  Thread.sleep(1000);
		  openingbalance.OpeningBalanceAddButton();
		  Thread.sleep(1000);
		  openingbalance.OpeningBalanceCancelButton();
		  Thread.sleep(1000);
		  Assert.assertEquals(openingbalance.HomepageVerifyByNavigateToOpeningBalanace(),
				  DataPropForVat.getProperty("HomePageNavigateToOpeningBalanaceVerfiy"), "Wrong Page");	  	  
	  }
	  
	  @Test(priority = 2)
	  public void VerifyNewOpeningBalanceItemInfoAddBtnWithEmptyRequiredField() throws InterruptedException {
		     Thread.sleep(1500);
			 openingbalance.OpeningBalanceAddButton();
			 Thread.sleep(1500);
			 openingbalance.OpeningBalanceItemInfoAddIconBtn();
			 Assert.assertTrue(openingbalance.WarningMessageForOpeningBalanceItemInfoAddButtonClickedWithoutFillUpRequiredField(), 
					 "Wrong Page");
	  }
	  
	  @Test(priority = 3)
	  public void VerifyNewOpeningBalanceItemInfoAddIconBtnWithFillingRequiredField() throws InterruptedException {
		     Thread.sleep(1500);
			 openingbalance.OpeningBalanceAddButton();
			 openingbalance.FillUpItemInfoFieldForDisplayingItemData(DataPropForVat.getProperty("ItemName"),
					 DataPropForVat.getProperty("QuantityOfItem"),
					 DataPropForVat.getProperty("UnitPriceOfItem"));
			 Assert.assertEquals(openingbalance.SaveButtonAppearanceValidation(),
					 DataPropForVat.getProperty("VerifySaveBtnIsDisplayed"),"Button is not Display");
	  }
	  
	  @Test(priority = 4)
	  public void VerifyNewOpeningBalanceItemInfoAddIconBtnWithFillingRequiredFieldAndSaveThatInfo() throws InterruptedException {
		     Thread.sleep(1500);
			 openingbalance.OpeningBalanceAddButton();
			 openingbalance.FillUpItemInfoFieldForDisplayingItemDataWithSavingInfo(DataPropForVat.getProperty("ItemName"),
					 DataPropForVat.getProperty("QuantityOfItem"),
					 DataPropForVat.getProperty("UnitPriceOfItem"));
			 Assert.assertEquals(openingbalance.VerifyCorrectTotalAmountIsDisplayedAfterSaving(), 
					 DataPropForVat.getProperty("VerifyTotalAmntIsCorrect"),
					 "Correct Amount is not Saved");
	  }
	  
	  @Test(priority = 5)
	  public void VerifyNewOpeningBalanceItemInfoAddIconBtnWithFillingRequiredFieldAndCancelThatInfo() throws InterruptedException {
		     Thread.sleep(1500);
			 openingbalance.OpeningBalanceAddButton();
			 openingbalance.ItemInfoFieldForCancelingData(DataPropForVat.getProperty("ItemName"),
					 DataPropForVat.getProperty("QuantityOfItem"),
					 DataPropForVat.getProperty("UnitPriceOfItem"));
			 Thread.sleep(2000);
			 Assert.assertEquals(openingbalance.HomepageVerifyByNavigateToOpeningBalanace(), 
					 DataPropForVat.getProperty("HomePageNavigateToOpeningBalanaceVerfiy"),
					 "Data is not Saved in the accurate page");
	  }
	  
	  @Test(priority = 6)
	  public void CheckDetailsOfAnItemInfo() throws InterruptedException {
		  Thread.sleep(1500);
		  openingbalance.CheckDetailsOfAnItem(DataPropForVat.getProperty
				  ("InputDataRangeValueInSearchField"));
		  Thread.sleep(1500);
		  Assert.assertTrue(openingbalance.DetailsCheckedValidation(),"Details can't Checked");
	  }
	  
	  @Test(priority = 7)
	  public void SavingDataWithOBPCurrentDate() throws InterruptedException {
		  Thread.sleep(1500);
		  openingbalance.OpeningBalanceAddButton();
		  openingbalance.SavingDataWithCurrentOBPDate(DataPropForVat.getProperty("ItemName"),
					 DataPropForVat.getProperty("QuantityOfItem"),
					 DataPropForVat.getProperty("UnitPriceOfItem"));
	  }
	  
	  @Test(priority = 8)
	  public void validedEditButtonForAnItem() throws InterruptedException {
		  Thread.sleep(1500);
		  openingbalance.OpeningBalanceAddButton();
		  openingbalance.SavingDataWithCurrentOBPDate(DataPropForVat.getProperty("ItemName"),
					 DataPropForVat.getProperty("QuantityOfItem"),
					 DataPropForVat.getProperty("UnitPriceOfItem"));
		  openingbalance.ValidedEditButton(DataPropForVat.getProperty("InputTodayInDateSearchField"));
	  }
	  
	  @Test(priority = 9)
	  public void OBPValueUpdateValidationInEditForm() throws InterruptedException {
		  Thread.sleep(1500);
		  openingbalance.OpeningBalanceAddButton();
		  openingbalance.OBPEditPage(DataPropForVat.getProperty("ItemName"),
					 DataPropForVat.getProperty("QuantityOfItem"),
					 DataPropForVat.getProperty("UnitPriceOfItem"),
					 DataPropForVat.getProperty("InputTodayInDateSearchField"));	  
	  }
	  
	  @Test(priority = 10)
	  public void ValidedSearchFieldOfOBP() throws InterruptedException {
		  openingbalance.SearchFieldFunctionality(DataPropForVat.getProperty("InputThisYearInDateSearchField"), 
				  DataPropForVat.getProperty("SearchingValue"));
		  Assert.assertEquals(openingbalance.DisplayedSearchingValue(),
				  DataPropForVat.getProperty("SearchingValue"), "Searching Value is not Correct");
	  }
	  
	  @Test(priority = 11)
	  public void VerifySearchedInfoEditing() throws InterruptedException {
		  openingbalance.SearchFieldFunctionality(DataPropForVat.getProperty("InputThisYearInDateSearchField"), 
				  DataPropForVat.getProperty("SearchingValue"));
		  openingbalance.SearchingDataEditing(); 
		  Assert.assertEquals(openingbalance.DisplayedSearchingValue(),
				  DataPropForVat.getProperty("SearchingValue"), "Searching Value is not Correct");
	  } 
	  
}
