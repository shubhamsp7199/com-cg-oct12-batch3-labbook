package labbook_1;

import java.util.Scanner;


/**
 * 
 * Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
 * On entering the choice, an appropriate message with ?stop? or ?ready? or ?go? should appear in the console .
 * Initially there is no message shown.
 *
 */
public class Exercise_2 {  

	public static void main(String[] args) {
		
		String ss="y";
		while(ss.equals("y")) {
			
			
		
		System.out.println("Press 1 to select red");
		System.out.println("Press 2 to select yellow");
		System.out.println("Press 3 to select green");
		
		System.out.println("enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		
		Exercise_2 e2 = new Exercise_2();
		
		switch(choice) {
		case 1:
			e2.red();
			break;
			
		case 2:
			e2.yellow();
			break;
			
		case 3:
			e2.green();
			break;
			
			default: System.out.println("invalid input");

	}
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		
		sc.close();
		}
}
	
	void red() {
		System.out.println("STOP");
	}
	
	void yellow() {
		System.out.println("READY");
	}
	
	void green() {
		System.out.println("GO");
	}
	
	
}