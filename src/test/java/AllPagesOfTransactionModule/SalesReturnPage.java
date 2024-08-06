package AllPagesOfTransactionModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesReturnPage {

	WebDriver driver;
    
	//-> Sales Return ADD Page
	@FindBy(id = "btn_add")
	private WebElement SalesReturnAddBtn;
	
	@FindBy(id = "select2-P320_BUYER_NAME_DISPLAY-container")
	private WebElement BuyerNameFieldBtn; 
	
	@FindBy(className = "select2-search__field")
	private WebElement BuyerNameSearchField;
	
	@FindBy(id = "select2-P320_UD_CHALLAN_NO-container")
	private WebElement ChallanSlFieldBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement ChallanSLSearchField;
	
	@FindBy(id = "P320_RETURN_DATE_input")
	private WebElement ReturnDateField;
	
	@FindBy(id = "select2-P320_ITEM_NAME-container")
	private WebElement ItemNameField;
	
	@FindBy(className = "select2-search__field")
	private WebElement ItemNameSearchField;
	
	@FindBy(id = "P320_QUANTITY")
	private WebElement RtnQty;
	
	@FindBy(id = "add_collection")
	private WebElement AddItemBtn;
	
	@FindBy(xpath = "//span[@class='fa fa-pencil-square-o']")
	private WebElement EditItem;
	
	@FindBy(xpath = "(//span[@class='fa fa-trash'])[1]")
	private WebElement DeleteItemInfo;
	
	@FindBy(id = "alertify-ok")
	private WebElement ItemInfoDltComfirm;
	
	@FindBy(id = "btn_create")
	private WebElement SaveBtn;
	
	@FindBy(xpath = "(//div[@class='col col-1 apex-col-auto'])[1]")
	private WebElement DisableSaveBtn;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[3]")
	private WebElement ClearBuyerName;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[4]")
	private WebElement ClearChallanName;
	
	@FindBy(css = ".alertify-message")
	private WebElement WarningMsgTextValue;
	
	//-> Sales Return History Page
	@FindBy(id = "saleshistory_heading")
	private WebElement SalesReturnHeadingText;
	
	@FindBy(xpath = "//i[@class='fa fa-eye']")
	private WebElement ReportBtn;
	
	@FindBy(css = "tbody tr td:nth-child(14)")
	private WebElement TotalAmtTextValue;
	
	@FindBy(id = "select2-P320_DATE-container")
	private WebElement durationBtn;
	
	@FindBy(id = "P320_FROM_DATE")
	private WebElement FromDateField;
	
	@FindBy(id = "P320_TO_DATE")
	private WebElement ToDateField;
	
	@FindBy(className = "select2-search__field")
	private WebElement DurationSearchField;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement EditIconBtn;
	
	@FindBy(css = "td[headers='RETURN_DATE']")
	private WebElement ReturnDateTextValue;
	
	@FindBy(xpath = "(//td[@class='t-Report-cell'][normalize-space()='New QA Buyer'])[1]")
	private WebElement BuyerNametextValueAfterSaving;
	
	@FindBy(xpath = "(//td[@class='t-Report-cell'][normalize-space()='211555641551'])[1]")
	private WebElement VatRegNoTextValueAfterSaving;
	
	@FindBy(xpath = "(//span[@class='fa fa-print'])[1]")
	private WebElement PrintBtnAfterSaving;
	
	//-> Sales Return Edit Page
	@FindBy(id = "P320_RETURN_DATE_input")
	private WebElement ReturnDateFieldInEditPage;
	
	@FindBy(id = "select2-P320_UD_CHALLAN_NO-container")
	private WebElement ChallanSLinEditPage;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[4]")
	private WebElement ChallanSlClearBtnInEditPg;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[3]")
	private WebElement BuyerNameClrBtnPg;
	
	@FindBy(id = "btn_save")
	private WebElement UpdateBtn;
	
	@FindBy(id = "btn_save")
	private WebElement CancelBtn;
	
	@FindBy(xpath = "(//span[@class='fa fa-trash'])[1]")
	private WebElement ItemDeleteIconBtnInEditPage;
	
	@FindBy(id = "alertify-ok")
	private WebElement ItemDeleteConfirmYesBtn;
	
	
	public SalesReturnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//--> Add page
	public SalesReturnPage functionalityForSavingSalesReturnInfo() throws InterruptedException {
		SalesReturnAddBtn.click();
		Thread.sleep(1500);
		BuyerNameFieldBtn.click();
		Thread.sleep(1500);
		BuyerNameSearchField.sendKeys("New QA Buyer" +Keys.ENTER);
		Thread.sleep(1500);
		ChallanSlFieldBtn.click();
		Thread.sleep(1500);
		ChallanSLSearchField.sendKeys("24/23-24" +Keys.ENTER);
		Thread.sleep(1500);
		ItemNameField.click();
		Thread.sleep(1500);
		ItemNameSearchField.sendKeys("New QA Product 4" +Keys.ENTER);
		Thread.sleep(1500);
		RtnQty.sendKeys("1");
		Thread.sleep(1500);
		AddItemBtn.click();
		Thread.sleep(1500);
		SaveBtn.click();
		return new SalesReturnPage(driver);	
	}
	
	public String DisplayBuyerNameTextvalue() {
		return BuyerNametextValueAfterSaving.getText();
	}
	
	public String DisplayVatRegNoTextValue() {
		return VatRegNoTextValueAfterSaving.getText();
	} 
	
	public String DisplayTextMsgOfHeading() {
		return SalesReturnHeadingText.getText();
	}
	
	public SalesReturnPage functionalityForAfterSavingPDFFile() throws InterruptedException {
		functionalityForSavingSalesReturnInfo();
		Thread.sleep(2000);
		PrintBtnAfterSaving.click();
		return new SalesReturnPage(driver);
	}
	
	public SalesReturnPage funcionalityForRequiredField() throws InterruptedException {
		SalesReturnAddBtn.click();
		Thread.sleep(1500);
		BuyerNameFieldBtn.click();
		Thread.sleep(1500);
		BuyerNameSearchField.sendKeys("New QA Buyer" +Keys.ENTER);
		Thread.sleep(1500);
		ChallanSlFieldBtn.click();
		Thread.sleep(1500);
		ChallanSLSearchField.sendKeys("24/23-24" +Keys.ENTER);
		Thread.sleep(1500);
		ItemNameField.click();
		Thread.sleep(1500);
		ItemNameSearchField.sendKeys("New QA Product 4" +Keys.ENTER);
		Thread.sleep(1500);
		RtnQty.sendKeys("2");
		Thread.sleep(1500);
		AddItemBtn.click();
		Thread.sleep(1500);
		ClearBuyerName.click();
		Thread.sleep(1500);
		BuyerNameFieldBtn.click();
		//Thread.sleep(1500);
		//ClearChallanName.click();
		Thread.sleep(1500);
		SaveBtn.click();
		return new SalesReturnPage(driver);
	}
	
	public SalesReturnPage functionalityForSalesChallanRequiredField() throws InterruptedException {
		SalesReturnAddBtn.click();
		Thread.sleep(1500);
		BuyerNameFieldBtn.click();
		Thread.sleep(1500);
		BuyerNameSearchField.sendKeys("New QA Buyer" +Keys.ENTER);
		Thread.sleep(1500);
		ChallanSlFieldBtn.click();
		Thread.sleep(1500);
		ChallanSLSearchField.sendKeys("24/23-24" +Keys.ENTER);
		Thread.sleep(1500);
		ItemNameField.click();
		Thread.sleep(1500);
		ItemNameSearchField.sendKeys("New QA Product 4" +Keys.ENTER);
		Thread.sleep(1500);
		RtnQty.sendKeys("2");
		Thread.sleep(1500);
		AddItemBtn.click();
		Thread.sleep(1500);
		ClearChallanName.click();
		Thread.sleep(1500);
		SaveBtn.click();
		
		return new SalesReturnPage(driver);
	}
	
	public String displayWarningMsg() {
		return WarningMsgTextValue.getText();
	}
	
	public SalesReturnPage functionalityForReturnDateRequiredField() throws InterruptedException {
		SalesReturnAddBtn.click();
		Thread.sleep(1500);
		BuyerNameFieldBtn.click();
		Thread.sleep(1500);
		BuyerNameSearchField.sendKeys("New QA Buyer" +Keys.ENTER);
		Thread.sleep(1500);
		ChallanSlFieldBtn.click();
		Thread.sleep(1500);
		ChallanSLSearchField.sendKeys("24/23-24" +Keys.ENTER);
		Thread.sleep(1500);
		ItemNameField.click();
		Thread.sleep(1500);
		ItemNameSearchField.sendKeys("New QA Product 4" +Keys.ENTER);
		Thread.sleep(1500);
		RtnQty.sendKeys("2");
		Thread.sleep(1500);
		AddItemBtn.click();
		Thread.sleep(1500);
		ReturnDateField.clear();
		Thread.sleep(1500);
		SaveBtn.click();
		return new SalesReturnPage(driver);
	}
	
	public SalesReturnPage functionalityForSalesRtnItemDelete() throws InterruptedException {
		SalesReturnAddBtn.click();
		Thread.sleep(1500);
		BuyerNameFieldBtn.click();
		Thread.sleep(1500);
		BuyerNameSearchField.sendKeys("New QA Buyer" +Keys.ENTER);
		Thread.sleep(1500);
		ChallanSlFieldBtn.click();
		Thread.sleep(1500);
		ChallanSLSearchField.sendKeys("24/23-24" +Keys.ENTER);
		Thread.sleep(1500);
		ItemNameField.click();
		Thread.sleep(1500);
		ItemNameSearchField.sendKeys("New QA Product 4" +Keys.ENTER);
		Thread.sleep(1500);
		RtnQty.sendKeys("2");
		Thread.sleep(1500);
		AddItemBtn.click();
		Thread.sleep(1500);
		DeleteItemInfo.click();
		Thread.sleep(1500);
		ItemInfoDltComfirm.click();
		
		return new SalesReturnPage(driver);
	}
	
	public Boolean SaveBtnEnableOrDisable() {
		return SaveBtn.isEnabled();
	}
	//-->Edit Page
	public SalesReturnPage functionalityForDateRange() throws InterruptedException {
		Thread.sleep(2000);
		durationBtn.click();
		Thread.sleep(2000);
		DurationSearchField.sendKeys("Date Range" + Keys.ENTER);
		Thread.sleep(2000);
		FromDateField.clear();
		Thread.sleep(2000);
		FromDateField.sendKeys("01-DEC-2023");
		Thread.sleep(2000);
		//ToDateField.clear();
//		Thread.sleep(2000);
//		LocalDate currentDate = LocalDate.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		String formattedDate = currentDate.format(formatter);
//		ToDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		EditIconBtn.click();
		return new SalesReturnPage(driver);
	}
	
	public SalesReturnPage funcationalityForEditPageRequiredField() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		ReturnDateFieldInEditPage.clear();
		Thread.sleep(1500);
		ChallanSlClearBtnInEditPg.click();
		Thread.sleep(1500);
		UpdateBtn.click();
		return new SalesReturnPage(driver);
	}
	
	public SalesReturnPage funcationalityForEditPageReturnDateRequiredField() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		ReturnDateFieldInEditPage.clear();
		Thread.sleep(1500);
		UpdateBtn.click();
		return new SalesReturnPage(driver);
	}
	
	public SalesReturnPage funcationalityForEditPageChallanSLRequiredField() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		ChallanSlClearBtnInEditPg.click();
		Thread.sleep(1500);
		UpdateBtn.click();
		return new SalesReturnPage(driver);
	}
	
	public SalesReturnPage functionalityForUpateBtnInEditPage() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		ItemDeleteIconBtnInEditPage.click();
		Thread.sleep(2000);
		ItemDeleteConfirmYesBtn.click();
		return new SalesReturnPage(driver);
	}
	
	public Boolean UpdateBtnEnableOrDisable() {
		return UpdateBtn.isEnabled();
	}
	
	public SalesReturnPage functionalityForUpdatingDataInEditPage() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		ReturnDateFieldInEditPage.clear();
		Thread.sleep(2000);
//		LocalDate currentDate = LocalDate.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		String formattedDate = currentDate.format(formatter);
		ReturnDateFieldInEditPage.sendKeys("12-DEC-2023");
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
		functionalityForDateRange();
		return new SalesReturnPage(driver);
	}
	
	public String displayReturnTextValue() {
		return ReturnDateTextValue.getText();
	}
	
	
}
