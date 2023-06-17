package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartsPage {

    private WebDriver driver;
    private By cartsLinkButton = By.xpath("//a[@id='nav-cart-link']");

    public CartsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCartsLink() {
        driver.findElement(cartsLinkButton).click();
    }

    public String getCartsPageTitle() {
        return driver.getTitle();
    }

}
