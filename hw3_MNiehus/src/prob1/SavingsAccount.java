package prob1;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance)
	{
		super(id,balance);
	}
	
	@Override
	public double withdraw(double amount)
	{
		double temp = super.withdraw(amount);
		if(temp <= 0)
			temp = deposit(amount);
		return temp;
	}

}
