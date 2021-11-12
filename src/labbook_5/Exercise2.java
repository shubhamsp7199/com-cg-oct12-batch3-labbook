package labbook_5;

import java.util.Scanner;


/**
 * 
 *Write a Java Program to validate the full name of an employee. 
 *Create and throw a user defined exception if firstName and lastName is blank.
 *
 */


class NameCannotBeBlank extends Exception {
	NameCannotBeBlank(String Message) {
		super(Message);
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();

		System.out.println("Enter last name");
		String lastName = sc.nextLine();

		validate(firstName, lastName);

		sc.close();
	}

	public static void validate(String firstName, String lastName) {
		try {
			if (firstName.length() == 0) {
				throw new NameCannotBeBlank("First name can't be blank");
			} else if (lastName.length() == 0) {
				throw new NameCannotBeBlank("Last name can't be  blank");
			} else {
				System.out.println("Name is accepted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}