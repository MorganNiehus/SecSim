package prob1;

public class CheckingAccount extends Account{
	

	private double overdraftLimit = 0;
	
	public CheckingAccount(int id, double balance, double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
		setBalance(balance);
		setId(id);
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
		if(getBalance() >= getOverdraftLimit())
			temp = deposit(amount);
		return temp;
	}

}
