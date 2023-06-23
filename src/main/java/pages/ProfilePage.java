package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;
    private By editProfileLinkButton = By.xpath("//a[@id='edit-profile-button']");
    private By editFirstNameBox = By.xpath("//input[@type='text' and @name='firstName']");
    private By editLastNameBox = By.xpath("//input[@type='text' and @name='lastName']");
    private By editEmail = By.xpath("//input[@type='email' and @name='email']");
    private By saveButton = By.xpath("//button[@type='submit' and @data-test-id='save']");
    private By backToMyAccountButton = By.xpath("//div[text()='Back to my account']");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnEditProfileLink() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(editProfileLinkButton).click();
    }
    public void editProfile(String firstName, String lastName) throws Exception {
        Thread.sleep(10000);
        driver.findElement(editFirstNameBox).clear();
        driver.findElement(editFirstNameBox).sendKeys(firstName);
        driver.findElement(editLastNameBox).clear();
        driver.findElement(editLastNameBox).sendKeys(lastName);
    }
    public void clickOnSaveButton() {
        driver.findElement(saveButton).click();
    }

    public String getProfilePageTitle() {
        return driver.getTitle();
    }

    public AccountsPage backToAccountPage()  {
        driver.findElement(backToMyAccountButton).click();
        return new AccountsPage(driver);
    }

}
