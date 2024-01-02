
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageTest {
    private HomePage homePage;
    private WebDriver driver;

     @BeforeMethod
    public void init(){
        System.setProperty("webdriver.chrome.driver","/Users/omali/IdeaProjects/Homework13/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.kidstaff.com.ua/");
        homePage = new HomePage(driver);
    }

    @Test
    public void firstPageObjectTest(){
        //homePage.testAcceptConsentButton();
        homePage.testAcceptCookiesButton();
        homePage.clickMenuItem();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException intEx) {
            throw new RuntimeException();
        }
    }

    @Test
    public void acceptCookieTest(){
        //homePage.testAcceptConsentButton();
        homePage.testAcceptCookiesButton();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException intEx) {
            throw new RuntimeException();
        }
    }

   /* @Test
    public void acceptConsentTest(){
        homePage.testAcceptConsentButton();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException intEx) {
            throw new RuntimeException();
        }
    }*/

    @Test
    public void checkHeaderLogo(){
         homePage.headerLogo();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException intEx) {
            throw new RuntimeException();
        }
    }

    @AfterMethod
    public void afterHook (){
        driver.quit();
    }

}