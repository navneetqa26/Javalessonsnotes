package lesson_15_ExceptionHandling;

public class MyCustomException extends Exception{
	
	public MyCustomException() {
        super("Default Error Message");
    }

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
