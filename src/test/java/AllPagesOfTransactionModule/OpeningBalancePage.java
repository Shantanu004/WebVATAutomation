package AllPagesOfTransactionModule;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OpeningBalancePage {

	WebDriver driver;
	
	//Dashboard of Opening Balance
	@FindBy(id = "R1652421624868264186_heading")
	private WebElement VerifyHomePageSuccessfullyNavigateToOpeningBalance;
	
	@FindBy(id = "btn_add")
	private WebElement AddOpeningBalance;
	
	@FindBy(id = "openblance_heading")
	private WebElement VerifyAddOpeningBalanceButton;
	
	@FindBy(id = "btn_cancel")
	private WebElement CancelOpeningBalance;
	
	@FindBy(id="select2-P25_ITEM_ID-container")
	private WebElement SelectItemNameBtn;
	
	@FindBy(xpath="//input[@role='textbox']")
	private WebElement ItemSearchBox;
	
	@FindBy(id = "P25_QUANTITY")
	private WebElement QuantityValue;
	
	@FindBy(id = "P25_UNIT_PRICE")
	private WebElement UnitPriceValue;
	
	@FindBy(id = "P25_TOTAL_AMT")
	private WebElement TotalAmountVisible;
	
	@FindBy(id = "btn_create")
	private WebElement SaveBtnIsAppeared;
	
	@FindBy(xpath = "(//span[contains(text(),'1000')])[2]")
	private WebElement LocatorOfTotalAmountIsDisplayed;
	
	@FindBy(xpath = "//a[@id='add_coll']")
	private WebElement OpeningBalanceItmInfoAddIconBtn;
	
	@FindBy(xpath = "//p[@class='alertify-message']")
	private WebElement AlertMessage;
	
	@FindBy(id = "select2-P25_DATE-container")
	private WebElement ClickOnDateRange;
	
	@FindBy(className = "select2-search__field")
	private WebElement SearchDateRange;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement ClickOnFromDate;
	
	@FindBy(linkText = "1")
	private WebElement SelectFromDatevalue;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement LocatorOFDetailsCheckButton;
	
	@FindBy(xpath = "(//span[contains(text(),'Total :')])[1]")
	private WebElement DetailsCheckConfirmation;
	
	@FindBy(id = "P25_INV_DATE")
	private WebElement OBPDate;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement EditButton;
	
	@FindBy(xpath = "(//input[@id='checkAll_2'])[1]")
	private WebElement CheckButtonForEdit;
	
	@FindBy(name = "f05")
	private WebElement OBPEditQtyvalue;
	
	@FindBy(name = "f06")
	private WebElement OBPEditUnitPricevalue;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement WarningOkButton;
	
	@FindBy(id = "btn_update1")
	private WebElement OBPUpdatingButton;
	
	@FindBy(id = "P25_SEARCH")
	private WebElement SearchingField;
	
	@FindBy(xpath = "//td[normalize-space()='OP01230700918']")
	private WebElement DisplayedSearchedValueResult;
	
	public OpeningBalancePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String HomepageVerifyByNavigateToOpeningBalanace() {	
		String DisplayVerify = VerifyHomePageSuccessfullyNavigateToOpeningBalance.getText();
		return DisplayVerify;	
	}
	//-> Opening Balance Add Page
	public void OpeningBalanceAddButton() {
		AddOpeningBalance.click();
	}
	
	public String ValidedOpeningBalanceADDButton() {
		String DisplayStatusForADDButton = VerifyAddOpeningBalanceButton.getText();
		return DisplayStatusForADDButton;
	}
	
	public void OpeningBalanceCancelButton() {
		CancelOpeningBalance.click();
	}
	
	public void OpeningBalanceItemInfoAddIconBtn() {
		OpeningBalanceItmInfoAddIconBtn.click();
	}
	
	public void ClickOnSaveButtonOfItemInfo() {
		SaveBtnIsAppeared.click();
	}
	
	public String SaveButtonAppearanceValidation() {
		String DisplaySaveButton = SaveBtnIsAppeared.getText();
		return DisplaySaveButton;
	}
	
	public OpeningBalancePage FillUpItemInfoFieldForDisplayingItemData(String itemName, String qtyvalue, String UnitPrice) throws InterruptedException {
    	SelectItemNameBtn.click();
		Thread.sleep(2000);
		ItemSearchBox.sendKeys(itemName + Keys.ENTER);
		Thread.sleep(2000);
		QuantityValue.sendKeys(qtyvalue);
		Thread.sleep(2000);
		UnitPriceValue.sendKeys(UnitPrice);
		OpeningBalanceItmInfoAddIconBtn.click();
		Thread.sleep(2000);
		SaveButtonAppearanceValidation();
		Thread.sleep(2000);
		return new OpeningBalancePage(driver);	
	}
	
	public String VerifyCorrectTotalAmountIsDisplayedAfterSaving() {
		String DisplaySaveButton = LocatorOfTotalAmountIsDisplayed.getText();
		return DisplaySaveButton;
	}
   public OpeningBalancePage FillUpItemInfoFieldForDisplayingItemDataWithSavingInfo(String itemName, String qtyvalue, String UnitPrice) throws InterruptedException {
    	SelectItemNameBtn.click();
		Thread.sleep(2000);
		ItemSearchBox.sendKeys(itemName + Keys.ENTER);
		Thread.sleep(2000);
		QuantityValue.sendKeys(qtyvalue);
		Thread.sleep(2000);
		UnitPriceValue.sendKeys(UnitPrice);
		OpeningBalanceItmInfoAddIconBtn.click();
		Thread.sleep(2000);
		ClickOnSaveButtonOfItemInfo();
		Thread.sleep(2000);
		LocatorOFDetailsCheckButton.click();
		Thread.sleep(2000);
		VerifyCorrectTotalAmountIsDisplayedAfterSaving();
		return new OpeningBalancePage(driver);	
	}
	
	public OpeningBalancePage ItemInfoFieldForCancelingData(String itemName, String qtyvalue, String UnitPrice) throws InterruptedException {
		SelectItemNameBtn.click();
		Thread.sleep(1500);
		ItemSearchBox.sendKeys(itemName + Keys.ENTER);
		QuantityValue.sendKeys(qtyvalue);
		UnitPriceValue.sendKeys(UnitPrice);
		OpeningBalanceItmInfoAddIconBtn.click();
		CancelOpeningBalance.click();
		return new OpeningBalancePage(driver);	
	}
	
	public OpeningBalancePage CheckDetailsOfAnItem(String dateRangeValue) throws InterruptedException {
		ClickOnDateRange.click();
		Thread.sleep(1500);
		SearchDateRange.sendKeys(dateRangeValue + Keys.ENTER);
		Thread.sleep(1500);
		ClickOnFromDate.click();
		Thread.sleep(1500);
		SelectFromDatevalue.click();
		Thread.sleep(1500);
		LocatorOFDetailsCheckButton.click();
		return new OpeningBalancePage(driver);
	}
	
	public OpeningBalancePage SavingDataWithCurrentOBPDate(String itemName, String qtyvalue, String UnitPrice) throws InterruptedException {
		OBPDate.clear();
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
	    OBPDate.sendKeys(formattedDate);
	    SelectItemNameBtn.click();
		Thread.sleep(2000);
		ItemSearchBox.sendKeys(itemName + Keys.ENTER);
		QuantityValue.sendKeys(qtyvalue);
		UnitPriceValue.sendKeys(UnitPrice);
		OpeningBalanceItmInfoAddIconBtn.click();
		Thread.sleep(2000);
		SaveBtnIsAppeared.click();
		Thread.sleep(2000);
		return new OpeningBalancePage(driver);
	}
	
	public OpeningBalancePage ValidedEditButton(String todayDateValue) throws InterruptedException {
		ClickOnDateRange.click();
		Thread.sleep(1500);
		SearchDateRange.sendKeys(todayDateValue + Keys.ENTER);
		EditButton.click();
		return new OpeningBalancePage(driver);
	}
	
	public OpeningBalancePage OBPEditPage(String itemName, String qtyvalue, String UnitPrice,String todayDateValue) throws InterruptedException {
		OBPDate.clear();
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
	    OBPDate.sendKeys(formattedDate);
	    SelectItemNameBtn.click();
		Thread.sleep(2000);
		ItemSearchBox.sendKeys(itemName + Keys.ENTER);
		Thread.sleep(2000);
		QuantityValue.sendKeys(qtyvalue);
		Thread.sleep(2000);
		UnitPriceValue.sendKeys(UnitPrice);
		OpeningBalanceItmInfoAddIconBtn.click();
		Thread.sleep(2000);
		SaveBtnIsAppeared.click();
		Thread.sleep(2000);
		ClickOnDateRange.click();
		Thread.sleep(1500);
		SearchDateRange.sendKeys(todayDateValue + Keys.ENTER);
		EditButton.click();
		CheckButtonForEdit.click();
		OBPEditQtyvalue.clear();
		Thread.sleep(2000);
		//WarningOkButton.click();
		OBPEditQtyvalue.sendKeys("40");
		OBPUpdatingButton.click();
		return new OpeningBalancePage(driver);
	}
	
	public OpeningBalancePage SearchFieldFunctionality(String thisYearDateRangeValue, String SearchedValue) throws InterruptedException {
		ClickOnDateRange.click();
		Thread.sleep(5000);
		SearchDateRange.sendKeys(thisYearDateRangeValue + Keys.ENTER);
		SearchingField.sendKeys(SearchedValue);
		Thread.sleep(5000);
		return new OpeningBalancePage(driver);
	}
	
	public OpeningBalancePage SearchingDataEditing() throws InterruptedException {
		EditButton.click();
		CheckButtonForEdit.click();
		OBPEditQtyvalue.clear();
		//WarningOkButton.click();
		OBPEditQtyvalue.sendKeys("30");
		OBPUpdatingButton.click();
		return new OpeningBalancePage(driver);
	}
	
	public String DisplayedSearchingValue() {
		String DisplaySearchingValue = DisplayedSearchedValueResult.getText();
		return DisplaySearchingValue;
	}
	
	
//	public String WarningMessageForOpeningBalanceItemInfoAddButtonClickedWithoutFillUpRequiredField() {
//		String DisplayWarningMessage= AlertMessage.getText();
//		return DisplayWarningMessage;
//	}
	
	public boolean WarningMessageForOpeningBalanceItemInfoAddButtonClickedWithoutFillUpRequiredField() {
          return AlertMessage.isDisplayed();
	}
	
	public boolean DetailsCheckedValidation() {
		return DetailsCheckConfirmation.isDisplayed();
	}
	
	
}
