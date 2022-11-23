package exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseTwoTest {

	@Test
	public void test() {
		String[] mySolution = ExerciseTwo.solution("hello", "hola", "ohayou");

		assertEquals("hello", mySolution[0]);
		assertEquals("hola", mySolution[1]);
		assertEquals("ohayou", mySolution[2]);
		
		
		String[] mySolution2 = ExerciseTwo.solution("eh", "bee", "see");

		assertEquals("eh", mySolution2[0]);
		assertEquals("bee", mySolution2[1]);
		assertEquals("see", mySolution2[2]);
	}

}
