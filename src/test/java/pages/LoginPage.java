package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By EMPTY_USER_INPUT_LOGIN = By.cssSelector("[class=product_label]");
    private final By ERROR_MESSAGE = By.xpath("//h3[@data-test='error']");

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
    public String getErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
