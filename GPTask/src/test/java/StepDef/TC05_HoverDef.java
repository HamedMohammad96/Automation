package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class TC05_HoverDef {
    P03_HomePage hover = new P03_HomePage();


    @When("User Hover random main category and Click on one random Sub-Category")
    public void UserHoverRandomMainCategory() throws InterruptedException {
        hover.hoverMainCategory();
        Thread.sleep(2000);
        hover.selectSubCategory();
    }

    @Then("User get text of the page title")
    public void userGetTextOfThePageTitle() {
        hover.getTitle();
        }

}

