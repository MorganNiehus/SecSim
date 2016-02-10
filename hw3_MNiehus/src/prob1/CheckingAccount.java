//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob1;

public class CheckingAccount extends Account{
	

	private double overdraftLimit = 0;
	
	public CheckingAccount(int id, double balance, double overdraftLimit)
	{
		super(id,balance);//use the Account constructor
		this.overdraftLimit = overdraftLimit;
		
	}
	
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double ammount)
	{
		this.overdraftLimit = ammount;
	}
	
	@Override
	public double withdraw(double amount)//override the other withdraw method
	{
		double temp = super.withdraw(amount);
		if(temp <= -getOverdraftLimit())
			temp = deposit(amount);
		return temp;
	}

}
