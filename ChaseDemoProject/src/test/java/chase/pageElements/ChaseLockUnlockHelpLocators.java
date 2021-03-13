package chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaseLockUnlockHelpLocators {
	
	@FindBy(xpath="//a[@id='Shop_Section1_ShopNow']")
	public WebElement shopnowBtn;
	
	@FindBy(xpath="//b[contains(text(),'Personal banking')]")
	public WebElement perBankingBtn;
	
	@FindBy(xpath="//a[@id='tabs__list--item-link-2']")
	public WebElement deskHelpBtn;
	
	@FindBy(xpath="//a[@data-video-details='lock-unlock-web']")
	public WebElement lockUnlockVid;
	
	@FindBy(xpath="//a[@id='cancel']")
	public WebElement xBtn;
	
}