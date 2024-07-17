package Tests;

import Pages.HomePage;
import Pages.Product_Search;
import Pages.SignIn;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Product_Search_Test extends TestBase {

    @Test(priority = 1)
    public void testProductSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();

       SignIn signIn = new SignIn(driver);
       signIn.Login("1023716500", "123456789");
       wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));

        Product_Search productSearch = new Product_Search(driver);
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.searchForProduct(" Iphone 14");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.chooseItem();

    }
    @Test(priority =2 )
    public void createlist()
    {
        Product_Search productSearch = new Product_Search(driver);
        executor = (JavascriptExecutor) driver;
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        executor.executeScript("scrollBy(0,300)");
        productSearch.AddList();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.Creatlist();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.addtolist("my list");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.clickCreatlist();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        Assert.assertTrue(productSearch.SuccessMessageDisplayed(), "'1 item added to my list'.");
        System.out.println(productSearch.SuccessMessageDisplayed());
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        productSearch.Viewlist();

    }
}
//

