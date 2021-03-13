package chase.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import chase.pageElements.ChaseCommercialpageLocators;
import tt.utilities.SetupDrivers;
import org.openqa.selenium.interactions.Actions;


public class ChaseCommercialpageActions {

	ChaseCommercialpageLocators ChaseCommercialpageLocatorsObj;
	Actions act;

	public ChaseCommercialpageActions(){
		ChaseCommercialpageLocatorsObj = new ChaseCommercialpageLocators();
		PageFactory.initElements(SetupDrivers.driver,  ChaseCommercialpageLocatorsObj);
	}
	
	public void CommWatchNow() throws Exception {
		ChaseCommercialpageLocatorsObj.commWatchNow.click();
		Thread.sleep(3000);

	}
    WebDriver driver;
 
	public void CommByVisibleElement() {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/Chrome.driver/chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        //Find element by link text and store in variable "Element"        		
        WebElement watchNow = driver.findElement(By.linkText("Watch Now"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", watchNow);
    }
   
 
  public void CommProTest(String CommProceed) throws Exception {
	  
  
		if (CommProceed.equals("proceed")){
			
			ChaseCommercialpageLocatorsObj.commProcBtn.click();
			 Thread.sleep(3000);
			
		}else if (CommProceed.equals("cancel")){
			
			ChaseCommercialpageLocatorsObj.commCancBtn.click();
		}
			 
  }
  
		public void CommValidation() throws Exception {
			ChaseCommercialpageLocatorsObj.commWatchNow.isDisplayed();
			Thread.sleep(3000);

  // public void CommlastName() throws Exception {
//	    ChaseCommercialpageLocatorsObj.commLastName.click();
//	   ChaseCommercialpageLocatorsObj.commLastName.sendKeys(ReadExcelSheet.getMapData("lastName")); 



}
}
