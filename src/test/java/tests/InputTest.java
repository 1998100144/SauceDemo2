package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class InputTest extends BaseTest{

    @Test
    public void InputTestArrowUp() {
        inputTest.open();
        assertEquals(inputTest.keysArrowUpInput(), "2");
    }
    @Test
    public void InputTestArrowDown() {
        inputTest.open();
        assertEquals(inputTest.keysArrowDownInput(), "2");
    }
}
