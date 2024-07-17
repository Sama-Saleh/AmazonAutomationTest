package Tests;

import Pages.FullBuying;
import Pages.HomePage;
import Pages.SignIn;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FullBuyingTest extends TestBase {

    @Test(priority = 1)
    public void testbuyproduct() {
        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();
        SignIn signIn = new SignIn(driver);
        signIn.Login("1023716500", "123456789");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));
        FullBuying buyproduct = new FullBuying(driver);
        buyproduct.searchForProduct("body splash");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy(0,200)");
        buyproduct.chooseItem();

        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy(0,200)");
        buyproduct.BuyNow();

    }
    @Test(priority = 2)
    public void WriteInfo(){
        FullBuying buyproduct = new FullBuying(driver);
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        buyproduct.UseThisAddress();
    }


}



