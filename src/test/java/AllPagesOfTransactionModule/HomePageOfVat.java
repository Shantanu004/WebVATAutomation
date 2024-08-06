package AllPagesOfTransactionModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AllPagesForReportModule.GeneralReportPage;
import AllPagesForReportModule.MISReportsPage;
import AllPagesForReportModule.VATRebateReport;


public class HomePageOfVat {

	WebDriver driver;
	
	@FindBy(id = "P1_TODATE_LABEL")
	private WebElement WelComeToHomePageBySuccessfullyLogin;
	
	@FindBy(id = "t_Button_navControl")
	private WebElement NavigationBarClick;
	
	@FindBy(linkText = "Transaction")
	private WebElement ClickOnTransaction;
	
	@FindBy(linkText = "Opening Balance")
	private WebElement ClickOnOpeningBalance;
	
	@FindBy(linkText = "Purchase Receive")
	private WebElement ClickOnPurchaseReceivePageBtn;
	
	@FindBy(linkText = "Purchase Return")
	private WebElement ClickOnPurchaseReturnPage;
	
	@FindBy(linkText = "Costing Calculation")
	private WebElement ClickOnCostingCalculationPage;
	
	@FindBy(linkText = "Input-Output Coefficient")
	private WebElement ClickOnInputOutCoefficientPage;
	
	@FindBy(linkText = "Batch Setup")
	private WebElement ClickOnBatchSetUpPage;
	
	@FindBy(linkText = "Consumption (Raw & Packing) Materials")
	private WebElement ClickOnConsumptionRawAndPackingMaterials;
	
	@FindBy(linkText = "Finished Goods Receive")
	private WebElement ClickOnFinishGoodsReceivePage;
	
	@FindBy(linkText = "Sales Challan")
	private WebElement ClickOnSalesChallanPage;
	
	@FindBy(linkText = "Sales Return")
	private WebElement ClickOnSalesReturnPage;
	
	@FindBy(linkText = "Miscellaneous Adjustment")
	private WebElement ClickOnMiscellaneousAdjustment;
	
	@FindBy(linkText = "Finish Goods Transfer (6.5)")
	private WebElement ClickOnFinishGoodsTransferPage;
	
	@FindBy(linkText = "Goods Transfer Receive")
	private WebElement ClickOnGoodsTransferReceivePage;
	
	@FindBy(linkText = "Treasury Challan")
	private WebElement ClickOnTreasuryChallanPage;
	
	@FindBy(linkText = "Useless Wastage Raw Or Packing materials(Mushak-4.4)")
	private WebElement ClickOnUselessWastageRawOrPackingMaterialsPage;
	
	@FindBy(linkText = "Useless Wastage Product")
	private WebElement ClickOnUselessWastageProduct;
	
	@FindBy(linkText = "Source vat")
	private WebElement ClickOnSourceVat;
	
	//--> Reports Module
	
	@FindBy(linkText = "Reports")
	private WebElement ReportsModule;
	
	@FindBy(linkText = "General Report")
	private WebElement GeneralReport;
	
	@FindBy(linkText = "VAT & Rebate Report")
	private WebElement VATRebateReport;
	
	@FindBy(linkText = "MIS Reports")
	private WebElement MISReports;
	
	
	
