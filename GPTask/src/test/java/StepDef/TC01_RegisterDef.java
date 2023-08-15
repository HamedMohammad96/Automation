package StepDef;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC01_RegisterDef {

    P01_RegisterPage p01RegisterPage = new P01_RegisterPage();

    @Given ("User click on Register button from the first page")

    public void register(){
        p01RegisterPage.ClickRegisterLink();
    }
    @And("User Choose Gender")
    public void chooseGender() {
        p01RegisterPage.EnterGender();
    }

    @And("user enter first name {string}")
    public void userEnterFirstName(String FirstName) {
        p01RegisterPage.EnterFirstName(FirstName);
    }

    @And("User Enter his Last Name {string}")
    public void userEnterHisLastName(String LastName) {
        p01RegisterPage.EnterLastName(LastName);
    }

    @And("user enter date of birth {string} {string} {string}")
    public void userEnterDateOfBirth(String Day , String Month , String Year) {
        p01RegisterPage.SelectDay(Day, Month, Year);
    }

    @And("user enter email {string}")
    public void userEnterEmailField(String mail) {
        p01RegisterPage.EnterEmail(mail);
    }

    @And("user fills Password fields {string}")
    public void userFillsPasswordFields(String pass) {
        p01RegisterPage.EnterPassword(pass);
    }

    @And("user fills confirmation Password fields {string}")
    public void userFillsConfirmationPasswordFields(String CPass) {
        p01RegisterPage.EnterConfirmationPassword(CPass);
    }

    @When("User Click the Register Button")
    public void userClickTheRegisterButton() {
        p01RegisterPage.ClickRegisterButton();
    }

    @Then("The user have been add his account successfully")
    public void theUserHaveBeenAddHisAccountSuccessfully() {
        p01RegisterPage.AddedSuccessfully();
    }
}



