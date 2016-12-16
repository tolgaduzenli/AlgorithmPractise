package elementsofprogramming.strings;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Tolga Duzenli on 16-Dec-2016.
 */
public class TestLengthEncoding {

    private static LengthEncoding lengthEncoding;

    @BeforeClass
    public static void setup() {
        lengthEncoding = new LengthEncoding();
    }

    @Test
         public void testDecodingWithCorrectValue(){
        assertEquals("eeeffffee",lengthEncoding.decoding("3e4f2e"));
    }

    @Test
    public void testEncodingWithCorrectValue(){
        assertEquals("3e4f2e",lengthEncoding.encoding("eeeffffee"));
    }

}
