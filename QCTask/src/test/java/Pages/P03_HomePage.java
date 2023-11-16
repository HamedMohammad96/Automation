package Pages;

import StepDef.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class P03_HomePage {
    Actions actions = new Actions(hook.driver);
    //Hover feature
    public void HoverONSupermarket(){
        WebElement Category = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/a[1]"));
        actions.moveToElement(Category).perform();
    }

    public void ClickOnBakery(){
        hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/a[7]")).click();
    }

    public void NavigateCorrectly(){
        String Title = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/header/div[1]/h1")).getText();
        Assert.assertEquals(Title,"Bakery");
        System.out.println("Navigate Correctly");
    }


    // Add Two Items to Cart

    public void AddItem1ToCart(){
        WebElement Item = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[1]/a"));
        actions.moveToElement(Item).perform();
        hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[1]/footer/form/button")).click();
    }
    public void AddItem2ToCart(){
        WebElement Item2 = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[2]/a"));
        actions.moveToElement(Item2).perform();
        hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[2]/footer/form/button")).click();
    }
    public void ClickOnCartButton(){
        hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/a")).click();
        String Cart = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/header/h2")).getText();
        Assert.assertTrue(Cart.contains("2"));
        System.out.println("There are two of items");
    }

    public void Calculation(){
        WebElement Price1 = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/article[1]/a/div[3]/div[1]"));
        String price1 = Price1.getText();
        WebElement Price2 = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/article[2]/a/div[3]/div[1]"));
        String price2 = Price2.getText();
        String Subtotal = hook.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div/div[2]/div/article/div[1]/p[2]")).getText();
        int subtotal = Integer.parseInt(price1) + Integer.parseInt(price2);
        Assert.assertEquals("subtotal" , Subtotal);
    }
}
