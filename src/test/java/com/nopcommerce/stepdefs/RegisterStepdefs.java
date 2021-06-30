package com.nopcommerce.stepdefs;

import com.nopcommerce.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class RegisterStepdefs {
    @Given("^I m on homepage of nopcommerce$")
    public void iMOnHomepageOfNopcommerce() {
    }

    @When("^I navigate to RegisterLink$")
    public void iNavigateToRegisterLink() {
        new RegisterPage().clickOnRegisterLink();
    }

    @And("^I select gender 'Male'$")
    public void iSelectGenderMale() {
        new RegisterPage().getClickOnMale();
    }

    @And("^I select Firstname \"([^\"]*)\"$")
    public void iSelectFirstname(String firstname) throws InterruptedException {
        Thread.sleep(1000);
       new RegisterPage().getFirstName(firstname);
    }

    @And("^I select Lastname \"([^\"]*)\"$")
    public void iSelectLastname(String lastname)  {
       new RegisterPage().getLastName(lastname);
    }

    @And("^I select Date \"([^\"]*)\"$")
    public void iSelectDate(String dom )  {
      new RegisterPage().getDate();
    }

    @And("^I select Month \"([^\"]*)\"$")
    public void iSelectMonth(String month)  {
       new RegisterPage().getMonth();
    }

    @And("^I select Year \"([^\"]*)\"$")
    public void iSelectYear(String year)  {
        new RegisterPage().getMonth();
    }

    @And("^I enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(2000);
        Random r = new Random();
        email= "primetime" + r.nextInt() + "@gmail.com";
        new RegisterPage().getEmailId( email );
        System.out.println(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
       new RegisterPage().getPassword(password);
    }

    @And("^I enter confirmPassword \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword) {
       new RegisterPage().getPasswordConfirm(confirmPassword);
    }

    @And("^I click on 'Registration Button'$")
    public void iClickOnRegistrationButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should see message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String arg0) throws Throwable {
        Assert.assertEquals("Your registration completed",new RegisterPage().getRegisterMessage());
    }


    @And("^I click on logoutLink$")
    public void iClickOnLogoutLink() {
        new RegisterPage().clickOnLogoutLink();
    }
}
