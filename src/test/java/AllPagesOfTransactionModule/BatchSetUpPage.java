package AllPagesOfTransactionModule;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchSetUpPage {

	WebDriver driver;
	
	//--> BatchSetUp Add Page
	
	@FindBy(id = "btn_add")
	private WebElement AddBtn;
	
	@FindBy(id = "batch-setup_heading")
	private WebElement batchSetUpheading;
	
	@FindBy(id="select2-P44_ITEM_ID-container")
	private WebElement itemnameSelectBtn;
	
	@FindBy(xpath = "(//input[@role='textbox'])[1]")
	private WebElement itemSearchfield;
	
	@FindBy(id = "P44_LOT_SIZE")
	private WebElement batchsize;
	
	@FindBy(id = "P44_BATCH_DATE")
	private WebElement batchdate;
	
	@FindBy(className = "a-Switch-toggle")
	private WebElement activeswitchbtn;
	
	@FindBy(id = "btn_create")
	private WebElement batchinfoSaveBtn;
	
	@FindBy(id = "btn_cancel")
	private WebElement batchinfocencelBtn;
	
	@FindBy(css = ".alertify-message")
	private WebElement WarningMsgForRequiredField;
	
	//--> BatchSetup History Page
	@FindBy(id = "select2-P44_DATE-container")
	private WebElement Durationbtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement DurationSearchField;
	
	@FindBy(id = "P44_SEARCH")
	private WebElement batchsetuphistorySearch;
	
	@FindBy(css = "tbody tr td:nth-child(1)")
	private WebElement BatchItemInfoName;
	
	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(2)")
	private WebElement udBatchNo;
	
	@FindBy(xpath = "(//td[contains(text(),'New QA Product 4 ( QA Test)')])[1]")
	private WebElement SearchingbatchItemNameFromHistory;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement batchItemEdit;
	
	@FindBy(id = "P44_FROM_DATE")
	private WebElement fromDateField;
	
	@FindBy(id = "P44_TO_DATE")
	private WebElement ToDateField;
	
	
	//--> BatchSetUp Edit page
	@FindBy(xpath = "(//img)[2]")
	private WebElement batchinfoeditBtn;
	
	@FindBy(id = "btn_up")
	private WebElement batchsetupinfoUpdateBtn;
	
	@FindBy(id = "btn_delete")
	private WebElement batchsetupinfodeleteBtn;
	
	@FindBy(id = "btn_cancel")
	private WebElement batchSetupInfoCancelbtn;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement batchDateChangeEditBtn;
	
	@FindBy(id = "alertify-ok")
	private WebElement batchInfoDeleteConfirmOk;
	
	@FindBy(id = "alertify-cancel")
	private WebElement batchInfoDeleteConfirmNo;
	
	@FindBy(xpath = "//h2[normalize-space()='Successfully Deleted.']")
	private WebElement batchInfoDeleteConfirmMsg;
	
	
	public BatchSetUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//-->Add Page
	public void functionalityForClickAddBtnOfBatchSetupAddForm() {
		AddBtn.click();
	}
	
	public String DisplayBatchSetupAddFormHeading() {
		return batchSetUpheading.getText();	
	}
	
	public void functionalityForBatchSetInfoSaving(String productName, String batchSize) throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		itemnameSelectBtn.click();
		Thread.sleep(1000);
		itemSearchfield.sendKeys(productName + Keys.ENTER);
		Thread.sleep(1000);
		batchsize.sendKeys(batchSize);
		Thread.sleep(1000);
		batchinfoSaveBtn.click();
	}
	
	public String DisplayBatchItemName() {
		return BatchItemInfoName.getText();	
	}
	
	public void functionalityForSavingDataWithoutItemNamefilledUp(String batchSize) throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		itemnameSelectBtn.click();
		Thread.sleep(1000);
		batchsize.sendKeys(batchSize);
		Thread.sleep(1000);
		batchinfoSaveBtn.click();
	}
	
	public void functionalityForSavingDataWithoutBatchSizefilledUp(String productName) throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		itemnameSelectBtn.click();
		Thread.sleep(1000);
		itemSearchfield.sendKeys(productName + Keys.ENTER);
		Thread.sleep(1000);
		batchinfoSaveBtn.click();
	}
	
	public void functionalityForWithoutSavingAllRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		batchinfoSaveBtn.click();
	}
	
	public String DisplayWaringMsgForRequiredField() {
		return WarningMsgForRequiredField.getText();	
	}
	
	public void functionalityForBatchSetInfoSavingForActiveStatusOff(String productName, String batchSize) throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		itemnameSelectBtn.click();
		Thread.sleep(1000);
		itemSearchfield.sendKeys(productName + Keys.ENTER);
		Thread.sleep(1000);
		batchsize.sendKeys(batchSize);
		Thread.sleep(1000);
		activeswitchbtn.click();
		Thread.sleep(1000);
		batchinfoSaveBtn.click();
	}

	public Boolean DisplayUdBatchNoText() {
		return udBatchNo.isDisplayed();
	}
	
	public void functionalityForBatchSetInfoSavingWithoutBatchDateFilledUp(String productName, String batchSize) throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		itemnameSelectBtn.click();
		Thread.sleep(1000);
		itemSearchfield.sendKeys(productName + Keys.ENTER);
		Thread.sleep(1000);
		batchsize.sendKeys(batchSize);
		Thread.sleep(1000);
		batchdate.clear();
		Thread.sleep(1000);
		batchinfoSaveBtn.click();
	}
	
	//--> Dashboard Page
	public void functionalityForSearchingBatchItem() throws InterruptedException {
		Durationbtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range" + Keys.ENTER);
		Thread.sleep(1000);
		fromDateField.clear();
		Thread.sleep(1000);
		fromDateField.sendKeys("01-JAN-2020"+Keys.ENTER);
		Thread.sleep(1000);
		batchsetuphistorySearch.sendKeys("New QA Product 4");
	}
	
	public String DisplaySearchedItemName() {
		return SearchingbatchItemNameFromHistory.getText();
	}
    //--> Update Page
	public void functionalityForUpdatingDataWithOutRequiredField() throws InterruptedException {
		batchItemEdit.click();
		Thread.sleep(1000);
		batchsize.clear();
		Thread.sleep(1000);
		batchdate.clear();
		Thread.sleep(1000);
		batchsetupinfoUpdateBtn.click();
	}
	
	public void functionalityForUpdatingDataWithOutBatchSize() throws InterruptedException {
		batchItemEdit.click();
		Thread.sleep(1000);
		batchsize.clear();
		Thread.sleep(1000);
		batchsetupinfoUpdateBtn.click();
	}
	
	public void functionalityForUpdatingDataWithOutBatchDate() throws InterruptedException {
		batchItemEdit.click();
		Thread.sleep(1000);
		batchdate.clear();
		Thread.sleep(1000);
		batchsetupinfoUpdateBtn.click();
	}
	
	public BatchSetUpPage functionalityForUpdatingDataFromEditBatchInfo() throws InterruptedException {
		batchItemEdit.click();
		Thread.sleep(2000);
		batchsize.clear();
		Thread.sleep(2000);
		batchsize.sendKeys("20");
		Thread.sleep(2000);
		batchdate.clear();
		Thread.sleep(2000);
		LocalDate tomorrow = LocalDate.now().plusDays(1);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	    String formattedDate = tomorrow.format(formatter);
	    Thread.sleep(2000);
		batchdate.sendKeys(formattedDate);
		Thread.sleep(2000);
		activeswitchbtn.click();
		Thread.sleep(2000);
		batchsetupinfoUpdateBtn.click();
		Thread.sleep(2000);
		Durationbtn.click();
		Thread.sleep(2000);
		DurationSearchField.sendKeys("Date Range" + Keys.ENTER);
		Thread.sleep(2000);
		fromDateField.clear();
		Thread.sleep(2000);
		fromDateField.sendKeys(formattedDate);
		Thread.sleep(2000);
		ToDateField.clear();
		Thread.sleep(2000);
		ToDateField.sendKeys(formattedDate);
		batchsetuphistorySearch.sendKeys("New QA Product");
		
		return new BatchSetUpPage(driver);
	}
	
	public BatchSetUpPage functionalityForBatchInfoDeleteConfirm() throws InterruptedException {
		batchinfoeditBtn.click();
		Thread.sleep(1000);
		batchsetupinfodeleteBtn.click();
		Thread.sleep(1000);
		batchInfoDeleteConfirmOk.click();	
		return new BatchSetUpPage(driver);
	}
	
	public String BatchInfoDeleteConfirmMsg() {
		return batchInfoDeleteConfirmMsg.getText();
	}
	
	public BatchSetUpPage functionalityForBatchInfoDeleteConfirmCancel() throws InterruptedException {
		batchinfoeditBtn.click();
		Thread.sleep(1000);
		batchsetupinfodeleteBtn.click();
		Thread.sleep(1000);
		batchInfoDeleteConfirmNo.click();	
		return new BatchSetUpPage(driver);
	}
	
	
	
}
