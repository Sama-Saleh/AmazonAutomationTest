package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Payment  extends PageBase {
    public Payment(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
    public WebElement youraccount;

    @FindBy(id = "hmenu-customer-profile-left")
    public WebElement hello;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div/div[3]/div[2]/a/div/div/div/div[1]")
    public WebElement yourpayment;

    @FindBy(xpath = "//*[@id=\"cpefront-mpo-widget\"]/div/div[2]/div[3]/div/div[2]/div/div/div[2]")
    public  WebElement addmethod;

    @FindBy(id="apx-add-credit-card-action-test-id")
    public WebElement addcredit;




    public void YourAccount() {youraccount.click();}
    public void Hello() {hello.click();}
    public void YourPayment(){yourpayment.click();}
    public void AddMethod(){addmethod.click();}
    public void AddCredit(){addcredit.click();}



}