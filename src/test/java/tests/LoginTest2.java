package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest2 extends BaseTest {
    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(driver.findElement(By.cssSelector("[class=product_label]")).getText(), "Products");
    }

    @Test
    public void emptyUserInputLogin() {
        loginPage.open();
        loginPage.login("", "secret_sauce");
        assertEquals(driver.findElement(By.cssSelector("[class=product_label]")).getText(), "Products");
    }
}
