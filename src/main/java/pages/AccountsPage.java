package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AccountsPage {

    private WebDriver driver;
    private By searchTab = By.xpath("//span[@class='relative font-bold uppercase px-4 text-base']" +
            "//child::div[contains(text(),'Search')]");
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

}
