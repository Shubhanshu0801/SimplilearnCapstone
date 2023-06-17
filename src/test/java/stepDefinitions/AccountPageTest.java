package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AccountsPage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class AccountPageTest {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AccountsPage accountsPage;
    private String title;
    private String product;

    @Given("user has already logged in")
    public void user_has_already_logged_in(DataTable dataTable) {
        List<Map<String, String>> credentialsList = dataTable.asMaps();
        String userName = credentialsList.get(0).get("username");
        String password = credentialsList.get(0).get("password");

        DriverFactory.getDriver().get("https://in.puma.com/in/en/account/login?action=login_with_email");
        accountsPage = loginPage.doLogin(userName, password);
    }

    @Given("user is on accounts page")
    public void user_is_on_accounts_page() {
        System.out.println("user is on accounts page");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = accountsPage.getAccountsPageTitle();
        System.out.println(title);
    }

    @When("user enters {string} into the search box")
    public void user_enters_into_the_search_box(String product) {
        accountsPage.clickOnSearchTab();
        accountsPage.enterIntoSearchTab(product);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        accountsPage.clickOnSearchButton();
    }

}
