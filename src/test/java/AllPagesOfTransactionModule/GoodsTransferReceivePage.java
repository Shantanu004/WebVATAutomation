package AllPagesOfTransactionModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodsTransferReceivePage {

	WebDriver driver;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[2]/div[2]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]/div[1]/h4[1]")
	private WebElement GoodsTransferChallan;
	
	@FindBy(xpath = "(//input[@id='checkAll_2'])[1]")
	private WebElement AllCheckBtn;
	
	@FindBy(id = "btn_save")
	private WebElement VerifyBtn;
	
	@FindBy(xpath = "//span[contains(text(),'(No Data Found.)')]")
	private WebElement TextMsg;
	
	public GoodsTransferReceivePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public GoodsTransferReceivePage functionalityForVerifyingGoodsTransferReceiveInfo() throws InterruptedException {
		GoodsTransferChallan.click();
		Thread.sleep(2000);
		AllCheckBtn.click();
		Thread.sleep(2000);
        VerifyBtn.click();  
		return new GoodsTransferReceivePage(driver);
	}
	
	public String displayWarningMsg() {
		return TextMsg.getText();
	}
	
	
}
