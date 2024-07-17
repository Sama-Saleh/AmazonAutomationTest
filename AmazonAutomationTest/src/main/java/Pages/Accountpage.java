package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Accountpage extends PageBase {
    public Accountpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nav-hamburger-menu") public WebElement youraccount;
    @FindBy(id = "hmenu-customer-profile-left") public WebElement hello;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div/div[2]/div[1]/a") public WebElement yourorder;
    @FindBy(xpath = "//*[@id=\"a-autoid-1-announce\"]/span") public WebElement dropdown;
    @FindBy(id="time-filter") public WebElement choosedate;
    @FindBy(xpath = "//*[@id=\"a-page\"]/section/div/div[9]/div")
    public WebElement successMessage;




    public void YourAccount() {youraccount.click();}
    public void Hello() {hello.click();}
    public void YourOrder() {yourorder.click();}
    public void DropDown() {dropdown.click();}
    public void ChooseTime(){
        select=new Select(choosedate);
        select.selectByIndex(2);
    }
    public boolean SuccessMessageDisplayed() {
        try {
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}






