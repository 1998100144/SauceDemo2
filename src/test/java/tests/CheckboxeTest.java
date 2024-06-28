package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class CheckboxeTest extends BaseTest {

    @Test
    public void checkboxTestOne() {
        checkboxePage.open();
        assertFalse(checkboxePage.checkboxOneIsSelected());

        checkboxePage.clickChekboxeOne();
        assertTrue(checkboxePage.checkboxOneIsSelected());
    }

    @Test
    public void checkboxTestTwo()   {
        checkboxePage.open();
        assertTrue(checkboxePage.checkboxTwoIsSelected());

        checkboxePage.clickCheckboxeTwo();
        assertFalse(checkboxePage.checkboxTwoIsSelected());
    }
}
