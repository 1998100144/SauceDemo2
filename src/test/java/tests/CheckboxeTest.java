package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class CheckboxeTest extends BaseTest {

    @Test
    public void checkboxTestOne() {
        checkboxePage.open();
        assertFalse(checkboxePage.selectCheckboxeOne());

        checkboxePage.clickChekboxeOne();
        assertTrue(checkboxePage.selectCheckboxeOne());
    }

    @Test
    public void checkboxTestTwo()   {
        checkboxePage.open();
        assertTrue(checkboxePage.selectCheckboxeTwo());

        checkboxePage.clickCheckboxeTwo();
        assertFalse(checkboxePage.selectCheckboxeTwo());
    }
}
