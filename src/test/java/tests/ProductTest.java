package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ProductTest extends BaseTest {
    private String goodName = "Sauce Labs Backpack";

    @Test(description = "Добавление и сравнение товара в корзине")
    public void buyProduct() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(productPage.getTitle(), "Products");
        productPage.addToCart(goodName);
        productPage.addToCart(2);
        productPage.openCart();
        assertTrue(cartPage.getProductName().contains(goodName));
    }

    @Test(description = "Соответствие количества товаров в корзине")
    public void quantityProducts(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productPage.addToCart(goodName);
        productPage.openCart();
        assertEquals(cartPage.quantityProductInCart(), 1);
    }
}
