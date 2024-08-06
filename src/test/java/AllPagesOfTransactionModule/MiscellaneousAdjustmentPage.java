package AllPagesOfTransactionModule;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiscellaneousAdjustmentPage {

	WebDriver driver;
	
	//-> MiscellaneousAdjustment Add Page
	@FindBy(id = "btn_add")
	private WebElement AddBtn;
	
	@FindBy(id = "select2-P90_MONTH_NAME-container")
	private WebElement MonthNameAddbtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement MonthSearchBox;
	
	@FindBy(id = "P90_VATREBATE_DATE")
	private WebElement TransactionDate;
	
	@FindBy(id = "select2-P90_ADJUST_FOR-container")
	private WebElement AdjustmentType;
	
	@FindBy(className = "select2-search__field")
	private WebElement AdjustmentTypeSearchfield;
	
	@FindBy(id = "select2-P90_REBATE_ID-container")
	private WebElement AdjustmentForbtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement AdjustmentForSearchField;
	
	@FindBy(id = "P90_REBATE_AMT")
	private WebElement AdjustmentAmt;
	
	@FindBy(className = "a-Switch-toggle")
	private WebElement ActiveStatusBtn;
	
	@FindBy(id = "btn_submit")
	private WebElement SaveBtn;
	
	@FindBy(id = "btn_cancel")
	private WebElement CancelBtn;
	
	@FindBy(className = "alertify-message")
	private WebElement WarningTextMsg;
	
	@FindBy(id = "alertify-ok")
	private WebElement OkBtn;
	
	//->Miscellaneous Adjustment Dashboard
	
	@FindBy(xpath = "//tbody/tr[2]/td[13]")
	private WebElement AdjustmentForTextValue;
	
	@FindBy(id = "select2-P90_DATE-container")
	private WebElement DurationBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement DurationSearchBox;
	
	@FindBy(id = "P90_FROM_DATE")
	private WebElement FromDateField;
	
	@FindBy(xpath = "(//img)[2]")
	private WebElement EditBtn;
	
	@FindBy(id = "P90_SEARCH")
	private WebElement MiscellaneousAdjustmentSearch;
	
	@FindBy(css = "tbody tr td:nth-child(9)")
	private WebElement MiscellaneousSearchingValue;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement MiscellaneousInfoEditButton;
	
	@FindBy(xpath = "(//td[contains(@class,'u-tL')][contains(text(),'Decrease Other’s Adjustment')])[1]")
	private WebElement ActualEditingAdjustmentType;
	
	@FindBy(xpath = "(//td[contains(@class,'u-tL')][normalize-space()='Reduced Adjustment of money paid as Advance Tax'])[1]")
	private WebElement ActualEditingAdjustmentFor;
	
	@FindBy(xpath = "(//td[contains(@class,'u-tR')][normalize-space()='100'])[1]")
	private WebElement ActualEditingAdjustmentAmtValue;
	
	
	
	//-> Edit Form of Miscellaneous Adjustment
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement MonthNameEditFieldClear;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[3]")
	private WebElement AdjustmentTypeEditFieldClear;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[4]")
	private WebElement AdjustmentForEditFieldClear;
	
	@FindBy(id = "P90_REBATE_AMT")
	private WebElement AdjustmentAmtEditField;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement TransactionDateBtnInEditPage;
	
	@FindBy(id = "P90_VATREBATE_DATE")
	private WebElement TransactionDateFieldInEditPage;
	
	@FindBy(id = "btn_update")
	private WebElement UpdateBtn;
	
	@FindBy(id = "btn_delete")
	private WebElement DeleteBtnInEditPage;
	
	@FindBy(id = "btn_cancel")
	private WebElement CancelBtnInEditPage;
	
	
	
	public MiscellaneousAdjustmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public MiscellaneousAdjustmentPage functionalityForMonthNameRequiredField() throws InterruptedException {
		Thread.sleep(2000);
		AddBtn.click();
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
		Thread.sleep(2000);
		TransactionDate.sendKeys(formattedDate);
		Thread.sleep(2000);
		AdjustmentType.click();
		Thread.sleep(2000);
		AdjustmentTypeSearchfield.sendKeys("Increase" + Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentForbtn.click();
		Thread.sleep(2000);
		AdjustmentForSearchField.sendKeys("Incremental" + Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentAmt.sendKeys("50");
		Thread.sleep(2000);
		SaveBtn.click();
		return new MiscellaneousAdjustmentPage(driver);
	}
	
	public MiscellaneousAdjustmentPage functionalityForTransactionDateRequiredField() throws InterruptedException {
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		MonthNameAddbtn.click();
		Thread.sleep(2000);
		MonthSearchBox.sendKeys("February" +Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentType.click();
		Thread.sleep(2000);
		AdjustmentTypeSearchfield.sendKeys("Increase" + Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentForbtn.click();
		Thread.sleep(2000);
		AdjustmentForSearchField.sendKeys("Incremental" + Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentAmt.sendKeys("50");
		Thread.sleep(2000);
		SaveBtn.click();
		return new MiscellaneousAdjustmentPage(driver);
	}
	
	public MiscellaneousAdjustmentPage functionalityForAdjustmentTypeRequiredField() throws InterruptedException {
		Thread.sleep(2000);
		AddBtn.click();
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
		Thread.sleep(2000);
		TransactionDate.sendKeys(formattedDate);
		Thread.sleep(2000);
		MonthNameAddbtn.click();
		Thread.sleep(2000);
		MonthSearchBox.sendKeys("February" +Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentAmt.sendKeys("50");
		Thread.sleep(2000);
		SaveBtn.click();
		return new MiscellaneousAdjustmentPage(driver);
	}
	
	public MiscellaneousAdjustmentPage functionalityForAdjustmentForRequiredField() throws InterruptedException {
		Thread.sleep(2000);
		AddBtn.click();
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
		Thread.sleep(2000);
		TransactionDate.sendKeys(formattedDate);
		Thread.sleep(2000);
		MonthNameAddbtn.click();
		Thread.sleep(2000);
		MonthSearchBox.sendKeys("February" +Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentAmt.sendKeys("50");
		Thread.sleep(2000);
		AdjustmentType.click();
		Thread.sleep(2000);
		AdjustmentTypeSearchfield.sendKeys("Increase" + Keys.ENTER);
		Thread.sleep(2000);
		SaveBtn.click();
		return new MiscellaneousAdjustmentPage(driver);
	}
	
	public MiscellaneousAdjustmentPage functionalityForALLRequiredField() throws InterruptedException {
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SaveBtn.click();
		return new MiscellaneousAdjustmentPage(driver);
	}
	
	public String displayWarningMsg() {
		return WarningTextMsg.getText();
	}
	
	public MiscellaneousAdjustmentPage functionalityForSavingData() throws InterruptedException {
		Thread.sleep(2000);
		AddBtn.click();
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
		Thread.sleep(2000);
		TransactionDate.sendKeys(formattedDate);
		Thread.sleep(2000);
		MonthNameAddbtn.click();
		Thread.sleep(2000);
		MonthSearchBox.sendKeys("February" +Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentAmt.sendKeys("50");
		Thread.sleep(2000);
		AdjustmentType.click();
		Thread.sleep(2000);
		AdjustmentTypeSearchfield.sendKeys("Increase" + Keys.ENTER);
		Thread.sleep(2000);
		AdjustmentForbtn.click();
		Thread.sleep(2000);
		AdjustmentForSearchField.sendKeys("Incremental" + Keys.ENTER);
		Thread.sleep(2000);
		SaveBtn.click();
		return new MiscellaneousAdjustmentPage(driver);
	}
	
	public String displayAdjustmentForTextValue() {
		return AdjustmentForTextValue.getText();
	}
	
	public void functionalityForDateRange() throws InterruptedException {
		Thread.sleep(2000);
		DurationBtn.click();
		Thread.sleep(2000);
		DurationSearchBox.sendKeys("Date Range" + Keys.ENTER);
		FromDateField.clear();
		Thread.sleep(2000);
		FromDateField.sendKeys("01-DEC-2023");
	}
	
	public void functionalityForMonthNameRequiredFieldInEditPage() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		MonthNameEditFieldClear.click();
		Thread.sleep(2000);
		UpdateBtn.click();
	}
	
	public void functionalityForAdjustmentTypeRequiredFieldInEditPage() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		AdjustmentTypeEditFieldClear.click();
		Thread.sleep(2000);
		UpdateBtn.click();
	}
		
	public void functionalityForAdjustmentAmtRequiredFieldInEditPage() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		AdjustmentAmtEditField.clear();
		Thread.sleep(2000);
		UpdateBtn.click();
	}
	
	public void functionalityForTrnasactionDateRequiredFieldInEditPage() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(5000);
		EditBtn.click();
		Thread.sleep(2000);
		TransactionDateBtnInEditPage.click();
		Thread.sleep(2000);
		String numberOfChar = TransactionDateFieldInEditPage.getAttribute("value");
		int numberofBackSpaces = numberOfChar.length();
		for (int i = 0; i < numberofBackSpaces; i++) {
			TransactionDateFieldInEditPage.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		UpdateBtn.click();
	}
	
	public void functionalityForAdjustmentForRequiredFieldInEditPage() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		AdjustmentForEditFieldClear.click();
		Thread.sleep(2000);
		UpdateBtn.click();
	}
	
	public void functionalityForMiscellaneousAdjustementInfoSearch() throws InterruptedException {
		functionalityForDateRange();
		Thread.sleep(2000);
		MiscellaneousAdjustmentSearch.sendKeys("V012312000513");
	}
	
	public String displayMiscellaneousSearchingTextValue() {
		return MiscellaneousSearchingValue.getText();
	}
	
	public void functionaltyForSavingAndEditingMiscellaneousInfo() throws InterruptedException {
		functionalityForSavingData();
		Thread.sleep(1000);
		MiscellaneousAdjustmentSearch.sendKeys("February");
	    Thread.sleep(1000);
		MiscellaneousInfoEditButton.click();
		Thread.sleep(1000);
		MonthNameAddbtn.click();
		Thread.sleep(1000);
		MonthSearchBox.sendKeys("May"+Keys.ENTER);
		Thread.sleep(1000);
		AdjustmentType.click();
		Thread.sleep(1000);
		AdjustmentTypeSearchfield.sendKeys("Decrease"+Keys.ENTER);
		Thread.sleep(1000);
		AdjustmentForbtn.click();
		Thread.sleep(1000);
		AdjustmentForSearchField.sendKeys("Reduced"+Keys.ENTER);
		Thread.sleep(1000);
		AdjustmentAmtEditField.clear();
		Thread.sleep(1000);
		AdjustmentAmtEditField.sendKeys("100");
		Thread.sleep(1000);
		UpdateBtn.click();
		Thread.sleep(1000);
		MiscellaneousAdjustmentSearch.clear();
		Thread.sleep(1000);
		MiscellaneousAdjustmentSearch.sendKeys("May");
	}
	
	public String DisplayActualEditingAdjustmentAmtValue() {
		return ActualEditingAdjustmentAmtValue.getText();
	}
	
	public String DisplayActualEditingAdjustForValue() {
		return ActualEditingAdjustmentFor.getText();
	}
}
