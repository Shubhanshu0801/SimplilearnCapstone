package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public WebDriver initializeDriver(String browser) {
        System.out.println("Browser value is " + browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            threadLocal.set(new ChromeDriver());
        }
        else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            threadLocal.set(new FirefoxDriver());
        }
        else if (browser.equals("safari")) {
            WebDriverManager.safaridriver().setup();
            threadLocal.set(new SafariDriver());
        }
        else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            threadLocal.set(new EdgeDriver());
        }
        else {
            System.out.println("Pass the correct value of browser");
        }
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        return getDriver();
    }

    public static synchronized WebDriver getDriver() {
        return threadLocal.get();
    }

}
