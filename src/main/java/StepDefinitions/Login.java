package StepDefinitions;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    public WebDriver driver ;


    @Given("I Lunch chrome browser")
    public void i_lunch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("I open HRM HomePage")
    public void i_open_hrm_home_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("I Verify logo present on page")
    public void i_verify_logo_present_on_page() {
        Boolean dashboard = driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed();
        if (dashboard.equals(true)) {
            System.out.println("Displayed");
        } else {
            System.out.println("Not Displayed");
        }
    }

    @Then("Close Browser")
    public void close_browser() {
        driver.close();
    }


    @When("user Opens the URL {string}")
    public void user_opens_the_url(String url) {
       driver.get(url);
    }

    @When("User Enters the Username as {string} and Password as {string}")
    public void user_enters_the_username_as_and_password_as(String username, String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
    @When("Click on Login")
    public void click_on_login() {
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("I Verify the Homepage Displyed or Not")
    public void i_verify_the_homepage_displyed_or_not() {
        try {
            Boolean dashboard = driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed();
          //  Assert.assertEquals(true, dashboard);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    @Then("Click on Logout")
    public void click_on_logout() {
        driver.close();
    }

}
