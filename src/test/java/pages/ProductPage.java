package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private final String ADD_TO_CART_PATTERN = "//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item']//button[text()='Add to cart']";
    private final By BUTTON = By.xpath("//*[@class='inventory_item']//button");

    public String getTitle() {
        return driver.findElement(By.cssSelector(TITLE)).getText();
    }
    public void addToCart(String product) {
        By addToCartButton = By.xpath(String.format(ADD_TO_CART_PATTERN, product));
        driver.findElement(addToCartButton).click();
    }

    public void addToCart(int index) {
        driver.findElements(BUTTON).get(2).click();
    }

    public void openCart() {
        driver.findElement(By.cssSelector(CART)).click();
    }
}
