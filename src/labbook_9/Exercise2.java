package labbook_9;

import java.util.*;

/**
 * 
 * : Write a method that uses lambda expression to format a given string, where a space is inserted between each character of string. 
 *  For ex., if input is “CG”, then expected output is “C G”.
 *
 */

public class Exercise2 {
	public static void main(String[] args) {

		Demo2 obj = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string value: ");
			return sc.next().replace("", " ").trim();
		};
		System.out.println("Output string: " + obj.addSpace());
	}
}