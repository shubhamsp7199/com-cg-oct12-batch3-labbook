package labbook_5;

import java.util.Scanner;

/**
 * 
 * Validate the age of a person and display proper message by using user defined exception. 
 * Age of a person should be above 15.
 *
 */

class InvalidInputException extends Exception {

	InvalidInputException(String Message) {
		super(Message);
	}

}

public class Exercise1 {		

	public static void main(String[] args) {

		System.out.println("Enter the age of person :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		try {
			if (age < 15) {
				throw new InvalidInputException("Exception");
			} else {
				System.out.println("Age is valid");

			}
		} catch (InvalidInputException e) {
			System.out.println("Please enter age greater than 15");
		}

		sc.close();
	}

}