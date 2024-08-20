package AllPagesForSetupModule;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

public class BasicSetupPage {

	WebDriver driver; 
	
    //Basic Setup Add Page 	
	@FindBy(id = "btn_add")
	private WebElement AddBtn; 
	
	@FindBy(xpath = "//h2[@id='lokupmst_heading']")
	private WebElement AddPageHeadingName; 
    
    @FindBy(id = "P102_LOOKUPMST_NAME")
    private WebElement NameField;
    
    @FindBy(id = "P102_LOOKUPMST_CODE")
    private WebElement CodeField;
    
    @FindBy(xpath = "(//span[@class='a-Switch-toggle'])[1]")
    private WebElement ActiveStatus;
	
    @FindBy(id = "P102_DESCRIPTION")
    private WebElement DescriptionField;
    
    @FindBy(id = "btn_save")
    private WebElement SaveBtn;
    
    @FindBy(id = "btn_refresh")
    private WebElement ResetBtn;
    
    @FindBy(id = "btn_cancel")
    private WebElement CancelBtn;
    
    //Basic Setup Dashboard 
    @FindBy(id = "P102_SEARCH")
    private WebElement SearchField;
    
    @FindBy(xpath = "//h2[@id='lookuprt_heading']")
    private WebElement BasicSetUpInformation;
    
    @FindBy(css = "tbody tr td:nth-child(2)")
    private WebElement InfoOfCodeNameOfBasicSetup;
    
    @FindBy(css = "tbody tr td:nth-child(3)")
    private WebElement InfoOfNameOfBasicSetup;
    
    @FindBy(css = "tbody tr td:nth-child(4)")
    private WebElement InfoOfDescriptionOfBasicSetup;
    
    @FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[1]")
    private WebElement EditBtn;
    
    @FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
    private WebElement DetailsBtn;
    
    @FindBy(xpath = "(//i[contains(@aria-hidden,'true')])[2]")
    private WebElement AddChildBtn;
    
    @FindBy(xpath = "//h4[normalize-space()='(No Data Found.!)']")
    private WebElement NoDataFoundMsg;
    
    //Basic Setup Edit Page 
    @FindBy(id = "btn_update1")
    private WebElement UpdateBtnInEditPage;
    
    @FindBy(id = "btn_delete")
    private WebElement DeleteBtnInEditPage;
    
    @FindBy(id = "btn_cancel")   
    private WebElement CancelBtnInEditPage;
    
    @FindBy(id = "alertify-ok")
    private WebElement ConfirmOkBtn;
    
    //Add Child Page
    @FindBy(id = "P102_LOOKUPCHD_NAME")
    private WebElement AddChildNameField;
    
    @FindBy(id = "P102_LOOKUPCHD_CODE")
    private WebElement AddChildCodeField;
    
    @FindBy(xpath = "(//span[@class='a-Switch-toggle'])[2]")
    private WebElement AddChildActiveSts;
    
    @FindBy(id = "P102_REMARKS")
    private WebElement AddChildRemarksField;
    
    @FindBy(id = "btn_save2")
    private WebElement AddChildSaveBtn;
    
    @FindBy(id = "btn_refresh1")
    private WebElement AddChildResetBtn;
    
    @FindBy(id = "btn_cancel1")
    private WebElement AddChildCancelBtn;
    
    @FindBy(xpath = "//h2[@id='detaillook_heading']")
    private WebElement AddChildPageHeadingName;
    
    //Details 
    @FindBy(css = "tbody tr:nth-child(1) td:nth-child(2)")
    private WebElement ChildNameValueInDetails;
    
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(1) td:nth-child(2)")
    private WebElement ChildCodeValueInDetails;
    
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(1) td:nth-child(2)")
    private WebElement ChildDiscriptionValueInDetails;
    
    @FindBy(xpath = "(//img[@class='apex-edit-pencil-alt'])[2]")
    private WebElement EditBtnOfChildPage;
    
    //Edit Child Page 
    @FindBy(id = "btn_update2")
    private WebElement UpdateBtnInEditChildPage;
    
    @FindBy(id = "btn_delete1")
    private WebElement DeleteBtnInEditChildPage;
    
    @FindBy(id = "btn_cancel1")
    private WebElement CancelBtnInEditChildPage;
    
