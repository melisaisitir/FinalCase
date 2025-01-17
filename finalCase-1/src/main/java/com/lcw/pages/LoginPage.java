package com.lcw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.lcw.utilities.Log;


public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    // Locators
    @FindBy(css = "[class='text-input']")
    private WebElement emailField ;

    @FindBy(css = "[class='login-form__button login-form__button--bg-blue']")
    private WebElement continueButton ;

    @FindBy(css = "[class='text-input']")
    private WebElement passwordField ;

    @FindBy(css = "[class='login-form__button login-form__button--bg-blue']")
    private WebElement loginButton ;


    // Methods
    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        Log.info("Email entered: " + email);
    }

    public void clickContinueButton() {
       continueButton.click ();
       Log.info("Continue button clicked.");
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        Log.info("Password entered.");
    }

    public void clickLoginButton() {
        loginButton.click ();
        Log.info ("Login button clicked.");
    }

}
