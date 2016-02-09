package prob1;

public class CheckingAccount extends Account{
	

	private double overdraftLimit = 0;
	
	public CheckingAccount(int id, double balance, double overdraftLimit)
	{
		super(id,balance);
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
	public double withdraw(double amount)
	{
		double temp = super.withdraw(amount);
		if(temp <= -getOverdraftLimit())
			temp = deposit(amount);
		return temp;
	}

}
