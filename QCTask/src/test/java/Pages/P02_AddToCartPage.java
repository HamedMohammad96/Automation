package Pages;

import StepDef.hook;
import org.openqa.selenium.By;

public class P02_AddToCartPage {

    public void addToCart(){
        hook.driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

}
