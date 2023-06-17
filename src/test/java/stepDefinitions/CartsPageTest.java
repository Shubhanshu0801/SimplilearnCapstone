package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import pages.CartsPage;

public class CartsPageTest {

    private String title;
    CartsPage cartsPage = new CartsPage(DriverFactory.getDriver());

    @When("user clicks on carts link")
    public void user_clicks_on_carts_link() {
        cartsPage.clickOnCartsLink();
    }

    @When("user gets the title of the carts page")
    public void user_gets_the_title_of_the_carts_page() {
        title = cartsPage.getCartsPageTitle();
    }

}
