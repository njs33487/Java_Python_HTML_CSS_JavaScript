package exercise08;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise07.ExerciseSeven;

public class ExerciseEightTest {

	@Test
	public void test() {
		ExerciseEight mySolution = new ExerciseEight();

		assertEquals("jokes",
				mySolution.solution("Who has the best jokes Trevin"));
		assertEquals("that",
				mySolution.solution("Wait I did that wrong"));
		assertEquals("forget",
				mySolution.solution("Sigh forget it"));
	}
}
