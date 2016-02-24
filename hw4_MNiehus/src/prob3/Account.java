//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 4
//Due Date: 2/24/16
//************************
package prob3;

public abstract class Account {
	
	private double balance = 0;
	
	protected Account(){
		
	}
	protected Account(double balance){
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	
	public double deposit(double amount){
		
		return balance += amount;
	}
	
	public double withdraw(double amount){
		return balance -= amount;
	}
	
	public String toString(){
		String result = " ";
		result = "The balance is: " + getBalance();
		return result;
	}
	
	public abstract double applyInterest();
	
	
	
	

}
