package dasturlash.uz.uzcard.handler;

public class InvalidPhoneNumberExceptionHandler extends RuntimeException {
    public InvalidPhoneNumberExceptionHandler(String message) {
        super(message);
    }
}
