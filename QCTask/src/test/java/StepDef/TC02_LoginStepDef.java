package StepDef;

import Pages.P02_LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC02_LoginStepDef {
    P02_LoginPage p02LoginPage = new P02_LoginPage();

    @Given("User Enter Valid Password {string}")
    public void UserEnterValidPassword(String Pass){
        p02LoginPage.EnterValidPassword(Pass);
    }

    @Then("User Click On Login Button")
    public void userClickOnLoginButton() {
        p02LoginPage.Login();
    }
}
