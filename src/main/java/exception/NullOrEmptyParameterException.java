package exception;

import constants.EnumParameterErrorCodes;

/**
 * @author Tolga Duzenli on 13-Dec-2016.
 */
public class NullOrEmptyParameterException extends CustomExceptions {

    public NullOrEmptyParameterException(EnumParameterErrorCodes code) {
        super(code.toString());
    }
}
