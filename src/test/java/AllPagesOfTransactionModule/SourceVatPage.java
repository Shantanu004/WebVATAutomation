package AllPagesOfTransactionModule;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SourceVatPage {

	WebDriver driver;
	
	//-> AddPage
	@FindBy(id = "select2-P163_CHALLAN_TYPE-container")
	private WebElement ChallanTypeBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement ChallanTypeSearchField;
	
	@FindBy(id = "select2-P163_SUPPLIER_NAME-container")
	private WebElement SupplierNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement SupplierSearchField;
	
	@FindBy(id = "select2-P163_BUYER_NAME-container")
	private WebElement CustomerNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement CustomerSearchField;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[3]")
	private WebElement SupplierNameClearBtn;
	
	@FindBy(id = "P163_TRCHALLAN_NO")
	private WebElement TreasuryNoField;
	
	@FindBy(id = "select2-P163_BANK_NAME-container")
	private WebElement BankNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement BankNameSearchField;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[4]")
	private WebElement BankNameClearField;
	
	@FindBy(id = "select2-P163_BRANCH_NAME-container")
	private WebElement BranchNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement BranchNameSearchField;
	
	@FindBy(id = "select2-P163_ACC_CODE-container")
	private WebElement EconomicsCodeBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement EconomicsSearchFieldBtn;
	
	@FindBy(css = "span[id='select2-P163_ACC_CODE-container'] span[class='select2-selection__clear']")
	private WebElement EconomicsCodeClearBtn;
	
	@FindBy(id = "P163_TRCHALLAN_DATE")
	private WebElement TreasuryDateField;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement TreasuryDateBtn;
	
	@FindBy(id = "P163_CERTIFICATE_FLG_LABEL")
	private WebElement CertificateIssueCheckBtn;
	
	@FindBy(id = "P163_CERTIFICATE_DATE")
	private WebElement CertificateDateField;
	
	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement CertificateDateBtn;
	
	@FindBy(id = "btn_save")
	private WebElement SaveBtn;
	
	@FindBy(id = "btn_clear")
	private WebElement CancelBtn;
	
	@FindBy(css = ".alertify-message")
	private WebElement RequiredFieldWarningMSg;
	
	@FindBy(id = "P163_TOTAL_SOURCE_VAT")
	private WebElement TotalSourceVATTextValue;
	
	@FindBy(id = "P163_DESCRIPTION")
	private WebElement DescriptionField;
	
	//-> SourceVat Details In Add Page
	@FindBy(id = "P163_CHALLAN_NO")
	private WebElement ChallanNoField;
	
	@FindBy(id = "P163_CHALLAN_DATE_input")
	private WebElement ChallanDateField;
	
	@FindBy(xpath = "(//button[@title='Select Date'])[1]")
	private WebElement ChallanDateBtn;
	
	@FindBy(id = "P163_VATABLE_AMT")
	private WebElement VatableAmtField;
	
	@FindBy(id = "P163_VAT_AMT")
	private WebElement VatAmtField;
	
	@FindBy(id = "addall")
	private WebElement SourceVatDetailsAddBtn;
	
	@FindBy(css = ".fa.fa-pencil-square-o")
	private WebElement SourceVatDetailsEditBtn;
	
	@FindBy(css = "span[class='fa fa-trash']")
	private WebElement SourceVatDetailsDeleteBtn;
	
	@FindBy(id = "P163_TOTAL_SOURCE_VAT")
	private WebElement TotalSourceVatValue;
	
	//-> SourceVat DashBoard
	@FindBy(id = "btn_show")
	private WebElement AddBtn;
	
	@FindBy(id = "select2-P163_CHALLAN_TYPE1-container")
	private WebElement ChallanTypeBtnInDashBoard;
	
	@FindBy(className = "select2-search__field")
	private WebElement ChallanTypeSearchFieldInDashBoard;
	
	@FindBy(id = "select2-P163_DATE-container")
	private WebElement DurationBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement DurationSearchField;
	
	@FindBy(id = "P163_FROM_DATE")
	private WebElement FromDateField;
	
	@FindBy(css = "div[id='P163_FROM_DATE_CONTAINER'] button[type='button']")
	private WebElement FromDateBtn;
	
	@FindBy(linkText = "1")
	private WebElement FirstDateBtn;
	
	@FindBy(id = "P163_CERTIFICATE_FLG1_LABEL")
	private WebElement CertificateFlagCheckBoxInDashBoard;
	
	@FindBy(id = "P163_SEARCH")
	private WebElement SearchField;
	
	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(3)")
	private WebElement ActualSavingSupplierName;
	
	@FindBy(css = "tbody tr td:nth-child(3)")
	private WebElement ActualSavingCustomerName;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement ItemOfIssueTypeChallanWithoutCIEditBtn;
	
	@FindBy(css = "tbody tr td:nth-child(2)")
	private WebElement ActualEditingInfo;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement DetailsButton;
	
	@FindBy(xpath = "(//td[@class='t-Report-cell'])[8]")
	private WebElement DisplayVatableAmtTextValue;
	
	@FindBy(xpath = "(//td[@class='t-Report-cell'])[9]")
	private WebElement DisplayVatAmtTextValue;
	
	@FindBy(xpath = "(//td[@class='t-Report-cell'])[10]")
	private WebElement DisplaySourceVatTextValue;
	
	@FindBy(xpath = "//td[normalize-space()='HELLO SUPPLIER']")
	private WebElement DisplaySupplierNameTextValue;
	
	@FindBy(xpath = "//td[normalize-space()='HELLO BANK LIMITED']")
	private WebElement DisplayBankNameTextValue;
	
	@FindBy(xpath = "//td[normalize-space()='HELLO']")
	private WebElement DisplayBranchNameTextValue;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement EditButtonOfReceiveTypeChallanInfo;
	
	@FindBy(xpath = "//td[normalize-space()='Local customer']")
	private WebElement DisplayCustomerNameTextValue;
	
	@FindBy(xpath = "(//span[@class='fa fa-print'])[1]")
	private WebElement PrintButtonForWithCITypeChallan;
	
	//-> Update Page
	
	@FindBy(id = "btn_update1")
	private WebElement VerifyBtn;
	
	@FindBy(id = "btn_clear")
	private WebElement CancelBtnInEditPage;
	
	@FindBy(className = "vatamt")
	private WebElement VatableAmtInEditPage;
	
	@FindBy(className = "vatmt")
	private WebElement VatAmtInEditPage;
	
	@FindBy(xpath = "(//input[@id='checkAll_2'])[1]")
	private WebElement CheckBoxButtonInEditPage;
	
	@FindBy(className  = "a-AlertMessage-details")
	private WebElement DisplayActualNumericValidationWarningMsg;
	
	
	public SourceVatPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	                    //---------ADD PAGE-------------//
	//->Coding info of Source VAT & Source VAT Details form in ADD Page
	public void functionalityForAllSourceVATInfo() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		SupplierNameBtn.click();
		Thread.sleep(1000);
		SupplierSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		Thread.sleep(1000);
		LocalTime currentSecond = LocalTime.now();
		DateTimeFormatter formatterOfSecond = DateTimeFormatter.ofPattern("ss");
		String ValueOfSecond = currentSecond.format(formatterOfSecond);
		DescriptionField.sendKeys("SourceVATNO"+ValueOfSecond);
	}
	
	public void functionalityForAllSourceVATDetail() throws InterruptedException {
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoField.sendKeys("QA_Ch"+formattedTime);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate+Keys.ENTER);
		Thread.sleep(1000);
		VatableAmtField.sendKeys("100");
		Thread.sleep(1000);
		VatAmtField.sendKeys("10");
		Thread.sleep(1000);
		SourceVatDetailsAddBtn.click();
	}
	//---
	
	//-> Coding of General Required Field Verifying in ADD Page
	public SourceVatPage functionalityForSupplierNameRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForTreasuryNoRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		SupplierNameBtn.click();
		Thread.sleep(1000);
		SupplierSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForBankNameRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		SupplierNameBtn.click();
		Thread.sleep(1000);
		SupplierSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForEconomicsCodeRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		SupplierNameBtn.click();
		Thread.sleep(1000);
		SupplierSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForTreasuryDateRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		SupplierNameBtn.click();
		Thread.sleep(1000);
		SupplierSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForChallanNoRequiredField() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate+Keys.ENTER);
		Thread.sleep(1000);
		VatableAmtField.sendKeys("100");
		Thread.sleep(1000);
		VatAmtField.sendKeys("10");
		Thread.sleep(1000);
		SourceVatDetailsAddBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForChallanDateRequiredField() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoField.sendKeys("QA_Ch"+formattedTime);
		Thread.sleep(1000);
		VatableAmtField.sendKeys("100");
		Thread.sleep(1000);
		VatAmtField.sendKeys("10");
		Thread.sleep(1000);
		SourceVatDetailsAddBtn.click();
		return new SourceVatPage(driver);
	}
	 
	public SourceVatPage functionalityForVATAbleAmtRequiredField() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoField.sendKeys("QA_Ch"+formattedTime);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate+Keys.ENTER);
		Thread.sleep(1000);
		VatAmtField.sendKeys("10");
		Thread.sleep(1000);
		SourceVatDetailsAddBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForVATAmtRequiredField() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		ChallanNoField.sendKeys("QA_Ch"+formattedTime);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		ChallanDateField.sendKeys(formattedDate+Keys.ENTER);
		Thread.sleep(1000);
		VatableAmtField.sendKeys("100");
		Thread.sleep(1000);
		SourceVatDetailsAddBtn.click();
		return new SourceVatPage(driver);
	}
	
	public String ActualTotalSourceVATFieldTextValue() {
		return TotalSourceVATTextValue.getText();
	}
	
	public String ActualWarningMsgForRequiredField() {
		return RequiredFieldWarningMSg.getText();
	}
	//--
	
	//-> Coding Info for Verifying Required Field and Saving when CI on of Issue Type Challan In Add Page
	public SourceVatPage functionalityForCertificateDateRequiredFieldWhenCertificateIssueOn() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		CertificateIssueCheckBtn.click();
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForSavingIssueTypeChallanWithCertificateIssue() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		CertificateIssueCheckBtn.click();
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		CertificateDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		CertificateDateBtn.click();
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1000);
		CertificateFlagCheckBoxInDashBoard.click();
		return new SourceVatPage(driver);
	}
	//--
	
	//-> Coding of Saving Issue Type Challan Without Certificate Issue From Add Page
	public SourceVatPage functionalityForSavingIssueTypeChallanWithOutCertificateIssue() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public Boolean ActualSupplierNameDisplayed() {
		return ActualSavingSupplierName.isDisplayed();
	}
	//--
	
	//-> Coding of Saving Received Type Challan From Add Page
	public SourceVatPage functionalityForSavingReceiveTypeChallan() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		ChallanTypeBtn.click();
		Thread.sleep(1000);
		ChallanTypeSearchField.sendKeys("Receive"+Keys.ENTER);
		Thread.sleep(1000);
		CustomerNameBtn.click();
		Thread.sleep(1000);
		CustomerSearchField.sendKeys("New QA Buyer"+Keys.ENTER);
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		Thread.sleep(1000);
		LocalTime currentSecond = LocalTime.now();
		DateTimeFormatter formatterOfSecond = DateTimeFormatter.ofPattern("ss");
		String ValueOfSecond = currentSecond.format(formatterOfSecond);
		DescriptionField.sendKeys("SourceVATNO"+ValueOfSecond);
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1000);
		ChallanTypeBtnInDashBoard.click();
		Thread.sleep(1000);
		ChallanTypeSearchFieldInDashBoard.sendKeys("Recive"+Keys.ENTER);
		return new SourceVatPage(driver);
	}
	
	public Boolean ActualSavingCustomerNameDisplayed() {
		return ActualSavingCustomerName.isDisplayed();
	}
	//--
	
	//-> Coding of Verifying Required Field when Challan Type Receive
	public SourceVatPage functionalityForCustomerNameRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		ChallanTypeBtn.click();
		Thread.sleep(1000);
		ChallanTypeSearchField.sendKeys("Receive"+Keys.ENTER);
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		Thread.sleep(1000);
		LocalTime currentSecond = LocalTime.now();
		DateTimeFormatter formatterOfSecond = DateTimeFormatter.ofPattern("ss");
		String ValueOfSecond = currentSecond.format(formatterOfSecond);
		DescriptionField.sendKeys("SourceVATNO"+ValueOfSecond);
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		return new SourceVatPage(driver);
	}
	
	public void functionalityForEnteringNonCertificateFlgIssueTypeChallan() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateBtn.click();
		Thread.sleep(1000);
		FirstDateBtn.click();
		Thread.sleep(1000);
		ItemOfIssueTypeChallanWithoutCIEditBtn.click();
	}
	
	//->  Coding for Verifying Required Field of Without Certificate Issue In Edit Page 
	public SourceVatPage functionalityForSupplierNameRequiredFieldInNonCiIssueEditPage() throws InterruptedException {
        functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
		SupplierNameClearBtn.click();
		Thread.sleep(1000);
	    VerifyBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForTreasuryNoRequiredFieldInNonCiIssueEditPage() throws InterruptedException {
        functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
		TreasuryNoField.clear();
		Thread.sleep(1000);
	    VerifyBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForBankNameRequiredFieldInNonCiIssueEditPage() throws InterruptedException {
        functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
		BankNameClearField.click();
		Thread.sleep(1000);
	    VerifyBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForEconomicCodeRequiredFieldInNonCiIssueEditPage() throws InterruptedException {
        functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
		EconomicsCodeClearBtn.click();
		Thread.sleep(1000);
	    VerifyBtn.click();
		return new SourceVatPage(driver);
	}
	

	public SourceVatPage functionalityForTreasuryDateRequiredFieldInNonCiIssueEditPage() throws InterruptedException {
        functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
		TreasuryDateField.clear();
		Thread.sleep(1000);
	    VerifyBtn.click();
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForVatableAmtFieldInNonCiIssueEditPage() throws InterruptedException {
        functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
        CheckBoxButtonInEditPage.click();
        Thread.sleep(1000);
		VatableAmtInEditPage.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		return new SourceVatPage(driver);
	}
	
	public SourceVatPage functionalityForVatAmtFieldInNonCiIssueEditPage() throws InterruptedException {
        functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
        CheckBoxButtonInEditPage.click();
        Thread.sleep(1000);
		VatAmtInEditPage.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);;
		return new SourceVatPage(driver);
	}
	
	public Boolean DisplayNumericValueWarningMsg() {
		return DisplayActualNumericValidationWarningMsg.isDisplayed();
	}
	//--
	
	//-->Coding of Updating Issue Type Challan Without Certificate in Edit Page 
	public SourceVatPage functionalityForUpdatingAndVerfiyingAllRequiredFieldInNonCiIssueEditPage() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1000);
		functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
        SupplierNameBtn.click();
        Thread.sleep(1000);
        SupplierSearchField.sendKeys("New QA Supplier 2"+Keys.ENTER);
        Thread.sleep(1000);
        BankNameBtn.click();
        Thread.sleep(1000);
        BankNameSearchField.sendKeys("Hello Bank Limited"+Keys.ENTER);
        Thread.sleep(1000);
        BranchNameBtn.click();
        Thread.sleep(1000);
        BranchNameSearchField.sendKeys("Hello"+Keys.ENTER);
        Thread.sleep(1000);
        TreasuryDateField.clear();
        Thread.sleep(1000);
        LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
        TreasuryDateField.sendKeys(formattedDate);
        Thread.sleep(1000);
        VerifyBtn.click();
        Thread.sleep(1000);
        SearchField.sendKeys("Hello");
		return new SourceVatPage(driver);
	}
	
	public Boolean DisplayActualEditingValue() {
		return ActualEditingInfo.isDisplayed();
	}
	
	public SourceVatPage functionalityForUpdatingSourceVATDetailsFieldInNonCiIssueEditPage() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1000);
		functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
        SupplierNameBtn.click();
        Thread.sleep(1000);
        SupplierSearchField.sendKeys("Hello Supplier"+Keys.ENTER);
        Thread.sleep(1000);
        CheckBoxButtonInEditPage.click();
        Thread.sleep(1000);
        VatableAmtInEditPage.clear();
        Thread.sleep(1000);
        VatableAmtInEditPage.sendKeys("200");
        Thread.sleep(1000);
        VatAmtInEditPage.clear();
        Thread.sleep(1000);
        VatAmtInEditPage.sendKeys("20");
        Thread.sleep(1000);
        VerifyBtn.click();
        Thread.sleep(1000);
        SearchField.sendKeys("Hello Supplier");
        Thread.sleep(1000);
        DetailsButton.click();
		return new SourceVatPage(driver);
	}
	
	public String ActualVatableAmtTextValue() {
		return DisplayVatableAmtTextValue.getText();
	}
	
	public String ActualVatAmtTextValue() {
		return DisplayVatAmtTextValue.getText();
	}
	
	public String ActualSourceVatTextValue() {
		return DisplaySourceVatTextValue.getText();
	}
	//--
	
	//-> Coding Info for Updating Issue Type Challan with Certificate Issue
	public SourceVatPage functionalityForUpdatingIssueTypeChallanWithCertificateIssue() throws InterruptedException {
		functionalityForAllSourceVATInfo();
		Thread.sleep(1000);
		CertificateIssueCheckBtn.click();
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		CertificateDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		CertificateDateBtn.click();
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1000);
		CertificateFlagCheckBoxInDashBoard.click();
		Thread.sleep(1000);
		functionalityForEnteringNonCertificateFlgIssueTypeChallan();
        Thread.sleep(1000);
        SupplierNameBtn.click();
        Thread.sleep(1000);
        SupplierSearchField.sendKeys("Hello Supplier"+Keys.ENTER);
        Thread.sleep(1000);
        BankNameBtn.click();
        Thread.sleep(1000);
        BankNameSearchField.sendKeys("Hello Bank Limited"+Keys.ENTER);
        Thread.sleep(1000);
        BranchNameBtn.click();
        Thread.sleep(1000);
        BranchNameSearchField.sendKeys("Hello"+Keys.ENTER);
        Thread.sleep(1000);
        TreasuryDateField.clear();
        Thread.sleep(1000);
        LocalDate currentDate1 = LocalDate.now();
	    DateTimeFormatter formatterForDate1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate1 = currentDate1.format(formatterForDate1);
        TreasuryDateField.sendKeys(formattedDate1);
        Thread.sleep(1000);
        CheckBoxButtonInEditPage.click();
        Thread.sleep(1000);
        VatableAmtInEditPage.clear();
        Thread.sleep(1000);
        VatableAmtInEditPage.sendKeys("200");
        Thread.sleep(1000);
        VatAmtInEditPage.clear();
        Thread.sleep(1000);
        VatAmtInEditPage.sendKeys("20");
        Thread.sleep(1000);
        VerifyBtn.click();
        Thread.sleep(1000);
		CertificateFlagCheckBoxInDashBoard.click();
		Thread.sleep(1000);
        DetailsButton.click();
		return new SourceVatPage(driver);
	}
	
	public String ActualSupplierNameTextValue() {
		return DisplaySupplierNameTextValue.getText();
	}
	
	public String ActualBankNameTextValue() {
		return DisplayBankNameTextValue.getText();
	}
	
	public String ActualBranchNameTextValue() {
		return DisplayBranchNameTextValue.getText();
	}
	
	//->Coding info of Editing Challan Type Received info 
	public void functionalityForEnteringReceivedTypeChallan() throws InterruptedException {
		ChallanTypeBtnInDashBoard.click();
		Thread.sleep(1000);
		ChallanTypeSearchFieldInDashBoard.sendKeys("Recive"+Keys.ENTER);
		Thread.sleep(1000);
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateBtn.click();
		Thread.sleep(1000);
		FirstDateBtn.click();
		Thread.sleep(1000);
		EditButtonOfReceiveTypeChallanInfo.click();
	}
	
	public void functionalityForUpdatingReceivedTypeChallan() throws InterruptedException {
		CustomerNameBtn.click();
		Thread.sleep(1000);
		CustomerSearchField.sendKeys("Local customer"+Keys.ENTER);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("Hello Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("Hello"+Keys.ENTER);
		Thread.sleep(1000);
		CheckBoxButtonInEditPage.click();
		Thread.sleep(1000);
		VatableAmtInEditPage.clear();
		Thread.sleep(1000);
		VatableAmtInEditPage.sendKeys("200");
		Thread.sleep(1000);
		VatAmtInEditPage.clear();
		Thread.sleep(1000);
		VatAmtInEditPage.sendKeys("20");
		Thread.sleep(1000);
		VerifyBtn.click();
	}
	
	public SourceVatPage functionalityForVerifyUpdatingReceivedTypeChallanInfo() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		ChallanTypeBtn.click();
		Thread.sleep(1000);
		ChallanTypeSearchField.sendKeys("Receive"+Keys.ENTER);
		Thread.sleep(1000);
		CustomerNameBtn.click();
		Thread.sleep(1000);
		CustomerSearchField.sendKeys("New QA Buyer"+Keys.ENTER);
		Thread.sleep(1000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatterForTime = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatterForTime);
		TreasuryNoField.sendKeys("Tr"+formattedTime);
		Thread.sleep(1000);
		BankNameBtn.click();
		Thread.sleep(1000);
		BankNameSearchField.sendKeys("New QA Bank Limited"+Keys.ENTER);
		Thread.sleep(1000);
		BranchNameBtn.click();
		Thread.sleep(1000);
		BranchNameSearchField.sendKeys("New QA Branch"+Keys.ENTER);
		Thread.sleep(1000);
		EconomicsCodeBtn.click();
		Thread.sleep(1000);
		EconomicsSearchFieldBtn.sendKeys("1/1133/0006/0311"+Keys.ENTER);
		Thread.sleep(1000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatterForDate);
		TreasuryDateField.sendKeys(formattedDate);
		Thread.sleep(1000);
		TreasuryDateBtn.click();
		Thread.sleep(1000);
		LocalTime currentSecond = LocalTime.now();
		DateTimeFormatter formatterOfSecond = DateTimeFormatter.ofPattern("ss");
		String ValueOfSecond = currentSecond.format(formatterOfSecond);
		DescriptionField.sendKeys("SourceVATNO"+ValueOfSecond);
		Thread.sleep(1000);
		functionalityForAllSourceVATDetail();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1000);
		functionalityForEnteringReceivedTypeChallan();
		Thread.sleep(1000);
		functionalityForUpdatingReceivedTypeChallan();
		Thread.sleep(1000);
		ChallanTypeBtnInDashBoard.click();
		Thread.sleep(1000);
		ChallanTypeSearchFieldInDashBoard.sendKeys("Recive"+Keys.ENTER);
		Thread.sleep(1000);
        DetailsButton.click();
		return new SourceVatPage(driver);
	}
	
	public String ActualCustomerNameTextValue() {
		return DisplayCustomerNameTextValue.getText();
	}
	//--
	
	//--> 
	public SourceVatPage FunctionalityForClickingPrintButton() throws InterruptedException {
		ChallanTypeBtnInDashBoard.click();
		Thread.sleep(1000);
		ChallanTypeSearchFieldInDashBoard.sendKeys("Issue"+Keys.ENTER);
		Thread.sleep(1000);
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2024");
//		FromDateBtn.click();
//		Thread.sleep(1000);
//		FirstDateBtn.click();
		Thread.sleep(1000);
		CertificateFlagCheckBoxInDashBoard.click();
		Thread.sleep(1000);
		PrintButtonForWithCITypeChallan.click();
		return new SourceVatPage(driver);
	}
	
	
}
