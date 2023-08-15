package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC08_WishListDef {
    P03_HomePage homePage = new P03_HomePage();
    @When("user click on wishlist button of product")
    public void userClickOnWishlistButtonOfProduct(){
        homePage.clickOnWishButton();
    }

    @Then("user found success message")
    public void userFoundSuccessMessage() {
        homePage.flashMessage();
    }

    @When("user click on wishlist tab on the top of the page")
    public void userClickOnWishlistTabOnTheTopOfThePage() throws InterruptedException{
        homePage.clickOnTabWishList();
    }

    @Then("user check that the qty of list is bigger than zero")
    public void userCheckThatTheQtyOfListIsBiggerThan() {
        homePage.qntOfWishlist();
    }
}
