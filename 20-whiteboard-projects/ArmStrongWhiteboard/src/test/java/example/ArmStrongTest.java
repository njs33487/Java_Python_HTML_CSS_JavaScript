package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArmStrongTest {

	@Test
	public void test() {
		//ASSERT
		assertTrue(ArmStrongClass.perform(0));
		assertTrue(ArmStrongClass.perform(1));
		assertTrue(ArmStrongClass.perform(2));
		assertTrue(ArmStrongClass.perform(153));
		assertTrue(ArmStrongClass.perform(370));
		assertTrue(ArmStrongClass.perform(371));
		assertTrue(ArmStrongClass.perform(407));
		assertTrue(ArmStrongClass.perform(1634));
		assertTrue(ArmStrongClass.perform(8208));
		assertTrue(ArmStrongClass.perform(9474));
		assertTrue(ArmStrongClass.perform(54748));
		

		assertFalse(ArmStrongClass.perform(1633));
		assertFalse(ArmStrongClass.perform(1635));
		assertFalse(ArmStrongClass.perform(9473));
		assertFalse(ArmStrongClass.perform(9475));
		

	}

}
