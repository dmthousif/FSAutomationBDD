package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import starter.pages.loginPage;

public class LoginSteps extends loginPage {

    public LoginSteps(WebDriver driver) {
        super(driver);
    }


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters {} and {}")
    public void user_enters_username_and_password(String userName, String passWord) {
        loginPage loginPage = new loginPage(driver); // Using the driver instance from BaseTest
        loginPage.getUserName().sendKeys(userName);
        loginPage.getPassWord().sendKeys(passWord);
        loginPage.getLoginButton().click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        Assert.assertTrue(driver.getTitle().equals("OrangeHRM"));

    }


}
