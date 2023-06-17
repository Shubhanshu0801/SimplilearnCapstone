package stepDefinitions;

import factory.DriverFactory;
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

    @When("user edits first name {string} last name {string} and email {string}")
    public void user_edits_first_name_last_name_and_email(String firstName, String lastName, String email) throws InterruptedException {
        Thread.sleep(10000);
        profilePage.editProfile(firstName, lastName, email);
    }

    @When("user clicks on back save button")
    public void user_clicks_on_back_save_button() {
        profilePage.clickOnSaveButton();
    }




}
