package AllPagesOfTransactionModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Consumption_RawAndPackingMaterialsPage {

	WebDriver driver;
	
	//--> ConsumptionAddPage
	@FindBy(id = "btn_add")
	private WebElement AddBtn;
	
	@FindBy(css = "label[for='P150_RW_PCK_RAD_0']")
	private WebElement RawMaterialsCheckBtn;
	
	@FindBy(css = "label[for='P150_RW_PCK_RAD_1']")
	private WebElement PackingMaterialsCheckBtn;
	
	@FindBy(id = "select2-P150_PRODUCT_NAME-container")
	private WebElement ProductBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement ProductSearchField;
	
	@FindBy(id = "select2-P150_BATCH_NAME-container")
	private WebElement ProductBatchBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement ProductBatchSearchField; 

	@FindBy(id = "alertify-ok")
	private WebElement saveconfirmationOk;
	
	@FindBy(id = "alertify-cancel")
	private WebElement saveConfirmationCancel;
	
	@FindBy(id = "btn_cancel")
	private WebElement CancelBtn;

	@FindBy(id = "btn_submit")
	private WebElement SaveRawBtn;
	
	@FindBy(id = "btn_create")
	private WebElement SavepackingBtn;
	
	@FindBy(id = "prod_inf_heading")
	private WebElement Headingtext;
	
	//-->ConsumptionDashboard
	
	@FindBy(id = "select2-P150_DATE-container")
	private WebElement DurationBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement DurationTextField;
	
	@FindBy(id = "P150_FROM_DATE")
	private WebElement FromDateBtn;
	
	@FindBy(css = "#P151_FROM_DATE")
	private WebElement FromDateField;
	
	@FindBy(id = "P150_TO_DATE")
	private WebElement ToDateBtn;
	
	@FindBy(id = "P150_SEARCH")
	private WebElement InfoSearch;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement ReportBtn;
	
	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(2)")
	private WebElement productTextValueForRaw;
	
	@FindBy(css = "tbody tr td:nth-child(2)")
	private WebElement productTextValueOfPacking;
	
	@FindBy(css = "tbody tr td:nth-child(3)")
	private WebElement BatchNameValue;
	
	@FindBy(xpath = "(//td[contains(text(),'Packing Material')])[1]")
	private WebElement ConsumptionTypeForPacking;
	
	@FindBy(xpath = "(//td[contains(@class,'u-tL')][normalize-space()='Raw Material'])[1]")
	private WebElement ConsumptionTypeForRaw;
	
	
	public Consumption_RawAndPackingMaterialsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public Consumption_RawAndPackingMaterialsPage functionalityForAddbtnToGoConsumptionform() {
		AddBtn.click();
		return new Consumption_RawAndPackingMaterialsPage(driver);
	}
	
	public String DisplayConsumptionAddFormHeadText() {
		return Headingtext.getText();
	}
	
	public Consumption_RawAndPackingMaterialsPage functionalityForSavingProductForRawMaterials() throws InterruptedException {
		AddBtn.click();
		//RawMaterialsCheckBtn.click();
		ProductBtn.click();
		Thread.sleep(2000);
		ProductSearchField.sendKeys("New QA Product"+Keys.ARROW_DOWN +Keys.ARROW_DOWN +Keys.ENTER);
		Thread.sleep(2000);
		ProductBatchBtn.click();
		Thread.sleep(2000);
		ProductBatchSearchField.sendKeys(Keys.ENTER);		
		Thread.sleep(2000);
		SaveRawBtn.click();
		Thread.sleep(2000);
		saveconfirmationOk.click();
		Thread.sleep(1000);
		InfoSearch.sendKeys("Raw Material");
		return new Consumption_RawAndPackingMaterialsPage(driver);	
	}
	
	public String DisplayProductTextValueForRaw() {
		return ConsumptionTypeForRaw.getText();
	}
	
	public Consumption_RawAndPackingMaterialsPage functionalityForSavingProductForPackingMaterials() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		PackingMaterialsCheckBtn.click();
		Thread.sleep(2000);
		ProductBtn.click();
		Thread.sleep(2000);
		ProductSearchField.sendKeys("New QA Product" + Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		ProductBatchBtn.click();
		Thread.sleep(2000);
		ProductBatchSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		SavepackingBtn.click();
		Thread.sleep(2000);
		saveconfirmationOk.click();
		Thread.sleep(2000);
		InfoSearch.sendKeys("Packing Material");
		
		return new Consumption_RawAndPackingMaterialsPage(driver);
	}
	
	public String DisplayProductTextValueForPacking() {
		return ConsumptionTypeForPacking.getText();
	}
	
	public Consumption_RawAndPackingMaterialsPage functionalityForItemSearching() throws InterruptedException {
		DurationBtn.click();
		Thread.sleep(1000);
		DurationTextField.sendKeys("This Year" +Keys.ENTER);
		Thread.sleep(1000);
		InfoSearch.sendKeys("P2424:63");
		Thread.sleep(2000);
		return new Consumption_RawAndPackingMaterialsPage(driver);
	}
	
	public String DisplayBatchNameTextValue() {
		return BatchNameValue.getText();
	}
	
	
}
