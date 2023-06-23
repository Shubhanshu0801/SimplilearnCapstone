package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.CartsPage;

public class CartsPageTest {
    CartsPage cartsPage = new CartsPage(DriverFactory.getDriver());
    @Given("user adds the product into the cart")
    public void user_adds_the_product_into_the_cart() throws InterruptedException {
        cartsPage.addProductToCart();
    }
}
