package Tests;
import Pages.Accountpage;
import Pages.HomePage;
import Pages.SignIn;
import Pages.YourAddress;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class YourAddressTest extends TestBase {

    @Test(priority = 1)
    public void testYouracc() {

        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();
        SignIn signIn = new SignIn(driver);
        signIn.Login("1023716500", "123456789");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));
        YourAddress addtest = new YourAddress(driver);
        addtest.YourAccount();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.Hello();

    }
    @Test(priority = 2)
    public void Testyouraddress() {
        YourAddress addtest = new YourAddress(driver);
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy(0,200)");
        addtest.YourAddress();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy(0,100)");
        addtest.Address();

    }
    @Test(priority = 3)
    public void AddYourAddress(){
        YourAddress addtest = new YourAddress(driver);
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.FullName("Sama Saleh");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.MobNum("1024430070");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.AddAddress("Gamal abdelnasser Street");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.BuildingName("ELMassa Tower ");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.CityArea("Al Faiyum City");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.District("Al Faiyum City");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.AutoDistrict();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.LandMark("Bank Misr");
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.AddressType();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        addtest.AddAdrBtn();
        Assert.assertTrue(addtest.SuccessMessageDisplayed(), "'Looks like you didn't place an order in 2024.'");
        System.out.println(addtest.SuccessMessageDisplayed());


    }
}