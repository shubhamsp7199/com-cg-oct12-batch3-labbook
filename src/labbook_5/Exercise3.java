package labbook_5;

import java.util.Scanner;
import com.cg.eis.exception.*;

/**
 * 
 * Create an Exception class named as “EmployeeException”(User defined Exception) in a package 
 * named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. 
 * Use Exception Handling mechanism to handle exception properly.
 *
 */

public class Exercise3 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		int salary = sc.nextInt();

		try {
			
			if (salary < 3000) {
				throw new EmployeeException("Your Salary is below 3000"); 
			} else {
				System.out.println("Your salary is above 3000");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}