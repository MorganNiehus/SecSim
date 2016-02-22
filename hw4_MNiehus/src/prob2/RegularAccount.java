package prob2;

public class RegularAccount extends Account{

	public RegularAccount(){
		
	}
	
	public RegularAccount(double balance){
		super(balance);
	}
	

	@Override
	public double applyInterest() {
		double temp = 0;
		if(super.getBalance() > 1000)
		{
			temp = super.getBalance() + (super.getBalance() * 0.01);
		}
		return temp;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result = "RegularAccount: " + super.toString();
		return result;
	}
	
	
}
