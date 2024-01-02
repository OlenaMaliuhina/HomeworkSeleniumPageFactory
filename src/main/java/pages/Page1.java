package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
    @FindBy(xpath ="//label[text()='Milka']")
    private WebElement checkBox1;
    @FindBy(xpath ="//label[text()='Конфеты']")
    private WebElement checkBox2;
    @FindBy(xpath ="//*[@class='button region-tag js-region js-region-title']")
    private WebElement dropdown;
    @FindBy(id ="js_set_gdpr_cookie")
    protected WebElement acceptCookieButton;
    @FindBy(xpath ="//*[@class='fc-button-label']")
    private WebElement acceptConsentButton;

    @FindBy(xpath ="//*[contains(text(),'Харьковская область')]")
    private WebElement dropdownItem;
    private WebDriver driver;
    public Page1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickCheckBox1(){
        checkBox1.click();
    }
    public void clickCheckBox2(){
        checkBox2.click();
    }
    public void clickDropdown(){
        dropdown.click();
    }
    public void clickDropdownItem(){
        dropdownItem.click();
    }
    public void testAcceptCookiesButton(){
        acceptCookieButton.click();
    }
    public void testAcceptConsentButton(){
        acceptConsentButton.click();
    }
}
