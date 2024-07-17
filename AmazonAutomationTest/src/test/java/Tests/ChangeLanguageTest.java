package Tests;

import Pages.ChangeLanguage;
import Pages.HomePage;
import Pages.Product_Search;
import Pages.SignIn;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChangeLanguageTest extends TestBase {

    @Test(priority = 1)
    public void testYour() {

        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();
        SignIn signIn = new SignIn(driver);
        signIn.Login("1023716500", "123456789");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));
        ChangeLanguage change = new ChangeLanguage(driver);
        change.ChgLanguage();
        change.ArabicLanguage();
        change.SaveChanges();
        Assert.assertTrue(change.SuccessMessageDisplayed(), "'النتائج'");
    }
    @Test(priority = 2)
    public void Arabsearch(){
        ChangeLanguage  productSearch = new ChangeLanguage(driver);

        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.searchForProduct(" كتب ");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.chooseItem();
        executor = (JavascriptExecutor) driver;
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        executor.executeScript("scrollBy(0,300)");
        productSearch.AddList();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.Creatlist();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.addtolist("المفضلة");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.clickCreatlist();
        Assert.assertTrue(productSearch.MessageDisplayed(), "'تم إضافة 1 سلعة إلى المفضلة'");
        System.out.println(productSearch.MessageDisplayed());
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.Viewlist();

    }

}
