package AllPagesForReportModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MISReportsPage {

	WebDriver driver;
	
	@FindBy(css = "div[id='121030000467'] h4")
	private WebElement AdvanceTaxBtn;
	
	@FindBy(id = "apex_date_01_00")
	private WebElement FromDateField;
	
	@FindBy(css = "div[id='121030000473'] h4")
	private WebElement ProductStockSummary;
	
	@FindBy(xpath = "//td[normalize-space()='28 MM CSD Cap']")
	private WebElement ItemNameForProductStockSummary;
	
	@FindBy(css = ".t-Button.t-Button--simple.p_lov_val")
	private WebElement FilterBtn;
	
	@FindBy(id = "btn_submit")
	private WebElement ReportBtn;
	
	@FindBy(css = "div[id='121030000474'] h4")
	private WebElement CreditNoteReport;
	
	@FindBy(css = "div[id='121030000475'] h4")
	private WebElement DebitNoteReport;
	
	@FindBy(css = "div[id='121030000476'] h4")
	private WebElement SourceVat_Issue;
	
	@FindBy(xpath = "//td[normalize-space()='NEW QA SUPPLIER']")
	private WebElement SupplierNameValueForSourceVatIssue;
	
	@FindBy(css = "div[id='121030000477'] h4")
	private WebElement SourceVat_Receive;
	
	@FindBy(xpath = "//td[normalize-space()='New QA Buyer']")
	private WebElement CustomerNameValueForSourceVatReceive;
	
	@FindBy(css = "div[id='121030000500'] h4")
	private WebElement ClosingStock;
	
	@FindBy(xpath = "(//span[@class='t-Button t-Button--simple p_lov_val'])[1]")
	private WebElement ItemNameFilterBtnForClosingStock;
	
	@FindBy(xpath = "(//span[@class='t-Button t-Button--simple p_lov_val'])[2]")
	private WebElement ItemTypeFilterBtnForClosingStock;
	
	@FindBy(xpath = "(//span[@class='t-Button t-Button--simple p_lov_val'])[3]")
	private WebElement ProdTypeFilterBtnForClosingStock;
	
	@FindBy(xpath = "(//td[normalize-space()='Adapalene'])[1]")
	private WebElement ClosingStockItemName;
	
	@FindBy(xpath = "(//td[normalize-space()='Raw Material'])[1]")
	private WebElement ClosingStockItemType;
	
	@FindBy()
	private WebElement ClosingStockProdType; //This Webelement is not use for now. 
	
	@FindBy(css = "div[id='121030000502'] h4")
	private  WebElement RawPackingStockSummary;
	
	@FindBy(xpath = "(//td[normalize-space()='Adapalene'])[1]")
	private WebElement ItemNameForRawPackingStockSummary;
	
	@FindBy(css = "div[id='122030000506'] h4")
	private WebElement CostingCalculation;
	
	@FindBy(xpath = "(//td[normalize-space()='Ambrox (Syrup)'])[1]")
	private WebElement ProductNameOfCostigCalculation;
	
	@FindBy(css = "div[id='122030000507'] h4")
	private WebElement InputOutputCoefficient;
	
	@FindBy(xpath = "(//td[normalize-space()='New QA Product (Product)'])[1]")
	private WebElement PriceDeclarationIdForInputOutputCoefficient;
	
	public MISReportsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public MISReportsPage functionalityForValidateAdvanceTaxReportFile() throws InterruptedException {
		Thread.sleep(1000);
		AdvanceTaxBtn.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2024");
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);	
	}
	
	public MISReportsPage functionalityForValidateProductStockSummaryReportFile() throws InterruptedException {
		Thread.sleep(1000);
		ProductStockSummary.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2024");
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		ItemNameForProductStockSummary.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);			
	}
	
	public MISReportsPage functionalityForValidateCreditNoteReport() throws InterruptedException {
		Thread.sleep(1000);
		CreditNoteReport.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2024");
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	public MISReportsPage functionalityForValidateDebitNoteReport() throws InterruptedException {
		Thread.sleep(1000);
		DebitNoteReport.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2024");
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	public MISReportsPage functionalityForValidateSourceVatIssueReport() throws InterruptedException {
		Thread.sleep(1000);
		SourceVat_Issue.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2024");
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		SupplierNameValueForSourceVatIssue.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	public MISReportsPage functionalityForValidateSourceVatReceiveReport() throws InterruptedException {
		Thread.sleep(1000);
		SourceVat_Receive.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FromDateField.sendKeys("01-Jan-2024");
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		CustomerNameValueForSourceVatReceive.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	public MISReportsPage functionalityForValidateClosingStockReport() throws InterruptedException {
		Thread.sleep(1000);
		ClosingStock.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		ItemNameFilterBtnForClosingStock.click();
		Thread.sleep(1000);
		ClosingStockItemName.click();
		Thread.sleep(1000);
		ItemTypeFilterBtnForClosingStock.click();
		Thread.sleep(1000);
		ClosingStockItemType.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	public MISReportsPage functionalityForValidateRawAndPackingStockSummaryReport() throws InterruptedException {
		Thread.sleep(1000);
		RawPackingStockSummary.click();
		Thread.sleep(1000);
		FromDateField.clear();
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		ItemNameForRawPackingStockSummary.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	public MISReportsPage functionalityForValidateCostingCalculationReport() throws InterruptedException {
		Thread.sleep(1000);
		CostingCalculation.click();
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		ProductNameOfCostigCalculation.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	public MISReportsPage functionalityForValidateInputOutputCoefficient() throws InterruptedException {
		Thread.sleep(1000);
		InputOutputCoefficient.click();
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		PriceDeclarationIdForInputOutputCoefficient.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new MISReportsPage(driver);
	}
	
	
	
}
