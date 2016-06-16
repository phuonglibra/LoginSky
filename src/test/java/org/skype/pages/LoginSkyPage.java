package org.skype.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://login.skype.com/login")
public class LoginSkyPage extends PageObject {

	@FindBy(id = "username")
	WebElement txtSkyname;
	@FindBy(id = "signIn")
	WebElement btnSignin;
	@FindBy(css="div.messageBox.message_error > span")
	WebElement boxerrorPass;
	@FindBy(id = "password")
	WebElement txtPassword;

	public void skynameField(String skypename) {
		txtSkyname.clear();
		txtSkyname.sendKeys(skypename);
	}

	public void signinField() {

		btnSignin.click();
	}

	public String getStringErrorPass() {
		// TODO Auto-generated method stub
		return boxerrorPass.getText();
	}

	public void passwordField(String password) {
		// TODO Auto-generated method stub
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public String getStringErrorSkyname() {
		// TODO Auto-generated method stub
		return boxerrorPass.getText();
	}

	public String getStringSigninError() {
		// TODO Auto-generated method stub
		return boxerrorPass.getText();
	}

}
