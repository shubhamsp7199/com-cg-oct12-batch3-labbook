package labbook_1;

import java.util.Scanner;

public class Exercise_4 {   //Write a Java program that prompts the user for an integer and then prints 
							//out all the prime numbers up to that Integer

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					isPrime = false;
				
					break;
				
				}
			}
			if (isPrime) {
				System.out.print(i+" ");
				
			}

		}

	}

}
