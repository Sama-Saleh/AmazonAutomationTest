package Tests;

import Pages.HomePage;
import Pages.SignIn;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class SignInTest extends TestBase {
    @Test
    public void signInTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();

        SignIn signIn = new SignIn(driver);
        signIn.Login("1023716500", "123456789");
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : amazon"));

        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Amazon.eg : amazon"), "Title should indicate successful login");

    }

    }
