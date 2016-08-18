import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Tolga Duzenli on 18-Aug-2016.
 */
public class TestWellFormatParenthesis {

    private WellFormatParenthesis wellFormatParenthesis;

    @Before
    public void setup() {
        wellFormatParenthesis = new WellFormatParenthesis();
    }

    @Test
    public void testWithNullValue() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat(null);
        assertFalse(wellFormat);
    }

    @Test
    public void testWithEmptyString() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("");
        assertTrue(wellFormat);
    }

    @Test
    public void testWithSpace() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat(" ");
        assertTrue(wellFormat);
    }

    @Test
    public void testWithRandomCharacter() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("a");
        assertTrue(wellFormat);
    }

    @Test
    public void testWithParenthesis() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("()");
        assertTrue(wellFormat);
    }

    @Test
    public void testWithOneParenthesis() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("(");
        assertFalse(wellFormat);
    }

    @Test
    public void testWithMultipleParenthesis() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("({4+5})");
        assertTrue(wellFormat);
    }

    @Test
    public void testWithMultipleParenthesis2() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("({4+5})]");
        assertFalse(wellFormat);
    }

    @Test
    public void testWithMultipleParenthesis3() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("]");
        assertFalse(wellFormat);
    }

    @Test
    public void testWithMultipleParenthesis4() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("(){[}]");
        assertTrue(wellFormat);
    }

    @Test
    public void testWithMultipleParenthesis5() {
        boolean wellFormat = wellFormatParenthesis.isWellFormat("][");
        assertFalse(wellFormat);
    }
}
