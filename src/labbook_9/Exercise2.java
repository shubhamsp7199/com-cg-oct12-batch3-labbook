package labbook_9;

import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {

		Demo2 obj = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string value: ");
			return sc.next().replace("", " ").trim();
		};
		System.out.println("Output string: " + obj.addSpace());
	}
}