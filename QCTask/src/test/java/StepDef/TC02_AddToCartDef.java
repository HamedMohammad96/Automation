package StepDef;

import Pages.P02_AddToCartPage;
import io.cucumber.java.en.Then;

public class TC02_AddToCartDef {
    P02_AddToCartPage addToCartPage = new P02_AddToCartPage();

    @Then("Click on add to cart button for the first item")
    public void ClickOnAddToCartButtonForTheFirstItem(){
        addToCartPage.addToCart();
    }
}
