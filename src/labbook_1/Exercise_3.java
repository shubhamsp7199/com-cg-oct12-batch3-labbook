package labbook_1;

import java.util.Scanner;

public class Exercise_3 {    //The Fibonacci sequence

	public static void main(String[] args) {

		Exercise_3 e3 = new Exercise_3();
		int n, a = 1, b = 1, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N'th value: ");
		n = sc.nextInt();
		e3.nrcf(a, b, c, n);
		e3.rcf(a, b, c, n);
	}

	void nrcf(int a, int b, int c, int n) {

		for (int i = 1; i <= n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		a = b = 1;
		System.out.println("using non recursive function is : " + c);

	}

	void rcf(int a, int b, int c, int n) {

		if (n - 2 > 0) {
			c = a + b;
			a = b;
			b = c;
			rcf(a, b, c, n - 1);
			return;
		}

		System.out.println("using recursive function is : " + c);
	}

}
