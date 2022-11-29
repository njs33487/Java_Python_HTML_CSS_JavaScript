package exercise12;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise07.ExerciseSeven;

public class ExerciseTwelveTest {

	@Test
	public void test() {

		ExerciseTwelve mySolution = new ExerciseTwelve();

		assertEquals("alvh",
				mySolution.solution("Abe Lincoln Vampire Hunter"));
		assertEquals("dad",
				mySolution.solution("Dungeons And Dragons"));
		assertEquals("raw",
				mySolution.solution("Rules As Written"));
	}

}
