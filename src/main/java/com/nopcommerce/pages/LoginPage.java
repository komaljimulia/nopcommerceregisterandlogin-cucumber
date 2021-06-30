package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeSignInText;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement clickOnLoginButton;
    @FindBy(name = "Password")
    WebElement password;
    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement homePageText;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement _errorMessage;


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        log.info("Clicking on Login Link:" + loginLink.toString());
    }
    public String getWelcomeSignText(){
        log.info("Sign in Text:" + welcomeSignInText.toString());
        return getTextFromElement(welcomeSignInText);
    }
    public void getEmailIdLogin(String emailidLogin){
        log.info("Get Email id:" + enterEmail.toString());
        sendTextToElement(enterEmail,emailidLogin);
    }
    public void clickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
        log.info("Clicking on Login button:" + clickOnLoginButton.toString());
    }

    public void getPasswordLogin(String passwordLogin){
        log.info("Get Email id:" + password.toString());
        sendTextToElement(password,passwordLogin);
    }
    public String getHomePageText(){
        mouseHoverToElement( homePageText );
        log.info("Get homepage Msg Text" + homePageText.toString());
        return getTextFromElement( homePageText );
    }
    public String getErrorMessage(){

        log.info("Getting error message : " + _errorMessage.toString());
        return getTextFromElement(_errorMessage);
    }

}
