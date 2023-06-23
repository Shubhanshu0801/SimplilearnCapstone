package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountsPage;
import pages.ProfilePage;

public class ProfilePageTest {

    private String title;

    private ProfilePage profilePage = new ProfilePage(DriverFactory.getDriver());

    @When("user clicks on edit profile link")
    public void user_clicks_on_edit_profile_link() throws InterruptedException {
        Thread.sleep(10000);
        profilePage.clickOnEditProfileLink();
    }

    @When("user is on profile page")
    public void user_is_on_profile_page() {
        title = profilePage.getProfilePageTitle();
    }

    @When("user edits first name {string} last name {string}")
    public void user_edits_first_name_last_name(String firstName, String lastName) throws Exception {
        profilePage.editProfile(firstName, lastName);
    }

    @When("user clicks on back save button")
    public void user_clicks_on_back_save_button() {
        profilePage.clickOnSaveButton();
    }

    @Then("user gets back on accounts page and can see the changes")
    public void user_gets_back_on_accounts_page_and_can_see_the_changes() {
        profilePage.backToAccountPage();
    }

}
