package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends BasePage {

    private final By PRODUCT_NAME = By.cssSelector(".inventory_item_name");
    private final By ID_PRODUCT_IN_CART = By.cssSelector("[class=cart_item_label]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Step("Получение списка товаров")
    public ArrayList<String> getProductName() {
        List<WebElement> productsName = driver.findElements(PRODUCT_NAME);
        ArrayList<String> name = new ArrayList<>();
        for (WebElement product : productsName) {
            name.add(product.getText());
        }
        return name;
    }

    @Step("Количество товаров в корзине")
    public int quantityProductInCart() {
        List<WebElement> idProductInCart = driver.findElements(ID_PRODUCT_IN_CART);
        return idProductInCart.size();
    }
}
