package labbook_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 *
 */

public class Exercise7 {

	public static int[] getSecondSmallest(int[] a) {

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			String s = "" + a[i];
			StringBuilder sbr = new StringBuilder(s);
			String st = "" + sbr.reverse();
			l.add(Integer.parseInt(st));
		}

		Collections.sort(l);
		for (int i = 0; i < a.length; i++) {
			a[i] = l.get(i);
		}
		return a;
	}

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter the length of array: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int[] a = new int[n];
			
			System.out.println("Enter the values: ");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			getSecondSmallest(a);
			
			System.out.println("Sorted Array:");
			for (int i = 0; i < n; i++) {
				System.out.println(a[i]);
			}
			sc.close();
		}

	}
}