package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.awt.windows.WPrinterJob;

import java.util.List;

public class AccountsPage {

    private WebDriver driver;
    private By searchTab = By.xpath("//button[@data-test-id='search-button-nav']");
    private By searchBox = By.xpath("//input[@id='react-aria-2']");
    private By searchButton = By.xpath("//button[@type='submit']");
    public AccountsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAccountsPageTitle() {
        return driver.getTitle();
    }

    public void clickOnSearchTab() {
        driver.findElement(searchTab).click();
    }

    public void enterIntoSearchTab(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void getProductsList() throws InterruptedException {
        Thread.sleep(10000);
        List<WebElement> products = driver.findElements(By.xpath("//section[@aria-label='Product results']//ul[@id='product-list-items']//li[@data-test-id='product-list-item']"));
        System.out.println("Product Count is "+ products.size());
    }
}
