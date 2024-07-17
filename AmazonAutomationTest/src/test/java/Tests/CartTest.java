package Tests;

import Pages.*;
import Pages.HomePage;
import Pages.SignIn;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CartTest extends TestBase {
    @Test(priority = 1)
            public void cartTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();

        SignIn signIn = new SignIn(driver);
        signIn.Login("1023716500", "123456789");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));
        CartPage carttest = new CartPage(driver);
        carttest.searchForProduct("headphones");
        carttest.FulFilledbyAmazon();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        carttest.GetByTommorow();

    }
        @Test(priority = 2)
    public void Addcart()
        {
            CartPage carttest = new CartPage(driver);

            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
            executor = (JavascriptExecutor) driver;
            executor.executeScript("scrollBy(0,300)");
            carttest.CHOOSEfirstitem();
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            executor = (JavascriptExecutor) driver;
            executor.executeScript("scrollBy(0,300)");
            carttest.AddCart();
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            carttest.NoThanks();
            Assert.assertTrue(carttest.SuccessMessageDisplayed(), "'Added to Cart'.");
            System.out.println(carttest.SuccessMessageDisplayed());
            carttest.OpenCart();
        }}






