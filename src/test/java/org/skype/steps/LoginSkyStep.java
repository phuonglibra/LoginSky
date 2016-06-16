package org.skype.steps;

import net.thucydides.core.annotations.Steps;

import org.junit.Assert;
import org.skype.steps.serenity.LoginSkypeSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSkyStep {
	@Steps
	LoginSkypeSteps loginsky;

	@Given("^Open Login skype page$")
	public void open_Login_skype_page() throws Throwable {
		loginsky.openSkyPage();
	}

	@When("^I am input username is \"([^\"]*)\"$")
	public void i_am_input_username_is(String skypename) throws Throwable {
		loginsky.inputSkyName(skypename);
	}

	@When("^user click Signin button$")
	public void user_click_Signin_button() throws Throwable {
		loginsky.clickSignin();
	}

	@Then("^I verify password is \"([^\"]*)\"$")
	public void i_verify_password_is(String checkMsgPassword) throws Throwable {
		Assert.assertEquals(loginsky.verifyPass(), checkMsgPassword);
	}

	@When("^I am input password is \"([^\"]*)\"$")
	public void i_am_input_password_is(String password) throws Throwable {
		loginsky.inputPassword(password);
	}

	@Then("^I verify skype name is \"([^\"]*)\"$")
	public void i_verify_skype_name_is(String checkMsgSkyname) throws Throwable {
		Assert.assertEquals(loginsky.verifySkyname(), checkMsgSkyname);
	}

	@Then("^I verify the error message is \"([^\"]*)\"$")
	public void i_verify_the_error_message_is(String checkSignError)
			throws Throwable {
		Assert.assertEquals(loginsky.verifySigninError(), checkSignError);
	}

	@Then("^I verify page title is \"([^\"]*)\"$")
	public void i_verify_page_title_is(String pagetitle) throws Throwable {
		Assert.assertEquals(loginsky.verifyPagetitle(), pagetitle);
	}
}
