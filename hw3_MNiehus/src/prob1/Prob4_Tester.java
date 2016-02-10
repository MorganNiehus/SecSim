//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob1;

public class Prob4_Tester {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(3344, 1000.0, 2000.0);
		ca.setOverdraftLimit(500.0);
		printOverdraftLimit( ca );
		Account a = new SavingsAccount(3344, 1000.0);
		printOverdraftLimit( a );
	}
	
	public static void printOverdraftLimit(Account a)
	{
		if(a instanceof CheckingAccount)//checked to see of a was an instance of CheckingAccount
		{
			System.out.println("OverDraft Limit: " + ((CheckingAccount)a).getOverdraftLimit());
		}
		else
			System.out.println("not Applicable");
	}
}
