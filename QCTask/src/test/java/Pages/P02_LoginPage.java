package Pages;

import StepDef.hook;
import org.openqa.selenium.By;

public class P02_LoginPage {
    public void EnterValidPassword(String Pass){
        hook.driver.findElement(By.xpath("//*[@id=\"passwordForm\"]/div/div[3]/label/input")).sendKeys(Pass);
    }

    public void Login(){
        hook.driver.findElement(By.id("loginButton")).click();
    }
}
