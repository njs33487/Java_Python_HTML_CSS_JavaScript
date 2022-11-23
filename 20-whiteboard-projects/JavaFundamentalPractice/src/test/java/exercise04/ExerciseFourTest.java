package exercise04;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseFourTest {

	@Test
	public void test() {
		ExerciseFourParent myParentSolution = new ExerciseFourParent();
		ExerciseFourParent myChildSolution = new ExerciseFourChild();

		assertEquals(120, myParentSolution.solution(12, 10));
		assertEquals(1200, myChildSolution.solution(12, 10));
		assertEquals(250, myParentSolution.solution(25, 10));
		assertEquals(3200, myChildSolution.solution(32, 10));
	}

}
