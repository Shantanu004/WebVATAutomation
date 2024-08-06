package AllPagesOfTransactionModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseReturnPage {

	WebDriver driver;
	
	//-->DashBoard Locator
	@FindBy(xpath = "//h2[@id='perretrt_heading']")
	private WebElement LocatorOfPurchaseReturnHeadingName;
	
	@FindBy(id = "btn_add")
	private WebElement LocatorOfPurchaseReturnAddBtn;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-eye')])[1]")
	private WebElement LocatorOfReportDetailsBtn;
	
	@FindBy(xpath = "(//td)[18]")
	private WebElement ItemOneTotalAmtValue;
	
	@FindBy(xpath = "(//td)[28]")
	private WebElement ItemTwoTotalAmtValue;
	
	@FindBy(xpath = "(//td)[38]")
	private WebElement TotalAmtValue;
	
	@FindBy(id = "select2-P164_RETURN_DATE1-container")
	private WebElement LocatorOfDateDurationDropDownBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement LocatorOfDateDurationSearchBox;
	
	@FindBy(id = "P164_FROM_DATE")
	private WebElement FromDateField;
	
	@FindBy(id = "P164_TO_DATE")
	private WebElement ToDateField;
	
	@FindBy(id = "P164_SEARCH")
	private WebElement LocatorOfItemSearchField;
	
	@FindBy(xpath = "//h4[contains(text(),'(No Data Found.)')]")
	private WebElement LocatorOfTextForNonExistngItemWhileSearch;
	
	@FindBy(xpath = "(//td)[77]")
	private WebElement LocatorOfCalculatedplace;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement LocatorOfSearchingItemReportBtn;
	
	@FindBy(xpath = "//tbody[1]/tr[1]/td[1]")
	private WebElement LocatorOfTotalAmtValuePlace;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement LocatorOfEditButtonOfAnItem;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[2]")
	private WebElement EditButtonOfSecondItem;
	
	@FindBy(xpath = "//td[normalize-space()='New QA Raw Materials 6']")
    private WebElement EditedItemTextValue;
	
	@FindBy(xpath = "(//td)[35]")
	private WebElement EditedReturnQtyValue;
	
	@FindBy(xpath ="//td[normalize-space()='New QA Raw Material 2']")
	private WebElement LocatorOfDeletedItem;
	
	@FindBy(xpath = "(//span[@class='fa fa-print'])[1]")
	private WebElement FilePrintButton;
	
	//-->ADD Page Locator
	@FindBy(id = "select2-P164_SUPPLIER_NAME-container")
	private WebElement LocatorOFSupplierNameDropDownBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement LocatorOfSupplierNameSearchBox;
	
	@FindBy(id = "select2-P164_RCVMST_ID-container")
	private WebElement LocatorOfChallanNumberDropDownBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement LocatorOfChallanNumberSearchBox;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement SupplierNameClearBtn;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[4]")
	private WebElement ChallanNumberClearBtn;
	
	@FindBy(id = "P164_RETURN_DATE")
	private WebElement TimeAndDateOfIssueField;
	
	@FindBy(id = "select2-P164_ITEM_NAME-container")
	private WebElement LocatorOfPurchaseReturnItemNameDropDownbtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement LocatorOfPurchaseReturnItemNameSearchBox;
	
	@FindBy(id = "P164_RETURN_QTY")
	private WebElement LocatorOfPurchaseReturnQuantityValue;
	
	@FindBy(id = "add_coll")
	private WebElement LocatorOfPurchaseReturnItemAddIcon;
	
	@FindBy(css = "tbody tr td:nth-child(1)")
	private WebElement FirstItemTextValueInAddPage;
	
	@FindBy(xpath = "(//span[@class='fa fa-trash'])[1]")
	private WebElement FirstItemDeleteBtn;
	
	@FindBy(id = "btn_create")
	private WebElement LocatorOfPurchaseRetrunItemSaveBtn;
	
	@FindBy(className = "alertify-message")
	private WebElement RequiredFieldWarningMsg;
	
	@FindBy(id = "alertify-ok")
	private WebElement ItemDeleteOkBtnInAddPage;
	
	@FindBy(id = "alertify-cancel")
	private WebElement ItemDeleteCancelBtnInAddPage;
	
	@FindBy(xpath = "(//span[contains(text(),'(No Data Found.)')])[1]")
	private WebElement DisplayMsgForEmptyItemInAddPage;
	
	//Edit Page Locator
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[4]")
	private WebElement ChallanNumberClearBtnInEditPage;
	
	@FindBy(id = "P164_RETURN_DATE")
	private WebElement LocatorOfTimeAndDateIssue;
	
	@FindBy(id = "btn_update1")
	private WebElement LocatorOfUpdateBtn;
	
	@FindBy(className = "alertify-message")
	private WebElement LocatorOfRequiredFieldDisplayMessage;
	
	@FindBy(xpath = "(//span[@class='fa fa-pencil-square-o'])[1]")
	private WebElement LocatorOfItemValueEditBtn;
	
	@FindBy(id = "P164_RETURN_QTY")
	private WebElement LocatorOfItemsQtyField;
	
	@FindBy(id = "upd_coll")
	private WebElement LocatorOfItemAddBtn;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-eye')])[1]")
	private WebElement LocatorOfReportEyeBtn;
	
	@FindBy(xpath = "(//span[normalize-space()='73'])[1]")
	private WebElement LocatorOfCalculatedvalue;
	
	@FindBy(xpath = "(//td)[31]")
	private WebElement LocatorOfTotalTextField;
	
	@FindBy(xpath = "//span[contains(text(),'(No Data Found.)')]")
	private WebElement LocatorOfTextMsgForNoItem;
	
	@FindBy(xpath = "(//span[@class='fa fa-trash'])[1]")
	private WebElement LocatorOfDeleteAnItemFromEditPage;
	
	@FindBy(xpath = "//tbody/tr[2]/td[9]")
	private WebElement LocatorOfTotalAmtValuePlaceBox;
	
	@FindBy(id = "btn_cancel")
	private WebElement LocatorOfCancelBtnInEditPage;
	
	@FindBy(xpath = "(//td)[28]")
	private WebElement LocatorOfTotalAmtPlaceBox;
	
	@FindBy(xpath = "(//span[contains(text(),'20')])[4]")
	private WebElement LocatorOfTotalAmtValue;
	
	@FindBy(id = "alertify-ok")
	private WebElement LocatorOfItemDeleteConfirm;
	
	@FindBy(xpath = "//span[@class='fa fa-pencil-square-o']")
	private WebElement LocatorOfEditIconBtnInPurchaseReturnAddForm;
	
	@FindBy(id = "upd_coll")
	private WebElement LocatorOfAddItemOfPurchaseReturnForm;
	
	@FindBy(xpath = "(//td[contains(@class,'u-tC')])[7]")
	private WebElement LocatorOfTotalAmountFieldAfterExchangeItemName;
	
	@FindBy(id = "add_coll")
	private WebElement AddItemInEditPage;
	
	
	public PurchaseReturnPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyNavigateToPurchaseReturnPage() {
		return LocatorOfPurchaseReturnHeadingName.getText();
	}
	
	public void PurchaseReturnAddBtn() {
		LocatorOfPurchaseReturnAddBtn.click();
	}
	
	//-->Add Page Info
	public void PurchaseReturnItemInfoForSaving(String supplierName, String challanNumber, 
			String itemName1, String itemName2, String QtyValue) throws InterruptedException {
		Thread.sleep(1000);
		PurchaseReturnAddBtn();
		Thread.sleep(1000);
		LocatorOFSupplierNameDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfSupplierNameSearchBox.sendKeys(supplierName + Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfChallanNumberSearchBox.sendKeys(challanNumber +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys(itemName1 +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnQuantityValue.sendKeys(QtyValue);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys(itemName2 +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnQuantityValue.sendKeys(QtyValue);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();
		Thread.sleep(1000);
		LocatorOfPurchaseRetrunItemSaveBtn.click();
		Thread.sleep(1000);
		LocatorOfReportDetailsBtn.click();
		Thread.sleep(1000);
		//LocatorOfCalculatedplace.isDisplayed();	
	}
	
	public Boolean TotalAmtOfFirstItem() {
		return ItemOneTotalAmtValue.isDisplayed();
	}
	
	public Boolean TotalAmtOfSecondItem() {
		return ItemTwoTotalAmtValue.isDisplayed();
	} 
	
	public void functionalityForFillingUpInfoInAddPage() throws InterruptedException {
		Thread.sleep(1000);
		PurchaseReturnAddBtn();
		Thread.sleep(1000);
		LocatorOFSupplierNameDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfSupplierNameSearchBox.sendKeys("New QA Supplier" + Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfChallanNumberSearchBox.sendKeys("NewChallan7182023" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys("New QA Raw Material 2" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnQuantityValue.sendKeys("2");
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys("New QA Raw Material 3" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnQuantityValue.sendKeys("2");
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();
	}
	
	public PurchaseReturnPage functionalityForChallanNumberRequiredFieldInAddPage() throws InterruptedException {
		functionalityForFillingUpInfoInAddPage();
		Thread.sleep(1000);
		ChallanNumberClearBtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseRetrunItemSaveBtn.click();
		return new PurchaseReturnPage(driver);
	}
	
	public PurchaseReturnPage functionalityForSupplierNameRequiredFieldInAddPage() throws InterruptedException {
		functionalityForFillingUpInfoInAddPage();
		Thread.sleep(1000);
		SupplierNameClearBtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseRetrunItemSaveBtn.click();
		return new PurchaseReturnPage(driver);
	}
	
	public PurchaseReturnPage functionalityForTimeAndDateOfIssueRequiredFieldInAddPage() throws InterruptedException {
		functionalityForFillingUpInfoInAddPage();
		Thread.sleep(1000);
		TimeAndDateOfIssueField.clear();
		Thread.sleep(1000);
		LocatorOfPurchaseRetrunItemSaveBtn.click();
		return new PurchaseReturnPage(driver);
	}
	
	public String DisplayWarningMsgOfRequiredField(){
		return RequiredFieldWarningMsg.getText();
	}
	
	public PurchaseReturnPage functionalityForDeletingItemFromAddPage() throws InterruptedException {
		LocatorOfPurchaseReturnAddBtn.click();
		Thread.sleep(1000);
		LocatorOFSupplierNameDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfSupplierNameSearchBox.sendKeys("New QA Supplier" + Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfChallanNumberSearchBox.sendKeys("NewChallan7182023" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys("New QA Raw Material 2" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnQuantityValue.sendKeys("2");
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();
		Thread.sleep(1000);
		FirstItemDeleteBtn.click();
		Thread.sleep(1000);
		ItemDeleteOkBtnInAddPage.click();
		return new PurchaseReturnPage(driver);
	}
	
	public String DisplayMsgWhenEmptyItemInAddPage() {
		return DisplayMsgForEmptyItemInAddPage.getText();
	} 
	
	public PurchaseReturnPage functionalityForNotDeletingItemFromAddPage() throws InterruptedException {
		LocatorOfPurchaseReturnAddBtn.click();
		Thread.sleep(1000);
		LocatorOFSupplierNameDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfSupplierNameSearchBox.sendKeys("New QA Supplier" + Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfChallanNumberSearchBox.sendKeys("NewChallan7182023" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys("New QA Raw Material 2" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnQuantityValue.sendKeys("2");
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();
		Thread.sleep(1000);
		FirstItemDeleteBtn.click();
		Thread.sleep(1000);
		ItemDeleteCancelBtnInAddPage.click();
		return new PurchaseReturnPage(driver);
	}
	
	public String DisplayFirstItemTextValueInAddPage() {
		return FirstItemTextValueInAddPage.getText();
	}
	
	public void FunctionalityOfPurchaseReturnAddformOfChangingItemNameByFixingQualityValue(
			String supplierName, String challanNumber,String itemName1,String QtyValue,String itemName2) throws InterruptedException {
		PurchaseReturnAddBtn();
		Thread.sleep(1000);
		LocatorOFSupplierNameDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfSupplierNameSearchBox.sendKeys(supplierName + Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfChallanNumberSearchBox.sendKeys(challanNumber +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys(itemName1 +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnQuantityValue.sendKeys(QtyValue);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();
		Thread.sleep(1000);
		LocatorOfEditIconBtnInPurchaseReturnAddForm.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
//		Thread.sleep(2000);
//		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys(itemName2 +Keys.ENTER);
//		Thread.sleep(3000);
//		LocatorOfAddItemOfPurchaseReturnForm.click();
		
	}
	
	public Boolean CheckItemNameDropDownButtonIsEnableOrDisable() {
		return LocatorOfPurchaseReturnItemNameDropDownbtn.isSelected();
	}
	
	//-->Dashboard Info 
	public void functionInfoForExistingItemSearch() throws InterruptedException {
		Thread.sleep(1000);
		LocatorOfDateDurationDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfDateDurationSearchBox.sendKeys("Date Range" + Keys.ENTER);
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2023" +Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfItemSearchField.sendKeys("116");
		Thread.sleep(3000);
		LocatorOfSearchingItemReportBtn.click();
		Thread.sleep(1000);
		LocatorOfTotalAmtValuePlace.isDisplayed();	
	}
	
	public String PurchaseReturnTotalCalculatedValueInDashBoard() {
		String DisplayCalculatedValue = TotalAmtValue.getText();
		return DisplayCalculatedValue;
	}
	
	public void functionInfoForNonExistingItemSearch() throws InterruptedException {
		Thread.sleep(2000);
		LocatorOfDateDurationDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfDateDurationSearchBox.sendKeys("This Year" + Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfItemSearchField.sendKeys("87586945789");
		Thread.sleep(2000);
	}
	
	public String DisplayTextForNonExistingValue() {
		String DisplayTextValueForNonExistingItem = LocatorOfTextForNonExistngItemWhileSearch.getText();
		return DisplayTextValueForNonExistingItem;
	}
	
	public void functionalityForverifyItemNameRequiredFieldInAddPage(String supplierName, 
			String challanNumber) throws InterruptedException {
		Thread.sleep(2000);
		PurchaseReturnAddBtn();
		Thread.sleep(2000);
		LocatorOFSupplierNameDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfSupplierNameSearchBox.sendKeys(supplierName + Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfChallanNumberSearchBox.sendKeys(challanNumber +Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfItemsQtyField.sendKeys("1");
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();		
	}
	
	public void functionalityForverifyQuantityRequiredFieldInAddPage() throws InterruptedException {
		Thread.sleep(2000);
		PurchaseReturnAddBtn();
		Thread.sleep(2000);
		LocatorOFSupplierNameDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfSupplierNameSearchBox.sendKeys("New QA Supplier" + Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfChallanNumberSearchBox.sendKeys("NewChallan71820230" +Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys("New QA Raw Materials 6"+Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemAddIcon.click();		
	}
	
	
	//-->Edit Page Info
	public void functionalityForVerifyTimeAndDateIssueRequiredFieldInEditPage() throws InterruptedException {
		Thread.sleep(2000);
		LocatorOfDateDurationDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfDateDurationSearchBox.sendKeys("This Year" + Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfEditButtonOfAnItem.click();
		Thread.sleep(2000);
		LocatorOfTimeAndDateIssue.clear();
		Thread.sleep(2000);
		LocatorOfUpdateBtn.click();		
	}
	
	public void functionalityForVerifyChallanNumberRequiredFieldInEditPage() throws InterruptedException {
		Thread.sleep(2000);
		LocatorOfDateDurationDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfDateDurationSearchBox.sendKeys("This Year" + Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfEditButtonOfAnItem.click();
		Thread.sleep(2000);
		ChallanNumberClearBtnInEditPage.click();
		Thread.sleep(2000);
		LocatorOfUpdateBtn.click();		
	}
	
	
	public String DisplayTextForRequiredField() {
		String DisplayTextWarningMessage = LocatorOfRequiredFieldDisplayMessage.getText();
		return DisplayTextWarningMessage;
	}
	
	public void FunctionalityForEditingAndSavingInfoInEditPage() throws InterruptedException {
		functionalityForFillingUpInfoInAddPage();
		Thread.sleep(1000);
		LocatorOfPurchaseRetrunItemSaveBtn.click();
		Thread.sleep(1000);
		LocatorOfDateDurationDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfDateDurationSearchBox.sendKeys("Today" + Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfEditButtonOfAnItem.click();
		Thread.sleep(1000);
		//EditButtonOfSecondItem.click();
		Thread.sleep(1000);
		ChallanNumberClearBtnInEditPage.click();
//		Thread.sleep(1000);
//		LocatorOfChallanNumberDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfChallanNumberSearchBox.sendKeys("NewChallan71820230"+Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameDropDownbtn.click();
		Thread.sleep(1000);
		LocatorOfPurchaseReturnItemNameSearchBox.sendKeys("New QA Raw Materials 6"+Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfItemsQtyField.sendKeys("1");
		Thread.sleep(1000);
		AddItemInEditPage.click();
		Thread.sleep(1000);
		LocatorOfUpdateBtn.click();	
		Thread.sleep(1000);
		LocatorOfDateDurationDropDownBtn.click();
		Thread.sleep(1000);
		LocatorOfDateDurationSearchBox.sendKeys("Today" + Keys.ENTER);
		Thread.sleep(1000);
		LocatorOfReportEyeBtn.click();
		Thread.sleep(1000);
		LocatorOfTotalTextField.isDisplayed();
	}
	
	public String DisplayEditedItemNameTextValue() {
		return EditedItemTextValue.getText();
	}
	
	public String DisplayEditedReturnQtyValue() {
		return EditedReturnQtyValue.getText();
	}
	
	public String DisplayForTotalTextValue() {
		String DisplayTextForTotalValue = LocatorOfTotalTextField.getText();
		return DisplayTextForTotalValue;
	}
	
	public String DisplayForNoItemTextValue() {
		String DisplayTextMsgForEmptyItem = LocatorOfTextMsgForNoItem.getText();
		return DisplayTextMsgForEmptyItem;
	}
	
	public void LocatorsOfUpToPurchaseReturnOfAnItemEditPage() throws InterruptedException {
		Thread.sleep(2000);
		LocatorOfDateDurationDropDownBtn.click();
		Thread.sleep(2000);
		LocatorOfDateDurationSearchBox.sendKeys("This Year" + Keys.ENTER);
		Thread.sleep(2000);
		LocatorOfEditButtonOfAnItem.click();
	}
	
	public void FunctionalityOfDeleteAnItemFromEditPageOfAnItemWithOutSaving() throws InterruptedException {
		LocatorsOfUpToPurchaseReturnOfAnItemEditPage();
		Thread.sleep(2000);
		LocatorOfDeleteAnItemFromEditPage.click();
		Thread.sleep(2000);
		LocatorOfItemDeleteConfirm.click();
		Thread.sleep(2000);
		LocatorOfCancelBtnInEditPage.click();
		Thread.sleep(2000);
		LocatorOfReportEyeBtn.click();
		Thread.sleep(2000);
		//LocatorOfTotalAmtValuePlaceBox.isDisplayed();	
	}
	
	public void FunctionalityOfDeleteAnItemFromEditPageOfAnItemWithSaving() throws InterruptedException {
		LocatorsOfUpToPurchaseReturnOfAnItemEditPage();
		Thread.sleep(2000);
		LocatorOfDeleteAnItemFromEditPage.click();
		Thread.sleep(2000);
		LocatorOfItemDeleteConfirm.click();
		Thread.sleep(2000);
		LocatorOfUpdateBtn.click();
		Thread.sleep(2000);
		LocatorOfReportEyeBtn.click();
		Thread.sleep(2000);
		//LocatorOfTotalAmtValuePlaceBox.isDisplayed();	
	}
	
	public Boolean ConfirmItemIsDeleted() {
		return LocatorOfDeletedItem.isDisplayed();
	}
	
	
	public String DisplayTotalAmtValue() {
		String DisplayTotalAmtTextValueForAnItem = LocatorOfTotalAmtValue.getText();
		return DisplayTotalAmtTextValueForAnItem;
	}
	
	public PurchaseReturnPage functionalityForPurchaseReturnPrintReportFile() throws InterruptedException {
		functionalityForFillingUpInfoInAddPage();
		Thread.sleep(1000);
		LocatorOfPurchaseRetrunItemSaveBtn.click();
		Thread.sleep(2000);
		FilePrintButton.click();
		return new PurchaseReturnPage(driver);
	}
	
	
	
}
