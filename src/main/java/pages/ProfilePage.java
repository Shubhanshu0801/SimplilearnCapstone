package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;
    private By editProfileLinkButton = By.xpath("//div[@class='min-h-12 pb-2 flex justify-between items-center flex-wrap border-b border-neutral-20']//child::div[@class='flex-auto flex justify-end']//child::a[@id='edit-profile-button']//child::span");
    private By editFirstNameBox = By.xpath("//input[@type='text' and @name='firstName']");
    private By editLastNameBox = By.xpath("//input[@type='text' and @name='lastName']");
    private By editEmail = By.xpath("//input[@type='email' and @name='email']");
    private By saveButton = By.xpath("//button[@type='submit' and @data-test-id='save']");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnEditProfileLink() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(editProfileLinkButton).click();
    }
    public void editProfile(String firstName, String lastName, String email) throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(editFirstNameBox).clear();
        driver.findElement(editFirstNameBox).sendKeys(firstName);
        driver.findElement(editLastNameBox).clear();
        driver.findElement(editLastNameBox).sendKeys(lastName);
        driver.findElement(editEmail).clear();
        driver.findElement(editEmail).sendKeys(email);
    }
    public void clickOnSaveButton() {
        driver.findElement(saveButton).click();
    }

    public String getProfilePageTitle() {
        return driver.getTitle();
    }

}
