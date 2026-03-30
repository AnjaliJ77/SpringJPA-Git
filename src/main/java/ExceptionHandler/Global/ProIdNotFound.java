package ExceptionHandler.Global;

public class ProIdNotFound extends RuntimeException{
    public ProIdNotFound(String message) {
        super(message);
    }

    public ProIdNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
