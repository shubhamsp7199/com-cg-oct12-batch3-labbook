package labbook_3;

import java.util.Scanner;

/**
 * 
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .
 *
 */

public class Exercise2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value: ");
		String str = sc.nextLine();
		
		String reverse = new StringBuffer(str).reverse().toString();

		System.out.println(str + " "+"|"+" " + reverse);
		sc.close();
	}

}
