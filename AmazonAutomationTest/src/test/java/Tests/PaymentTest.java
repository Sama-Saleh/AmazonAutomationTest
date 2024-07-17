package Tests;

import Pages.HomePage;
import Pages.Payment;
import Pages.SignIn;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PaymentTest extends TestBase {

    @Test(priority = 1)
    public void testYourpay() {

        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();
        SignIn signIn = new SignIn(driver);
        signIn.Login("1023716500", "123456789");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));
        Payment paytest =new Payment(driver);
        paytest.YourAccount();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        paytest.Hello();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        paytest.YourPayment();
    }
    @Test(priority = 2)
    public void AddMethodTest(){
        Payment testmethod =new Payment(driver);
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        testmethod.AddMethod();
        try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
        testmethod.AddCredit();
        try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}

    }
}
//Amazon accepts all major credit and debit cards:
