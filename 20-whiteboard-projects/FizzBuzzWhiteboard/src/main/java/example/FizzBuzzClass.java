package example;

public class FizzBuzzClass {

	public static String[] perform(int n) {
		/*
		 * Have you heard of the whiteboarding question called FizzBuzz? Well, this will
		 * be a slightly modified version of 'FizzBuzz'.
		 * 
		 * Description: Create a string array of length n. For each element, put a
		 * string containing the index. HOWEVER, if its index is divisible by 3, then
		 * instead of putting the number itself you'll put "Fizz" in that index of the
		 * array. If the index is divisible by 5, then instead of putting the number
		 * itself you'll put "Buzz" in that index of the array. Finally, if the index is
		 * divisible by 3 AND 5, then instead of putting the number itself you'll put
		 * "FizzBuzz" in that index of the array.
		 *
		 * Example: perform(17) should return the following array: ["FizzBuzz", "1",
		 * "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
		 * "13", "14", "FizzBuzz", "16"]
		 *
		 * start Fizzbuzz(); 
		 * take in user input for integer n make an Array of size n of
		 * integers for 0 to array size of n if n mod 3 = Fizz pass into array else if n
		 * mod 5 = Buzz else if n mod 3 and 5 = FizzBuzz else pass in integer end IF end
		 * FOR print Array end Fizzbuzz();
		 */

		// declare String Array of size n input
		String[] fizzArr;
		fizzArr = new String[n];

		try {
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			System.out.println("Array can not be size 0 or less");
		}

		for (int i = 0; i < n; i++) {
			if ((i % 3) == 0 && (i % 5) == 0) {
				fizzArr[i] = "FizzBuzz";
			} else if ((i % 3) == 0) {
				fizzArr[i] = "Fizz";
			} else if ((i % 5) == 0) {
				fizzArr[i] = "Buzz";
			} else
				fizzArr[i] = "" + i;
		}

		return fizzArr;

	}

}

/*
 * switch(i) { case ( (i % 3) == 0 ): fizzArr[i] = "FIZZ"; break; case ((i % 5)
 * == 0): fizzArr[i] = "BUZZ"; break; case ((i % 3) == 0 && (i % 5) == 0 ):
 * fizzArr[i] = "FIZZBUZZ"; break; default: fizzArr[i] = "" + n ; }
 */

//  arry[5]  {	0	1	2	3	4 }
//		FizzArray[i] = "fizzBuzz"
//		FizzArray[i] = "fizz"
//		FizzArray[i] = "Buzz"
//		FizzArray[i] = "" + n;
