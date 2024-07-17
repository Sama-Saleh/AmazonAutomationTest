package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {
    public CartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "twotabsearchtextbox")         public WebElement searchInput;
    @FindBy(id = "nav-search-submit-button")    public WebElement searchButton;
    @FindBy(id = "p_98/21909049031")            public WebElement  Fulfilledbyamazon;
    @FindBy(id = "p_90/21908975031")            public WebElement  Getbytommorow;
    @FindBy(xpath = "//span[@class='a-price-whole']")
    public WebElement  choosefirstitem;
    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    public WebElement addcart;
    @FindBy(xpath = "//*[@id=\"attachSiNoCoverage\"]")
    public WebElement nothanks;
    @FindBy(xpath = "//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")
    public WebElement successMessage;
    @FindBy(xpath = "//*[@id=\"sw-gtc\"]")
    public WebElement opencart;






    public void searchForProduct(String product) {
        searchInput.clear();
        searchInput.sendKeys(product);
        searchButton.click();
    }
    public void FulFilledbyAmazon()   {Fulfilledbyamazon.click();}
    public void GetByTommorow()       {Getbytommorow.click();}
    public void CHOOSEfirstitem(){choosefirstitem.click();}
    public void AddCart(){addcart.click();}
    public void NoThanks(){nothanks.click();}
    public boolean SuccessMessageDisplayed() {
        try {
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public void OpenCart(){opencart.click();}








}
