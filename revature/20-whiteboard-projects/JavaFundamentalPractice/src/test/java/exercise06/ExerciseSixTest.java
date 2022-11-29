package exercise06;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseSixTest {

	@Test
	public void test() {
		RubberDuckException myEx = new RubberDuckException();
		RuntimeRubberDuckException myRunEx = new RuntimeRubberDuckException();
		Object upcastedEx = myEx;

		assertTrue(myEx instanceof Exception);
		assertTrue(myRunEx instanceof RuntimeException);
		assertFalse(upcastedEx instanceof RuntimeException);
		
	}

}
