package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginHRM
{
    public WebDriver Idriver;

    public loginHRM(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "txtUsername")
    @CacheLookup
    WebElement usrname;

    @FindBy(id = "txtPassword")
    @CacheLookup
    WebElement passwrd;

    @FindBy(id = "btnLogin")
    @CacheLookup
    WebElement loginButton;

    @FindBy(xpath = "//h1[text()='Dashboard']")
    WebElement Dashboard;

    public void logincrt(String Username, String Password) throws InterruptedException {
        usrname.sendKeys(Username);
        passwrd.sendKeys(Password);
        Thread.sleep(8000);
    }

    public void clickOnLogin() throws InterruptedException {
        Thread.sleep(8000);
        loginButton.click();
    }

    public Boolean DashBoards() {
        Boolean result = Dashboard.isDisplayed();
        return result;
    }


}
