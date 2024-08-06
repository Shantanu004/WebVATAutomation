package AllPagesOfTransactionModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UselessWastageProduct {

	WebDriver driver;
	
	@FindBy(id = "select2-P96_ITEM_NAME-container")
	private WebElement ItemName;
	
	@FindBy(className = "select2-search__field")
	private WebElement ItemSearchField;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement ItemNameClearBtn;
	
	@FindBy(id = "P96_QUANTITY")
	private WebElement QtyField;
	
	@FindBy(id = "P96_PRESENT_PRICE")
	private WebElement PresentPrice;
	
	@FindBy(id = "addchd")
	private WebElement AddBtn;
	
	@FindBy(xpath = "//span[@class='fa fa-pencil-square-o']")
	private WebElement EditBtn;
	
	@FindBy(xpath = "(//span[@class='t-Icon fa fa-trash'])[3]")
	private WebElement DeleteBtn;
	
	@FindBy(id = "btn_save")
	private WebElement SaveBtn;
	
	@FindBy(id = "btn_cancel")
	private WebElement ClearBtn;
	
	@FindBy(id = "select2-P96_DURATION-container")
	private WebElement DurationBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement DurationSearchField;
	
	@FindBy(id = "P96_FROM_DATE")
	private WebElement FromDate;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement FromDateBtn;
	
	@FindBy(id = "P96_SEARCH")
	private WebElement SearchField;
	
	@FindBy(className = "alertify-message")
	private WebElement WarningMsg;
	
	@FindBy(css = "tbody tr td:nth-child(6)")
	private WebElement ActualExactPrice;
	
	@FindBy(xpath = "//div[contains(@class,'col col-4')]//h4[1]")
	private WebElement ActualSavingInfo;
	
	@FindBy(css = "div[id='UL01240200315'] h4:nth-child(1)")
	private WebElement ItemInfo;
	
	@FindBy(id = "btn_update")
	private WebElement UpdateBtn;
	
	@FindBy(css = "span[class='a-IRR-noDataMsg-text'] h4 span")
	private WebElement NoDataTextMsg;
	
	@FindBy(css = ".alertify-message")
	private WebElement ActualWarningMsg;
	
	@FindBy(id = "btn_submit")
	private WebElement ReportBtnForPdfGenerating;
	
	@FindBy(css = "div[id='UL01240500326'] h4:nth-child(1)")
	private WebElement ItemInfoForReportGenerate;
	
	public UselessWastageProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public UselessWastageProduct functionalityForValidateAllRequiredField() throws InterruptedException {
		Thread.sleep(1000);
		AddBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public UselessWastageProduct functionalityForValidateItemNameRequiredField() throws InterruptedException {
		Thread.sleep(1000);
		QtyField.sendKeys("10");
		Thread.sleep(1000);
		PresentPrice.sendKeys("100");
		Thread.sleep(1000);
		AddBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public UselessWastageProduct functionalityForValidateQtyRequiredField() throws InterruptedException {
		Thread.sleep(1000);
		ItemName.click();;
		Thread.sleep(1000);
		ItemSearchField.sendKeys("New QA Product 3"+Keys.ENTER);
		Thread.sleep(1000);
		PresentPrice.sendKeys("100");
		Thread.sleep(1000);
		AddBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public UselessWastageProduct functionalityForValidatePresentPriceRequiredField() throws InterruptedException {
		Thread.sleep(1000);
		ItemName.click();;
		Thread.sleep(1000);
		ItemSearchField.sendKeys("New QA Product 3"+Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("100");
		Thread.sleep(1000);
		AddBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public Boolean ActualWarningMsg() {
		System.out.println(WarningMsg.getText());
		return WarningMsg.isDisplayed();
	}
	
	public UselessWastageProduct functionalityForValidateAddingItemWithFillupAllRequiredField() throws InterruptedException {
		Thread.sleep(1000);
		ItemName.click();;
		Thread.sleep(1000);
		ItemSearchField.sendKeys("New QA Product 3"+Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("10");
		Thread.sleep(1000);
		PresentPrice.sendKeys("350");
		Thread.sleep(100);
		AddBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public String ActualExactPriceValue() {
		return ActualExactPrice.getText();
	}
	
	public UselessWastageProduct functionalityForValidateSavingInfo() throws InterruptedException {
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		ItemSearchField.sendKeys("New QA Product 3"+Keys.ENTER);
		Thread.sleep(1000);
		QtyField.sendKeys("1");
		Thread.sleep(1000);
		PresentPrice.sendKeys("350");
		Thread.sleep(100);
		AddBtn.click();
		Thread.sleep(1000);
		SaveBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public String ActualSavingInfo() {
		return ActualSavingInfo.getText();
	}
	
	public void functionalityForInputtingDateRange() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDate.clear();
		Thread.sleep(1000);
		FromDate.sendKeys("01-Feb-2024");
		Thread.sleep(1000);
		FromDateBtn.click();
	} 
	
	public UselessWastageProduct functionalityForValidateUpdateQtyValue() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		ItemInfo.click();
		Thread.sleep(1000);
		QtyField.clear();
		Thread.sleep(1000);
		QtyField.sendKeys("2");
		Thread.sleep(1000);
		UpdateBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public String ActualUpdatingInfoValue() {
		return ItemInfo.getText();
	}
	
	public UselessWastageProduct functionalityForValidateUpdatePresentPriceValue() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		ItemInfo.click();
		Thread.sleep(1000);
		PresentPrice.clear();
		Thread.sleep(1000);
	    PresentPrice.sendKeys("400");
		Thread.sleep(1000);
		UpdateBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public UselessWastageProduct functionalityForValidateUpdateItemName() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		ItemInfo.click();
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
	    ItemSearchField.sendKeys("New QA Product 2"+ Keys.ENTER);
		Thread.sleep(1000);
		UpdateBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public UselessWastageProduct functionalityForValidateClearBtn() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		ItemInfo.click();
		Thread.sleep(1000);
		ClearBtn.click();
		return new UselessWastageProduct(driver);	
	}
	
	public String AcutalEmptyDataTextMsg() {
		return NoDataTextMsg.getText();
	}
	
	public UselessWastageProduct functionalityForSearchingProduct() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		SearchField.sendKeys("New QA Product 2" + Keys.ENTER);
		return new UselessWastageProduct(driver);
	}
	
	public Boolean ActualSearchingValue() {
		return ItemInfo.isDisplayed();
	}
	
	public UselessWastageProduct functionalityForValidateItemNameRequiredFieldInEditingPage() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		ItemInfo.click();
		Thread.sleep(1000);
		ItemNameClearBtn.click();
		Thread.sleep(1000);
		UpdateBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public UselessWastageProduct functionalityForValidateQTYRequiredFieldInEditingPage() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		ItemInfo.click();
		Thread.sleep(1000);
		QtyField.clear();
		Thread.sleep(1000);
		UpdateBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public UselessWastageProduct functionalityForValidatePresentRequiredFieldInEditingPage() throws InterruptedException {
		functionalityForInputtingDateRange();
		Thread.sleep(1000);
		ItemInfo.click();
		Thread.sleep(1000);
		PresentPrice.clear();
		Thread.sleep(1000);
		UpdateBtn.click();
		return new UselessWastageProduct(driver);
	}
	
	public String ActualWarningPopUpMsg() {
		return ActualWarningMsg.getText();
	}
	
	public UselessWastageProduct functionalityForPdfReportGenerating() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchField.sendKeys("Date Range"+Keys.ENTER);
		Thread.sleep(1000);
		FromDateBtn.click();
		Thread.sleep(1000);
		FromDate.clear();
		Thread.sleep(1000);
		FromDate.sendKeys("01-May-2024");
		Thread.sleep(1000);
		FromDateBtn.click();
		Thread.sleep(1000);
		ItemInfoForReportGenerate.click();
		Thread.sleep(1000);
	    ReportBtnForPdfGenerating.click();
		return new UselessWastageProduct(driver);
	}
}
