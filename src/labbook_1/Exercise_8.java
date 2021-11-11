package labbook_1;

/**
 * 
 * Create a method to check if a number is a power of two or not
 *
 */

public class Exercise_8 {  

	public static void main(String[] args) {
		
		System.out.println(power2());
	 }
	 
	 public static boolean power2(){
		 int n=4;
		 
	  if(n<=0){
	   return false;
	  }
	   
	  while(n > 1){
	   if(n % 2 != 0){
	    return false;
	   }
	   n = n / 2;
	  }
	  return true;
	 }

	}

