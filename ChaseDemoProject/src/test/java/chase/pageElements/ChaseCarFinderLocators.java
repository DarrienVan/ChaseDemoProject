package chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ChaseCarFinderLocators {
	

	@FindBy(xpath="//a[@id='Shop_Section1_ShopNow']")
	public WebElement shopnowBtn;

	@FindBy(xpath="//input[@id='zip-value']")
	public WebElement zipBar; 
	
	@FindBy(xpath="//span[contains(text(),'Finance')]")
	public WebElement carFinBtn; 
	
	@FindBy(xpath="//body/div[@id='jsEnabled']/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/p[1]/a[1]")
	public WebElement carDealBtn; 
	
	@FindBy(xpath="//p[contains(text(),'No results')]")
	public WebElement carNoRslt; 
	
	@FindBy(xpath="//button[@class='dealer-search-button cta-btn disabled']")
	public WebElement carNoSubBtn; 
	
	@FindBy(xpath="//p[contains(text(),'Ford/Lincoln of Queens')]")
	public WebElement carNameCheck; 
	
	@FindBy(xpath="//button[contains(text(),'Search')]")
	public WebElement carSubBtn; 
	
	
	
	
}