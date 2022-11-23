package exercise05;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise04.ExerciseFourChild;
import exercise04.ExerciseFourParent;

public class ExerciseFiveTest {
	
	@Test
	public void test() {
		ExerciseFiveParent myParentSolution = new ExerciseFiveParent();
		ExerciseFiveChild myChildSolution = new ExerciseFiveChild();
		ExerciseFiveParent upcastedChildSolution = myChildSolution;
		
		assertEquals("start", myParentSolution.targetValue);
		assertEquals("end", myChildSolution.targetValue);
		assertEquals("start", upcastedChildSolution.targetValue);
		
		assertEquals("start", myParentSolution.solution());
		assertEquals("end", myChildSolution.solution());
		assertEquals("start", myChildSolution.secondSolution());
		assertEquals("end", upcastedChildSolution.solution());
		
		myParentSolution.targetValue="dolphin";
		myChildSolution.targetValue="barnacles";
		upcastedChildSolution.targetValue = "dolphin";
		

		assertEquals("dolphin", myParentSolution.targetValue);
		assertEquals("barnacles", myChildSolution.targetValue);
		assertEquals("dolphin", upcastedChildSolution.targetValue);
		
		assertEquals("dolphin", myParentSolution.solution());
		assertEquals("barnacles", myChildSolution.solution());
		assertEquals("dolphin", myChildSolution.secondSolution());
		assertEquals("barnacles", upcastedChildSolution.solution());
		
	}

}
