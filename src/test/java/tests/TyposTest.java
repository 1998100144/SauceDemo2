package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TyposTest extends BaseTest{

    @Test
    public void typosTest() {
        typosPage.open();
        assertEquals(typosPage.findTypos(), " Sometimes you'll see a typo, other times you won't.");

    }
}
