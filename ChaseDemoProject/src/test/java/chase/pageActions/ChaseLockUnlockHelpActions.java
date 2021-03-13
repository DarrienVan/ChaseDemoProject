package chase.pageActions;

import org.openqa.selenium.support.PageFactory;
import chase.pageElements.ChaseLockUnlockHelpLocators;
import tt.utilities.SetupDrivers;

public class ChaseLockUnlockHelpActions{

	
	
	ChaseLockUnlockHelpLocators ChaseLockUnlockHelpLocatorsObj;
	

	public ChaseLockUnlockHelpActions(){
		ChaseLockUnlockHelpLocatorsObj = new ChaseLockUnlockHelpLocators();
		PageFactory.initElements(SetupDrivers.driver,  ChaseLockUnlockHelpLocatorsObj);
	}
	
	public void PersonalBankHelp() throws Exception {
		ChaseLockUnlockHelpLocatorsObj.perBankingBtn.click();
		Thread.sleep(3000);
}
	public void DesktopHelp() throws Exception {
		ChaseLockUnlockHelpLocatorsObj.deskHelpBtn.click();
		Thread.sleep(3000);
	}
	
	public void LockUnlockHelp() throws Exception {
		ChaseLockUnlockHelpLocatorsObj.lockUnlockVid.click();
		Thread.sleep(3000);
	}
		public void LockUnlockHelpX() throws Exception {
			ChaseLockUnlockHelpLocatorsObj.xBtn.isDisplayed();
			Thread.sleep(3000);
		}
}
