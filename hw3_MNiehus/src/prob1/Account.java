//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob1;

import java.util.Date;

public class Account {
	
	//set our private variables
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	//constructor
	public Account()
	{
		id = 00000;
		balance = 0.0;
		annualInterestRate = 0;
		dateCreated = new Date();
		
	}
	//overload constructor
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	//******************************
	//below are all the getters and
	//setters for the private
	//variables
	//******************************
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDate()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		double monthly = annualInterestRate / 12;//simple math to get the monthly interest
		return monthly;
	}
	
	public double getMonthlyInterest()
	{
		double newBalance = balance * getMonthlyInterestRate();
		return newBalance;
	}
	
	public double withdraw(double amount)
	{
		return balance -= amount;
	}
	
	public double deposit(double amount)
	{
		return balance += amount;
	}

}
