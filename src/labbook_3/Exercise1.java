package labbook_3;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
 *  (Use String Tokenizer class)?
 *
 */

public class Exercise1 {
	
	public static void main(String[] args) {
		int n ;
		int sum =0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer: ");
		String s =sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s,",");

		while(st.hasMoreTokens()) {
			String temp =st.nextToken();
			n =Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n ;
		}
		
		System.out.println("Sum of integers: " + sum);
		sc.close();
	}

}
