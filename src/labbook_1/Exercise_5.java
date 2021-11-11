package labbook_1;

import java.util.Scanner;

/**
 * 
 *Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 *
 */

public class Exercise_5 {   

	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int n= sc.nextInt();
		
		int sum = calSum (n);
		
		System.out.println("sum = "+sum);
		
		sc.close();
		
	}
      public static int calSum (int n)
	{
		
		int sum = 0;	
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
