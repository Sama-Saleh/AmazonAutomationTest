package Tests;

import Pages.HomePage;
import Pages.SignIn;
import Pages.SignUp;
import org.testng.annotations.Test;

public class SignupTest extends TestBase {
    @Test
    public void signupTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openAccountList();
        SignIn signIn = new SignIn(driver);
        signIn.clickCreateAccountButton();
        SignUp SignUp = new SignUp(driver);
        SignUp.fillSignUpForm("samasaleh","1149014664","123456","123456");
        SignUp.clickContinue();
        try {Thread.sleep(30000);} catch (InterruptedException e) {e.printStackTrace();}

    }


}
