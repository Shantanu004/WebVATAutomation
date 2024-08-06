package AllPagesOfTransactionModule;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishGoodsTransferPage {

	WebDriver driver;
	
	//-> Finish Goods Transfer Add Page
	@FindBy(id = "btn_add")
	private WebElement AddBtn;
	
	@FindBy(id = "select2-P91_REC_BRANCH-container")
	private WebElement NameOfTheBranchBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement NameOfTheBranchSearchField;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[1]")
	private WebElement NameOfTheBranchClearBtn;
	
	@FindBy(id = "select2-P91_PREPARED_BY-container")
	private WebElement PreparedByBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement PreparedBySearchField;
	
	@FindBy(css  = "span[id='select2-P91_PREPARED_BY-container'] span[class='select2-selection__clear']")
	private WebElement PreparedByClearBtn;
	
	@FindBy(id = "select2-P91_VEHICLE_NO-container")
	private WebElement VehicleNoBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement VehicleNoSearchField;
	
	@FindBy(css = "span[id='select2-P91_VEHICLE_NO-container'] span[class='select2-selection__clear']")
	private WebElement VehicleNoClearBtn;
	
	@FindBy(id = "select2-P91_ITEM_ID-container")
	private WebElement ItemNameBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement ItemNameSearchField;
	
	@FindBy(id = "P91_TOTAL_QTY")
	private WebElement TotalQtyField;
	
	@FindBy(id = "addchd")
	private WebElement AddItem;
	
	@FindBy(id = "btn_save")
	private WebElement SaveBtn;
	
	@FindBy(className = "alertify-message")
	private WebElement WarningTextMsg;
	
	//-> Finish Goods Transfer Dashboard
	@FindBy(id = "P91_SEARCH")
	private WebElement SearchingInfo;
	
	@FindBy(xpath = "//tbody/tr[2]/td[6]")
	private WebElement VehicleNoTextValue;
	
	@FindBy(xpath = "//tbody/tr[2]/td[8]")
	private WebElement ReceivingBranchTextValue;
	
	@FindBy(xpath = "//tbody/tr[2]/td[3]")
	private WebElement PreparedByTextValue;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement ReportEyeBtn;
	
	@FindBy(xpath = "(//td)[22]")
	private WebElement TotalAmtTextValueInDashBoard;
	
	@FindBy(xpath = "(//span[@class='fa fa-print'])[1]")
	private WebElement PrintBtnAfterSaving;
	
	//-> Finish Goods Transfer Update Page
	@FindBy(xpath = "(//span[@class='fa fa-pencil-square-o'])[1]")
	private WebElement EditBtn;
	
	@FindBy(xpath = "(//input[@id='checkAll_2'])[1]")
	private WebElement AllCheckbtn;
	
	@FindBy(id = "btn_update")	
	private WebElement UpdateBtn;
	
	@FindBy(id = "P91_FGTMST_DATE")
	private WebElement DateAndTimeOfIssue;
	
	@FindBy(className = "totalqty")
	private WebElement TotalQtyFieldInUpdatePage;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement OKBtnForPopupMsg;
	
	
	public FinishGoodsTransferPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public FinishGoodsTransferPage functionalityForValidateAllRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchSearchField.sendKeys("Abc" +Keys.ENTER);
		Thread.sleep(2000);
	    PreparedByBtn.click();
	    Thread.sleep(2000);
	    PreparedBySearchField.sendKeys("Jamil"+Keys.ENTER);
	    Thread.sleep(2000);
		VehicleNoBtn.click();
		Thread.sleep(2000);
		VehicleNoSearchField.sendKeys("011" + Keys.ENTER);
		Thread.sleep(2000);
		ItemInfoAddfunctionality();
		Thread.sleep(2000);
		NameOfTheBranchClearBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchBtn.click();
		Thread.sleep(2000);
		PreparedByClearBtn.click();
		Thread.sleep(2000);
		VehicleNoClearBtn.click();
		Thread.sleep(2000);
		SaveBtn.click();
		return new FinishGoodsTransferPage(driver);
	}
	
	public void ItemInfoAddfunctionality() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(2000);
		ItemNameSearchField.sendKeys("New QA Product 3"+Keys.ENTER);
		Thread.sleep(2000);
		TotalQtyField.sendKeys("1");
		Thread.sleep(2000);
		AddItem.click();
	}
	
	public FinishGoodsTransferPage functionalityForNameOfTheBrnchRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		PreparedByBtn.click();
		Thread.sleep(2000);
		PreparedBySearchField.sendKeys("Jamil"+Keys.ENTER);
		Thread.sleep(2000);
		VehicleNoBtn.click();
		Thread.sleep(2000);
		VehicleNoSearchField.sendKeys("011"+Keys.ENTER);
		Thread.sleep(2000);
		ItemInfoAddfunctionality();
		SaveBtn.click();
		return new FinishGoodsTransferPage(driver);
	} 
	
	public FinishGoodsTransferPage functionalityForPreparedByRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchSearchField.sendKeys("ABC"+Keys.ENTER);
		Thread.sleep(2000);
		VehicleNoBtn.click();
		Thread.sleep(2000);
		VehicleNoSearchField.sendKeys("011"+Keys.ENTER);
		Thread.sleep(2000);
		ItemInfoAddfunctionality();
		SaveBtn.click();
		return new FinishGoodsTransferPage(driver);
	}
	
	public FinishGoodsTransferPage functionalityForVehicleNoRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchSearchField.sendKeys("ABC"+Keys.ENTER);
		Thread.sleep(2000);
		PreparedByBtn.click();
		Thread.sleep(2000);
		PreparedBySearchField.sendKeys("Jamil"+Keys.ENTER);
		Thread.sleep(2000);
		VehicleNoBtn.click();
		Thread.sleep(2000);
		VehicleNoSearchField.sendKeys("011"+Keys.ENTER);
		Thread.sleep(2000);
		VehicleNoClearBtn.click();
		Thread.sleep(2000);
		ItemInfoAddfunctionality();
		Thread.sleep(2000);
		SaveBtn.click();
		return new FinishGoodsTransferPage(driver);
	}
	
	public String displayWarningMsg() {
		return WarningTextMsg.getText();
	}
	
	public FinishGoodsTransferPage functionalityForFinishGoodsTransferRcvInfoSaving() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchSearchField.sendKeys("Abc" +Keys.ENTER);
		Thread.sleep(2000);
	    PreparedByBtn.click();
	    Thread.sleep(2000);
	    PreparedBySearchField.sendKeys("Jamil"+Keys.ENTER);
	    Thread.sleep(2000);
		VehicleNoBtn.click();
		Thread.sleep(2000);
		VehicleNoSearchField.sendKeys("011" + Keys.ENTER);
		Thread.sleep(2000);
		ItemInfoAddfunctionality();
		Thread.sleep(2000);
		SaveBtn.click();
		Thread.sleep(2000);
		SearchingInfoFromDashBoard();
		return new FinishGoodsTransferPage(driver);
	}
	
	public void SearchingInfoFromDashBoard() {
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
		SearchingInfo.sendKeys(formattedDate);
	}
	
	public String displayVehicleNoTextValue() {
		return VehicleNoTextValue.getText();
	}
	
	public void PresentTimeAndDateOfIssue() throws InterruptedException {
		DateAndTimeOfIssue.clear();
		Thread.sleep(2000);
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = currentDate.format(formatter);
		DateAndTimeOfIssue.sendKeys(formattedDate);
		
	}
	
	public FinishGoodsTransferPage functionalityForNameOfTheBranchRequiredFieldInUpdatePage() throws InterruptedException {
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchClearBtn.click();
		Thread.sleep(2000);
		AllCheckbtn.click();
		Thread.sleep(2000);
		UpdateBtn.click();
		return new FinishGoodsTransferPage(driver);
	}
	
	public FinishGoodsTransferPage functionalityForPreparedByRequiredFieldInUpdatePage() throws InterruptedException {
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		PreparedByClearBtn.click();
		Thread.sleep(2000);
		AllCheckbtn.click();
		Thread.sleep(2000);
		UpdateBtn.click();
		return new FinishGoodsTransferPage(driver);
	}
	
	public FinishGoodsTransferPage functionalityForVehicleNoRequiredFieldInUpdatePage() throws InterruptedException {
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		VehicleNoClearBtn.click();
		Thread.sleep(2000);
		PresentTimeAndDateOfIssue();
		Thread.sleep(2000);
		AllCheckbtn.click();
		Thread.sleep(2000);
		UpdateBtn.click();
		return new FinishGoodsTransferPage(driver);
	}
	
	public FinishGoodsTransferPage functionalityForChangingNameOfTheBranchFieldValueInUpdatePage() throws InterruptedException {
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchBtn.click();
		Thread.sleep(2000);
		NameOfTheBranchSearchField.sendKeys("ATI"+Keys.ENTER);
		Thread.sleep(2000);
		PresentTimeAndDateOfIssue();
		Thread.sleep(2000);
		AllCheckbtn.click();
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
		SearchingInfoFromDashBoard();
		return new FinishGoodsTransferPage(driver);
	}
	
	public String displayReceivingBranchTextValue() {
		return ReceivingBranchTextValue.getText();
	}
	
	public FinishGoodsTransferPage functionalityForChangingPreparedByFieldValueInUpdatePage() throws InterruptedException {
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		PreparedByBtn.click();
		Thread.sleep(2000);
		PreparedBySearchField.sendKeys("Sulaiman"+Keys.ENTER);
		Thread.sleep(2000);
		PresentTimeAndDateOfIssue();
		Thread.sleep(2000);
		AllCheckbtn.click();
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
		SearchingInfoFromDashBoard();
		return new FinishGoodsTransferPage(driver);
	}
	
	public String displayPreparedByTextValue() {
		return PreparedByTextValue.getText();
	}
	
	public FinishGoodsTransferPage functionalityForChangingVehiclenoFieldValueInUpdatePage() throws InterruptedException {
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		VehicleNoBtn.click();
		Thread.sleep(2000);
		VehicleNoSearchField.sendKeys("022"+Keys.ENTER);
		Thread.sleep(2000);
		PresentTimeAndDateOfIssue();
		Thread.sleep(2000);
		AllCheckbtn.click();
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
		SearchingInfoFromDashBoard();
		return new FinishGoodsTransferPage(driver);
	}
	
	public String displayvehicleNoTextValue() {
		return VehicleNoTextValue.getText();
	}
	
	public FinishGoodsTransferPage FunctionalityForChangingTotalQtyValueInUpdatepage() throws InterruptedException {
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		AllCheckbtn.click();
		Thread.sleep(2000);
		TotalQtyFieldInUpdatePage.clear();
//		Thread.sleep(2000);
//		OKBtnForPopupMsg.click();
		Thread.sleep(2000);
		TotalQtyFieldInUpdatePage.sendKeys("2");
		Thread.sleep(2000);
		UpdateBtn.click();
		Thread.sleep(2000);
		SearchingInfoFromDashBoard();
		Thread.sleep(2000);
		ReportEyeBtn.click();
		return new FinishGoodsTransferPage(driver);
	}
	
	public String displayTotalAmtTextValueInDashBoard() {
		return TotalAmtTextValueInDashBoard.getText();
	}
	
	public FinishGoodsReceivePage funcationalityForVerifyPDFFileAfterSaving() throws InterruptedException {
		functionalityForFinishGoodsTransferRcvInfoSaving();
		Thread.sleep(1000);
		PrintBtnAfterSaving.click();
		return new FinishGoodsReceivePage(driver);
	}
	
	
}
