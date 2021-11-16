package labbook_10;

import java.util.*;
import java.io.*;

/**
 * 
 * Write a Java program that reads a file and displays the file on the screen, with a line number before each line?
 *
 */

class Excercise1 {
	
	public static void main(String args[]) throws IOException {
		
		int a = 1;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter File name: ");
		String str = sc.next();
		
		FileInputStream f = new FileInputStream(str);
		System.out.println("\nContents of the file are");
		
		int n = f.available();
		System.out.print(a + ": ");
		
		for (int i = 0; i < n; i++) {
			ch = (char) f.read();
			System.out.print(ch);
			if (ch == '\n') {
				System.out.print(++a + ": ");

			}

		}
	}
}