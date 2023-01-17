package nextstep.exception;

public class NotCorrectPasswordException extends RoomEscapeException {
    public NotCorrectPasswordException() {
        super();
    }

    public NotCorrectPasswordException(String message) {
        super(message);
    }


    public NotCorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }


    public NotCorrectPasswordException(Throwable cause) {
        super(cause);
    }
}