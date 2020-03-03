package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);//create connection btwn this class and WebDriver Selenium
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement buttonLogIn;



    public static void getToPOSModule() {
        LoginPage lg = new LoginPage();
        Driver.getDriver().get(Config.getProperty("url"));
        lg.userNameInput.sendKeys(Config.getProperty("userNameInput"));
        lg.passwordInput.sendKeys(Config.getProperty("passwordInput"));
        SeleniumUtils.highLighterMethod(Driver.getDriver(), lg.buttonLogIn);

        lg.buttonLogIn.click();

        if (Config.getProperty("browser").equals("safari")) { // for case if you run in Safari, simple .click doesn't work, need to use JS.
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", lg.buttonLogIn);
        }

        String posModule = "//span[contains(text(), 'Point of Sale')][1]";
        WebElement pos = Driver.getDriver().findElement(By.xpath(posModule));
        WebDriverWait wait = new WebDriverWait (Driver.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(pos));
        pos.click();
    }


}
