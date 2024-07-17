package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class Product_Search extends PageBase {
    public Product_Search(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;


    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[8]")
    private WebElement chooseitem;


    @FindBy(xpath = "//*[@id=\"add-to-wishlist-button\"]")
    private WebElement addlist;

    @FindBy(xpath = "//*[@id=\"atwl-dd-create-list\"]")
    private WebElement creatlist;

    @FindBy(xpath = "//*[@id=\"list-name\"]")
    private WebElement Addlist;

    @FindBy(xpath = "//*[@id=\"wl-redesigned-create-list\"]/span/span/input")
    private  WebElement clickcreatelist ;
    @FindBy(xpath = "//*[@id=\"wl-huc-post-create-msg\"]/span")
    public WebElement successMessage;

    @FindBy(xpath = "//*[@id=\"wl-huc-post-create-msg\"]/div[2]/span[1]/span/a")
    private  WebElement viewlist;







    public void searchForProduct(String product) {
        searchInput.clear();
        searchInput.sendKeys(product);
        searchButton.click();
    }
    public void chooseItem() {
        chooseitem.click();
    }


    public void addtolist(String name){
     Addlist.clear();
     Addlist.sendKeys(name);

    }
    public void AddList(){
        addlist.click();

    }
    public void Creatlist(){
        creatlist.click();
    }


    public void clickCreatlist(){
        clickcreatelist.click();
    }
    public boolean SuccessMessageDisplayed() {
        try {
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public void Viewlist(){
        viewlist.click();
    }






}


