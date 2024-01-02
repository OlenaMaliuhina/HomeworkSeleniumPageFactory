package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id ="js_set_gdpr_cookie")
    protected WebElement acceptCookieButton;

    @FindBy(xpath ="//*[@class='fc-button-label']")
    private WebElement acceptConsentButton;

    @FindBy(xpath ="/html/body/div[1]/header/section/div/div/ul/li[1]/a")
    private WebElement menuItem;

    @FindBy(xpath ="//*[@class='navbar-main-item-logo pb-1']")
    private WebElement headerLogo;
    @FindBy(id ="item-1")
    private WebElement checkBox;


     private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
         }

    public HomePage() {

    }

    public String getText(){
        return checkBox.getText();
    }
   //public void clickCheckBox(){
      //  checkBox.click();
   // }
    public void clickMenuItem(){
        menuItem.click();
    }

    public void testAcceptCookiesButton(){
        acceptCookieButton.click();
    }
    public void headerLogo(){
         headerLogo.isDisplayed();
    }
    public void testAcceptConsentButton(){
        acceptConsentButton.click();
    }
}
