package elementsofprogramming.strings;

import exception.NullOrEmptyParameterException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Tolga Duzenli on 16-Dec-2016.
 */
public class TestDecodeColumnId {

    private static ColumnIdDecoder columnIdDecoder;

    @BeforeClass
    public static void setup() {
        columnIdDecoder = new ColumnIdDecoder();
    }

    @Test(expected = NullOrEmptyParameterException.class)
    public void testWithNull() throws NullOrEmptyParameterException {
        columnIdDecoder.decodeColId(null);
    }

    @Test
    public void testWithA() throws NullOrEmptyParameterException {
        assertEquals(1, columnIdDecoder.decodeColId("A"));
    }

    @Test
    public void testWithZZ() throws NullOrEmptyParameterException {
        assertEquals(702, columnIdDecoder.decodeColId("ZZ"));
    }

    @Test(expected = NumberFormatException.class)
    public void testWithWrongParameter() throws NullOrEmptyParameterException {
        columnIdDecoder.decodeColId("z");
    }
}
