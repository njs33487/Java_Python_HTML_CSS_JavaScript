package exercise07;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseSevenTest {

	@Test
	public void test() {
		ExerciseSeven mySolution = new ExerciseSeven();

		assertEquals("Hunter Vampire Lincoln Abe",
				mySolution.solution("Abe Lincoln Vampire Hunter"));
		assertEquals("Boss A Like Code",
				mySolution.solution("Code Like A Boss"));
		assertEquals("voodoo? you do Who",
				mySolution.solution("Who do you voodoo?"));
	}

}