	public HomePageOfVat(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String AfterLoginVerifyingDisplayedOfHomePage() {
		String displayStatus = WelComeToHomePageBySuccessfullyLogin.getText();
		return displayStatus;
	}
	
	public OpeningBalancePage HomePageToNavigateOpeningBalance() {
		NavigationBarClick.click();
		ClickOnTransaction.click();
		ClickOnOpeningBalance.click();
		return new OpeningBalancePage(driver);
	}
	
  public PurchaseReceivePage HomePageToNavigatePurhcaseReceive() {
		NavigationBarClick.click();
		ClickOnTransaction.click();
		ClickOnPurchaseReceivePageBtn.click();
		return new PurchaseReceivePage(driver);
	}
	
  public PurchaseReturnPage HomePageToNavigatePurhcaseReturn() {
		
		NavigationBarClick.click();
		ClickOnTransaction.click(); 
		ClickOnPurchaseReturnPage.click();
		return new PurchaseReturnPage(driver);
	}
	
	public CostingCalculationPage HomePageToNavigateCostingCalculationPage() {
		
		NavigationBarClick.click();
		ClickOnTransaction.click(); 
		ClickOnCostingCalculationPage.click();
		return new CostingCalculationPage(driver);
	}
	
	public InputOutputCoefficientPage HomePageToNavigateInputOutputCoefficient() {
		NavigationBarClick.click();
		ClickOnTransaction.click(); 
		ClickOnInputOutCoefficientPage.click();
		return new InputOutputCoefficientPage(driver);
			
	}
	
	public BatchSetUpPage HomePageToNavigateBatchSetUp() {
		NavigationBarClick.click();
		ClickOnTransaction.click();
		ClickOnBatchSetUpPage.click();
	    return new BatchSetUpPage(driver);			
	}

	public Consumption_RawAndPackingMaterialsPage HomePageToNavigateConsumption() {
		NavigationBarClick.click();
		ClickOnTransaction.click();
		ClickOnConsumptionRawAndPackingMaterials.click();
		return new Consumption_RawAndPackingMaterialsPage(driver);
	}
	
	public FinishGoodsReceivePage HomePageToNavigateFinishGoodsReceivePage() {
		NavigationBarClick.click();
		ClickOnTransaction.click();
		ClickOnFinishGoodsReceivePage.click();
	    return new FinishGoodsReceivePage(driver); 	
	}
	
	public SalesChallanPage HomePageToNavigateSalesChallanPage() {
		NavigationBarClick.click();
		ClickOnTransaction.click();
		ClickOnSalesChallanPage.click();
	    return new SalesChallanPage(driver); 	
	}
	
	public SalesReturnPage HomePageToNavigateSalesReturnPage() {
		NavigationBarClick.click();
		ClickOnTransaction.click();
		ClickOnSalesReturnPage.click();
	    return new SalesReturnPage(driver); 	
	}
	
	public MiscellaneousAdjustmentPage HomePageToNavigateMiscellaneousAdjustmentPage() throws InterruptedException {
		Thread.sleep(1500);
		NavigationBarClick.click();
		Thread.sleep(1500);
		ClickOnTransaction.click();
		Thread.sleep(1500);
		ClickOnMiscellaneousAdjustment.click();
	    return new MiscellaneousAdjustmentPage(driver); 	
	}
	
   public FinishGoodsTransferPage HomePageToNavigateFinishGoodsTransferPage() throws InterruptedException {
	    Thread.sleep(1500);
		NavigationBarClick.click();
		Thread.sleep(1500);
		ClickOnTransaction.click();
		Thread.sleep(1500);
		ClickOnFinishGoodsTransferPage.click();
	    return new FinishGoodsTransferPage(driver);
   }
   
   public GoodsTransferReceivePage HomePageToNavigateGoodsTransferReceivePage() throws InterruptedException {
	    Thread.sleep(1500);
		NavigationBarClick.click();
		Thread.sleep(1500);
		ClickOnTransaction.click();
		Thread.sleep(1500);
		ClickOnGoodsTransferReceivePage.click();
	    return new GoodsTransferReceivePage(driver);
  }
	
	public TreasuryChallanPage HomePageToNavigateTreasuryChallanPage() throws InterruptedException {
		Thread.sleep(1500);
		NavigationBarClick.click();
		Thread.sleep(1500);
		ClickOnTransaction.click();
		Thread.sleep(1500);
		ClickOnTreasuryChallanPage.click();
		return new TreasuryChallanPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage HomePageToNavigateUselessWastageRawOrPackingMaterialsPage() throws InterruptedException {
		Thread.sleep(1500);
		NavigationBarClick.click();
		Thread.sleep(1500);
		ClickOnTransaction.click();
		Thread.sleep(1500);
		ClickOnUselessWastageRawOrPackingMaterialsPage.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageProduct HomePageToNavigateUselessWastageProduct() throws InterruptedException {
		Thread.sleep(1500);
		NavigationBarClick.click();
		Thread.sleep(1500);
		ClickOnTransaction.click();
		Thread.sleep(1500);
		ClickOnUselessWastageProduct.click();
		return new UselessWastageProduct(driver);
	}
	
	public SourceVatPage HomePageToNavigateSourceVat() throws InterruptedException {
		Thread.sleep(1500);
		NavigationBarClick.click();
		Thread.sleep(1500);
		ClickOnTransaction.click();
		Thread.sleep(1500);
		ClickOnSourceVat.click();
		return new SourceVatPage(driver);
	}
	
	//--> Report Module
	public GeneralReportPage HomePageToNavigateGeneralReport() throws InterruptedException {
		Thread.sleep(1000);
		NavigationBarClick.click();
		Thread.sleep(1000);
		ReportsModule.click();
		Thread.sleep(1000);
		GeneralReport.click();
		return new GeneralReportPage(driver);
	}
	
	public VATRebateReport HomePageToNavigateVATRebateReport() throws InterruptedException {
		Thread.sleep(1000);
		NavigationBarClick.click();
		Thread.sleep(1000);
		ReportsModule.click();
		Thread.sleep(1000);
		VATRebateReport.click();
		return new VATRebateReport(driver);
	}
	
	public MISReportsPage HomePageToNavigateMISReports() throws InterruptedException {
		Thread.sleep(1000);
		NavigationBarClick.click();
		Thread.sleep(1000);
		ReportsModule.click();
		Thread.sleep(1000);
		MISReports.click();
		return new MISReportsPage(driver);
	}
	
}
