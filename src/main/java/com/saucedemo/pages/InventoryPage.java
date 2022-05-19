package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(tagName = "select")
    WebElement selectDropDown;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Price (high to low)')]")
    WebElement selectPriceHighToLow;

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> addToCartList;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(id= "first-name")
    WebElement frtName ;
    @CacheLookup
    @FindBy(id = "last-name")
    WebElement lstName;
    @CacheLookup
    @FindBy(id = "postal-code")
    WebElement postalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='complete-text']")
    WebElement verifyMsg;





    public void selectDropDown() {
        log.info("Select dropdown" + selectDropDown.toString());
        clickOnElement(selectDropDown);
    }

    public void clickOnPriceHighToLow() {
        log.info("Click on price high to low" + selectPriceHighToLow.toString());
        clickOnElement(selectPriceHighToLow);
    }
    public void clickOnAddToCart() {
        log.info("add to cat cheapest & costliest products ");
        addToCartList.get(0).click();
        addToCartList.get(addToCartList.size() - 1).click();
    }
    public void clickOnShoppingCart(){
        log.info("Click on shopping cart"+shoppingCart.toString());
        clickOnElement(shoppingCart);
    }
    public void enterFirstName(String name1){
        log.info("Enter first name"+frtName.toString());
        sendTextToElement(frtName,name1);
    }
    public void enterLastName(String name2){
        log.info("Enter last name"+lstName.toString());
        sendTextToElement(lstName,name2);
    }
    public void enterZipCode(String zipCode){
        log.info("Enter zipcode"+postalCode.toString());
        sendTextToElement(postalCode,zipCode);
    }
    public void clickOnFinalContinue(){
        log.info("click on final continue button"+clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
    public void clickOnFinishedButton(){
        log.info("Click on finished button"+finishButton.toString());
        clickOnElement(finishButton);
    }
    public String verifyMsg(){
        log.info("Verify msg"+verifyMsg.toString());
        return getTextFromElement(verifyMsg);
    }

}
