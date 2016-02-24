package prob3;


public class RegularAccount extends Account{

	public RegularAccount(){
		
	}
	
	public RegularAccount(double balance){
		super(balance);
	}
	

	@Override
	public double applyInterest() {
		double temp = super.getBalance();
		if(temp > 1000)
		{
			super.withdraw(1000);
			temp = super.setBalance(super.getBalance() + (super.getBalance() * 0.01));
			super.deposit(1000);
		}
		return super.getBalance();
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result = "RegularAccount: " + super.toString();
		return result;
	}
	
	
}
