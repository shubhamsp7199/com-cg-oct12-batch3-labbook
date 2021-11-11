package labbook_2;

import java.util.Arrays;

/**
 * Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase and the elements in the right half 
 * should be completely in lower case. Return the resulting array.
 *
 */


public class Exercise2 {

	public String[] sortStrings(String[] ar) {
		
		Arrays.sort(ar);
		return ar;
	}

	public static void main(String[] args) {

		String[] array = { "ORANGE", "BananA", "Kiwi", "AppLE", "GrapES", "PINEapple" };
		
		Exercise2 ref = new Exercise2();
		
		String[] sorted = ref.sortStrings(array);
		
		for (int i = 0; i < sorted.length; i++) {

			System.out.print(sorted[i] + " ");
		}

		System.out.println();
		
		for (int i = (sorted.length / 2) + 1; i < sorted.length; i++) {
			System.out.print(sorted[i].toUpperCase() + " ");
		}
	}

}
