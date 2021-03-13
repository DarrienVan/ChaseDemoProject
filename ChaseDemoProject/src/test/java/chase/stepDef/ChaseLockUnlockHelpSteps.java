package chase.stepDef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import chase.pageActions.ChaseLockUnlockHelpActions;
import chase.pageActions.ChaseHomepageActions;

public class ChaseLockUnlockHelpSteps {

	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	ChaseLockUnlockHelpActions ChaseLockUnlockHelpActionsObj = new ChaseLockUnlockHelpActions();
	



@Given("^click videos to help you bank$")
public void click_videos_to_help_you_bank() throws Throwable {
    System.out.println();
    ChaseLockUnlockHelpActionsObj.PersonalBankHelp();
}

@Given("^click personal banking link$")
public void click_personal_banking_link() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.PersonalBankHelp();
}

@Given("^click desktop help link$")
public void click_desktop_help_link() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.DesktopHelp();
}

@Given("^click lock and unlock your debit card$")
public void click_lock_and_unlock_your_debit_card() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.LockUnlockHelp();
}

@Then("^validate by x button$")
public void validate_by_x_button() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.LockUnlockHelpX();
}
}