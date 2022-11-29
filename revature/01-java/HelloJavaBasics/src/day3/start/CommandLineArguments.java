package day3.start;

public class CommandLineArguments {

	public static void main(String[] args) {
		/*
		 * run as -> run configurations -> arguments
		 */
		
		System.out.println("hello world!");

		for(String temp: args){
			System.out.println("One of the Strings: "+ temp);
		}

	}

}
