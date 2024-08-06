package AllPagesForReportModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralReportPage {

	WebDriver driver;
	
	@FindBy(id = "P92_SEARCH_REPORT")
	private WebElement SearchFieldOfGenerralReportPage;
	
	@FindBy(xpath = "//h4[normalize-space()='Product Information']")
	private WebElement ProductInformation;
	
	@FindBy(css = "div[id='121030000495'] h4")
	private WebElement ProductInformation_HSCode;
	
	@FindBy(css = "div[id='121030000497'] h4")
	private WebElement StatementOfRebate_HSCode;
	
	@FindBy(id = "apex_date_01_00")
	private WebElement DateOfParameter1OfStatementOfRebate;
	
	@FindBy(id = "apex_date_02_00")
	private WebElement DateOfParameter2OfStatementOfRebate;
	
	@FindBy(css = "div[id='121030000498'] h4")
	private WebElement MonthlySalesRebate_HSCode;
	
	@FindBy(css = "div[id='121030000499'] h4")
	private WebElement SupplierWisePurchase;
	
	@FindBy(css = "div[id='121070000504'] h4")
	private WebElement Mushak6point3;
	
	@FindBy(xpath = "//span[@class='t-Button t-Button--simple p_lov_val']")
	private WebElement FilterBtnOfInfo;
	
	@FindBy(xpath = "//span[@class='t-Button t-Button--simple p_lov_val_cal']")
	private WebElement ChallanNoDltBtn;
	
	@FindBy(id = "P92_SEARCH")
	private WebElement SearchingFieldOfInfo;
	
	@FindBy(xpath = "//td[normalize-space()='95/23-24 (05-MAY-2024)']")
	private WebElement ChallanNoSearchingItem;
	
	@FindBy(xpath = "//td[normalize-space()='1/23-23 (28-FEB-2023)']")
	private WebElement ChallanNoItemOfMushak6Point3;
	
	@FindBy(id = "btn_cancel")
	private WebElement CancelBtn;
	
	@FindBy(css = "div[id='122080000508'] h4")
	private WebElement Mushak6Point6SourceVat;
	
	@FindBy(id = "apex_date_01_00")
	private WebElement ChallanFromDateFieldOfMushak6point6;
	
	@FindBy(id = "apex_date_01_01")
	private WebElement ChallanToDateFieldOfMushak6Point6;
	
	@FindBy(xpath = "//td[normalize-space()='Drug International Ltd (Head Office) (51)']")
	private WebElement SourceVATValue;
	
	@FindBy(css = "div[id='122080000509'] h4")
	private WebElement SalesReturn6PointSeven;
	
	@FindBy(xpath = "//td[normalize-space()='5454 (UD01230900799)']")
	private WebElement SalesReturnProduct;
	
	@FindBy(css = "div[id='122100000513'] h4")
	private WebElement UselessProductWastage4PointFive;
	
	@FindBy(xpath = "(//td[@class='t-Report-cell'][normalize-space()='New QA Product'])[1]")
	private WebElement UselessProductItem;
	
	@FindBy(css = "div[id='122110000514'] h4")
	private WebElement ReceiveItemFromSupplier;
	
	@FindBy(id = "btn_submit")
	private WebElement ReportBtn;
	
	public GeneralReportPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public GeneralReportPage functionalityForValidateProductInformationFile() throws InterruptedException {
	    Thread.sleep(1000);
		ProductInformation.click();
	    Thread.sleep(1000);
	    ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	public GeneralReportPage functionalityForValidateHSCodeWiseProductionInformation() throws InterruptedException {
		Thread.sleep(1000);
		ProductInformation_HSCode.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	public GeneralReportPage functionalityForHSCodeWiseStatementOfRebate() throws InterruptedException {
		Thread.sleep(1000);
		StatementOfRebate_HSCode.click();
		Thread.sleep(1000);
		DateOfParameter1OfStatementOfRebate.clear();
		Thread.sleep(1000);
		DateOfParameter1OfStatementOfRebate.sendKeys("01-May-2024");
		Thread.sleep(1000);
		ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	public GeneralReportPage functionalityForHSCodeWiseMonthlySalesRebate() throws InterruptedException {
		Thread.sleep(1000);
		MonthlySalesRebate_HSCode.click();
		Thread.sleep(1000);
		DateOfParameter1OfStatementOfRebate.clear();
		Thread.sleep(1000);
		DateOfParameter1OfStatementOfRebate.sendKeys("01-May-2024");
		Thread.sleep(1000);
		ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	public GeneralReportPage functionalityForValidateSupplierWisePurchaseReport() throws InterruptedException {
		Thread.sleep(1000);
		SupplierWisePurchase.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new GeneralReportPage(driver);	
	}
	
	public GeneralReportPage functionalityForValidateMushak6Point3ReportFile() throws InterruptedException {
		Thread.sleep(1000);
		Mushak6point3.click();
		Thread.sleep(1000);
		FilterBtnOfInfo.click();
		//Thread.sleep(1000);
		//ChallanNOSearchingField.sendKeys("95/23-24 (05-MAY-2024)");
		Thread.sleep(3000);
        ChallanNoItemOfMushak6Point3.click();
        Thread.sleep(1000);
        ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	public GeneralReportPage functionalityForValidateMushak6Point6ForSourceVatReportFile() throws InterruptedException {
		Thread.sleep(1000);
		Mushak6Point6SourceVat.click();
		Thread.sleep(1000);
		ChallanFromDateFieldOfMushak6point6.clear();
		Thread.sleep(1000);
		ChallanFromDateFieldOfMushak6point6.sendKeys("01-May-2020");
		Thread.sleep(1000);
		FilterBtnOfInfo.click();
		Thread.sleep(1000);
		SourceVATValue.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	public GeneralReportPage functionalityForValidateSalesReturnMushak6Point7() throws InterruptedException {
		Thread.sleep(1000);
		SalesReturn6PointSeven.click();
		Thread.sleep(1000);
		FilterBtnOfInfo.click();
		Thread.sleep(1000);
		SalesReturnProduct.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	public GeneralReportPage functionalityForValidateUselessProductWastageMushak4Point5() throws InterruptedException {
		Thread.sleep(1000);
		UselessProductWastage4PointFive.click();
		Thread.sleep(1000);
		FilterBtnOfInfo.click();
		Thread.sleep(1000);
		UselessProductItem.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new GeneralReportPage(driver);
	}
	
	
}
