package prob1;

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account()
	{
		id = 00000;
		balance = 0.0;
		annualInterestRate = 0;
		dateCreated = new Date();
		
	}
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
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
	
	

}
