package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By EMPTY_USER_INPUT_LOGIN = By.cssSelector("[class=product_label]");
    private final By ERROR_NO_PASSWORD = By.xpath("//h3[contains(text(), 'Password is required')]");
    private final By ERROR_INCORRECT_PASSWORD = By.xpath("//h3[contains(text(), 'password do not match any user in this service')]");
    private final By ERROR_LOCKED_USER = By.xpath("//h3[contains(text(), 'user has been locked out')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    public void login(String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }
    public String getEmptyUserInputLogin() {
        return driver.findElement(EMPTY_USER_INPUT_LOGIN).getText();
    }
    public String getErrorNoPassword() {
        return driver.findElement(ERROR_NO_PASSWORD).getText();
    }
    public String getIncorrectPassword() {
        return driver.findElement(ERROR_INCORRECT_PASSWORD).getText();
    }
    public String getLockedUser() {
        return driver.findElement(ERROR_LOCKED_USER).getText();
    }

}
