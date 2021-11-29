package task2;

/**
 * @author Nikita Nesterov
 */
public class ExceedRangeException extends Throwable {

    private String string;

    public ExceedRangeException(String string) {
        this.string = string;
    }

    public ExceedRangeException(String message, String string) {
        super(message);
        this.string = string;
    }

    public ExceedRangeException(String message, Throwable cause, String string) {
        super(message, cause);
        this.string = string;
    }

    public ExceedRangeException(Throwable cause, String string) {
        super(cause);
        this.string = string;
    }

    public ExceedRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String string) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.string = string;
    }
}
