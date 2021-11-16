package labbook_9;

import java.util.Scanner;

/**
 * 
 * : Write a method that uses lambda expression to accept username and password and return true or false. 
 * (Hint: Use any custom values for username and password for authentication)
 *
 */

public class Exercise3 {
   public static void main(String[] args) {
	Demo3 obj = ()->{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter username: ");
	 String userName = sc.next();
	 
	 System.out.println("Enter password");
	 String passWord = sc.next();
	 
	 if(userName.equals("Sp") && passWord.equals("Sp@7")) 
		 return true;
	return false;
	};
	if(obj.checkUserName())
		System.out.println("Valid UserName and Password");
	else
		System.out.println("Invalid UserName and Password");
  }
}