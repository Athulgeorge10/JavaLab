package lab24;

public class InvalidAmountException extends Exception {
	public String message;
    InvalidAmountException(String msg) {
        message = msg;
    }
    
    public String getMessage() {
    	return message;
    }
}