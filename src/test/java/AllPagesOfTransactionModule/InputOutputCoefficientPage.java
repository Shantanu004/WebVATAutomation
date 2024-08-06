package AllPagesOfTransactionModule;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InputOutputCoefficientPage {

	WebDriver driver;
	
	//-> Input-output Coefficient Form Page portion
	@FindBy(id = "btn_clear")
	private WebElement ClearBtn;
	
	@FindBy(id = "select2-P33_PROD_CODE-container")
	private WebElement ProductSelectBtn;
	
	@FindBy(className = "select2-search__field")
	private WebElement ProductSearchTextField;
	
	@FindBy(id = "btn_save")
	private WebElement ProductSaveBtn;
	
	//-> Product list portion 
	@FindBy(id = "P33_SRCH")
	private WebElement ProductSearchBoxFromList;
	
	@FindBy(xpath = "(//a)[57]")
	private WebElement ProductSelectBtnFromList;
	
	@FindBy(id = "btn_cancel")
	private WebElement ProductClearBtnFromList;
	
	@FindBy(id = "btn_submit")
	private WebElement ProductReportBtn;
	
	@FindBy(css = "div[id='I012307001836'] h4")
	private WebElement ProductSearchedValue;
	
	@FindBy(xpath = "(//span[@class='select2-selection__placeholder'][normalize-space()='--Select One--'])[1]")
	private WebElement EmptyProductField;
	
	@FindBy(css = "div[id='I012307001836'] h4")
	private WebElement SearchingProductOfSavedValue;
	
	public InputOutputCoefficientPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FunctionalityForProductClearAfterSelecting(String productName) throws InterruptedException {
		Thread.sleep(2000);
		ProductSelectBtn.click();
		Thread.sleep(2000);
		ProductSearchTextField.sendKeys(productName + Keys.ENTER);
		Thread.sleep(2000);
		ClearBtn.click();
	}
	
	public String DisplayEmptyProductTextField() {
		return EmptyProductField.getText();
	} 
	
	public void FunctionalityForSaveBtnAfterSelectingProduct() throws InterruptedException {
	    Thread.sleep(2000);
		ProductSelectBtn.click();
		Thread.sleep(2000);
		ProductSearchTextField.sendKeys("New QA Product 3" + Keys.ENTER);
		Thread.sleep(2000);
		ProductSaveBtn.click();
		Thread.sleep(2000);
		ProductSearchBoxFromList.sendKeys("New QA Product 3" + Keys.ENTER);
	}
	
	public String DisplaySearchedProductAfterSaving() {
		return SearchingProductOfSavedValue.getText();
	} 
	
	
	public void FunctionalityForProductSearchFromList(String productName) throws InterruptedException {
		Thread.sleep(2000);
		ProductSearchBoxFromList.sendKeys("New QA Product 3" + Keys.ENTER);
	}
	
	public String DisplaySearchingValue() {
		return ProductSearchedValue.getText();
	}
	
	public void FunctionalityForProductSearchFromListForClearedBtn(String productName) throws InterruptedException {
		Thread.sleep(2000);
		ProductSearchBoxFromList.sendKeys(productName + Keys.ENTER);
		Thread.sleep(2000);
		ProductSearchedValue.click();
		Thread.sleep(2000);
		ProductClearBtnFromList.click();
	}
	
	public void FunctionalityForProductClearFromSearchField(String productName) throws InterruptedException {
		Thread.sleep(2000);
		ProductSearchBoxFromList.sendKeys(productName + Keys.ENTER);
		Thread.sleep(2000);
		ProductSearchBoxFromList.clear();
		//ProductSearchedValue.clear();
	}
	
	public String DisplayEmptySearchField() {
		return ProductSearchBoxFromList.getText();
	}
	
	public void FunctionalityForProductReportGenerateFromList() throws InterruptedException, IOException {
		String mainWindowHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		ProductSearchBoxFromList.sendKeys("New QA Product 3" + Keys.ENTER);
		Thread.sleep(2000);
		ProductSearchedValue.click();
		Thread.sleep(2000);
		ProductReportBtn.click();
		Thread.sleep(1000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
		String url = driver.getCurrentUrl();
        URL pdfURL=new URL(url);
        InputStream is=pdfURL.openStream();
        BufferedInputStream bis=new BufferedInputStream(is);
        PDDocument doc=PDDocument.load(bis);
        String pdfContent=new PDFTextStripper().getText(doc);
        int pages=doc.getNumberOfPages();
        System.out.println("The total number of pages "+pages);
        Assert.assertTrue(pdfContent.contains("New QA Product 3 (Product)"), "Incorrect Product Name:");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("7788996622\r\n"+ "33"), "Incorrect HS Code:");
        Thread.sleep(1000);
        Assert.assertTrue(pdfContent.contains("New QA Raw Material 1\r\n"
        		+ "New QA Raw Material 2\r\n"
        		+ "New QA Raw Material 3\r\n"
        		+ "Electricity\r\n"
        		+ "Insurance\r\n"
        		+ "Spare Parts"), "Incorrect Items name:");
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(mainWindowHandle);
	}
	
	
	
	
	
}
