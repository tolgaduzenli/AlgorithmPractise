package careerup;

import exception.NullOrEmptyParameterException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Tolga Duzenli on 1/4/17.
 */
public class TestFindFirstNonRepeatedChar {

    private static FindFirstNonRepeatedChar findFirstNonRepeatedChar;


    @BeforeClass
    public static void setup() {
        findFirstNonRepeatedChar = new FindFirstNonRepeatedChar();
    }


    @Test(expected = NullOrEmptyParameterException.class)
    public void testWithNullString() throws NullOrEmptyParameterException {
        findFirstNonRepeatedChar.firstNonRepeatingCharWithRegex(null);
    }

    @Test(expected = NullOrEmptyParameterException.class)
    public void testWithEmptyString() throws NullOrEmptyParameterException {
        findFirstNonRepeatedChar.firstNonRepeatingCharWithRegex("");
    }

    @Test
    public void testWithRepeatedString() throws NullOrEmptyParameterException {
        char c = findFirstNonRepeatedChar.firstNonRepeatingCharWithRegex("swiss");
        assertEquals('w', c);
    }

    @Test
    public void testWithNonRepeatedString() throws NullOrEmptyParameterException {
        char c = findFirstNonRepeatedChar.firstNonRepeatingCharWithRegex("tolga");
        assertEquals('t', c);
    }

    @Test
    public void testWithNumericString() throws NullOrEmptyParameterException {
        char c = findFirstNonRepeatedChar.firstNonRepeatingCharWithRegex("12323");
        assertEquals('1', c);
    }
}
