package Pages;

import StepDef.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_SignInPage {
    public void ClickOnAccountButton(){
        hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]")).click();
    }
    public void ClickOnSignInButton(){
        hook.driver.findElement(By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a")).click();
    }

    public void fillMailField(String Mail){
        hook.driver.findElement(By.id("input_identifierValue")).sendKeys(Mail);
    }

    public void ClickOnContinueButton(){
        hook.driver.findElement(By.xpath("//*[@id=\"identification-form\"]/div[1]/div[3]/div[2]/button")).click();
    }

    public void FillPassword(String Pass){
        hook.driver.findElement(By.xpath("//*[@id=\"card_password\"]/div[3]/label/input")).sendKeys(Pass);
    }

    public void FillConfirmationPassword(String ConPass){
        hook.driver.findElement(By.xpath("//*[@id=\"card_password\"]/div[4]/label/input")).sendKeys(ConPass);
    }

    public void ClickOnContinue1Button(){
        hook.driver.findElement(By.xpath("//*[@id=\"card_password\"]/div[5]/div/button")).click();
    }

    public void FillFirstName(String FN){
        hook.driver.findElement(By.id("input_first_name")).sendKeys(FN);
    }

    public void FillLastName(String LN){
        hook.driver.findElement(By.id("input_last_name")).sendKeys(LN);
    }

    public void FillPhoneNumber(String PN){
        hook.driver.findElement(By.xpath("//*[@id=\"card_profile_details\"]/div[4]/div[2]/label/input")).sendKeys(PN);
    }

    public void ClickOnContinue2Button(){
        hook.driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();
    }

    public void ChooseGender(String Gender){
        WebElement dropdownElement = hook.driver.findElement(By.xpath("//*[@id=\"gender\"]/div[1]"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(Gender);
    }

    public void ChooseDateOfBirth(){
        hook.driver.findElement(By.xpath("//*[@id=\"card_profile_gender\"]/div/div[2]/label")).sendKeys("04151996");
    }

    public void CheckTerms(){
        hook.driver.findElement(By.id("acceptTC")).click();
    }

    public void ClickOnContinue3Button(){
        hook.driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
    }

}
