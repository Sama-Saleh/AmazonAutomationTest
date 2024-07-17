package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {super(driver);}
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")
    WebElement accountList;




    public void openAccountList() {accountList.click();}





}
