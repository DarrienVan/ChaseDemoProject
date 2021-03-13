package chase.pageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import tt.utilities.SetupDrivers;
import chase.pageElements.ChaseHomepageLocators;



public class ChaseHomepageActions{
	
	ChaseHomepageLocators ChaseHomepageLocatorsObj;

	public ChaseHomepageActions(){
		ChaseHomepageLocatorsObj = new ChaseHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver,  ChaseHomepageLocatorsObj);
	}
	public void loadChaseHomepage() throws Exception {
//		SetupDrivers.driver.get("https://www.chase.com");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void SelectCommercial() throws Exception {
		ChaseHomepageLocatorsObj.commBtn.click();
		Thread.sleep(3000);
	}
	public void SelectAutoButton()throws Exception {
		ChaseHomepageLocatorsObj.autoBtn.click();
	}
		
	public void SelectShopCar()throws Exception {
		ChaseHomepageLocatorsObj.shopcarBtn.click();
}
	   WebDriver driver;
	public void HelpBankOnline()throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Program Files/Chrome.driver/chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        //Find element by link text and store in variable "Element"        		
        WebElement helpBankOnlinee = driver.findElement(By.linkText("News & Stories"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", helpBankOnlinee);
        Thread.sleep(3000);
		ChaseHomepageLocatorsObj.helpBankOnline.click();
}
}