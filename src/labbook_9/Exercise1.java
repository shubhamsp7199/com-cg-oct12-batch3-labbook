package labbook_9;

import java.util.Scanner;

/**
 * 
 * Write a lambda expression which accepts x and y numbers and return xy.
 *
 */

public class Exercise1 {
	public static void main(String[] args) {

		Demo1 obj = () -> {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value X and Y: ");
			return (long) Math.pow(sc.nextInt(), sc.nextInt());
		};
		System.out.println("Y'th power of X: " + obj.powerOfX());
	}
	
}