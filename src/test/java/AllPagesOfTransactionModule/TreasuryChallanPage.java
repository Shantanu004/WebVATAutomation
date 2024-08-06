package AllPagesOfTransactionModule;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreasuryChallanPage {

	WebDriver driver;
	
	//-> Treasury Challan Add Page
	@FindBy(id = "btn_add")
	private WebElement AddBtn;
	
	@FindBy(id = "P114_CHALLAN_NO")
	private WebElement ChallanNoInputField;
	
	@FindBy(id = "P114_UD_TRN_NO")
	private WebElement TransactionNoField;
	
	@FindBy(id = "select2-P114_T_TYPE-container")
	private WebElement TreasuryTypeBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement TreasuryTypeSearchField;
	
	@FindBy(id = "select2-P114_ECONOMIC_CODE-container")
	private WebElement EconomicCodeBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement EconomicCodeSearchField;
	
	@FindBy(id = "P114_CHALLAN_DATE")
	private WebElement ChallanDateField;
	
	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement ChallanDateBtn;
	
	@FindBy(id = "P114_DEPOSIT_DATE")
	private WebElement DepositDate;
	
	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement DepositDateBtn;
	
	@FindBy(id = "select2-P114_BANK_ID-container")
	private WebElement BankNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement BankNameSearchField;
	
	@FindBy(id = "P114_DEPOSIT_AMT")
	private WebElement DepositAmtField;
	
	@FindBy(id = "select2-P114_BRANCH_ID-container")
	private WebElement BranchNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement BranchNameSearchField;
	
	@FindBy(id = "btn_save")
	private WebElement SaveandExit;
	
	@FindBy(id = "btn_cancel")
	private WebElement CancelBtn;
	
	@FindBy(className = "alertify-message")
	private WebElement WarningTextMsg;
	
	//-> Treasury Challan Dashboard 
	
	@FindBy(id = "select2-P114_DATE-container")
	private WebElement DurationBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement DurationSearchField;
	
	@FindBy(id = "P114_FROM_DATE")
	private WebElement FromDateField;
	
	@FindBy(xpath = "(//img)[2]")
	private WebElement EditBtn;
	
	@FindBy(id = "P114_SEARCH")
	private WebElement SearchField;
	
	@FindBy(css = "body > form:nth-child(3) > div:nth-child(11) > div:nth-child(2) > div:nth-child(2) > main:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
	private WebElement Challanvalue;
	
	@FindBy(css = "td[headers='CHALLAN_NO']")
	private WebElement UpdatedChallanValue;
	
	@FindBy(css = "td[headers='UD_TRN_NO']")
	private WebElement UpdatedTransactionNoValue;
	
	@FindBy(css = "tbody tr span:nth-child(2)")
	private WebElement UpdatedTreasuryTypeValue;
	
	@FindBy(xpath = "(//td[@align='right'][normalize-space()='D011912000062'])[1]")
	private WebElement UpdatedEconomicCodeValue;
	
	@FindBy(css = "td[headers='CHALLAN_DATE']")
	private WebElement UpdatedChallanDateValue;
	
	@FindBy(css = "td[headers='DEPOSIT_DATE']")
	private WebElement UpdatedDepositDateValue;
	
	@FindBy(css = "tbody tr:nth-child(1) td:nth-child(9)")
	private WebElement UpdatedBankNameValue;
	
	@FindBy(css = "td[headers='DEPOSIT_AMT']")
	private WebElement UpdatedDepositAmtValue;
	
	//-> Treasury Challan Edit Page
	@FindBy(id = "btn_edit")
	private WebElement UpdateBtnInEditPage;
	
	@FindBy(id = "btn_delete")
	private WebElement DeleteBtnInEditPage;
	
	@FindBy(id = "btn_cancel")
	private WebElement CancelBtnInEditPage;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement TreasuryTypeClearBtn;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[3]")
	private WebElement EconomicCodeClearBtn;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[4]")
	private WebElement BankNameClearBtn;
	
	@FindBy(id = "alertify-ok")
	private WebElement TreasuryChallanInfoDeleteConfirmOkBtn;
	
	@FindBy(id = "alertify-cancel")
	private WebElement TreasuryChallanInfoDeleteConfirmCancelBtn;
	
	
	public TreasuryChallanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//--> Add Page
	public TreasuryChallanPage functionalityForValidateRequiredFieldInAddPage() throws InterruptedException {
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateChallanNoRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TransactionNoField.sendKeys("QATrN"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(1000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(2000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateTransactionNoRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(1000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(2000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateTreasuryTypeRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(2000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateEconomicCodeRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(2000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateChallanDateRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(2000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(1000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateDipositDateRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(2000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(1000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		Thread.sleep(1000);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		ChallanDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateBankNameRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(2000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(1000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		Thread.sleep(1000);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForValidateDipositAmtRequiredFieldInAddPage() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(2000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(1000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		Thread.sleep(1000);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		SaveandExit.click();
		return new TreasuryChallanPage(driver);
	}
	
	public String DisplayWarningMsg() {
		return WarningTextMsg.getText();
	}
	
	public TreasuryChallanPage functionalityForValidateSavingTreasuryChallanValues() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		Thread.sleep(1000);
		TreasuryTypeBtn.click();
		Thread.sleep(2000);
		TreasuryTypeSearchField.sendKeys("Development Surcharge"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicCodeBtn.click();
		Thread.sleep(1000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		Thread.sleep(1000);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		DepositDateBtn.click();
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		DepositAmtField.sendKeys("100");
		Thread.sleep(1000);
		SaveandExit.click();
		Thread.sleep(1000);
		SearchField.sendKeys("QACh"+formattedTime);
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayChallanValue() {
		return Challanvalue.isDisplayed();
	}
	
	public void FunctionForEnteringEditpage() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
        FromDateField.sendKeys("1-Jan-2024");
        Thread.sleep(1000);
        EditBtn.click();
		}
	
	//--> Edit Page
	public TreasuryChallanPage functionalityForVerifyChallanNoRequiredFieldInEditPage() throws InterruptedException {
		ChallanNoInputField.clear();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForVerifyTransactionNoRequiredFieldInEditPage() throws InterruptedException {
		TransactionNoField.clear();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForVerifyTreasuryTypeRequiredFieldInEditPage() throws InterruptedException {
		TreasuryTypeClearBtn.click();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForVerifyEconomicCodeRequiredFieldInEditPage() throws InterruptedException {
		EconomicCodeClearBtn.click();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForVerifyChallanDateRequiredFieldInEditPage() throws InterruptedException {
		ChallanDateBtn.click();
		Thread.sleep(1000);
		ChallanDateField.clear();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForVerifyDepositDateRequiredFieldInEditPage() throws InterruptedException {
		DepositDateBtn.click();
		Thread.sleep(1000);
		DepositDate.clear();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForVerifyBankNameRequiredFieldInEditPage() throws InterruptedException {
		BankNameClearBtn.click();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForVerifyDepositAmtRequiredFieldInEditPage() throws InterruptedException {
		DepositAmtField.clear();
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForUpdatingChallanNoValueInEditPage() throws InterruptedException {
		ChallanNoInputField.clear();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoInputField.sendKeys("QACh"+formattedTime);
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys("QACh"+formattedTime);
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedChallanNoValue() {
		return UpdatedChallanValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForUpdatingTransactionNoValueInEditPage() throws InterruptedException {
		TransactionNoField.clear();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TransactionNoField.sendKeys("Trn"+formattedTime);
		String SearchingTrnNo="Trn"+formattedTime;
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys(SearchingTrnNo);
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedTransactionNoValue() {
		return UpdatedTransactionNoValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForUpdatingTreasuryTypeInEditPage() throws InterruptedException {
		TreasuryTypeBtn.click();
		Thread.sleep(1000);
		TreasuryTypeSearchField.sendKeys("Deduction At Source"+Keys.ENTER);
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys("QACh100957");
		Thread.sleep(1000);
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedTreasuryTypeValue() {
		return UpdatedTreasuryTypeValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForUpdatingEconomicCodeInEditPage() throws InterruptedException {
		EconomicCodeBtn.click();
		Thread.sleep(1000);
		EconomicCodeSearchField.sendKeys("1/1133/0006/0711"+Keys.ENTER);
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys("D011912000062");
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedEconomicCodeValue() {
		return UpdatedEconomicCodeValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForUpdatingChallanDateInEditPage() throws InterruptedException {
		ChallanDateField.clear();
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys(formattedDate);
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedChallanDateValue() {
		return UpdatedChallanDateValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForUpdatingDepositDateInEditPage() throws InterruptedException {
		DepositDate.clear();
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		DepositDate.sendKeys(formattedDate);
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys(formattedDate);
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedDepositDateValue() {
		return UpdatedDepositDateValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForUpdatingBankNameInEditPage() throws InterruptedException {
		BankNameClearBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New Bank"+Keys.ENTER);
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys("New Bank");
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedBankNameValue() {
		return UpdatedBankNameValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForUpdatingDepositAmtInEditPage() throws InterruptedException {
		DepositAmtField.clear();
		Thread.sleep(1000);
		DepositAmtField.sendKeys("600");
		Thread.sleep(1000);
		UpdateBtnInEditPage.click();
		Thread.sleep(1000);
		SearchField.sendKeys("600");
		return new TreasuryChallanPage(driver);
	}
	
	public Boolean DisplayUpdatedDepositAmtValue() {
		return UpdatedDepositAmtValue.isDisplayed();
	}
	
	public TreasuryChallanPage functionalityForDeletingTreasuryChallanInfo() throws InterruptedException {
		DeleteBtnInEditPage.click();
		Thread.sleep(1000);
		TreasuryChallanInfoDeleteConfirmOkBtn.click();
		return new TreasuryChallanPage(driver);
	}
	
	public TreasuryChallanPage functionalityForCancelingOfTreasuryChallanInfo() throws InterruptedException {
		CancelBtn.click();
		Thread.sleep(1000);
		return new TreasuryChallanPage(driver);
	}
	
	
}
