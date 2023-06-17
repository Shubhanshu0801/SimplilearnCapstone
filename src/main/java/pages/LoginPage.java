package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private  WebDriver driver;

    private By email = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@id='login-submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void enterUsername(String username) {
        driver.findElement(email).sendKeys(username);
    }
    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }
    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public AccountsPage doLogin(String us, String pd) {
        System.out.println("Login with " + us + " and " + pd);
        driver.findElement(email).sendKeys(us);
        driver.findElement(password).sendKeys(pd);
        driver.findElement(loginButton).click();
        return new AccountsPage(driver);
    }

}
