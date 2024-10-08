package lab24;

public class InsufficientBalanceException extends Exception {
	public String message;
    InsufficientBalanceException(String msg) {
        message = msg;
    }
    
    public String getMessage() {
    	return message;
    }
}