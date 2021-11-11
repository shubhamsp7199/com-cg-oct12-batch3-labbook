package labbook_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each character 
 * in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 *
 */

public class Exercise8 {

	static boolean isOrder(String s) {

		int n = s.length();

		char[] ch = new char[n];

		for (int i = 0; i < n; i++) {
			ch[i] = s.charAt(i);
		}

		Arrays.sort(ch);

		for (int i = 0; i < n; i++) {

			if (ch[i] != s.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ");
		String s = sc.nextLine();

		if (isOrder(s)) {
			System.out.println("postive String");
		} else {
			System.out.println("Negative String");
		}

		sc.close();
	}

}
