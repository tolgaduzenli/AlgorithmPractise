package elementsofprogramming.arrays;

import constants.EnumPrimeNumberError;
import exception.PrimeNumberException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 *         This class returns list of prime numbers to given parameter number.
 *         The overall time complexity is O(nloglogn), space complexity is O(n).
 */
public class EnumeratePrimes {

    public List<Integer> generatePrimes(int n) throws PrimeNumberException {
        if (n < 2) {
            throw new PrimeNumberException(EnumPrimeNumberError.WRONG_PARAMETER);
        }
        List<Integer> primes = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
        isPrime.set(0, false);
        isPrime.set(1, false);
        for (int p = 2; p <= n; p++) {
            if (isPrime.get(p)) {
                primes.add(p);
                for (int i = p; i <= n; i += p) {
                    isPrime.set(i, false);
                }
            }
        }
        return primes;
    }
}
