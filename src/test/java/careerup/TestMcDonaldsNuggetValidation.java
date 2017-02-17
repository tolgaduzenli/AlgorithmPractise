package careerup;

import hackerrank.McDonaldsNuggetValidation;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Tolga Duzenli on 2/17/17.
 */
public class TestMcDonaldsNuggetValidation {

    private static McDonaldsNuggetValidation mcDonaldsNuggetValidation;

    @BeforeClass
    public static void setup() {
        mcDonaldsNuggetValidation = new McDonaldsNuggetValidation();
    }

    @Test
    public void testWithNegtiveNumber() {
        assertFalse(mcDonaldsNuggetValidation.isNuggetNumberValid(-5));
    }

    @Test
    public void testWithZero() {
        assertTrue(mcDonaldsNuggetValidation.isNuggetNumberValid(0));
    }


    @Test
    public void testWithFirstHundredNumbers() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("i : " + i + " - " + mcDonaldsNuggetValidation.isNuggetNumberValid(i));
        }
    }
}
