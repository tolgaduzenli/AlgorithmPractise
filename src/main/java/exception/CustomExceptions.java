package exception;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 */
public class CustomExceptions extends Exception {
    private String message;


    public CustomExceptions(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
