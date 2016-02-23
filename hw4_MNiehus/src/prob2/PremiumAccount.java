package prob2;

public class PremiumAccount extends Account{

	public PremiumAccount(){
		
	}
	
	public PremiumAccount(double balance){
		super(balance);
	}
	

	@Override
	public double applyInterest() {
		return setBalance((super.getBalance() * 0.015) + super.getBalance());
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result = "PremiumAccount: " + super.toString();
		return result;
	}
	
}