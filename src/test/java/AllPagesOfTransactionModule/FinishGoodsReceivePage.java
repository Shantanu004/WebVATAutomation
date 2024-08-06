package AllPagesOfTransactionModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishGoodsReceivePage {

	WebDriver driver;
	
	//-> Finish Good Entry Page
	@FindBy(id = "btn_cancel")
	private WebElement cancelBtn;
	
	@FindBy(id = "P20_FGTMST_DATE")
	private WebElement FGTDate;
	
	@FindBy(id = "P20_RCV_DATE")
	private WebElement RCVdate;
	
	@FindBy(id = "select2-P20_BATCH_ID-container")
	private WebElement ItemNameFieldBtn;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement ItemSearch;
	
	@FindBy(id = "P20_RECEIVE_QTY")
	private WebElement ItemRcvQty;
	
	@FindBy(id = "add_coll")
	private WebElement IteminfoAddColl;
	
	@FindBy(css = ".fa.fa-pencil-square-o")
	private WebElement IteminfoEditBtn;
	
	@FindBy(xpath = "//span[@class='t-Icon fa fa-trash delete-irrow delete-irrow']")
	private WebElement ItemInfoDltBtn;
	
	@FindBy(id = "alertify-ok")
	private WebElement ItemInfoDltConfirmining;
	
	@FindBy(id = "alertify-cancel")
	private WebElement IteminfoDltCanceling;
	
	@FindBy(id = "btn_save")
	private WebElement FinishGoodsEntrySaveBtn;
	
	@FindBy(className ="alertify-message")
	private WebElement WarningMsgTextValue;
	
	@FindBy(xpath = "//div[@id='COLL_data_panel']//span[contains(text(),'(No Data Found.)')]")
	private WebElement DisplayMsgForNoData;
	
	@FindBy(css = "td[headers='rcv_qty']")
	private WebElement ReceiveQtyTextValue;
	
	//--> Finish Goods Received Dashboard
	@FindBy(id = "btn_show")
	private WebElement AddBtn;
	
	@FindBy(id = "select2-P20_DATE-container")
	private WebElement DurationBtn;
	
	@FindBy(css = "input[role='textbox']")
	private WebElement DurationSearchField;
	
	@FindBy(id = "P20_SEARCH")
	private WebElement InfoSearchField;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement ReportBtn;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-eye')])[1]")
	private WebElement SearchedItemReportBtn;
	
	@FindBy(xpath = "(//td)[24]")
	private WebElement RcvQtyTextValue;
	
	@FindBy(xpath = "(//span[contains(text(),'1')])[6]")
	private WebElement RcvQtyValueAfterSearch;
	
	public FinishGoodsReceivePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//-->Add Page
	public FinishGoodsReceivePage functionalityForFinishGoodsItemSaving() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		ItemNameFieldBtn.click();
		Thread.sleep(2000);
		ItemSearch.sendKeys("New QA Product" +Keys.ENTER);
		Thread.sleep(2000);
		ItemRcvQty.clear();
		Thread.sleep(2000);
		ItemRcvQty.sendKeys("1");
		Thread.sleep(2000);
		IteminfoAddColl.click();
		Thread.sleep(2000);
		FinishGoodsEntrySaveBtn.click();
		Thread.sleep(2000);
		ReportBtn.click();
		return new FinishGoodsReceivePage(driver);
	}
	
	public String DisplayRcvQtyValue() throws InterruptedException {
		Thread.sleep(3000);
		return RcvQtyTextValue.getText();
	}
	
	public FinishGoodsReceivePage functionalityForRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		ItemNameFieldBtn.click();
		Thread.sleep(1000);
		ItemSearch.sendKeys("New QA Product" +Keys.ENTER);
		Thread.sleep(1000);
		ItemRcvQty.clear();
		Thread.sleep(1000);
		ItemRcvQty.sendKeys("1");
		Thread.sleep(1000);
		IteminfoAddColl.click();
		Thread.sleep(1000);
		RCVdate.clear(); 
		Thread.sleep(1000);
		FGTDate.clear();
		Thread.sleep(1000);
		FinishGoodsEntrySaveBtn.click();
		return new FinishGoodsReceivePage(driver);
	}
	
	public FinishGoodsReceivePage functionalityForFGTRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		ItemNameFieldBtn.click();
		Thread.sleep(1000);
		ItemSearch.sendKeys("New QA Product" +Keys.ENTER);
		Thread.sleep(1000);
		ItemRcvQty.clear();
		Thread.sleep(1000);
		ItemRcvQty.sendKeys("1");
		Thread.sleep(1000);
		IteminfoAddColl.click();
		Thread.sleep(1000);
		FGTDate.clear();
		Thread.sleep(1000);
		FinishGoodsEntrySaveBtn.click();
		
		return new FinishGoodsReceivePage(driver);
	}
	
	public FinishGoodsReceivePage functionalityForRCVDateRequiredField() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);
		ItemNameFieldBtn.click();
		Thread.sleep(1000);
		ItemSearch.sendKeys("New QA Product" +Keys.ENTER);
		Thread.sleep(1000);
		ItemRcvQty.clear();
		Thread.sleep(1000);
		ItemRcvQty.sendKeys("1");
		Thread.sleep(1000);
		IteminfoAddColl.click();
		Thread.sleep(1000);
		RCVdate.clear();
		Thread.sleep(1000);
		FinishGoodsEntrySaveBtn.click();
		
		return new FinishGoodsReceivePage(driver);
	}
	
	
	public String DisplayWarningMsg() {
		return WarningMsgTextValue.getText();
	}
	
	public FinishGoodsReceivePage functionalityForEditRcvQtyValue() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		ItemNameFieldBtn.click();
		Thread.sleep(2000);
		ItemSearch.sendKeys("New QA Product" +Keys.ENTER);
		Thread.sleep(2000);
		ItemRcvQty.clear();
		Thread.sleep(2000);
		ItemRcvQty.sendKeys("1" + Keys.ENTER);
