package Pages;

import StepDef.hook;
import org.openqa.selenium.By;

public class P03_CheckoutPage {

    public void clickOnMyCart(){
        hook.driver.findElement(By.className("shopping_cart_link")).click();
    }

    public void ClickOnCheckOutButton(){
        hook.driver.findElement(By.id("checkout")).click();
    }

    public void EnterMoreInfo(){
        hook.driver.findElement(By.id("first-name")).sendKeys("Hamed");
        hook.driver.findElement(By.id("last-name")).sendKeys("Mohammad");
        hook.driver.findElement(By.id("postal-code")).sendKeys("3515313");
    }

    public void ClickContinueButton(){
        hook.driver.findElement(By.id("continue")).click();
    }

    public void ClickFinishButton(){
        hook.driver.findElement(By.id("finish")).click();
    }

    public void ClickLogoutButton(){
        hook.driver.findElement(By.id("react-burger-menu-btn")).click();
        hook.driver.findElement(By.id("logout_sidebar_link")).click();
    }

}
