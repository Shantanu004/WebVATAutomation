package AllPagesOfTransactionModule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CostingCalculationPage {

	WebDriver driver;
	
	//Cost calculation ADD page WebElement 
	@FindBy(id = "btn_add")
	private WebElement CostingCalculationAddBtn;
	
	@FindBy(xpath = "//span[contains(text(),'--Select One--')]")
	private WebElement CostingCalculationProductSelectBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement ProductSearchTextBox;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement ProductRemoveIconBtn;
	
	@FindBy(id = "btn_save")
	private WebElement CostingCalculationItemSaveBtn;
	
	@FindBy(id = "btn_cancel")
	private WebElement CostingCalculationItemCancelBtn;
	
	@FindBy(xpath = "(//span[@class='a-Switch-toggle'])[1]")
	private WebElement ActiveStatusBtn;
	
	@FindBy(xpath = "(//span[@class='a-Switch-toggle'])[2]")
	private WebElement ShowStatusBtn;
	
	@FindBy(xpath = "//span[normalize-space()='118016.4']")
	private WebElement TotalAmtForASelectedProduct;
	
	//-> Item's locator after select a product. 
	@FindBy(xpath = "(//span[@class='t-Button t-Button--simple p_itembtn'])[1]")
	private WebElement Item1Btn;
	
	@FindBy(xpath = "(//span[@class='a-IRR-headerLabel'][normalize-space()='Item Name'])[1]")
	private WebElement ItemHeaderName;
	
	@FindBy(xpath = "(//input[@name='f51'])[1]")
	private String Item1ChallanNo;
	
	@FindBy(xpath = "(//span[@class='t-Button t-Button--simple p_itembtn'])[2]")
	private WebElement Item2Btn;
	
	@FindBy(xpath = "(//input[@name='f51'])[1]")
	private WebElement Item2ChallanNo;
	
	@FindBy(xpath = "(//span[@class='t-Button t-Button--simple p_itembtn'])[3]")
	private WebElement Item3Btn;
	
	@FindBy(xpath = "(//input[@name='f51'])[1]")
	private WebElement Item3ChallanNo;
	
	@FindBy(xpath = "//span[contains(text(),'(No Data Found.)')]")
	private WebElement TextMsgForNoData;
	
	@FindBy(id = "btn_cancel1")
	private WebElement ItemInfoCancelBtn;
	
	//Costing calculation report page WebElement
	//-> Time & Date Related Locator
	@FindBy(id = "select2-P108_DATE-container")
	private WebElement DurationBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement DurationSearchTxtBox;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement FromDateBtn;
	
	@FindBy(className = "ui-datepicker-month")
	private WebElement MonthSelectorDropDownBtn;
	
	@FindBy(xpath = "//option[normalize-space()='Feb']")
	private WebElement MonthSelect;
	
	@FindBy(className = "ui-datepicker-year")
	private WebElement YearSelectorDropDownBtn;
	
	@FindBy(xpath = "//option[@value='2019']")
	private WebElement YearSelect;
	
	@FindBy(linkText = "1")
	private WebElement DateSelect;
	
	//-> Product Search locator
	@FindBy(id = "P108_SEARCH")
	private WebElement ProductSearchBoxForCostingCalculation;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[4]")
	private WebElement SearchedProdcutViewBtn;
	
	//-> Product View Locator
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement ProductViewBtnforAnItem;
	//-> Product Report view Locator
	@FindBy(xpath = "(//i[@class='fa fa-play-circle-o'])[4]")
	private WebElement ProdcutReportViewBtnForAnItem;
	
	public CostingCalculationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String DisplayTextForTotalAmountValueOfAnProduct() {
		return TotalAmtForASelectedProduct.getText();	
	}
	//Add Page
	public void functionalityForSelectProductAndDeselectProductForNotSavingData(String productName) throws InterruptedException {
		Thread.sleep(2000);
		CostingCalculationAddBtn.click();
		Thread.sleep(2000);
		CostingCalculationProductSelectBtn.click();
		Thread.sleep(2000);
		ProductSearchTextBox.sendKeys(productName + Keys.ENTER);
		Thread.sleep(2000);
		ProductRemoveIconBtn.click();
	}
	
	public String DisplayTextForNoData() {
		return TextMsgForNoData.getText();	
	}
	
	public String DisplayChallanNoForItem1() {
		String ChallanNoValueOfItem1= driver.findElement(By.xpath("(//input[@name='f51'])[1]")).getText();
		return ChallanNoValueOfItem1;
	}
	
	public String DisplayChallanNoForItem2() {
		return Item2ChallanNo.getText();
	}
	
	public String DisplayChallanNoForItem3() {
		return Item3ChallanNo.getText();
	}
	
	public void ClickOnItem1Btn() {
		Item1Btn.click();
	}
	
	public void ClickOnItem2Btn() {
		Item2Btn.click();
	}
	
	public void ClickOnItem3Btn() {
		Item3Btn.click();
	}
	
	public void ClickOnItemCloseBtn(){
		ItemInfoCancelBtn.click();
	}
	
	public void functionalityForItemCheckingForASpecificProduct(String productName) throws InterruptedException {
		Thread.sleep(2000);
		CostingCalculationAddBtn.click();
		Thread.sleep(2000);
		CostingCalculationProductSelectBtn.click();
		Thread.sleep(2000);
		ProductSearchTextBox.sendKeys(productName + Keys.ENTER);
//		Thread.sleep(1000);
//		DisplayChallanNoForItem1();
//		Thread.sleep(1000);
//		ClickOnItemCloseBtn();
//		Thread.sleep(1000);
//		DisplayChallanNoForItem2();
//		Thread.sleep(1000);
//		ClickOnItemCloseBtn();
	}
	
	public void functionalityForProductItemSaving(String productName) throws InterruptedException {
		Thread.sleep(2000);
		CostingCalculationAddBtn.click();
		Thread.sleep(2000);
		CostingCalculationProductSelectBtn.click();
		Thread.sleep(2000);
		ProductSearchTextBox.sendKeys(productName + Keys.ENTER);
		Thread.sleep(2000);
		CostingCalculationItemSaveBtn.click();
		Thread.sleep(2000);
		ProductViewBtnforAnItem.click();
	}
	
	//-->Dashboard
	public String DisplayTotalAmtValue() {
		return TotalAmtForASelectedProduct.getText();
	} 
	
	public void functionalityForProductSearch(String productName) throws InterruptedException {
		Thread.sleep(1000);
		DurationBtn.click();
		Thread.sleep(1000);
		DurationSearchTxtBox.sendKeys("Date Range" + Keys.ENTER);
		Thread.sleep(1000);
		FromDateBtn.click();
		Thread.sleep(1000);
		MonthSelectorDropDownBtn.click();
		Thread.sleep(1000);
		MonthSelect.click();
		Thread.sleep(1000);
		YearSelectorDropDownBtn.click();
		Thread.sleep(1000);
		YearSelect.click();
		Thread.sleep(1000);
		DateSelect.click();
		Thread.sleep(1000);
		ProductSearchBoxForCostingCalculation.sendKeys(productName);
		Thread.sleep(1000);
		SearchedProdcutViewBtn.click();	
	}
	
	public void functionaliyForViewingReport(String productName) throws InterruptedException {
		functionalityForProductSearch(productName);
		Thread.sleep(2000);
		ProdcutReportViewBtnForAnItem.click();
	}
	
	public void functionalityForVerifyingReportFile(String productName) throws InterruptedException {
		functionalityForProductSearch(productName);
		Thread.sleep(1000);
		ProdcutReportViewBtnForAnItem.click();
	}
	
	
	
}
