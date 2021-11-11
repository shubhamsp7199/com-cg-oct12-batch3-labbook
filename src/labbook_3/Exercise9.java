package labbook_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


/**
 * 
 *  Create a method to accept date and print the duration in days, months and years with regards to current system date.
 *
 */


public class Exercise9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		
		System.out.println("Enter month: ");
		int month=sc.nextInt();
		
		System.out.println("Enter day: ");
		int date=sc.nextInt();
		
		LocalDate givendate =LocalDate.of(year, month, date);
		
		LocalDate currentdate =LocalDate.now();
		
		Period diff =Period.between(givendate, currentdate);
		
		System.out.println("Duration in days: ");
		
		System.out.println(diff.getYears()+ "years " + diff.getMonths()+" months "+ diff.getDays()+"day");
        sc.close();
	}


}
