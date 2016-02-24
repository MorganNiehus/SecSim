package prob2;

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
