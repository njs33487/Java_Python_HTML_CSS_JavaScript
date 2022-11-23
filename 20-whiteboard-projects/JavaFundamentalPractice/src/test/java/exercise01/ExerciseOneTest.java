package exercise01;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseOneTest {

	@Test
	public void test() {
		ExerciseOne exOne = new ExerciseOne();

		assertEquals(300, exOne.solution(10, 20));
		assertEquals(-150, exOne.solution(15, -30));
		assertEquals(-120, exOne.solution(-5, -7));
		assertEquals(3570, exOne.solution(157, 200));
		assertEquals(3270, exOne.solution(-1020, 1347));
	}

}
