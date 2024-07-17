package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageBase {
    public static WebDriver driver;
    public Select select;
    public Actions actions;
    public Assert Assert;
    public WebDriverWait wait;
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
