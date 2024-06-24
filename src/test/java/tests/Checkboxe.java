package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class Checkboxe extends BaseTest{

    @Test
    public void checkboxTestOne() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//*[text()=' checkbox 1']//preceding::input"));
        assertFalse(driver.findElement(By.xpath("//*[text()=' checkbox 1']//preceding::input")).isSelected());

        driver.findElement(By.xpath("//*[text()=' checkbox 1']//preceding::input")).click();
        assertTrue(driver.findElement(By.xpath("//*[text()=' checkbox 1']//preceding::input")).isSelected());
    }
    @Test
    public void checkboxTestTwo()   {

        driver.findElement(By.xpath("//input[last()]"));
        assertTrue(driver.findElement(By.xpath("//input[last()]")).isSelected());

        driver.findElement(By.xpath("//input[last()]")).click();
        assertFalse(driver.findElement(By.xpath("//input[last()]")).isSelected());

    }
}
