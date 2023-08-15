package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TC04_SearchDef {
    P03_HomePage searchPage = new P03_HomePage();
    public String P;

    @When("user search for products by name {string}")
    public void userSearchForProductsByName(String productName) {
        P = productName;
        searchPage.SearchForByName(productName);
        searchPage.ClickSearchIcon();
    }

    @Then("user will found all products that searched for by name")
    public void userWillFoundAllProductsThatSearchedForByName() {
        searchPage.assureURLTrue();
        List<WebElement> l = searchPage.countNumberOfSearch();
        for (int i = 0; i < l.size(); i++) {
            String C = l.get(i).getText();
            Assert.assertTrue(C.toLowerCase().contains(P));
        }
    }

    @When("user search for products by SKU {string}")
    public void userSearchForProductsBySKU(String SKU) {
        P = SKU;
        searchPage.SearchForBySKU(P);
        searchPage.ClickSearch();
    }

    @Then("user will found all products that searched for by SKU")
    public void userWillFoundAllProductsThatSearchedForBySKU() {
        searchPage.clickOnProduct();
        String productSKU = searchPage.getProductSKU();
        Assert.assertTrue(productSKU.contains(P));
        }

}

