package Pages;

import StepDef.hook;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class P02_LoginPage {

    SoftAssert S = new SoftAssert();

    public void clickLoginLink(){
        hook.driver.findElement(By.className("ico-login")).click();
    }

    public void EnterValidMail(String mail){
        hook.driver.findElement(By.id("Email")).sendKeys(mail);
    }

    public void EnterValidPassword(String pass){
        hook.driver.findElement(By.id("Password")).sendKeys(pass);
    }

    public void ClickLoginButton(){
        hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }

    public void LoggedInSuccessfully(){
        String Success = hook.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/";
        S.assertEquals(Success,expectedURL);
        System.out.println("The same URL");
        S.assertTrue(hook.driver.findElement(By.className("ico-account")).isDisplayed());
        System.out.println("My Account is Displayed");
    }


    public void EnterInvalidMail(String invalidMail){
        hook.driver.findElement(By.id("Email")).sendKeys(invalidMail);
    }

    public void EnterInvalidPassword(String invalidPass){
        hook.driver.findElement(By.id("Password")).sendKeys(invalidPass);
    }

    public void unsuccessfulLogin(){
        String getMessage = hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
        S.assertTrue(getMessage.contains("Login was unsuccessful."));
        System.out.println("The message is correct");
        String actualColor = hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getCssValue("color");
        String expectedColor = "rgba(228, 67, 75, 1)";
        S.assertEquals(actualColor , expectedColor);
        System.out.println("The color of this message is Red");
        S.assertAll();
    }


}
