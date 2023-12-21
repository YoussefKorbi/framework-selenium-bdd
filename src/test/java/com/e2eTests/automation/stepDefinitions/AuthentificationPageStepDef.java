package com.e2eTests.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationPageStepDef {
	public WebDriver driver;

	public AuthentificationPageStepDef() {
		driver = Setup.driver;
	}

	@Given("^I open OrangeHRM application$")
	public void iOpenOrangeHRMApplication() throws Throwable {

	}

	@When("^I set username$")
	public void iSetUsername() throws Throwable {
	}

	@When("^I set password$")
	public void iSetPassword() throws Throwable {
	}

	@When("^I click on login button$")
	public void iClickOnLoginButton() throws Throwable {
	}

	@Then("^I check the admin account is displayed$")
	public void iCheckTheAdminAccountIsDisplayed() throws Throwable {
	}

}
