package StepDef;

import Pages.P03_CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC03_CheckoutDef {
    P03_CheckoutPage checkoutPage = new P03_CheckoutPage();
    @And("Click on My Cart Button")
    public void ClickOnMyCartButton(){
        checkoutPage.clickOnMyCart();
    }

    @And("Click on Checkout Button")
    public void clickOnCheckoutButton() {
        checkoutPage.ClickOnCheckOutButton();
    }

    @And("Enter First, Last name and Zip Code")
    public void enterFirstLastNameAndZipCode() {
        checkoutPage.EnterMoreInfo();
    }

    @And("Click on Button Continue")
    public void clickOnButtonContinue() {
        checkoutPage.ClickContinueButton();
    }

    @When("Click on Button Finish")
    public void clickOnButtonFinish() {
        checkoutPage.ClickFinishButton();
    }

    @Then("Click on Logout Button")
    public void clickOnLogoutButton(){
        checkoutPage.ClickLogoutButton();
    }
}
