package exception;

import constants.EnumCollectionError;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 */
public class NullEmptyCollectionException extends Exception {

    private String message;


    public NullEmptyCollectionException(EnumCollectionError error) {
        super();
        message = error.toString();
    }

    @Override
    public String getMessage() {
        return message;
    }
}
