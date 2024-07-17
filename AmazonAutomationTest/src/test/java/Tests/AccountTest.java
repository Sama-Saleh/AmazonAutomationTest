package Tests;
import Pages.Accountpage;
import Pages.HomePage;
import Pages.SignIn;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccountTest extends TestBase{

    @Test(priority = 1)
    public void testYouracc() {

        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();
        SignIn signIn = new SignIn(driver);
        signIn.Login("1023716500", "123456789");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));
        Accountpage acctest = new Accountpage(driver);
        acctest.YourAccount();
        acctest.Hello();
    }
    @Test(priority = 2)
            public void Testyourorder() {
        Accountpage acctest = new Accountpage(driver);
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        acctest.YourOrder();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        acctest.DropDown();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        acctest.ChooseTime();
        Assert.assertTrue(acctest.SuccessMessageDisplayed(), "'Looks like you didn't place an order in 2024.'");
        System.out.println(acctest.SuccessMessageDisplayed());
    }
}

