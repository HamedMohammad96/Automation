package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC06_HomeSliderDef {
    P03_HomePage homePage = new P03_HomePage();
    @When("user click on first page home slider")
    public void userClickOnFirstPageHomeSlider() throws InterruptedException {
        homePage.clickFirstSlider();
    }

    @Then("there is no changing in the Url")
    public void thereIsNoChangingInTheUrl() {
        homePage.makeSureOfURL();
    }
    //    the second scenario
    @When("user click on Second page home slider")
    public void userClickOnSecondPageHomeSlider() throws InterruptedException{
        homePage.clickSecondSlider();
    }


    @Then("The URL doesn't change")
    public void theURLDoesnTChange() {
        homePage.MatchedURL();
    }
}
