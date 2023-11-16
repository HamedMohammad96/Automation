package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;

public class TC03_HoverStepDef {
    P03_HomePage p03HomePage = new P03_HomePage();

    @Given("User Hover On Supermarket Category")
    public void UserHoverOnSupermarketCategory(){
        p03HomePage.HoverONSupermarket();
    }

    @When("User Click On Bakery")
    public void userClickOnBakery() {
        p03HomePage.ClickOnBakery();
    }

    @Then("Page Navigate To Bakery")
    public void pageNavigateToBakery() {
        p03HomePage.NavigateCorrectly();
    }
}
