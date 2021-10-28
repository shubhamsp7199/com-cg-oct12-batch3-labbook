package labbook_1;

import java.util.Scanner;

public class Exercise_6 {   //Create a class with a method to find the difference between the 
							//sum of the squares and the square of the sum of the first n natural numbers. 

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
			
		System.out.println("difference "+ calDiff(n));
				
	}
	
	 public static int calDiff (int n)
	 {
		 int sqsum = 0;
		 int sumsq = 0;
		 for(int i=1 ; i <= n ; i++)
		 {
				sqsum = sqsum + (i*i);
				sumsq = sumsq + i;
			
		}
		  
		  
		  int diff =  (sumsq * sumsq) - sqsum ;
					
			return diff;
	 }

}