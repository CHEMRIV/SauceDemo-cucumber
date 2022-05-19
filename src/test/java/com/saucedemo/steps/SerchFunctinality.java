package com.saucedemo.steps;

import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SerchFunctinality {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String name, String password) {
        new HomePage().enterUserName(name);
        new HomePage().enterPassword(password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLogInButton();
    }

    @And("^I filter the products by Price high to low$")
    public void iFilterTheProductsByPriceHighToLow() {
        new InventoryPage().selectDropDown();
        new InventoryPage().clickOnPriceHighToLow();
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new InventoryPage().clickOnAddToCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new InventoryPage().clickOnShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckOutPage().clickOnCheckOut();

    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstName, String lastName, String zipCode) {
        new InventoryPage().enterFirstName(firstName);
        new InventoryPage().enterLastName(lastName);
        new InventoryPage().enterZipCode(zipCode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new InventoryPage().clickOnFinalContinue();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new InventoryPage().clickOnFinishedButton();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        String expectedMsg="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        Assert.assertEquals("No match Found",expectedMsg,new InventoryPage().verifyMsg());
    }


}
