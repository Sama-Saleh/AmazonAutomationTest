package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class YourAddress extends PageBase {
    public YourAddress(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "nav-hamburger-menu")
    public WebElement youraccount;

    @FindBy(id = "hmenu-customer-profile-left")
    public WebElement hello;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div/div[4]/div[2]/a")
    public WebElement youraddress;
    @FindBy(xpath = "//*[@id=\"ya-myab-address-add-link\"]/div")
    public WebElement addadress;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFullName\"]")
    public WebElement fullname;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")
    public WebElement mobmnum;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressLine1\"]")
    public WebElement addresstitle;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enter-building-name-or-number\"]")
    public WebElement buildingname;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressCity\"]")
    public WebElement cityarea;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressDistrictOrCounty\"]")
    public WebElement district;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[1]/div/div[14]/ul")
    public WebElement autodistrict;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-landmark\"]")
    public WebElement landmark;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-addr-details-res-radio-input\"]")
    public WebElement addrtype;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")
    public WebElement addaddress;
    @FindBy(xpath = "//*[@id=\"yaab-alert-box\"]/div/h4")
    public WebElement successMessage;



    public void YourAccount() {
        youraccount.click();
    }

    public void Hello() {
        hello.click();
    }
    public void YourAddress(){youraddress.click();}
    public void Address(){addadress.click();}
    public void FullName(String name) {
        fullname.sendKeys(name);

    }

    public void MobNum(String num) {
        mobmnum.sendKeys(num);
    }

    public void AddAddress(String add) {
        addresstitle.sendKeys(add);
    }

    public void BuildingName(String build) {
        buildingname.sendKeys(build);
    }

    public void CityArea(String cityname) {
        cityarea.sendKeys(cityname);
    }
    public void District(String disinfo) {
        district.sendKeys(disinfo);
        district.click();
    }
    public void AutoDistrict()
    {
        autodistrict.click();

        }


    public void LandMark(String land)
    {landmark.sendKeys(land);}
    public void AddressType()
    {addrtype.click();}
    public void AddAdrBtn()
    {addaddress.click();}
    public boolean SuccessMessageDisplayed() {
        try {
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}