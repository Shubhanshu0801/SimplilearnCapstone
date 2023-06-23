package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartsPage {
    private WebDriver driver;
    public CartsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addProductToCart() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//ul[@id='product-list-items']//li[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='size-picker']//label[1]")).click();
        driver.findElement(By.xpath("//button[@data-test-id='pdp-add-to-cart']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@role='dialog']//div[@data-test-id='minicart-actions']//a[@data-test-id='minicart-cart-link']")).click();
    }



}
