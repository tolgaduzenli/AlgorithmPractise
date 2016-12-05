package exception;

import constants.EnumCollectionError;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 */
public class NullEmptyCollectionException extends CustomExceptions {

    public NullEmptyCollectionException(EnumCollectionError error) {
        super(error.toString());
    }
}
