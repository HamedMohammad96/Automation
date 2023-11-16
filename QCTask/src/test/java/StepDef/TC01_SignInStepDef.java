package StepDef;

import Pages.P01_SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_SignInStepDef {
    P01_SignInPage p01SignInPage = new P01_SignInPage();

    @Given("User click on Account button")
    public void UserClickOnAccountButton(){
        p01SignInPage.ClickOnAccountButton();
    }

    @And("User Click on Sign In Button")
    public void userClickOnSignInButton(){
        p01SignInPage.ClickOnSignInButton();
    }


    @And("User fills email {string}")
    public void userFillsEmail(String Mail){
        p01SignInPage.fillMailField(Mail);
    }


    @And("User click on continue button")
    public void userClickOnContinueButton() {
        p01SignInPage.ClickOnContinueButton();
    }

    @And("User fills password {string}")
    public void userFillsPassword(String Pass) {
        p01SignInPage.FillPassword(Pass);
    }

    @And("User fills confirmation password {string}")
    public void userFillsConfirmationPassword(String ConPass) {
        p01SignInPage.FillConfirmationPassword(ConPass);
    }

    @And("User click on another continue button")
    public void userClickOnOntherContinueButton() {
        p01SignInPage.ClickOnContinue1Button();
    }

    @And("User fills First Name {string}")
    public void userFillsFirstName(String FN) {
        p01SignInPage.FillFirstName(FN);
    }

    @And("User fills Last Name {string}")
    public void userFillsLastName(String LN) {
        p01SignInPage.FillLastName(LN);
    }

    @And("User fill Phone Number {string}")
    public void userFillPhoneNumber(String PN) {
        p01SignInPage.FillPhoneNumber(PN);
    }

    @And("User click on the continue button")
    public void userClickOnTheContinueButton() {
        p01SignInPage.ClickOnContinue2Button();
    }

    @And("User Choose Gender {string}")
    public void userChooseGender(String Gender) {
        p01SignInPage.ChooseGender(Gender);
    }

    @And("User Choose date of birth")
    public void userChooseDateOfBirth() {
        p01SignInPage.ChooseDateOfBirth();
    }

    @When("User click on check box of terms")
    public void userClickOnCheckBoxOfTerms() {
        p01SignInPage.CheckTerms();
    }

    @Then("User Click the last continue button")
    public void userClickTheLastContinueButton() {
        p01SignInPage.ClickOnContinue3Button();
    }
}
