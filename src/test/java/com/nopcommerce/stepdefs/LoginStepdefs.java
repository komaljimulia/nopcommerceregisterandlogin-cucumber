package com.nopcommerce.stepdefs;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Welcome, Please Sign In!",new LoginPage().getWelcomeSignText());
    }
    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().getEmailIdLogin(email);
    }

    @And("^I enter password of login \"([^\"]*)\"$")
    public void iEnterPasswordOfLogin(String password)  {
        new LoginPage().getPasswordLogin(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals("Welcome to our store",new LoginPage().getHomePageText());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errormessage)  {
       Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.",new LoginPage().getErrorMessage());

    }
}
