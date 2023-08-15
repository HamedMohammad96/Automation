package StepDef;

import Pages.P02_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC02_LoginDef {
    P02_LoginPage p02LoginPage = new P02_LoginPage();

    @Given("user Click on Login button from home page")
        public void login(){
        p02LoginPage.clickLoginLink();
    }

    @And("user Enter valid email {string}")
    public void userEnterValidEmail(String mail) {
        p02LoginPage.EnterValidMail(mail);
    }

    @And("user Enter valid Password {string}")
    public void userEnterValidPassword(String pass) {
        p02LoginPage.EnterValidPassword(pass);
    }

    @When("user click on Login Button")
    public void userClickOnLoginButton() {
        p02LoginPage.ClickLoginButton();
    }

    @Then("User login into the system successfully")
    public void userLoginIntoTheSystemSuccessfully() {
        p02LoginPage.LoggedInSuccessfully();
    }

    @And("user Enter invalid email {string}")
    public void userEnterInvalidEmail(String invalidMail) {
        p02LoginPage.EnterInvalidMail(invalidMail);
    }

    @And("user Enter invalid Password {string}")
    public void userEnterInvalidPassword(String invalidPass) {
        p02LoginPage.EnterInvalidPassword(invalidPass);
    }

    @Then("User could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        p02LoginPage.unsuccessfulLogin();
    }
}
