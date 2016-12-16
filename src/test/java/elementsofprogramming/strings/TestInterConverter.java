package elementsofprogramming.strings;

import exception.NullOrEmptyParameterException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Tolga Duzenli on 13-Dec-2016.
 *         While testing InterConverter, I used Ineteger.parseInt() and String.valueOf() functions
 *         to be sure expected results.
 */
public class TestInterConverter {

    private static InterConverter interConverter;

    @BeforeClass
    public static void setup() {
        interConverter = new InterConverter();
    }

    @Test(expected = NullOrEmptyParameterException.class)
    public void testStringToIntWithNull() throws NullOrEmptyParameterException {
        interConverter.stringToInt(null);
    }

    @Test(expected = NullOrEmptyParameterException.class)
    public void testStringToIntWithEmptyString() throws NullOrEmptyParameterException {
        interConverter.stringToInt("");
    }

    @Test(expected = NullOrEmptyParameterException.class)
    public void testStringToIntWithWhiteSpaceString() throws NullOrEmptyParameterException {
        interConverter.stringToInt("   ");
    }

    @Test
    public void testStringToIntWithPositiveValue() throws NullOrEmptyParameterException {
        assertEquals(Integer.parseInt("1"), interConverter.stringToInt("1"));
    }

    @Test
    public void testStringToIntWithNegativeValue() throws NullOrEmptyParameterException {
        assertEquals(Integer.parseInt("-1"), interConverter.stringToInt("-1"));
    }

    @Test
    public void testStringToIntWithZero() throws NullOrEmptyParameterException {
        assertEquals(Integer.parseInt("0"), interConverter.stringToInt("0"));
    }

    @Test
    public void testIntToStringWithMaxInteger() {
        String intToString = interConverter.intToString(Integer.MAX_VALUE);
        assertEquals(String.valueOf(Integer.MAX_VALUE), intToString);
    }

    @Test
    public void testIntToStringWithMinInteger() {
        String intToString = interConverter.intToString(Integer.MIN_VALUE);
        assertEquals(String.valueOf(Integer.MIN_VALUE), intToString);
    }

    @Test
    public void testIntToStringWithGreaterThanMaxInteger() {
        String intToString = interConverter.intToString(Integer.MAX_VALUE + 1);
        assertEquals(String.valueOf(Integer.MAX_VALUE + 1), intToString);
    }

}
