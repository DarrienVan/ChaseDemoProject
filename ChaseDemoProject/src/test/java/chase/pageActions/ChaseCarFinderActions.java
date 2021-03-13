package chase.pageActions;


import org.openqa.selenium.support.PageFactory;

import chase.pageElements.ChaseCarFinderLocators;
import tt.utilities.SetupDrivers;

public class ChaseCarFinderActions {
	
	ChaseCarFinderLocators ChaseCarFinderLocatorsObj; 
	
	public ChaseCarFinderActions(){
		ChaseCarFinderLocatorsObj = new ChaseCarFinderLocators();
		PageFactory.initElements(SetupDrivers.driver,  ChaseCarFinderLocatorsObj);
	}
	public void SelectFinanceButton() throws Exception {
		ChaseCarFinderLocatorsObj.carFinBtn.click();
		Thread.sleep(3000);
	}
	public void SelectCarDealButton() throws Exception {
		ChaseCarFinderLocatorsObj.carDealBtn.click();
		Thread.sleep(3000); 
	}
	
 		public void EnterZipcode(String Carzipcode)throws Exception{
	if (Carzipcode.equals("11418")){
		ChaseCarFinderLocatorsObj.zipBar.sendKeys("11418");
		ChaseCarFinderLocatorsObj.carSubBtn.click();
	}else if (Carzipcode.equals("11")){
		ChaseCarFinderLocatorsObj.zipBar.sendKeys("11");
		ChaseCarFinderLocatorsObj.carSubBtn.click();
	}else if (Carzipcode.equals("00003")){
		ChaseCarFinderLocatorsObj.zipBar.sendKeys("00003");
		ChaseCarFinderLocatorsObj.carSubBtn.click();}
	}
		
		public void VerifyZipcode(String Carzipcode)throws Exception{
if (Carzipcode.equals("11418")){
	ChaseCarFinderLocatorsObj.carNameCheck.isDisplayed();
	
}else if (Carzipcode.equals("11")){
	ChaseCarFinderLocatorsObj.carNoSubBtn.isDisplayed();
		
}else if (Carzipcode.equals("00003")){
	ChaseCarFinderLocatorsObj.carNoRslt.isDisplayed();}
	
			}
}
