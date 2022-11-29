package exercise10;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseTenTest {

	@Test
	public void test() {
		ExerciseTen mySolution = new ExerciseTen();

		assertEquals("usfwjo", mySolution.solution("trevin", 1));
		assertEquals("fkhvwhu", mySolution.solution("chester", 3));
		assertEquals("d", mySolution.solution("a", 1));
	}

}
