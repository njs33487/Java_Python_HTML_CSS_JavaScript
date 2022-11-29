package day15.exceptions;

public class RubberDuckRuntimeException extends RuntimeException{


	public RubberDuckRuntimeException() {
		super();
	}

	public RubberDuckRuntimeException(String message) {
		super(message);
	}
	
	public RubberDuckRuntimeException(String message, Throwable clause) {
		super(message, clause);
	}
}
