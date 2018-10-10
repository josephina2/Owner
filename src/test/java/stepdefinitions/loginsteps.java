package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.Login;
import utilty.Hook;

import static org.junit.Assert.assertTrue;

public class loginsteps {

   // WebDriver driver;

    Login login = new Login();

    public loginsteps()

    {
        PageFactory.initElements(Hook.driver,  login);

    }


    @Given("^I navigate to the giftrete website$")
    public void i_navigate_to_the_giftrete_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();


        String appUrl = "http://www.giftrete.com";
        Hook.driver.get(appUrl);
    }

    @When("^I click the login link$")
    public void i_click_the_login_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.linkText("Login")).click();
    }

    @When("^I enter my email$")
    public void i_enter_my_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //Hook.driver.findElement(By.id("email")).sendKeys("j.mingelangela@yahoo.com");

        login.enterEmail();
    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //Hook.driver.findElement(By.name("password")).sendKeys("Kayodelem11");

        login.enterPassword();
    }

    @Then("^I click signup$")
    public void i_click_signup() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[2]/section/form/div[4]/button")).click();
    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @And("^I enter invalid password$")
    public void iEnterInvalidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.name("password")).sendKeys("Kayodelem111");
    }

    @Then("^I should not be able to log in$")
    public void iShouldNotBeAbleToLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(Hook.driver.findElement(By.cssSelector(".alert")).isDisplayed());

    }

    @And("^I close the browser$")
    public void iCloseTheBrowser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.close();
    }
}
