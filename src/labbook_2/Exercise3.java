package labbook_2;

import java.util.Arrays;

/**
 * 
 * Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		
		int[] a = { 17, 16, 21 };
		
		System.out.print("Original array: ");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		
		int[] c = getSorted(a);
		System.out.println("Sorted array: " + Arrays.toString(c));
	}

	public static int[] getSorted(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			
			int b = a[i];
			int rev = 0;
			
			while (b != 0) {
				
				rev = rev * 10 + b % 10;
				b = b / 10;
			}
			
			a[i] = rev;
		}
		
		System.out.println();
		System.out.println("Reversed digit: " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		return a;
	}

}
