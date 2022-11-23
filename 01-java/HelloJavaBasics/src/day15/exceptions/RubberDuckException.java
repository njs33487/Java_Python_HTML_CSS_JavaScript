package day15.exceptions;

public class RubberDuckException extends Exception{

	public RubberDuckException() {
		super();
	}

	public RubberDuckException(String message) {
		super(message);
	}
	
	public RubberDuckException(String message, Throwable clause) {
		super(message, clause);
	}
}
