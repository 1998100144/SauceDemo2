package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputPage extends BasePage {
    WebDriver driver;

    private final By NUMBER_INPUT = By.cssSelector("input");

    public InputPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/inputs");
    }

    public String keysArrowUpInput() {
        driver.findElement(NUMBER_INPUT).sendKeys(Keys.ARROW_UP);
        return driver.findElement(NUMBER_INPUT).getAttribute("value");
    }

    public String keysArrowDownInput() {
        driver.findElement(NUMBER_INPUT).sendKeys(Keys.ARROW_DOWN);
        return driver.findElement(NUMBER_INPUT).getAttribute("value");
    }
}
