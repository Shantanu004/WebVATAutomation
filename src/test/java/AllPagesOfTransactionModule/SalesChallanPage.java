package AllPagesOfTransactionModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SalesChallanPage {

	WebDriver driver;
	
	//Sales Challan Entry Page
	@FindBy(id = "btn_add")
	private WebElement AddBtn;
	
	@FindBy(id = "select2-P61_BUYER_ID-container")
	private WebElement CustomerNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement CustomerSearchField;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement CustomerSelectionClear;
	
	@FindBy(id = "select2-P61_VEHICLE_NO-container")
	private WebElement VehicleNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement VehicleSearchField;
	
	@FindBy(css = "span[id='select2-P61_VEHICLE_NO-container'] span[class='select2-selection__clear']")
	private WebElement VehicleSelectionClear;
	
	@FindBy(id = "select2-P61_ITEM_ID-container")
	private WebElement ItemNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement ItemNameSearchField;
	
	@FindBy(id = "btn_submit")
	private WebElement SalesOrderAddBtn;
	
	@FindBy(id = "P61_TOTAL_QTY")
	private WebElement TotalSalesQty;
	
	@FindBy(css = ".fa.fa-pencil-square-o")
	private WebElement EditSalesOrder;
	
	@FindBy(id = "btn_submit1")
	private WebElement ItemEditAdd;
	
	@FindBy(xpath = "//tbody/tr[3]/td[12]")
	private WebElement EditedTotalQtyTextValue;
	
	@FindBy(xpath = "//tbody/tr[2]/td[15]")
	private WebElement ItemInfoDltBtn;
	
	@FindBy(id = "btn_create")
	private WebElement SalesChallanInfoSaving;  
	
	@FindBy(css = ".alertify-message")
	private WebElement WarningMsgTextValue;
	
	//Sales Challan History
	@FindBy(id = "select2-P61_DATE-container")
	private WebElement DurationBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement DurationSearchField;
	
	@FindBy(id = "P61_SEARCH")
	private WebElement SalesChallanSearchBox;
	
	@FindBy(id = "saleschallanrt_heading")
	private WebElement SalesChallanHeading;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement ReportBtnAfterEditingInfo;
	
	@FindBy(xpath = "(//td[normalize-space()='Foreign Customer'])[1]")
	private WebElement EditingBuyerNameValue;
	
	@FindBy(xpath = "(//td[normalize-space()='45452525'])[1]")
	private WebElement EditingVatRegNoValue;
	
	@FindBy(xpath = "(//span[normalize-space()='Direct Export'])[1]")
	private WebElement EditingChallanTypeValue;
	
	@FindBy(xpath = "(//td[normalize-space()='2'])[1]")
	private WebElement EditingQtyValue;
	
	@FindBy(xpath = "(//td[contains(text(),'376')])[2]")
	private WebElement EditingTotalAmtValue;
	
	@FindBy(xpath = "(//span[@class='fa fa-print'])[1]")
	private WebElement PrintFileBtnAfterEditing;
	
	@FindBy(xpath = "(//span[@class='fa fa-print'])[1]")
	private WebElement PrintBtnAfterVerifying;
	
	//Sales Challan Edit Form	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement SalesChallanItemEdit;
	
	@FindBy(id = "select2-P61_CH_TYPE-container")
	private WebElement EditChallanType;
	
	@FindBy(className = "select2-search__field")
	private WebElement ChallanTypeSearchFieldInEditPage;
	
	@FindBy(id = "select2-P61_BUYER_ID-container")
	private WebElement EditCustomernamebtn;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement EditCustomerNameFieldClear;
	
	@FindBy(id = "select2-P61_VEHICLE_NO-container")
	private WebElement EditVehicleNameBtn;
	
	@FindBy(css = "span[id='select2-P61_VEHICLE_NO-container'] span[class='select2-selection__clear']")
	private WebElement Editvehiclenamefieldclear;
	
	@FindBy(id = "checkAll_2")
	private WebElement InfoCheckBox;
	
	@FindBy(className = "qty")
	private WebElement TotalQtyInEditPage;
	
	@FindBy(id = "btn_update")
	private WebElement VerifyBtn;
	
	@FindBy(id = "btn_cancel1")
	private WebElement CancelBtn;
	
	@FindBy(css = ".alertify-message")
	private WebElement WarningMsg;
	
	@FindBy(name = "f10")
	private WebElement TotalAmt;
	
	@FindBy(xpath = "(//td[normalize-space()='New QA Buyer'])[1]")
	private WebElement BuyerNameTextValueAfterSaving;
	
	public SalesChallanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//--> Add Page 
	public SalesChallanPage functionalityForSavingSalesChallan() throws InterruptedException {
		Thread.sleep(1500);
        AddBtn.click();
        Thread.sleep(1500);
        CustomerNameBtn.click();
        Thread.sleep(1500);
        CustomerSearchField.sendKeys("New QA Buyer" + Keys.ENTER);
        Thread.sleep(1500);
        VehicleNameBtn.click();
        Thread.sleep(1500);
        VehicleSearchField.sendKeys("New QA Vehicle" + Keys.ENTER);
        Thread.sleep(1500);
        ItemNameBtn.click();
        Thread.sleep(2000);
        ItemNameSearchField.sendKeys("New QA Product" + Keys.ENTER);
        Thread.sleep(1500);
        TotalSalesQty.sendKeys("1");
        Thread.sleep(1500);
        SalesOrderAddBtn.click();
        Thread.sleep(1500);
        SalesChallanInfoSaving.click();   
		return new SalesChallanPage(driver);
	}
	
	public String DisplayAfterSavingTextValue() {
		return BuyerNameTextValueAfterSaving.getText();
	}
	
	public String DisplaySalesChallanHeadingText() {
		return SalesChallanHeading.getText();
	}
	
	public SalesChallanPage functionalityForEditingSalesOrderInSalesChallan() throws InterruptedException {
		Thread.sleep(1500);
        AddBtn.click();
        Thread.sleep(1500);
        CustomerNameBtn.click();
        Thread.sleep(1500);
        CustomerSearchField.sendKeys("New QA Buyer" + Keys.ENTER);
        Thread.sleep(1500);
        VehicleNameBtn.click();
        Thread.sleep(1500);
        VehicleSearchField.sendKeys("New QA Vehicle" + Keys.ENTER);
        Thread.sleep(1500);
        ItemNameBtn.click();
        Thread.sleep(2000);
        ItemNameSearchField.sendKeys("New QA Product" + Keys.ENTER);
        Thread.sleep(1500);
        TotalSalesQty.sendKeys("1");
        Thread.sleep(1500);
        SalesOrderAddBtn.click();
        Thread.sleep(1500);
        EditSalesOrder.click();
        Thread.sleep(1500);
        TotalSalesQty.clear();
        Thread.sleep(1500);
        TotalSalesQty.sendKeys("2");
        Thread.sleep(1500);
        ItemEditAdd.click(); 
		return new SalesChallanPage(driver);
	}
	
	public String DisplayEditedTotalAmt() {
		return EditedTotalQtyTextValue.getText();
	}
	
	
	public SalesChallanPage functionalityForRequiredField() throws InterruptedException {
		Thread.sleep(1500);
        AddBtn.click();
        Thread.sleep(1500);
        CustomerNameBtn.click();
        Thread.sleep(1500);
        CustomerSearchField.sendKeys("New QA Buyer" + Keys.ENTER);
        Thread.sleep(1500);
        VehicleNameBtn.click();
        Thread.sleep(1500);
        VehicleSearchField.sendKeys("New QA Vehicle" + Keys.ENTER);
        Thread.sleep(1500);
        ItemNameBtn.click();
        Thread.sleep(2000);
        ItemNameSearchField.sendKeys("New QA Product" + Keys.ENTER);
        Thread.sleep(1500);
        TotalSalesQty.sendKeys("1");
        Thread.sleep(1500);
        SalesOrderAddBtn.click();
        Thread.sleep(1500);
        CustomerSelectionClear.click();
        Thread.sleep(1500);
        CustomerNameBtn.click();
        Thread.sleep(1500);
        VehicleSelectionClear.click();
        Thread.sleep(1500);
        SalesChallanInfoSaving.click(); 
		return new SalesChallanPage(driver);
	}
	
	public String displayWarningMsg() {
		return WarningMsgTextValue.getText();
	}
	
	public SalesChallanPage functionalityCustomerNameRequiredField() throws InterruptedException {
		Thread.sleep(1500);
        AddBtn.click();
        Thread.sleep(1500);
        CustomerNameBtn.click();
        Thread.sleep(1500);
        CustomerSearchField.sendKeys("New QA Buyer" + Keys.ENTER);
        Thread.sleep(1500);
        VehicleNameBtn.click();
        Thread.sleep(1500);
        VehicleSearchField.sendKeys("New QA Vehicle" + Keys.ENTER);
        Thread.sleep(1500);
        ItemNameBtn.click();
        Thread.sleep(2000);
        ItemNameSearchField.sendKeys("New QA Product" + Keys.ENTER);
        Thread.sleep(1500);
        TotalSalesQty.sendKeys("1");
        Thread.sleep(1500);
        SalesOrderAddBtn.click();
        Thread.sleep(1500);
        CustomerSelectionClear.click();
        Thread.sleep(1500);
        CustomerNameBtn.click();
        Thread.sleep(1500);
        SalesChallanInfoSaving.click();   
		return new SalesChallanPage(driver);
	}
	
	public SalesChallanPage functionalityVehicleNameRequiredField() throws InterruptedException {
		Thread.sleep(1500);
        AddBtn.click();
        Thread.sleep(1500);
        CustomerNameBtn.click();
        Thread.sleep(1500);
        CustomerSearchField.sendKeys("New QA Buyer" + Keys.ENTER);
        Thread.sleep(1500);
        VehicleNameBtn.click();
        Thread.sleep(1500);
        VehicleSearchField.sendKeys("New QA Vehicle" + Keys.ENTER);
        Thread.sleep(1500);
        ItemNameBtn.click();
        Thread.sleep(2000);
        ItemNameSearchField.sendKeys("New QA Product" + Keys.ENTER);
        Thread.sleep(1500);
        TotalSalesQty.sendKeys("1");
        Thread.sleep(1500);
        SalesOrderAddBtn.click();
        Thread.sleep(1500);
        VehicleSelectionClear.click();
        Thread.sleep(1500);
        SalesChallanInfoSaving.click(); 
		return new SalesChallanPage(driver);
	}
	
	//-->Edit page
	public SalesChallanPage functionalityForSalesChallanEditPageRequiredField() throws InterruptedException {
		DurationBtn.click();
		DurationSearchField.sendKeys("Today" + Keys.ENTER);
		Thread.sleep(2000);
		SalesChallanItemEdit.click();
		Thread.sleep(2000);
		EditCustomerNameFieldClear.click();
		Thread.sleep(2000);
		EditCustomernamebtn.click();
		Thread.sleep(3000);
		Editvehiclenamefieldclear.click();
		Thread.sleep(2000);
		VerifyBtn.click();
		return new SalesChallanPage(driver);
	}
	
	public String DisplayWarningMsgInEditPageForRequiredField() {
		return WarningMsg.getText();
	}
	
	public SalesChallanPage functionalityForCustomerNameRequiredFieldInEditPage() throws InterruptedException {
		DurationBtn.click();
		DurationSearchField.sendKeys("This Year" + Keys.ENTER);
		Thread.sleep(2000);
		SalesChallanItemEdit.click();
		Thread.sleep(2000);
		EditCustomerNameFieldClear.click();
		Thread.sleep(2000);
		EditCustomernamebtn.click();
		Thread.sleep(2000);
		VerifyBtn.click();
		return new SalesChallanPage(driver);
	}
	
	public SalesChallanPage functionalityForVehicleNameRequiredFieldInEditPage() throws InterruptedException {
		DurationBtn.click();
		DurationSearchField.sendKeys("This Year" + Keys.ENTER);
		Thread.sleep(2000);
		SalesChallanItemEdit.click();
		Thread.sleep(3000);
		Editvehiclenamefieldclear.click();
		Thread.sleep(2000);
		VerifyBtn.click();
		return new SalesChallanPage(driver);
	}
	
	public SalesChallanPage functionalityForTotalQtyfieldInEditPage() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(2000);
		DurationSearchField.sendKeys("This Year" +Keys.ENTER);
		Thread.sleep(2000);
		SalesChallanItemEdit.click();
		Thread.sleep(2000);
		InfoCheckBox.click();
		Thread.sleep(2000);
		TotalQtyInEditPage.sendKeys(Keys.BACK_SPACE);
		return new SalesChallanPage(driver);
	}
	
	public Boolean DisplayTotalAmtInEDitPage() {
		return TotalAmt.isDisplayed();
	}
	
	public void functionalityForChangingValueInEditPage() throws InterruptedException {
		EditChallanType.click();
		Thread.sleep(1000);
		ChallanTypeSearchFieldInEditPage.sendKeys("Direct Export"+Keys.ENTER);
		Thread.sleep(1000);
		CustomerNameBtn.click();
		Thread.sleep(1000);
		CustomerSearchField.sendKeys("Foreign Customer"+Keys.ENTER);
		Thread.sleep(1000);
		VehicleNameBtn.click();
		Thread.sleep(1000);
		VehicleSearchField.sendKeys("Jubayer Transport"+Keys.ENTER);
		Thread.sleep(1000);
		InfoCheckBox.click();
		Thread.sleep(1000);
		TotalQtyInEditPage.clear();
		Thread.sleep(1000);
		TotalQtyInEditPage.sendKeys("2");
	}
	
	public SalesChallanPage functionalityForEditingAndVerifyingSalesChallanInfo() throws InterruptedException {
		functionalityForSavingSalesChallan();
		Thread.sleep(2000);
		SalesChallanItemEdit.click();
		Thread.sleep(1000);
		functionalityForChangingValueInEditPage();
		Thread.sleep(1000);
		VerifyBtn.click();
		Thread.sleep(1000);
		SalesChallanSearchBox.sendKeys("45452525");
		Thread.sleep(1000);
		ReportBtnAfterEditingInfo.click();
		return new SalesChallanPage(driver);
	}
	
	public String ActualEditingBuyerNameTextValue() {
		return EditingBuyerNameValue.getText();
	}
	
	public String ActualEditingVatRegNoTextValue() {
		return EditingVatRegNoValue.getText();
	}
	
	public String ActualEditingChallanTypeTextValue() {
		return EditingChallanTypeValue.getText();
	}
	
	public String ActualEditingQtyValue() {
		return EditingQtyValue.getText();
	}
	
	public String ActualEditingTotalAmt() {
		return EditingTotalAmtValue.getText();
	}
	
	public SalesChallanPage functionalityForVerifyPrintedPdfFile() throws InterruptedException {
		functionalityForEditingAndVerifyingSalesChallanInfo();
		Thread.sleep(1000);
		PrintFileBtnAfterEditing.click();
		return new SalesChallanPage(driver);
	}
	
	public SalesChallanPage functionalityForSavingAndVerifiedPDFFile() throws InterruptedException {
		functionalityForSavingSalesChallan();
		Thread.sleep(2000);
		SalesChallanItemEdit.click();
		Thread.sleep(1000);
		VerifyBtn.click();
		Thread.sleep(2000);
		PrintBtnAfterVerifying.click();
		return new SalesChallanPage(driver);
		
	}
	
}

