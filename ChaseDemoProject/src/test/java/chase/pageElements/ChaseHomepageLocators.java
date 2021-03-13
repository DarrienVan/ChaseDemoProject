package chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ChaseHomepageLocators { 
	
	@FindBy(xpath="//a[contains(text(),'Commercial')]")
	public WebElement commBtn;
	

	@FindBy(xpath="//header/section[2]/section[1]/section[1]/nav[2]/ul[1]/li[4]/a[1]")
	public WebElement autoBtn;
	
	@FindBy(xpath="//a[contains(text(),'Shop for a car')]")
	public WebElement shopcarBtn;
	
	@FindBy(xpath="//p[contains(text(),'Videos to help you bank from your device')]")
	public WebElement helpBankOnline;
}