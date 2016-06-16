package org.skype.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.skype.pages.LoginSkyPage;

public class LoginSkypeSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginSkyPage loginPage;

	@Step
	public void openSkyPage() {
		loginPage.open();
	}

	@Step
	public void inputSkyName(String skypename) {
		loginPage.skynameField(skypename);
	}

	@Step
	public void clickSignin() {
		loginPage.signinField();
	}

	@Step
	public String verifyPass() {
		// TODO Auto-generated method stub
		return loginPage.getStringErrorPass();
	}

	@Step
	public void inputPassword(String password) {
		// TODO Auto-generated method stub
		loginPage.passwordField(password);
	}

	@Step
	public String verifySkyname() {
		// TODO Auto-generated method stub
		return loginPage.getStringErrorSkyname();
	}

	@Step
	public String verifySigninError() {
		// TODO Auto-generated method stub
		return loginPage.getStringSigninError();
	}

	@Step
	public String verifyPagetitle() {
		// TODO Auto-generated method stub
		return loginPage.getTitle();
	}

}
