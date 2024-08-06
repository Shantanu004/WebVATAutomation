package AllPagesOfTransactionModule;


import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PurchaseReceivePage {

	WebDriver driver;
	
	//-> Locator of Dashboard of Purchase Receive
	@FindBy(xpath = "//h2[@id='purrecrt_heading']")
	private WebElement PurchaseReceiveHeading;
	
	@FindBy(linkText = "Purchase Receive")
	private WebElement PurchaseReceivePageBtn;
	
	@FindBy(xpath = "(//span[contains(text(),'200')])[2]")
	private WebElement LocatorOfTotalAmountOfA_ItemInPurchaseRcvHomePage;
	
	@FindBy(id = "select2-P113_DATE-container")
	private WebElement PurchaseReceiveTimeDurationButton;
	
	@FindBy(className = "select2-search__field")
	private WebElement PurchaseReceiveTimeSearchField;
	
	@FindBy(id = "P113_FROM_DATE")
	private WebElement FromDateFieldInDashboard;
	
	@FindBy(id = "P113_TO_DATE")
	private WebElement ToDateFieldInDashboard;
	
	@FindBy(id = "P113_SEARCH")
	private WebElement PurchaseReceiceItemSearchField;
	
	@FindBy(xpath = "//td[normalize-space()='Challan090311']")
	private WebElement ActualPurchaseReceiveSearchingChallanValue;
	
	@FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
	private WebElement PurchaseReceiveInfoEditIconBtn;
	
	@FindBy(xpath = "(//td[contains(text(),'LOCAL')])[1]")
	private WebElement DisplayRcvTypeValue;
	
	@FindBy(xpath = "(//td[contains(text(),'NEW QA SUPPLIER 2')])[1]")
	private WebElement DisplaySupplierName;
	
	@FindBy(xpath = "(//td[contains(text(),'10')])[2]")
	private WebElement DisplayQtyValue;
	
	@FindBy(xpath = "(//td[normalize-space()='40'])[1]")
	private WebElement DisplayUnitPriceValue;
	
	@FindBy(xpath = "(//td)[20]")
	private WebElement DisplayTotalAmt;
	
	@FindBy(xpath = "//span[contains(text(),'(No Data Found.)')]")
	private WebElement ActualConfirmingTextforInvalidItemSearched;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-eye')])[1]")
	private WebElement ReportButton;
	
	@FindBy(xpath = "(//span[@class='fa fa-print'])[1]")
	private WebElement PrintButton;
	
	//-> Locator info Add Page of Purchase Receive
	@FindBy(id = "btn_add")
	private  WebElement PurchaseReceiveInfoAddBtn;
	
	@FindBy(id = "btn_save")
	private  WebElement PurchaseReceiveInfoSaveBtn;
	
	@FindBy(className = "alertify-message")
	private WebElement WarningMessage;
	
	@FindBy(id = "P113_BILL_OF_ENTRY")
	private WebElement ChallanNOValue;
	
	@FindBy(id = "select2-P113_SUPPLIER_ID-container")
	private WebElement SupplyNameDropDownButton;
	
	@FindBy(className = "select2-search__field")
	private WebElement SupplyNameSearchField;
	
	@FindBy(id = "P113_BILL_OF_ENTRY_DATE")
	private WebElement ChallanDateInAddPage;

	@FindBy(id = "add_coll")
	private WebElement ItemInfoAddIconBtnForPurchaseReceive;
	
	@FindBy(id = "P113_TOTAL_AMT")
	private WebElement EmptyTotalAmountValue;
	
	@FindBy(xpath = "(//b[@role='presentation'])[5]")
	private WebElement SelectBtnForItemValueOfPurchaseRcv;
	
	@FindBy(xpath = "//*[@id=\"select2-P113_ITEM_ID-container\"]/span")
	private WebElement CrossSelectedItemvalue;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement SearchFieldForItemValueOfPurchaseRcv;
	
	@FindBy(id = "P113_UNIT_PRICE")
	private WebElement UnitPriceValue;
	
	@FindBy(id = "P113_QUANTITY")
	private WebElement QuantityValue;
	
	@FindBy(className = "r_totamt")
	private WebElement LocatorOfTotalAmountAfterCalculation;

	@FindBy(id = "btn_save")
	private WebElement purchaseReceiveInfoSaveBtn;
	
	//-> Locator of Edit 
	
	@FindBy(xpath = "//td[normalize-space()='ABC CHEMICAL LIMITED']")
	private WebElement SupplierNameConfiming;
	
	@FindBy(id = "checkAll_2")
	private WebElement CheckButtonInPurchaseReceiveEditInfoForm;
	
	@FindBy(name = "f04")
	private WebElement QtyFieldInEditPage;
	
	@FindBy(name = "f05")
	private WebElement unitPriceEditFieldInPurchaseRcvEditForm; 
	
	@FindBy(id = "btn_update1")
	private WebElement verifyButtonOfPurchaseRcvEditForm;
	
	@FindBy(xpath = "//span[@class='fa fa-print']")
	private WebElement LocatorOfPrintIconBtn;
	
	@FindBy(xpath = "(//span[@class='select2-selection__clear'][normalize-space()='×'])[2]")
	private WebElement SupplierFieldClearBtnInEditPage;
	
	@FindBy(className = "a-AlertMessage-details")
	private WebElement WarningMessageForNumericField;
	
  public PurchaseReceivePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
  //-> Dashboard in Purchase Receive
  public String PurchaseReceiveHeadingText() {
	  return PurchaseReceiveHeading.getText();
  }
  
  public void PurchaseReceiveInfoADDButton() {
	  PurchaseReceiveInfoAddBtn.click();  
  }
  
  public void ClickOnReportButton() {
	  ReportButton.click();
  }
  
  //-> Add Page in Purchase Receive Page
  public void PurchaseReceiveInfoSaveButton() {
	  PurchaseReceiveInfoSaveBtn.click();
  }
  
  public void warningMessageStatusDisplay() {
	  WarningMessage.getText();
  }
  
  public String DisplayedWarningMessage() {
		String DisplayWarningMessageTextvalue = WarningMessage.getText();
		return DisplayWarningMessageTextvalue;
	}

  public PurchaseReceivePage ClickOnSaveButtonWithEmptyRequiredField() {
	  PurchaseReceiveInfoAddBtn.click();  
	  PurchaseReceiveInfoSaveBtn.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public void functionalityOfPurchaseRcvItemInfo() throws InterruptedException {
	  SelectBtnForItemValueOfPurchaseRcv.click();
	  Thread.sleep(1000);
	  SearchFieldForItemValueOfPurchaseRcv.sendKeys("New QA packing material 1"+Keys.ENTER);
	  Thread.sleep(1000);
	  QuantityValue.sendKeys("20");
	  Thread.sleep(1000);
	  UnitPriceValue.sendKeys("50");
	  Thread.sleep(1000);
	  ItemInfoAddIconBtnForPurchaseReceive.click();
  }
  
  public void functionalityOfPurchaseRcvInfoForm() throws InterruptedException {
	  SupplyNameDropDownButton.click();
	  Thread.sleep(1000);
	  SupplyNameSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
	  Thread.sleep(1000);
	  LocalTime currentTime = LocalTime.now();
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
	  String formattedTimeForChallan = currentTime.format(formatter);
	  ChallanNOValue.sendKeys("QAChallan"+formattedTimeForChallan);
	  Thread.sleep(1000);
	  LocalDate currentDate = LocalDate.now();
	  DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	  String formattedDateForChallan = currentDate.format(formatterForDate);
	  ChallanDateInAddPage.clear();
	  Thread.sleep(1000);
	  ChallanDateInAddPage.sendKeys(formattedDateForChallan);
  }
  
  public PurchaseReceivePage functionalityForVerifySupplierNameRequiredField() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  LocalTime currentTime = LocalTime.now();
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
	  String formattedTime = currentTime.format(formatter);
	  ChallanNOValue.sendKeys("QAChallan"+formattedTime);
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvItemInfo();
	  purchaseReceiveInfoSaveBtn.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyChallanNoRequiredField() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  SupplyNameDropDownButton.click();
	  Thread.sleep(1000);
	  SupplyNameSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvItemInfo();
	  purchaseReceiveInfoSaveBtn.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyChallanDateRequiredField() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  LocalTime currentTime = LocalTime.now();
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
	  String formattedTime = currentTime.format(formatter);
	  ChallanNOValue.sendKeys("QAChallan"+formattedTime);
	  Thread.sleep(1000);
	  SupplyNameDropDownButton.click();
	  Thread.sleep(1000);
	  SupplyNameSearchField.sendKeys("New QA Supplier"+Keys.ENTER);
	  Thread.sleep(1000);
	  ChallanDateInAddPage.clear();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvItemInfo();
	  purchaseReceiveInfoSaveBtn.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyItemNameRequiredField() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvInfoForm();
	  Thread.sleep(1000);
	  QuantityValue.sendKeys("20");
	  Thread.sleep(1000);
	  UnitPriceValue.sendKeys("50");
	  Thread.sleep(1000);
      ItemInfoAddIconBtnForPurchaseReceive.click(); 
      Thread.sleep(1000);
      PurchaseReceiveInfoSaveBtn.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyQuantityValueRequiredField() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvInfoForm();
	  Thread.sleep(1000);
	  SelectBtnForItemValueOfPurchaseRcv.click();
	  Thread.sleep(1000);
	  SearchFieldForItemValueOfPurchaseRcv.sendKeys("New QA packing material 1"+Keys.ENTER);
	  Thread.sleep(1000);
	  UnitPriceValue.sendKeys("50");
	  Thread.sleep(1000);
      ItemInfoAddIconBtnForPurchaseReceive.click(); 
      Thread.sleep(1000);
      PurchaseReceiveInfoSaveBtn.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyUnitPriceRequiredField() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvInfoForm();
	  Thread.sleep(1000);
	  SelectBtnForItemValueOfPurchaseRcv.click();
	  Thread.sleep(1000);
	  SearchFieldForItemValueOfPurchaseRcv.sendKeys("New QA packing material 1"+Keys.ENTER);
	  Thread.sleep(1000);
	  QuantityValue.sendKeys("20");
	  Thread.sleep(1000);
      ItemInfoAddIconBtnForPurchaseReceive.click(); 
      Thread.sleep(1000);
      PurchaseReceiveInfoSaveBtn.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage ClickOnItemInfoAddIconWithEmptyField() {
	  PurchaseReceiveInfoAddBtn.click(); 
	  ItemInfoAddIconBtnForPurchaseReceive.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public boolean GettingZeroFromTotalAmountField() {
	  return EmptyTotalAmountValue.isDisplayed();
  }
  
  public PurchaseReceivePage FillingItemInfo(String ItemValue,String unitPrice, String quantityValue) throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(2000);
	  SelectBtnForItemValueOfPurchaseRcv.click();
	  Thread.sleep(2000);
	  SearchFieldForItemValueOfPurchaseRcv.sendKeys(ItemValue + Keys.ENTER);
	  Thread.sleep(2000);
	  UnitPriceValue.sendKeys(unitPrice);
	  Thread.sleep(2000);
	  QuantityValue.sendKeys(quantityValue);
	  Thread.sleep(2000);
	  ItemInfoAddIconBtnForPurchaseReceive.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public boolean DisplayedTotalAmountValueAfterCalculation() {
		boolean DisplayTotalAmountvalue = LocatorOfTotalAmountAfterCalculation.isDisplayed();
		return DisplayTotalAmountvalue;
	}
  
  public PurchaseReceivePage SavingPurchaseReceiveInfo(String supplyName, String challanNo, String ItemValue,String unitPrice, 
		  String quantityValue) throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(2000);
	  SupplyNameDropDownButton.click();
	  Thread.sleep(2000);
	  SupplyNameSearchField.sendKeys(supplyName + Keys.ENTER);
	  Thread.sleep(2000);
	  ChallanNOValue.sendKeys(challanNo);
	  Thread.sleep(2000);
	  SelectBtnForItemValueOfPurchaseRcv.click();
	  Thread.sleep(2000);
	  SearchFieldForItemValueOfPurchaseRcv.sendKeys(ItemValue + Keys.ENTER);
	  Thread.sleep(2000);
	  UnitPriceValue.sendKeys(unitPrice);
	  Thread.sleep(2000);
	  QuantityValue.sendKeys(quantityValue);
	  Thread.sleep(2000);
	  ItemInfoAddIconBtnForPurchaseReceive.click();
	  Thread.sleep(5000);
	  purchaseReceiveInfoSaveBtn.click(); 
	  Thread.sleep(2000);
	  ClickOnReportButton();
	  return new PurchaseReceivePage(driver);
  }
  
  public String ActualItem_sTotalAmountValueInPurchaseRcvHomePageForAssert() {
		String DisplayTotalAmtTextvalue =LocatorOfTotalAmountOfA_ItemInPurchaseRcvHomePage.getText();
		return DisplayTotalAmtTextvalue;
	}
  
  
  public String ActualSupplierHeaderValueForAssert() {
		String DisplaySupplierNameTextvalue = SupplierNameConfiming.getText();
		return DisplaySupplierNameTextvalue;
	}
  
  //-> Dashboard of Purchase Receive
  public PurchaseReceivePage purchaseReceiveItemSearch() throws InterruptedException {
	  PurchaseReceiveTimeDurationButton.click();
	  Thread.sleep(1000);
	  PurchaseReceiveTimeSearchField.sendKeys("Date Range" + Keys.ENTER);
	  Thread.sleep(1000);
	  FromDateFieldInDashboard.clear();
	  Thread.sleep(1000);
	  FromDateFieldInDashboard.sendKeys("01-Jan-2020");
	  Thread.sleep(1000);
	  PurchaseReceiceItemSearchField.sendKeys("Challan090311");
	  return new PurchaseReceivePage(driver);
  }
  
  public String ActualSearchedChallanValueforAssert() {
	  String DisplayChallanNoTextValue = ActualPurchaseReceiveSearchingChallanValue.getText();
	  return DisplayChallanNoTextValue;
  }
  
  public PurchaseReceivePage purchaseReceiveInvalidItemSearch() {
	  PurchaseReceiveTimeDurationButton.click();
	  PurchaseReceiveTimeSearchField.sendKeys("This Year" + Keys.ENTER);
	  LocalTime currentTime = LocalTime.now();
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
	  String formattedTime = currentTime.format(formatter);
	  PurchaseReceiceItemSearchField.sendKeys("Challan"+formattedTime);
	  return new PurchaseReceivePage(driver);
  }
  
  public String ActualInvalidSearchedChallanValueforAssert() {
	  String DisplayChallanNoTextValue = ActualConfirmingTextforInvalidItemSearched.getText();
	  return DisplayChallanNoTextValue;
  }
  
  //-> Edit Page of Purchase Receive  
  public void functionalityForPurchaseRcvEditPage() throws InterruptedException {
	  PurchaseReceiveInfoEditIconBtn.click();
	  Thread.sleep(1000);
	  SupplyNameDropDownButton.click();
	  Thread.sleep(1000);
	  SupplyNameSearchField.sendKeys("New QA Supplier 2"+Keys.ENTER);
	  Thread.sleep(1000);
	  ChallanNOValue.clear();
	  Thread.sleep(1000);
	  LocalTime currentTime = LocalTime.now();
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
	  String formattedTime = currentTime.format(formatter);
	  ChallanNOValue.sendKeys("QAChallan"+formattedTime);
	  Thread.sleep(1000);
	  ChallanDateInAddPage.clear();
	  Thread.sleep(1000);
//	  LocalDate today = LocalDate.now();
//	  LocalDate tomorrow = today.plusDays(1);
//	  DateTimeFormatter Tformatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//	  String formattedTomorrow = tomorrow.format(Tformatter);
	  LocalDate currentDate = LocalDate.now();
	  DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	  String formattedDateForChallan = currentDate.format(formatterForDate);
	  ChallanDateInAddPage.sendKeys(formattedDateForChallan);
	  Thread.sleep(1000);
	  CheckButtonInPurchaseReceiveEditInfoForm.click();
	  Thread.sleep(1000);
	  QtyFieldInEditPage.clear();
	  Thread.sleep(1000);
	  QtyFieldInEditPage.sendKeys("10");
	  Thread.sleep(1000);
	  unitPriceEditFieldInPurchaseRcvEditForm.clear();
	  Thread.sleep(1000);
	  unitPriceEditFieldInPurchaseRcvEditForm.sendKeys("40");
  }
  
  
  public PurchaseReceivePage functionalityForEditingAndSavingPurchaseReceiveInfo() throws InterruptedException {
	 PurchaseReceiveInfoAddBtn.click();
	 Thread.sleep(1000);
	 functionalityOfPurchaseRcvInfoForm();
	 Thread.sleep(1000);
	 functionalityOfPurchaseRcvItemInfo();
	 Thread.sleep(1000);
	 PurchaseReceiveInfoSaveBtn.click();
	 Thread.sleep(1000);
	 PurchaseReceiveTimeDurationButton.click();
	 Thread.sleep(1000);
	 PurchaseReceiveTimeSearchField.sendKeys("Date Range" + Keys.ENTER);
	 Thread.sleep(1000);
	 FromDateFieldInDashboard.clear();
	 Thread.sleep(1000);
	 LocalDate currentDate = LocalDate.now();
	 DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	 String formattedDate= currentDate.format(formatterForDate);
	 FromDateFieldInDashboard.sendKeys(formattedDate);
	 Thread.sleep(1000); 
	 functionalityForPurchaseRcvEditPage();
	 Thread.sleep(1000);
	 verifyButtonOfPurchaseRcvEditForm.click();
	 Thread.sleep(1000);
	 PurchaseReceiveTimeDurationButton.click();
	 Thread.sleep(1000);
	 PurchaseReceiveTimeSearchField.sendKeys("Date Range"+Keys.ENTER);
	 Thread.sleep(1000);
	 ClickOnReportButton();
	 return new PurchaseReceivePage(driver);
  }
  
  public void functionalityForEditPageRequiredFields() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvInfoForm();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvItemInfo();
	  Thread.sleep(1000);
	  PurchaseReceiveInfoSaveBtn.click();
	  Thread.sleep(1000);
	  PurchaseReceiveTimeDurationButton.click();
	  Thread.sleep(1000);
	  PurchaseReceiveTimeSearchField.sendKeys("Date Range" + Keys.ENTER);
	  Thread.sleep(1000);
	  FromDateFieldInDashboard.clear();
	  Thread.sleep(1000);
	  LocalDate currentDate = LocalDate.now();
	  DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	  String formattedDate= currentDate.format(formatterForDate);
	  FromDateFieldInDashboard.sendKeys(formattedDate);
	  Thread.sleep(1000);
	  PurchaseReceiveInfoEditIconBtn.click();
  }
  
  public PurchaseReceivePage functionalityForVerifySupplierNameRequiredFieldInEditPage() throws InterruptedException {
	  functionalityForEditPageRequiredFields();
	  Thread.sleep(1000);
	  SupplierFieldClearBtnInEditPage.click();
	  Thread.sleep(1000);
	  verifyButtonOfPurchaseRcvEditForm.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyChallanNoRequiredFieldInEditPage() throws InterruptedException {
	  functionalityForEditPageRequiredFields();
	  Thread.sleep(1000);
	  ChallanNOValue.clear();
	  Thread.sleep(1000);
	  verifyButtonOfPurchaseRcvEditForm.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyChallanDateRequiredFieldInEditPage() throws InterruptedException {
	  functionalityForEditPageRequiredFields();
	  Thread.sleep(1000);
	  ChallanDateInAddPage.clear();
	  Thread.sleep(1000);
	  verifyButtonOfPurchaseRcvEditForm.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyQtyFieldInEditPage() throws InterruptedException {
	  functionalityForEditPageRequiredFields();
	  Thread.sleep(1000);
	  CheckButtonInPurchaseReceiveEditInfoForm.click();
	  Thread.sleep(1000);
	  QtyFieldInEditPage.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage functionalityForVerifyUnitPriceFieldInEditPage() throws InterruptedException {
	  functionalityForEditPageRequiredFields();
	  Thread.sleep(1000);
	  CheckButtonInPurchaseReceiveEditInfoForm.click();
	  Thread.sleep(1000);
	  unitPriceEditFieldInPurchaseRcvEditForm.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
	  return new PurchaseReceivePage(driver);
  }
  
  
  public Boolean DisplayWarningMsgForNumericFieldInEditPage() {
	  return WarningMessageForNumericField.isDisplayed();
  }
  
  public Boolean DisplayVerifyButtonIsDisable() {
	  return verifyButtonOfPurchaseRcvEditForm.isEnabled();
  }
  
  public String ActualRcvTypeValue() {
	  return DisplayRcvTypeValue.getText();
  }
  
  public String ActualSuppllieNameValue() {
	  return DisplaySupplierName.getText();
  }
  
  public void ReportButtonInDashBoard() {
	  ReportButton.click();
  }
  
  public String ActualQtyValue() {
	  return DisplayQtyValue.getText();
  }
  
  public String ActualUnitPriceValue() {
	  return DisplayUnitPriceValue.getText();
  }
  
  public String ActualTotalAmountValue() {
	  return DisplayTotalAmt.getText();
  }
  
  public void printIconButton() {
	  LocatorOfPrintIconBtn.click();
  }
  
  public PurchaseReceivePage functionalityForPrintButtonToOpenReportFile() throws InterruptedException {
	  PurchaseReceiveInfoAddBtn.click();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvInfoForm();
	  Thread.sleep(1000);
	  functionalityOfPurchaseRcvItemInfo();
	  Thread.sleep(1000);
	  PurchaseReceiveInfoSaveBtn.click();
	  Thread.sleep(1000);
	  Thread.sleep(1000);
	  PurchaseReceiveTimeDurationButton.click();
	  Thread.sleep(1000);
	  PurchaseReceiveTimeSearchField.sendKeys("Date Range" + Keys.ENTER);
	  Thread.sleep(1000);
	  FromDateFieldInDashboard.clear();
	  Thread.sleep(1000);
	  LocalDate currentDate = LocalDate.now();
	  DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	  String formattedDate= currentDate.format(formatterForDate);
	  FromDateFieldInDashboard.sendKeys(formattedDate);
	  Thread.sleep(1000);
	  PurchaseReceiveInfoEditIconBtn.click();
	  Thread.sleep(1000);
	  verifyButtonOfPurchaseRcvEditForm.click();
	  Thread.sleep(1000);
	  PrintButton.click();
	  return new PurchaseReceivePage(driver);
  }
  
  public PurchaseReceivePage PrintButtonToOpenPDFFile() throws InterruptedException, IOException {
	  PurchaseReceiveTimeDurationButton.click();
	  Thread.sleep(2000);
	  PurchaseReceiveTimeSearchField.sendKeys("This Year" + Keys.ENTER);
	  Thread.sleep(2000);
	  //printIconButton();
//	  String url = driver.getCurrentUrl();
//	  URL pdfUrl = new URL(url);
//	  URLConnection urlConnection =  pdfUrl.openConnection();
//	  urlConnection.addRequestProperty("User-Agent", "Shan");
//	  System.setProperty("http.maxRedirects", "50");
//	  InputStream is = urlConnection.getInputStream();
//	  BufferedInputStream bis = new BufferedInputStream(is);
//	  PDDocument pdDocument = PDDocument.load(bis);
//	  PDFTextStripper pdfTextStripper = new PDFTextStripper();
//	  String pdfText = pdfTextStripper.getText(pdDocument);
//	  System.out.println(pdfText);
	  
	  return new PurchaseReceivePage(driver);
  }
  
    
}