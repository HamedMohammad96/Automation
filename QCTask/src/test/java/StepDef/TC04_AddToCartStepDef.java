package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC04_AddToCartStepDef {
    P03_HomePage p03HomePage = new P03_HomePage();
    
    @Given("User Click On Add to Cart Button For two Items")
    public void UserClickOnAddToCartButtonForTwoItems(){
        p03HomePage.AddItem1ToCart();
        p03HomePage.AddItem2ToCart();
    }

    @When("User Click On Cart Button To Verify adding the two items")
    public void userClickOnCartButtonToVerifyAddingTheTwoItems() {
        p03HomePage.ClickOnCartButton();
    }

    @Then("Calculate the two items price and compare with subtotal")
    public void calculateTheTwoItemsPriceAndCompareWithSubtotal() {
        p03HomePage.Calculation();
    }
}
