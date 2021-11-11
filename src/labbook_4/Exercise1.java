package labbook_4;

/**
 * 
 *a)	Create Account for smith with initial balance as INR 2000 and for Kathy with initial balance as 3000.
 *(accNum should be auto generated).
b)	Deposit 2000 INR to smith account.
c)	Withdraw 2000 INR from Kathy account.
d)	Display updated balances in both the account.
e)	Extend the functionality through Inheritance and polymorphism. 
Inherit two classes Savings Account and Current Account from account class. 
And Implement the following in the respective classes.

-	Savings Account
a.	Add a variable called minimum Balance and assign final modifier.
b.	Override method called withdraw (This method should check for minimum balance and allow withdraw to happen)

-	Current Account
a.	Add a variable called overdraft Limit
b.	Override method called withdraw (checks whether overdraft limit is reached and returns a Boolean value accordingly)

 *
 */

class Account {
	long accNum;
	Double balance;
	String accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

}

class Person extends Account {

	String name;
	float age;

	public Person(String name, float age) {
		this.name = name;
		this.age = age;
	}

	public Person(long accNum, double balance, String accHolder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	final float minBal = 1000;
	boolean overLimit;

	void withdraw(double minBal) {

		System.out.println(" ");
		System.out.println("Smith's availabe Balance : " + balance);
		minBal -= balance;
		System.out.println(overLimit = true);
		if (balance < 1000) {
			minBal += balance;
			System.out.println(overLimit = false);
		}
		
		System.out.println(" ");
		System.out.println("Rs.: " + balance + "/- Withdraw from smith's account");
		System.out.println("Smith's balance : " + minBal);
	}

	double balance;

	void deposit(double deposit) {

		double deposit1 = 2000;

		balance = balance + deposit1;
		System.out.println(" ");
		System.out.println("Rs. "+ deposit1+ "Deposited in Kathy's account");
		System.out.println("Kathy's balance: "+balance);
	}

}

class Exercise1 {
	public static void main(String arg[]) {
		Person c1 = new Person(1, 2000, "Smith");
		System.out.println(c1.accNum);
		System.out.println(c1.balance);
		System.out.println(c1.accHolder);
		
		System.out.println(" ");

		Person c2 = new Person(2, 3000, "Kathy");
		System.out.println(c2.accNum);
		System.out.println(c2.balance);
		System.out.println(c2.accHolder);

		c1.withdraw(2000);
		c2.deposit(2000);

	}
}