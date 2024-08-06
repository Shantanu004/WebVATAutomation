package AllPagesForReportModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VATRebateReport {

	WebDriver driver;
	
    @FindBy(css = "div[id='121030000478'] h4")
	private WebElement VatRebateMushak6Point1PurchaseRcvReport;
	
    @FindBy(id = "apex_date_01_00")
    private WebElement ToDateField;
    
    @FindBy(xpath = "//span[@class='t-Button t-Button--simple p_lov_val']")
    private WebElement FilterBtn;
    
    @FindBy(xpath = "//span[@class='t-Button t-Button--simple p_lov_val_cal']")
    private WebElement InfoDeleteBtn;
    
    @FindBy(xpath = "//td[normalize-space()='Alovera Leaf']")
    private WebElement PurchaseRcvItemNameForVATRebateMushak6Point1;
    
    @FindBy(css = "div[id='121030000479'] h4")
    private WebElement SalesRegisterMushak6Point2;
    
    @FindBy(xpath = "//td[normalize-space()='Final Product']")
    private WebElement ProductNameForSalesRegisterMushak6Point2;
    
    @FindBy(css = "div[id='121030000482'] h4")
    private WebElement Mushak6Point10MoreThantwoLakhPurchase;
    
    @FindBy(css = "div[id='121030000483'] h4")
    private WebElement Mushakl6Point10MoreThanTwoLakhSales;
	
    @FindBy(css = "div[id='121030000487'] h4")
    private WebElement Mushak6Point2Point1PurchaseSalesRegister;
    
    @FindBy(xpath = "//td[normalize-space()='Ambrox']")
    private WebElement ProductNameForMushak6Point2Point1;
    
    @FindBy(css = "div[id='121030000496'] h4")
	private WebElement Mushak9Point1VATRtnEngV2;
    
    @FindBy(xpath = "//td[normalize-space()='Amended Return (Section 66)']")
    private WebElement ClauseInfoValue;
    
    @FindBy(css = "div[id='122080000510'] h4")
    private WebElement PurchaseReturnMushak6Point8DebitNote;
    
    @FindBy(xpath = "(//td[@class='t-Report-cell'][normalize-space()='(1001001)'])[1]")
    private WebElement PurchaseReturnNameValue;
    
    @FindBy(xpath = "//h4[normalize-space()='Finished Goods Transfer (Mushak-6.5)']")
    private WebElement FinishGoodsTransferMushak6Point5;
    
    @FindBy(xpath = "//td[normalize-space()='(10-MAY-2023)']")
    private WebElement BranchNoValueForMushak6Point5;
    
    @FindBy(css = "div[id='122100000512'] h4")
    private WebElement UselessRawAndpackingMaterialMushak4Point4; 
    
    @FindBy(xpath = "(//td[@class='t-Report-cell'][normalize-space()='Clopid -AS Tab.'])[1]")
    private WebElement ItemNameForMushak4Point4;
    
    @FindBy(id = "btn_submit")
    private WebElement ReportBtn;
    
	public VATRebateReport(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public VATRebateReport functionalityForValidateMushak6Point1PurchaseRcv() throws InterruptedException {
		Thread.sleep(1000);
		VatRebateMushak6Point1PurchaseRcvReport.click();
		Thread.sleep(1000);
		ToDateField.clear();
		Thread.sleep(1000);
		ToDateField.sendKeys("01-Jan-2020");
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		PurchaseRcvItemNameForVATRebateMushak6Point1.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}	
	
	public VATRebateReport functionalityForValidateMushak6Point2SalesRegister() throws InterruptedException {
		Thread.sleep(1000);
		SalesRegisterMushak6Point2.click();
		Thread.sleep(1000);
		ToDateField.clear();
		Thread.sleep(1000);
		ToDateField.sendKeys("01-Jan-2020");
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		ProductNameForSalesRegisterMushak6Point2.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}
	
	public VATRebateReport functionalityForValidateMushak6Point10MoreThanTakaTwoLakhTakaPurchase() throws InterruptedException {
		Thread.sleep(1000);
		Mushak6Point10MoreThantwoLakhPurchase.click();
		Thread.sleep(1000);
		ToDateField.clear();
		Thread.sleep(1000);
		ToDateField.sendKeys("01-Jan-2020");
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}
	
	public VATRebateReport functionalityForValidateMushak6Point10MoreThanTwoLakhSales() throws InterruptedException {
		Thread.sleep(1000);
		Mushakl6Point10MoreThanTwoLakhSales.click();
		Thread.sleep(1000);
		ToDateField.clear();
		Thread.sleep(1000);
		ToDateField.sendKeys("01-Jan-2020");
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}
	
	public VATRebateReport functionalityForValidateMushak6Point2Point1PurchaseSalesRegister() throws InterruptedException {
		Thread.sleep(1000);
		Mushak6Point2Point1PurchaseSalesRegister.click();
		Thread.sleep(1000);
		ToDateField.clear();
		Thread.sleep(1000);
		ToDateField.sendKeys("01-Jan-2020");
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		ProductNameForMushak6Point2Point1.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}
	
	public VATRebateReport functionalityForValidateMushak9Point1VatRtnEngV2() throws InterruptedException {
		Thread.sleep(1000);
		Mushak9Point1VATRtnEngV2.click();
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		ClauseInfoValue.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}
	
	public VATRebateReport functionalityForValidateMushak6Point8PurchaseReturn() throws InterruptedException {
		Thread.sleep(1000);
		PurchaseReturnMushak6Point8DebitNote.click();
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		PurchaseReturnNameValue.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}
	
	public VATRebateReport functionalityForValidateMushak6Point5FinishGoodTransfer() throws InterruptedException {
		Thread.sleep(1000);
		FinishGoodsTransferMushak6Point5.click();
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		BranchNoValueForMushak6Point5.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	}
	
	public VATRebateReport functionalityForValidateMushak4Point4UselessRawAndPackingMaterials() throws InterruptedException {
		Thread.sleep(1000);
		UselessRawAndpackingMaterialMushak4Point4.click();
		Thread.sleep(1000);
		FilterBtn.click();
		Thread.sleep(1000);
		ItemNameForMushak4Point4.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new VATRebateReport(driver);
	} 
	
	
}
