package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends PageBase{
    public SignUp(WebDriver driver) {super(driver);}
    @FindBy(name="customerName")
    public WebElement customerName;
    @FindBy(name="email")
    public WebElement mobilephone;
    @FindBy(name="password")
    public WebElement password;
    @FindBy(name = "passwordCheck")
    public WebElement passwordCheck;
    @FindBy(id="continue")
    public WebElement continueButton;

    public void fillSignUpForm(String user, String mobile,String pass, String confirmPass)
    {
        customerName.sendKeys(user);
        mobilephone.sendKeys(mobile);
        password.sendKeys(pass);
        passwordCheck.sendKeys(confirmPass);
    }
    public void clickContinue() {
        continueButton.click();
    }

}
