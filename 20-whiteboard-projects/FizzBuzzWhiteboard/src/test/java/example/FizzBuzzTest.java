package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testOne() {
		//ARRANGE
		//	Here we set up the initial conditions of the test (like creating necessary variables)
		String[] expectedArray = {"FizzBuzz", "1", "2", "Fizz", "4", "Buzz", "Fizz", "7",
								"8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16"};
		
		//ACT
		//	Here we actually run the functionality we want to set to see it's output/behavior
		String[] actualArray = FizzBuzzClass.perform(17);
		
		//ASSERT
		//	Finally, here we check to see if the functionality from the "ACT" phase has produced
		//	the correct results.
		assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void testTwo() {
		//ARRANGE
		
		//ACT
		String[] smallArray = FizzBuzzClass.perform(1);
		String[] mediumArray = FizzBuzzClass.perform(100);
		String[] largeArray = FizzBuzzClass.perform(1_000_000);
		
		//ASSERT
		assertEquals("FizzBuzz", smallArray[0]);
		assertEquals(1, smallArray.length);

		assertEquals("FizzBuzz", mediumArray[45]);
		assertEquals("FizzBuzz", mediumArray[60]);
		assertEquals("FizzBuzz", mediumArray[90]);
		assertEquals("Fizz", mediumArray[48]);
		assertEquals("Fizz", mediumArray[99]);
		assertEquals("Buzz", mediumArray[95]);
		assertEquals("Buzz", mediumArray[55]);
		assertEquals("44", mediumArray[44]);
		assertEquals("98", mediumArray[98]);
		assertEquals(100, mediumArray.length);

		assertEquals("FizzBuzz", largeArray[22020]);
		assertEquals("FizzBuzz", largeArray[687990]);
		assertEquals("22021", largeArray[22021]);
		assertEquals("234397", largeArray[234397]);
		assertEquals("Fizz", largeArray[46878]);
		assertEquals("Buzz", largeArray[234395]);
		assertEquals(1_000_000, largeArray.length);
		
		
	}
	
//	@Test
	public void testThree() {
		
		@ACT
		String[] zeroArray = FizzBuzzClass.perform(0);
		
		//ACT & ASSERT
		assertThrows(IllegalArgumentException.class, ()->FizzBuzzClass.perform(-1));
		assertThrows(IllegalArgumentException.class, ()->FizzBuzzClass.perform(-3));
		assertThrows(IllegalArgumentException.class, ()->FizzBuzzClass.perform(-5));
		assertThrows(IllegalArgumentException.class, ()->FizzBuzzClass.perform(-1000));
	
		//ASSERT
		assertEquals(0, zeroArray.length);
	}

}
