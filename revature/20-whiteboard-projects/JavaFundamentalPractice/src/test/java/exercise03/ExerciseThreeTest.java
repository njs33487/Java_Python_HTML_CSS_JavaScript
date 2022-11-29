package exercise03;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseThreeTest {

	@Test
	public void test() {
		ExerciseThree mySolution = new ExerciseThree();

		String[] arrayOne = {"one", "two", "three", "four"};
		String[] arrayTwo = {"everyday", "when you're", "walking", "down", "the street"};
		int[] arrayThree = {32, 2352, 238983};
		int[] arrayFour = {32,235,3232,324,757,88};

		mySolution.solution(arrayOne);
		mySolution.solution(arrayTwo);
		mySolution.solution(arrayThree);
		mySolution.solution(arrayFour);
		

		assertEquals("AT LEAST IM NOT LAST", arrayOne[2]);
		assertEquals("AT LEAST IM NOT LAST", arrayTwo[3]);
		assertEquals(-5, arrayThree[1]);
		assertEquals(-5, arrayFour[4]);
		
		assertEquals("four", arrayOne[3]);
		assertEquals("walking", arrayTwo[2]);
		assertEquals(238983, arrayThree[2]);
		assertEquals(235, arrayFour[1]);
	}


	@Test
	public void testTwo() {

		//ACT
		ExerciseThree mySolution = new ExerciseThree();
		String[] arrayOne = {"one"};
		String[] arrayTwo = {};
		int[] arrayThree = {32};
		int[] arrayFour = {};
		
		//ACT & ASSERT
		assertThrows(IllegalArgumentException.class, ()->mySolution.solution(arrayOne));
		assertThrows(IllegalArgumentException.class, ()->mySolution.solution(arrayTwo));
		assertThrows(IllegalArgumentException.class, ()->mySolution.solution(arrayThree));
		assertThrows(IllegalArgumentException.class, ()->mySolution.solution(arrayFour));
		
	}
}
