package exercise09;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseNineTest {

	@Test
	public void test() {
		ExerciseNine mySolution = new ExerciseNine();

		assertEquals(6593, mySolution.solution(3956));
		assertEquals(272432, mySolution.solution(234272));
		assertEquals(194411, mySolution.solution(114491));
		assertEquals(985, mySolution.solution(589));
		assertEquals(5, mySolution.solution(5));
		assertEquals(-7625432, mySolution.solution(-2345267));
	}

}
