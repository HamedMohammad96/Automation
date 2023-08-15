package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC07_FollowUsDef {
    P03_HomePage homePage = new P03_HomePage();

    @When("user open facebook link")
    public void UserOpenFacebookLink() throws InterruptedException{
        homePage.ClickOnFaceBookLink();
    }
    @Then("{string} is opened in new tab 1")
    public void isOpenedInNewTab1(String link) {
        homePage.matchURL(link);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException{
        homePage.ClickOnTwitterLink();
    }
    @Then("{string} is opened in new tab 2")
    public void isOpenedInNewTab2(String link) {
        homePage.matchesURL(link);
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException{
        homePage.ClickOnRssLink();
    }
    @Then("{string} is opened in new tab 3")
    public void isOpenedInNewTab3(String link) {
        homePage.matchdURL(link);
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException{
        homePage.ClickOnYoutubeLink();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String link) {
        homePage.RightURL(link);
    }


}
