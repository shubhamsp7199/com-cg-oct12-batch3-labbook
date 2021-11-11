package labbook_1;

import java.util.Scanner;

/**
 * 
 * // Create a method to find the sum of the cubes of the digits of an n digit number
 *
 */

public class Exercise_1 { 

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		while (n != 0) {
			int digit = n % 10;

			int res = 1;

			for (int i = 1; i <= 3; i++) {

				res = res * digit;
			}
			n = n / 10;

			sum = sum + res;

		}
		System.out.println(sum);
		sc.close();
	}

}
