package exercise11;

import static org.junit.Assert.*;

import org.junit.Test;


public class ExerciseElevenTest {


	@Test
	public void test() {
		ExerciseEleven mySolution = new ExerciseEleven();

		assertTrue(mySolution.solution("radar"));
		assertTrue(mySolution.solution("civic"));
		assertTrue(mySolution.solution("racecar"));
		assertFalse(mySolution.solution("trevin"));
		assertFalse(mySolution.solution("chester"));
		assertFalse(mySolution.solution("giraffe"));
	}
}
