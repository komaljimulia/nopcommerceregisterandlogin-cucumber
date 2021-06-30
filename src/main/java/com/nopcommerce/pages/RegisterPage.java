package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement clickOnMale;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']//option[contains(text(),'11')]")
    WebElement date;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']//option[contains(text(),'November')]")
    WebElement month;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']//option[contains(text(),'2011')]")
    WebElement year;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='Company']")
    WebElement company;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerMessage;
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement clickOnLogOut;

    //ErrorMessage with First name empty
    @FindBy(xpath = "//span[text()='First name is required.']")
    WebElement firstNameEmpty;


    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        log.info("Clicking on radio button:" + registerLink.toString());
    }
    public String getRegisterText(){
        log.info("Register Text:" + registerText.toString());
        return getTextFromElement(registerText);
    }
    public void getClickOnMale(){
        clickOnElement(clickOnMale);
        log.info("Clicking on male button:" +clickOnMale.toString());
    }
    public void getFirstName(String name){
        log.info("Get first name:" + firstName.toString());
         sendTextToElement(firstName,name);
    }
    public void getLastName(String surname){
        log.info("Get last name:" + lastName.toString());
        sendTextToElement(lastName,surname);
    }
    public void getDate(){

        clickOnElement(date);
        log.info("Date:" +date.toString());
    }
    public void getMonth(){
        log.info("Month:" +month.toString());
    }
    public void getYear(){
        clickOnElement(year);
        log.info("Year:" +year.toString());
    }
    public void getEmailId(String emailid){
        log.info("Get Email id:" + emailId.toString());
        sendTextToElement(emailId,emailid);
    }
    public void getCompanyName(String companyName){
        log.info("Get company name:" + company.toString());
        sendTextToElement(company,companyName);
    }
    public void getPassword(String passwordCorrect){
        log.info("Get password:" + password.toString());
        sendTextToElement(password,passwordCorrect);
    }
    public void getPasswordConfirm(String passwordCorrect1){
        log.info("Get password confirm:" + confirmPassword.toString());
        sendTextToElement(confirmPassword,passwordCorrect1);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegisterMessage(){
        log.info("Register message:" + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
    public String getFirstNameEmptyMsg(){
        log.info("First name empty message:" + firstNameEmpty.toString());
        return getTextFromElement(firstNameEmpty);
    }
    public void clickOnLogoutLink(){
        clickOnElement(clickOnLogOut);
        log.info("Clicking on radio button:" + clickOnLogOut.toString());
    }


}
