package StepDef;

import Pages.P01_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_LoginDef {
    P01_LoginPage login = new P01_LoginPage();

    @Given("Enter User Name {string}")
    public void EnterUserName(String UserName){
        login.EnterUsername(UserName);
    }

    @And("Enter Password {string}")
    public void enterPassword(String Password) {
        login.EnterPassword(Password);
    }


    @When("Click on Login Button")
    public void clickOnLoginButton() {
        login.ClickLoginButton();
    }


    @Then("User logged in successfully")
    public void userLoggedInSuccessfully() {
        login.LoggedInSuccessfully();
    }
}
