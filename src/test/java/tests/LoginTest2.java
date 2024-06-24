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

    @Test
    public void noPassword() {
        loginPage.open();
        loginPage.login("standard_user", "");
        assertEquals(driver.findElement(By.xpath("//h3[contains(text(), 'Password is required')]")).getText(), "Epic sadface: Password is required");
    }

    @Test
    public void lockedUse() {
        loginPage.open();
        loginPage.login("locked_out_user", "secret_sauce");
        assertEquals(driver.findElement(By.xpath("//h3[contains(text(), 'user has been locked out')]")).getText(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void incorrectPassword() {
        loginPage.open();
        loginPage.login("standard_user", "123");
        assertEquals(driver.findElement(By.xpath("//h3[contains(text(), 'password do not match any user in this service')]")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }
}
