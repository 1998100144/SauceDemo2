package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private final String ADD_TO_CART_PATTERN = "//div[text()='%s']//ancestor::div[@class='inventory_item']//button[text()='Add to cart']";
    private final By BUTTON = By.xpath("//*[@class='inventory_item']//button");

    @Step("Страница товаров")
    public String getTitle() {
        return driver.findElement(By.cssSelector(TITLE)).getText();
    }
    @Step("Добавление товара в корзину (по наименованию)")
    public void addToCart(String product) {
        By addToCartButton = By.xpath(String.format(ADD_TO_CART_PATTERN, product));
        driver.findElement(addToCartButton).click();
    }
    @Step("Добавление товара в корзину (по индексу)")
    public void addToCart(int index) {
        driver.findElements(BUTTON).get(2).click();
    }
    @Step("Открытие корзины")
    public void openCart() {
        driver.findElement(By.cssSelector(CART)).click();
    }
}
