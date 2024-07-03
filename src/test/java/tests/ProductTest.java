package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ProductTest extends BaseTest {
    private String goodName = "Sauce Labs Backpack";

    @Test(description = "Добавление и сравнение товара в корзине")
    public void buyProduct() {
        loginPage.open();
        loginPage.login(user, password);
        assertEquals(productPage.getTitle(), "Products");
        productPage.addToCart(goodName);
        productPage.addToCart(2);
        productPage.openCart();
        assertTrue(cartPage.getProductName().contains(goodName));
    }

    @Test(description = "Соответствие количества товаров в корзине")
    public void quantityProducts(){
        loginPage.open();
        loginPage.login(user, password);
        productPage.addToCart(goodName);
        productPage.openCart();
        assertEquals(cartPage.quantityProductInCart(), 1);
    }
}
