package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends BasePage{
    WebDriver driver;

    private final By TEXT_TYPOS = By.xpath("//p[contains(text(),'Sometimes you'll see a typo')]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/typos");
    }

    public String findTypos() {
        return driver.findElement(TEXT_TYPOS).getText();
    }
}
