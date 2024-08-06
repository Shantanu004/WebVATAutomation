package AllPagesOfTransactionModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UselessWastageRawOrPackingMaterialsPage {

	WebDriver driver;
	
	@FindBy(id = "addchd")
	private WebElement AddBtn;
	
	@FindBy(xpath = "//span[contains(text(),'(No Data Found.)')]")
	private WebElement NoDataFoundMsg;
	
	@FindBy(id = "select2-P95_ITEM_NAME-container")
	private WebElement ItemNameBtn; 
	
	@FindBy(className = "select2-search__field")
	private WebElement ItemNameSearchField;
	
	@FindBy(id = "P95_RM_RECNO")
	private WebElement ReceiveDate;

	@FindBy(id = "P95_QUANTITY")
	private WebElement QtyField;
	
	@FindBy(id = "P95_PRESENT_PRICE")
	private WebElement PresentPrice;
//	
	@FindBy(id = "btn_cancel")
	private WebElement ClearBtn;
//	
	@FindBy(id = "btn_save")
	private WebElement SaveBtn;

//This locator founded as a compound class for that it shows error. 	
//	@FindBy(className = "fa fa-pencil-square-o")
//	private WebElement EditBtn;

	@FindBy(xpath = "//span[@class='fa fa-pencil-square-o']") 
	private WebElement EditBtn;
	
	@FindBy(xpath = "//span[@class='fa fa-trash']")
	private WebElement DeleteBtn;
	
	@FindBy(id = "select2-P95_DURATION-container")
	private WebElement DurationBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement DurationSearchField;
	
	@FindBy(id = "P95_FROM_DATE")
	private WebElement FromDate;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement FromDateBtn;
	
	@FindBy(xpath = "//li[1]//a[1]//div[1]//h4[1]")
	private WebElement ItemInfoBtn;
	
	@FindBy(id = "btn_update")
	private WebElement UpdateBtn;
	
	@FindBy(xpath = "(//option[@value='RC01230800915'])[1]")
	private WebElement UpdatedReceiveDateValue;
	
	@FindBy(xpath = "//option[@value='I012307001838']")
	private WebElement UpdatedItemNameValue;
	
	@FindBy(id = "P95_SEARCH")
	private WebElement SearchBox;
	
	@FindBy(xpath = "//div[contains(@class,'col col-4')]//h4[1]")
	private WebElement ActualSearchingResult;
	
	@FindBy(xpath = "//td[normalize-space()='New QA Raw Material 3']")
	private WebElement ActualEditingItemNameValue;
	
	@FindBy(xpath = "//td[normalize-space()='RC01230700878']")
	private WebElement ActualEditingReceiveNameValue;
	
	@FindBy(xpath = "//td[normalize-space()='2']")
	private WebElement ActualEditingQtyValue;
	
	@FindBy(xpath = "//td[normalize-space()='55']")
	private WebElement ActualEditingPresentPrice;
	
	@FindBy(id = "btn_submit")
	private WebElement ReportBtn;
	
	public UselessWastageRawOrPackingMaterialsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForValidateAllRequiredField() {
		AddBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForValidateItemNameRequiredField() throws InterruptedException {
		QtyField.sendKeys("1");
		Thread.sleep(1000);
		PresentPrice.sendKeys("60");
		Thread.sleep(1000);
		AddBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForValidateReceiveDateRequiredField() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(1000);
        ItemNameSearchField.sendKeys("New QA Raw Material 1"+Keys.ENTER);
        Thread.sleep(1000);
        QtyField.sendKeys("1");
        Thread.sleep(1000);
        PresentPrice.sendKeys("60");
        Thread.sleep(1000);
        AddBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForValidatePresentPriceRequiredField() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 1"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("1");
		Thread.sleep(1000);
		AddBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForValidateQtyRequiredField() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 1"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		PresentPrice.sendKeys("1");
		Thread.sleep(1000);
		AddBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public String DisplayMsgForEmptyData() {
		return NoDataFoundMsg.getText();
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForValidateSavingInfo() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 1"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("1");
		Thread.sleep(1000);
		PresentPrice.sendKeys("60");
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1000);
		ItemInfoBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForUpdatingPresentPrice() throws InterruptedException {
		Thread.sleep(1000);
		ItemInfoBtn.click();
		Thread.sleep(1000);
		PresentPrice.clear();
		Thread.sleep(1000);
		PresentPrice.sendKeys("50");
		Thread.sleep(1000);
		UpdateBtn.click();
		Thread.sleep(1000);
		ItemInfoBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public Boolean DisplayActualPresentPriceValue() {
		return PresentPrice.isDisplayed();	
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForUpdatingQtyValue() throws InterruptedException {
		Thread.sleep(1000);
		ItemInfoBtn.click();
		Thread.sleep(1000);
		QtyField.clear();
		Thread.sleep(1000);
		QtyField.sendKeys("2");
		Thread.sleep(1000);
		UpdateBtn.click();
		Thread.sleep(1000);
		ItemInfoBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public Boolean DisplayActualQtyValue() {
		return QtyField.isDisplayed();	
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForUpdatingReceiveDate() throws InterruptedException {
		Thread.sleep(1000);
		ItemInfoBtn.click();
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		UpdateBtn.click();
		Thread.sleep(1000);
		ItemInfoBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public Boolean DisplayActualReceiveDateValue() {
		return UpdatedReceiveDateValue.isDisplayed();	
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForUpdatingItemName() throws InterruptedException {
		Thread.sleep(1000);
		ItemInfoBtn.click();
		Thread.sleep(1000);
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 2"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		UpdateBtn.click();
		Thread.sleep(1000);
		ItemInfoBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public Boolean DisplayActualItemNameValue() {
		return UpdatedItemNameValue.isDisplayed();	
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForvalidateClearBtn() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDate.clear();
		Thread.sleep(1000);
		FromDate.sendKeys("01-FEB-2024");
		Thread.sleep(1000);
		FromDateBtn.click();
		Thread.sleep(1000);
		ItemInfoBtn.click();
		Thread.sleep(1000);
		ClearBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForvalidateSarchingItem() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDate.clear();
		Thread.sleep(1000);
		FromDate.sendKeys("01-FEB-2024");
		Thread.sleep(1000);
		FromDateBtn.click();
		Thread.sleep(1000);
		SearchBox.sendKeys("New QA Raw Material 2" + Keys.SPACE);
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public String DisplayActualSearchingValue() throws InterruptedException {
		return ActualSearchingResult.getText();
	}
	
	public void functionalityForEditingItemAndReceiveDateInfo() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 1"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("1");
		Thread.sleep(1000);
		PresentPrice.sendKeys("60");
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		EditBtn.click();
		Thread.sleep(1000);
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 3"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PresentPrice.sendKeys(Keys.ENTER);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForEditingItemNameInfo() throws InterruptedException {
	    functionalityForEditingItemAndReceiveDateInfo(); 
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public String DisplayActualItemNameEditingValue() throws InterruptedException {
		return ActualEditingItemNameValue.getText();
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForEditingReceiveDateInfo() throws InterruptedException {
	    functionalityForEditingItemAndReceiveDateInfo();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public String DisplayActualReceiveNumberEditingValue() {
		System.out.println(ActualEditingReceiveNameValue.getText());
		return ActualEditingReceiveNameValue.getText();
	}
	
	public void functionalityForEditingInfo() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 1"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("1");
		Thread.sleep(1000);
		PresentPrice.sendKeys("60");
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		EditBtn.click();
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForEditingQtyValue() throws InterruptedException {
		functionalityForEditingInfo();
		Thread.sleep(1000);
		QtyField.clear();
		Thread.sleep(1000);
		QtyField.sendKeys("2"+Keys.ENTER);
		Thread.sleep(1000);
		PresentPrice.sendKeys(Keys.ENTER);
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public String DisplayActualQtyEditingValue() {
		return ActualEditingQtyValue.getText();
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForEditingPresentPriceValue() throws InterruptedException {
		functionalityForEditingInfo();
		Thread.sleep(1000);
		EditBtn.click();
		Thread.sleep(1000);
		PresentPrice.clear();
		Thread.sleep(1000);
		PresentPrice.sendKeys("55"+Keys.ENTER);
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public String DisplayActualPresentPriceEditingValue() {
		return ActualEditingPresentPrice.getText();
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForDeleteItem() throws InterruptedException {
		ItemNameBtn.click();
		Thread.sleep(1000);
		ItemNameSearchField.sendKeys("New QA Raw Material 1"+Keys.ENTER);
		Thread.sleep(1000);
		ReceiveDate.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("1");
		Thread.sleep(1000);
		PresentPrice.sendKeys("60");
		Thread.sleep(1000);
		AddBtn.click();
		Thread.sleep(1000);
		DeleteBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	public UselessWastageRawOrPackingMaterialsPage functionalityForGenerateReportBtn() throws InterruptedException {
	    DurationBtn.click();
	    Thread.sleep(1000);
	    DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
	    Thread.sleep(1000);
	    FromDateBtn.click();
	    Thread.sleep(1000);
	    FromDate.clear();
	    Thread.sleep(1000);
	    FromDate.sendKeys("01-MAY-2024");
	    Thread.sleep(1000);
	    FromDateBtn.click();
	    Thread.sleep(1000);
		ItemInfoBtn.click();
		Thread.sleep(1000);
		ReportBtn.click();
		return new UselessWastageRawOrPackingMaterialsPage(driver);
	}
	
	
}
