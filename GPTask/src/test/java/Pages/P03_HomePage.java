package Pages;

import StepDef.hook;
import com.beust.jcommander.converters.IntegerConverter;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P03_HomePage {
    SoftAssert S = new SoftAssert();
    Random random = new Random();
    Actions actions = new Actions(hook.driver);
    public String p ;
    WebElement Su;
    String subCat;
    int mainCat;
    // Start of Currency Feature
    public void selectCurrency() {
        Select SC = new Select(hook.driver.findElement(By.id("customerCurrency")));
        SC.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    public List<WebElement> getDisplayedProducts() {
        return hook.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div/div/div[2]/div[3]/div[1]/span"));
    }



    public void SearchForByName(String productName){
        p= productName ;
        hook.driver.findElement(By.id("small-searchterms")).sendKeys(productName);
    }
    // End of Currency Feature

    // Start of Search Feature
    public void ClickSearchIcon(){
        hook.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
    }

    public void assureURLTrue(){
        String URL = hook.driver.getCurrentUrl();
        S.assertTrue(URL.contains("https://demo.nopcommerce.com/search?q=" + p));
        System.out.println("The URL matched");
    }

    public List<WebElement> countNumberOfSearch(){
        int count = hook.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")).size();
        System.out.println("the number of count : " + count);
        List<WebElement> items = hook.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a"));
        return items;
    }

    public void SearchForBySKU(String productSKU){
        p= productSKU ;
        hook.driver.findElement(By.id("small-searchterms")).sendKeys(p);
    }

    public void ClickSearch(){
        hook.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
    }

    public void clickOnProduct(){
        hook.driver.findElement(By.className("product-item")).click();
    }

    public String getProductSKU(){
        String SKU = hook.driver.findElement(By.className("sku")).getText();
        return SKU;
    }
    // End of Search Feature

    // Start of Hover Feature
    public void hoverMainCategory(){
        List<WebElement> l = hook.driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));
        int mainCatRandomIndex = random.nextInt(2);
        mainCat = mainCatRandomIndex;
        WebElement randomMainCategory = l.get(mainCatRandomIndex);
        actions.moveToElement(randomMainCategory).perform();
    }

    public void selectSubCategory(){
        int subCatRandomIndex = random.nextInt(2);
        List<WebElement> subCategories = hook.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[" + (mainCat + 1) + "]/ul/li"));
        WebElement randomSubCategory = subCategories.get(subCatRandomIndex);
        subCat = randomSubCategory.getText();
        System.out.println(subCatRandomIndex + " " + subCat);
        randomSubCategory.click();
    }

    public void getTitle(){
        String Title = hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")).getText();
        System.out.println(Title);
        Assert.assertEquals(Title,subCat);
        System.out.println("Done with sub category");
    }
    // End of Hover Feature

    // Start of HomeSlider Feature
    public void clickFirstSlider() throws InterruptedException {
        hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();

        Thread.sleep(1000);

        hook.driver.findElement(By.id("nivo-slider")).click();
    }

    public void makeSureOfURL(){
        String URL = hook.driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/nokia-lumia-1020");
        System.out.println("The URL NotMatched");
    }

    public void clickSecondSlider() throws InterruptedException {
        hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();

        Thread.sleep(1000);

        hook.driver.findElement(By.id("nivo-slider")).click();
    }

    public void MatchedURL(){
        String URL = hook.driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/iphone-6");
        System.out.println("The URL NotMatched");
    }
    // End of HomeSlider Feature

    // Start of FollowUs Feature

    public void ClickOnFaceBookLink() throws InterruptedException{    // FaceBook Scenario
        hook.driver.findElement(By.className("facebook")).click();

        WebDriverWait wait = new WebDriverWait(hook.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(hook.driver.getWindowHandles());
        hook.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

    }

    public void matchURL(String link){
        String URL = hook.driver.getCurrentUrl();
        Assert.assertEquals(URL,link);
        System.out.println("The FaceBook URL matched");

        hook.driver.close();
    }

    public void ClickOnTwitterLink() throws InterruptedException{    // Twitter Scenario
        hook.driver.findElement(By.className("twitter")).click();

        WebDriverWait wait = new WebDriverWait(hook.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(hook.driver.getWindowHandles());
        hook.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

    }

    public void matchesURL(String link){
        String URL = hook.driver.getCurrentUrl();
        Assert.assertEquals(URL,link);
        System.out.println("The Twitter URL matched");

        hook.driver.close();
    }



    public void ClickOnRssLink() throws InterruptedException{    // rss Scenario
        hook.driver.findElement(By.className("rss")).click();

        WebDriverWait wait = new WebDriverWait(hook.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(hook.driver.getWindowHandles());
        hook.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

    }

    public void matchdURL(String link){
        String URL = hook.driver.getCurrentUrl();
        Assert.assertEquals(URL,link);
        System.out.println("The rss URL not matched");

        hook.driver.close();
    }

    public void ClickOnYoutubeLink() throws InterruptedException{    // youtube Scenario
        hook.driver.findElement(By.className("youtube")).click();

        WebDriverWait wait = new WebDriverWait(hook.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(hook.driver.getWindowHandles());
        hook.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

    }

    public void RightURL(String link){
        String URL = hook.driver.getCurrentUrl();
        Assert.assertEquals(URL,link);
        System.out.println("The youtube URL matched");

        hook.driver.close();
    }
    // End of FollowUs Feature

    // Start of WishList Feature
    // first scenario
    public void clickOnWishButton(){
        hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();
    }

    public void flashMessage(){
       WebElement SuccessMessage =  hook.driver.findElement(By.id("bar-notification"));
       Su = SuccessMessage;
       WebElement SuccessMessageColor = hook.driver.findElement(By.id("bar-notification"));
       String BackgroundColor = SuccessMessageColor.getCssValue("background-color");
       String expectedColor = "rgba(75, 176, 122, 1)";
       S.assertTrue(SuccessMessage.isDisplayed());
       System.out.println("success message is displayed");
       S.assertEquals(BackgroundColor , expectedColor);
       System.out.println("the color is green");
    }

    // second scenario
    public void clickOnTabWishList() throws InterruptedException{
        Thread.sleep(7000);
        hook.driver.findElement(By.className("ico-wishlist")).click();
    }
    public void qntOfWishlist(){
      String Quantity = hook.driver.findElement(By.xpath("//td[@class='quantity']/input")).getAttribute("value");
      int quantityValue = Integer.parseInt(Quantity);
      Assert.assertTrue(quantityValue > 0);
      System.out.println("The quantity :" + quantityValue);
    }
    // End of WishList Feature

}
