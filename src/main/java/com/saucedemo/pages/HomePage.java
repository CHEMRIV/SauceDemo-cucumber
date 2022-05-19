package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucedemo.drivermanager.ManageDriver.driver;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement userPassword;
    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void enterUserName(String name){
        log.info("Enter Username"+userName.toString());
        sendTextToElement(userName,name);
    }
    public void enterPassword(String password){
        log.info("Enter user password" +userName.toString());
        sendTextToElement(userPassword,password);
    }
public void clickOnLogInButton(){
        log.info("Click On LogIn Button"+loginButton.toString());
        clickOnElement(loginButton);
}





}
