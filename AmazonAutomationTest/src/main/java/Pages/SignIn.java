package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends PageBase {
    public SignIn(WebDriver driver) {super(driver);}
    @FindBy(id = "ap_email")
    public WebElement email;
    @FindBy(id="continue")
    public WebElement continueButton;
    @FindBy(id="ap_password")
    public WebElement password;
    @FindBy(id="auth-fpp-link-bottom")
    public WebElement ForgotPassLink;
    @FindBy(id="signInSubmit")
    public WebElement signInButton;
    @FindBy(id="ap_change_login_claim")
    public WebElement changeLoginEmail;
    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]/div/form/div/div[2]/div/div/label/div/label/input")
    public WebElement rememberMeButton;
    @FindBy(id="createAccountSubmit")
    public WebElement createAccountButton;
    @FindBy(xpath = "//*[@id=\"nav-your-amazon-text\"]")
    public WebElement MyAmazonText;

    public void Login(String user, String pass) {
        email.sendKeys(user);
        continueButton.click();
        password.sendKeys(pass);
        rememberMeButton.click();
        signInButton.click();

    }
    public void clickForgotPasswordLink() {
        ForgotPassLink.click();
    }

    public void clickChangeEmailClaim() {
        changeLoginEmail.click();
    }

    public boolean isProfileIconDisplayed() {
        return MyAmazonText.isDisplayed();
    }
    public void clickCreateAccountButton() {
        createAccountButton.click();
    }
    }


