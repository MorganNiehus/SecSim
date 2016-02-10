//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob1;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance)
	{
		super(id,balance);//use Account constructor
	}
	
	@Override
	public double withdraw(double amount)//override withdraw for Savings
	{
		double temp = super.withdraw(amount);
		if(temp <= 0)
			temp = deposit(amount);
		return temp;
	}

}
