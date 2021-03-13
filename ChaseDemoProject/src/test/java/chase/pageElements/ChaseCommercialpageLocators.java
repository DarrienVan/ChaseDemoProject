package chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ChaseCommercialpageLocators {
//	@FindBy(xpath="//*[contains(text(),'Watch')]")
//	public WebElement watchNow;
	
	@FindBy(xpath="//a[@name='btn_proceed']")  
	public WebElement commProcBtn;
	
	@FindBy(xpath="//a[contains(text(),'Watch now')]")
	public WebElement commWatchNow;
	
	@FindBy(xpath="//a[@name='btn_cancel']")
	public WebElement commCancBtn;

	/* 
	@FindBy(xpath="//body[1]/div[1]/div[4]/div[1]/div[2]/div[1]/form[1]/span[1]")
	public WebElement commFirstName;
	
	@FindBy(xpath="//input[@id='fe137186822134d5826dbedfc209cc6d02e076c7']")
	public WebElement commLastName;
	
	@FindBy(xpath="//input[@id='29ea5d7b9e46d0e83b73c8b912c86ad7f5ead00d']")
	public WebElement commBusiName;
	
	@FindBy(xpath="//input[@id='197653086fc9cc7c8f2f9142e448d4804b54a6be']")
	public WebElement commEmail;
	
	@FindBy(xpath="//a[contains(text(),'Watch now')]")
	public WebElement commSubmitBtn;
	
	@FindBy(xpath="button[@id='cookieDisclaimerOptIn']") 
	public WebElement closeCookie;
	    
	
	*/
}
