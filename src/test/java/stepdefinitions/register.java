package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import utilty.Hook;

public class register {
    @Then("^I should be registered$")
    public void iShouldBeRegistered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.linkText("Register")).click();
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.id("first_name")).sendKeys(firstname);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.name("last_name")).sendKeys(lastname);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.id("email")).sendKeys(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

    @And("^I click on signup$")
    public void iClickOnSignup() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.cssSelector("button.huge:nth-child(2)")).click();
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Hook.driver.findElement(By.name("confirm_password")).sendKeys(password);
    }
}
