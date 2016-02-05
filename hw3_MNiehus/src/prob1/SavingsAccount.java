package prob1;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance)
	{
		super(id,balance);
	}
	
	@Override
	public double withdraw(double amount)
	{
		double temp = 0;
		if(super.withdraw(amount) <= 0)
		{
			System.out.println("cant be below zero");
		}
		else
		{
			temp = super.getBalance();
		}
		return temp;
	}

}
