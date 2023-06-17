package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageTest {

    private static String title;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        DriverFactory.getDriver().get("https://in.puma.com/in/en/account/login?action=login_with_email");
    }
    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        title = loginPage.getLoginPageTitle();
        System.out.println("Login page title is "  + title);
        Assert.assertTrue(title.contains(expectedTitle));
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUsername(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginButton();
    }

}
