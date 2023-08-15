package Pages;
import StepDef.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class P01_RegisterPage {

    public void ClickRegisterLink() {
     hook.driver.findElement(By.className("ico-register")).click();
    }

    public void EnterGender(){

        hook.driver.findElement(By.id("gender-male")).click();
    }
    public void EnterFirstName(String firstname){
        hook.driver.findElement(By.id("FirstName")).sendKeys(firstname);
    }
    public void EnterLastName(String lastname){
        hook.driver.findElement(By.id("LastName")).sendKeys(lastname);
    }
    public void SelectDay(String Day , String Month , String Year){
        Select seD = new Select(hook.driver.findElement(By.name("DateOfBirthDay")));
        seD.selectByValue(Day);
        Select seM = new Select(hook.driver.findElement(By.name("DateOfBirthMonth")));
        seM.selectByValue(Month);
        Select seY = new Select(hook.driver.findElement(By.name("DateOfBirthYear")));
        seY.selectByValue(Year);
    }
    public void EnterEmail(String mail){
        hook.driver.findElement(By.id("Email")).sendKeys(mail);
    }
    public void EnterPassword(String pass){
        hook.driver.findElement(By.id("Password")).sendKeys(pass);
    }
    public void EnterConfirmationPassword(String CPass){
        hook.driver.findElement(By.id("ConfirmPassword")).sendKeys(CPass);
    }
    public void ClickRegisterButton(){
        hook.driver.findElement(By.id("register-button")).click();
    }
    public void AddedSuccessfully(){
        String confirmation = hook.driver.findElement(By.className("result")).getText();
        Assert.assertEquals("Your registration completed","Your registration completed");
        System.out.println("The user have been add his account successfully");
        String actualColor = hook.driver.findElement(By.className("result")).getCssValue("color");
        String expectedColor = "rgba(76, 177, 124, 1)";
        SoftAssert S = new SoftAssert();
        S.assertEquals(actualColor , expectedColor);
        System.out.println("The color of this message is green");
    }
}


