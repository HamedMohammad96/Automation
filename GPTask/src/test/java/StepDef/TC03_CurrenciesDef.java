package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TC03_CurrenciesDef {
    P03_HomePage currency = new P03_HomePage();
    @When("User can select Euro currency from the dropdown list on the top left of home page")
    public void userCanSelectEuroCurrencyFromTheDropdownListOnTheTopLeftOfHomePage() {
        currency.selectCurrency();
    }

    @Then("Make sure that the four products in the home page has been changed from US to Euro")
    public void makeSureThatTheFourProductsInTheHomePageHasBeenChangedFromUSToEuro() {
        List<WebElement> products = currency.getDisplayedProducts();

        for (int i = 0; i < currency.getDisplayedProducts().size(); i++) {
            String productText = currency.getDisplayedProducts().get(i).getText();
            Assert.assertTrue(productText.contains("€"));
            System.out.println("All product have the same symbol of Euro");
        }
    }
}
