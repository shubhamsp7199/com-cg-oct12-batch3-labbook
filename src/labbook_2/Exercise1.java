package labbook_2;

import java.util.Scanner;

/**
 * 
 * Create a method which accepts an array of integer elements and return the
 * second smallest element in the array
 *
 */

public class Exercise1 {

	public void getSecondSmallest(int n) {
		
		Scanner sc = new Scanner(System.in);

		int temp;
		System.out.print(" Values of array : ");
		int[] aa = new int[n];

		for (int i = 0; i < n; i++) {
			aa[i] = sc.nextInt(); 
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (aa[i] > aa[j]) {
					temp = aa[i];
					aa[i] = aa[j];
					aa[j] = temp;
				}
			}
		}
		
		System.out.println("2nd Smallest element of the array is:: " + aa[1]);
		sc.close();
	}

	public static void main(String[] args) {

		Exercise1 sobj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.print(" Value of n = ");
		int number = sc.nextInt();
		sobj.getSecondSmallest(number);
		sc.close();

	}
}
