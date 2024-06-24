package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TyposTest extends BaseTest{

    @Test
    public void typosTest() {
        driver.get("https://the-internet.herokuapp.com/typos");
        driver.findElement(By.xpath("//p[contains(text(),'won,t.')]"));
        assertEquals(driver.findElement(By.xpath("//p[contains(text(),'won,t.')]")), " Sometimes you'll see a typo, other times you won't.");

    }
}
