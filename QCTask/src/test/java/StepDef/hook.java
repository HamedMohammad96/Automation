package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hook {

    public static WebDriver driver = null;

    @Before
    public void openBrowser() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");

    }

    @After
    public void quitBrowser(){
        driver.quit();
    }
}
