package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ProductTest extends BaseTest {
    private String goodName = "Sauce Labs Backpack";
    @Test
    public void buyProduct() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productPage.addToCart(goodName);
        productPage.addToCart(2);
        productPage.openCart();
        assertTrue(cartPage.getProductName().contains(goodName));
    }

    @Test
    public void quantityProducts(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productPage.addToCart(goodName);
        productPage.openCart();
        assertEquals(cartPage.quantityProductInCart(), 1);
    }
}
