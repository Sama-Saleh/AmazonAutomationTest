package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class FullBuying extends PageBase {
    public FullBuying(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInput;
    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;
    @FindBy(xpath = "//span[@class='a-price-whole']")
    public WebElement choosefirstitem;
    @FindBy(id="a-autoid-0-announce")
    public WebElement dropdown;
    @FindBy(xpath = "//*[@id=\"buy-now-button\"]")
    public WebElement buynow;
    @FindBy(xpath = "//*[@id=\"shipToThisAddressButton\"]/span/input")
    public WebElement useadd;



    public void searchForProduct(String product) {
        searchInput.clear();
        searchInput.sendKeys(product);
        searchButton.click();
    }

    public void chooseItem() {choosefirstitem.click();}
    public void DropDown() {
        dropdown.click();
        select=new Select(dropdown);
        select.selectByIndex(5);}

    public void BuyNow() {buynow.click();}
    public void UseThisAddress(){useadd.click();}
}