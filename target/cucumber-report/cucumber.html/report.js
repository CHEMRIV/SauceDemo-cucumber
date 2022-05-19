$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4594053600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price high to low",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"Herry\", lastName \"Potter\" and zipPostalCode \"WD185NW\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "SerchFunctinality.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 119383800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "SerchFunctinality.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 279716500,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iClickOnLoginButton()"
});
formatter.result({
  "duration": 161092200,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iFilterTheProductsByPriceHighToLow()"
});
formatter.result({
  "duration": 364035100,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 224141800,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iOpenShoppingCart()"
});
formatter.result({
  "duration": 150143000,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iGoToCheckout()"
});
formatter.result({
  "duration": 99997400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Herry",
      "offset": 27
    },
    {
      "val": "Potter",
      "offset": 45
    },
    {
      "val": "WD185NW",
      "offset": 72
    }
  ],
  "location": "SerchFunctinality.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 316746700,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iClickOnContinueButton()"
});
formatter.result({
  "duration": 89312900,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iClickOnFinishButton()"
});
formatter.result({
  "duration": 83336800,
  "status": "passed"
});
formatter.match({
  "location": "SerchFunctinality.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 53424000,
  "status": "passed"
});
formatter.after({
  "duration": 749704600,
  "status": "passed"
});
});