//		Thread.sleep(2000);
//		IteminfoAddColl.click();
		Thread.sleep(2000);
	    IteminfoEditBtn.click();
	    Thread.sleep(2000);
	    ItemRcvQty.clear();
	    Thread.sleep(2000);
	    ItemRcvQty.sendKeys("2" + Keys.ENTER);
	    //Thread.sleep(2000);
	    //IteminfoAddColl.click();
		return new FinishGoodsReceivePage(driver);
	}
	
	public String EditedReceiveQtyValue() {
		//System.out.println(ReceiveQtyTextValue.getText());
		return ReceiveQtyTextValue.getText();
	}
	
	public FinishGoodsReceivePage functionalityForDeleteItemInfo() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(2000);
		ItemNameFieldBtn.click();
		Thread.sleep(2000);
		ItemSearch.sendKeys("New QA Product" +Keys.ENTER);
		Thread.sleep(2000);
		ItemRcvQty.clear();
		Thread.sleep(2000);
		ItemRcvQty.sendKeys("1" + Keys.ENTER);
		Thread.sleep(2000);
		ItemInfoDltBtn.click();
		Thread.sleep(2000);
		ItemInfoDltConfirmining.click();
		return new FinishGoodsReceivePage(driver);
	}
	
	public String DisplayMsgForNoData() {
		return DisplayMsgForNoData.getText();
	}
	
	//-->DashBoard
	public FinishGoodsReceivePage functionlityForSearchingItemByDate() throws InterruptedException {
	DurationBtn.click();
	Thread.sleep(1000);
	DurationSearchField.sendKeys("This Year" + Keys.ENTER);
	Thread.sleep(1000);
	InfoSearchField.sendKeys("29-Apr-2024");
	Thread.sleep(1000);
	SearchedItemReportBtn.click();
	return new FinishGoodsReceivePage(driver);
	}
	
	public String DisplayValueOfRcvQtyAfterSearch() {
		return RcvQtyValueAfterSearch.getText();
	}
	
	
}
