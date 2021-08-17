package StepDef;

import POM.loginHRM;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewLogin
{
    public WebDriver driver;
    public loginHRM logintest;

    @Given("I Lunch chrome browsers")
    public void i_lunch_chrome_browsers() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logintest = new loginHRM(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user Opens the Test URL {string}")
    public void user_opens_the_test_url(String url) {
        driver.get(url);
    }

    @When("User Enters the Login Username as {string} and Login Password as {string}")
    public void user_enters_the_login_username_as_and_login_password_as(String Uname, String Pname) throws InterruptedException {
        logintest.logincrt(Uname,Pname);
    }

    @When("Click on Login button")
    public void click_on_login_button() throws InterruptedException {
        logintest.clickOnLogin();
    }

    @Then("I Verify the Homepage is Displyed or Not")
    public void i_verify_the_homepage_is_displyed_or_not() {
        System.out.println("New");
    }

    @Then("Close The Browser")
    public void close_the_browser() {
        driver.close();
    }
}
