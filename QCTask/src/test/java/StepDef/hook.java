
package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hook {
    public static WebDriver driver = null;

    public hook() {
    }

    @Before
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.jumia.com.eg/");
        hook.driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section/button")).click();
    }

//    @After
//    public void quitBrowser() {
//        driver.quit();
//    }
}
