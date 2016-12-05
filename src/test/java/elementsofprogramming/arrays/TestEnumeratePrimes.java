package elementsofprogramming.arrays;

import constants.EnumPrimeNumberError;
import exception.PrimeNumberException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 */
public class TestEnumeratePrimes {

    private static EnumeratePrimes enumeratePrimes;

    @BeforeClass
    public static void setUp() {
        enumeratePrimes = new EnumeratePrimes();
    }

    @Test(expected = PrimeNumberException.class)
    public void testWithLessThan2() throws PrimeNumberException {
        int n = 1;
        try {
            enumeratePrimes.generatePrimes(n);
        } catch (PrimeNumberException pe) {
            assertEquals(EnumPrimeNumberError.WRONG_PARAMETER.toString(), pe.getMessage());
            throw pe;
        }
    }

    @Test
    public void writePrimeNumbersOnConsole() throws PrimeNumberException {
        int n = 5;
        List<Integer> primes = enumeratePrimes.generatePrimes(n);
        primes.forEach(System.out::println);
    }

    @Test
    public void testPrimeNumbers() throws PrimeNumberException {
        int n = 5;
        List<Integer> primes = enumeratePrimes.generatePrimes(n);
        assertNotNull(primes);
        assertEquals(3, primes.size());
    }
}
