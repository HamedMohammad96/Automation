package Pages;

import StepDef.hook;
import org.openqa.selenium.By;
import org.testng.Assert;

public class P01_LoginPage {
    public void EnterUsername(String UserName){
        hook.driver.findElement(By.id("user-name")).sendKeys(UserName);
    }

    public void EnterPassword(String Password){
        hook.driver.findElement(By.id("password")).sendKeys(Password);
    }

    public void ClickLoginButton(){
        hook.driver.findElement(By.id("login-button")).click();
    }

    public void LoggedInSuccessfully(){
        String product = hook.driver.findElement(By.className("title")).getText();
        Assert.assertEquals(product,"Products");
    }
}
