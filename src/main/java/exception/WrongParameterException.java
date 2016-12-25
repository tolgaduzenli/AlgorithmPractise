package exception;

import constants.EnumParameterErrorCodes;

/**
 * @author Tolga Duzenli on 12/24/16.
 */
public class WrongParameterException extends CustomExceptions {

    public WrongParameterException(EnumParameterErrorCodes code) {
        super(code.toString());
    }
}