    public BasicSetupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
    //Add Page 
    public void functionalityForNavigateAddPage() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    }
    
    public String DisplayAddPageHeadingName() {
    	return AddPageHeadingName.getText();
    }
	
    public void functionalityForNameRequiredFieldVerify() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
   	    String formattedTimeForCode = currentTime.format(formatter);
   	    CodeField.sendKeys("QACode"+formattedTimeForCode);
   	    Thread.sleep(1000);
   	    SaveBtn.click();
    }
    
    public void functionalityForCodeRequiredFieldVerify() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
   	    String formattedTimeForName = currentTime.format(formatter);
    	NameField.sendKeys("QABasicSetup"+formattedTimeForName);
   	    Thread.sleep(1000);
   	    SaveBtn.click();
    }
    
    public void functionalityForResetBtnVerify() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
    	NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
    	Thread.sleep(1000);
   	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
   	    Thread.sleep(1000);
   	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
   	    Thread.sleep(1000);
   	    ResetBtn.click();
    }
    
    public void functionalityForCancelBtnVerify() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	CancelBtn.click();	
    }
    
    public String DisplayBasicSetupDashboardHeadingName() {
    	return BasicSetUpInformation.getText();
    }
    
    public void functionalityForBasicSetupInfoSaving() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mmss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
   	    NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
 	    Thread.sleep(1000);
	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    SaveBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
    }
    
    public boolean DisplayBasicSetupNameAfterSaving() {
    	return InfoOfNameOfBasicSetup.isDisplayed();
    }
    
    //Edit Page
    public void functionalityForValidateNameRequiredFieldInEditPage() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
   	    NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
 	    Thread.sleep(1000);
	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    SaveBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    EditBtn.click();
	    Thread.sleep(1000);
	    NameField.clear();
	    Thread.sleep(1000);
	    UpdateBtnInEditPage.click();
	    Thread.sleep(1000);
	    ConfirmOkBtn.click();
    }
    
    public void functionalityForValidateCodeRequiredFieldInEditPage() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
   	    NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
 	    Thread.sleep(1000);
	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    SaveBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    EditBtn.click();
	    Thread.sleep(1000);
	    CodeField.clear();
	    Thread.sleep(1000);
	    UpdateBtnInEditPage.click();
	    Thread.sleep(1000);
	    ConfirmOkBtn.click();
    }
    
    public void functionalityForValidateUpdatingNameCodeDescriptionValue() throws InterruptedException {
    	EditBtn.click();
    	Thread.sleep(1000);
    	NameField.clear();
    	Thread.sleep(1000);
    	CodeField.clear();
    	Thread.sleep(1000);
    	DescriptionField.clear();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mmss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
   	    NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
   	    String ExpectedEditedNameValue= "QABasicSetup"+formattedTimeForSecond;
 	    Thread.sleep(1000);
	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    String ExpectedEditedCodeValue= "QACODE"+formattedTimeForSecond;
	    Thread.sleep(1000);
	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    String ExpectedEditedDescriptionValue= "QA Description"+formattedTimeForSecond;
	    UpdateBtnInEditPage.click();
	    Thread.sleep(1000);
	    ConfirmOkBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    Assert.assertEquals(ActualNameOfBasicSetupValue(), ExpectedEditedNameValue, "Incorrect Info");
	    Thread.sleep(1000);
	    Assert.assertEquals(ActualCodeInfoAfterUpdating(), ExpectedEditedCodeValue, "Incorrect Info");
	    Thread.sleep(1000);
	    Assert.assertEquals(ActualDescriptionInfoAfterUpdating(), ExpectedEditedDescriptionValue, "Incorrect Info");
    }
    
    public String ActualNameOfBasicSetupValue() {
    	return InfoOfNameOfBasicSetup.getText();
    }
    
    public String ActualCodeInfoAfterUpdating() {
    	return InfoOfCodeNameOfBasicSetup.getText();
    }
    
    public String ActualDescriptionInfoAfterUpdating() {
    	return InfoOfDescriptionOfBasicSetup.getText();
    }
    
    public void functionalityForValidateDeleteBtnInEditPage() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mmss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
   	    NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
 	    Thread.sleep(1000);
	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    SaveBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    EditBtn.click();
	    Thread.sleep(1000);
	    DeleteBtnInEditPage.click();
	    Thread.sleep(1000);
	    ConfirmOkBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
    }
    
    public String ActualDeleteMsgAfterDeletingBasicSetup() {
    	return NoDataFoundMsg.getText();
    }
    
    //Add Child Page
    public void functionalityForNavigateAddChildPage() throws InterruptedException {
    	AddChildBtn.click();
    	Thread.sleep(1000);	
    }
    
    public String DisplayAddChildPageHeadingName() {
    	return AddChildPageHeadingName.getText();
    }
    
    public void functionalityForNameRequiredFieldInChildPage() throws InterruptedException {
    	AddChildBtn.click();
    	Thread.sleep(1000);
    	AddChildCodeField.sendKeys("ChildCode001");
    	Thread.sleep(1000);
    	AddChildRemarksField.sendKeys("ChildRemark001");
    	Thread.sleep(1000);
    	AddChildSaveBtn.click();
    }
    
    public void functionalityForCodeRequiredFieldInChildPage() throws InterruptedException {
    	AddChildBtn.click();
    	Thread.sleep(1000);
    	AddChildNameField.sendKeys("ChildName001");
    	Thread.sleep(1000);
    	AddChildRemarksField.sendKeys("ChildRemark001");
    	Thread.sleep(1000);
    	AddChildSaveBtn.click();
    }
    
    public void functionalityForValidateResetBtnInChildPage() throws InterruptedException {
    	AddChildBtn.click();
    	Thread.sleep(1000);
    	AddChildResetBtn.click();
    }
    
    public void functionalityForValidateSavingAddChildInfo() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mmss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
   	    NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
 	    Thread.sleep(1000);
	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    SaveBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    AddChildBtn.click();
	    Thread.sleep(1000);
	    AddChildNameField.sendKeys("ChildName"+formattedTimeForSecond);
    	Thread.sleep(1000);
    	String ExpectedChildName= "ChildName"+formattedTimeForSecond;
    	AddChildCodeField.sendKeys("ChildCode"+formattedTimeForSecond);
    	Thread.sleep(1000);
    	//String ExpectedChildCode="ChildCode"+formattedTimeForSecond;
    	AddChildRemarksField.sendKeys("ChildRemark"+formattedTimeForSecond);
    	Thread.sleep(1000);
    	//String ExpectedChildRemark="ChildRemark"+formattedTimeForSecond;
    	AddChildSaveBtn.click();
    	Thread.sleep(1000);
    	DetailsBtn.click();
    	Thread.sleep(1000);
    	Assert.assertEquals(ActualNameOfChildInfo(), ExpectedChildName, "Test case Fail");
	    }
    
    public String ActualNameOfChildInfo() {
    	return ChildNameValueInDetails.getText();
    }
    
    public String ActualCodeOfChildInfo() {
    	return ChildCodeValueInDetails.getText();
    }
    
    public String ActualDescriptionOfChildInfo() {
    	return ChildDiscriptionValueInDetails.getText();
    }
    
    //EditChildPage
    public void functionalityForValidateEditingChildPage() throws InterruptedException {
    	AddBtn.click();
    	Thread.sleep(1000);
    	LocalTime currentTime = LocalTime.now();
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mmss");
   	    String formattedTimeForSecond = currentTime.format(formatter);
   	    NameField.sendKeys("QABasicSetup"+formattedTimeForSecond);
 	    Thread.sleep(1000);
	    CodeField.sendKeys("QACode"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    DescriptionField.sendKeys("QA Description"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    SaveBtn.click();
	    Thread.sleep(1000);
	    SearchField.sendKeys("QABasicSetup"+formattedTimeForSecond);
	    Thread.sleep(1000);
	    AddChildBtn.click();
	    Thread.sleep(1000);
	    AddChildNameField.sendKeys("ChildName"+formattedTimeForSecond);
    	Thread.sleep(1000);
    	AddChildCodeField.sendKeys("ChildCode"+formattedTimeForSecond);
    	Thread.sleep(1000);
    	AddChildRemarksField.sendKeys("ChildRemark"+formattedTimeForSecond);
    	Thread.sleep(1000);
    	AddChildSaveBtn.click();
    	Thread.sleep(1000);
    	DetailsBtn.click();
    	Thread.sleep(1000);
    	EditBtnOfChildPage.click();
    	Thread.sleep(1000);
    	AddChildNameField.clear();
    	Thread.sleep(1000);
    	AddChildCodeField.clear();
    	Thread.sleep(1000);
    	AddChildRemarksField.clear();
    	Thread.sleep(1000);
    	LocalTime currentTimeSec = LocalTime.now();
   	    DateTimeFormatter formatterOfTimeSec = DateTimeFormatter.ofPattern("mmss");
   	    String formattedForTimeSec = currentTimeSec.format(formatterOfTimeSec);
   	    Thread.sleep(1000);
 	    String ExpectedChildName= "ChildName"+formattedForTimeSec;
   	    Thread.sleep(1000); 
   	    AddChildNameField.sendKeys("ChildName"+formattedForTimeSec);
 	    Thread.sleep(1000);
 	    AddChildCodeField.sendKeys("ChildCode"+formattedForTimeSec);
 	    Thread.sleep(1000);
 	    AddChildRemarksField.sendKeys("ChildRemark"+formattedForTimeSec);
 	    Thread.sleep(1000);
 	    UpdateBtnInEditChildPage.click();
 	    Thread.sleep(1000);
 	    ConfirmOkBtn.click();
 	    Thread.sleep(1000);
 	    DetailsBtn.click();
 	    Thread.sleep(1000);
 	    Assert.assertEquals(ActualNameOfChildInfo(), ExpectedChildName, "Test case Fail");
    }
    
    
    
    
}
