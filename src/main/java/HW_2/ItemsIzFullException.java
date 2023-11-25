package HW_2;

public class ItemsIzFullException extends RuntimeException {
    public ItemsIzFullException() {
    }

    public ItemsIzFullException(String message) {
        super(message);
    }

    public ItemsIzFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemsIzFullException(Throwable cause) {
        super(cause);
    }

    public ItemsIzFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
