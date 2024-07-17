package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.security.cert.X509Certificate;

public class ChangeLanguage extends PageBase {
    public ChangeLanguage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]")
    public WebElement language;
    @FindBy(id = "nav-hamburger-menu")
    public WebElement youraccount;
    @FindBy(xpath = "//*[@id=\"icp-language-settings\"]/div[2]/div")
    public WebElement arabic;
    @FindBy(xpath = "//*[@id=\"icp-save-button\"]/span/input")
    public WebElement save;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span")
    public WebElement successMessage;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInput;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;


    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[8]")
    public WebElement chooseitem;


    @FindBy(xpath = "//*[@id=\"add-to-wishlist-button\"]")
    public WebElement addlist;

    @FindBy(xpath = "//*[@id=\"atwl-dd-create-list\"]")
    public WebElement creatlist;

    @FindBy(xpath = "//*[@id=\"list-name\"]")
    public WebElement Addlist;

    @FindBy(xpath = "//*[@id=\"wl-redesigned-create-list\"]/span/span/input")
    private  WebElement clickcreatelist ;

    @FindBy(xpath = "//*[@id=\"wl-huc-post-create-msg\"]/span")
    public WebElement successmsg;




    @FindBy(xpath = "//*[@id=\"wl-huc-post-create-msg\"]/div[2]/span[1]/span/a")
    public   WebElement viewlist;

    /*

     */

    @FindBy(id = "hmenu-customer-profile-left")
    public WebElement hello;


    public void ChgLanguage() {
        language.click();

    }
    public void ArabicLanguage(){
        arabic.click();
    }
    public void SaveChanges()
    {save.click();}

    public boolean SuccessMessageDisplayed() {
        try {
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
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
    public boolean MessageDisplayed() {
        try {
            return successmsg.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public void Viewlist(){
        viewlist.click();
    }
}
