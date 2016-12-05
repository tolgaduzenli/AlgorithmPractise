package exception;

import constants.EnumPrimeNumberError;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 */
public class PrimeNumberException extends CustomExceptions {

    public PrimeNumberException(EnumPrimeNumberError error) {
        super(error.toString());
    }
}
